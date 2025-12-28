pipeline {
  agent any

  environment {
    IMAGE = "prasadgatiganti/springboot-devops-demo"
    CONTAINER_NAME = "springboot_app"
    APP_PORT = "8081"
  }

  stages {
    stage('Checkout') {
      steps { checkout scm }
    }

    stage('Build & Test') {
      steps {
        dir('app') {
          sh 'mvn -B clean test package'
        }
      }
    }

    stage('Docker Build') {
      steps {
        dir('app') {
          sh "docker build -t ${IMAGE}:${BUILD_NUMBER} -t ${IMAGE}:latest ."
        }
      }
    }

    stage('Docker Push') {
      steps {
        withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'DH_USER', passwordVariable: 'DH_PASS')]) {
          sh """
            echo "$DH_PASS" | docker login -u "$DH_USER" --password-stdin
            docker push ${IMAGE}:${BUILD_NUMBER}
            docker push ${IMAGE}:latest
          """
        }
      }
    }

    stage('Deploy (Restart Container)') {
      steps {
        sh """
          docker pull ${IMAGE}:latest || true
          docker rm -f ${CONTAINER_NAME} || true
          docker run -d --name ${CONTAINER_NAME} -p ${APP_PORT}:8080 --restart unless-stopped ${IMAGE}:latest
          docker ps | grep ${CONTAINER_NAME}
        """
      }
    }
  }

  post {
    always { sh 'docker image prune -f || true' }
  }
}

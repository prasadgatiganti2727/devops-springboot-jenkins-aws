🚀 DevOps CI/CD Pipeline with Jenkins, Docker, and AWS
📌 Overview

This repository demonstrates a production-style CI/CD pipeline built around a Spring Boot application, showcasing real-world DevOps practices using Jenkins, Docker, and AWS EC2.

The project automates the full software delivery lifecycle — from source code commit to containerized deployment — following industry best practices for CI/CD, containerization, and infrastructure automation.

This repository was created as part of hands-on DevOps skill development and is continuously refined to reflect real enterprise workflows.

🧰 Tech Stack
Category	Technologies
Language	Java 17
Framework	Spring Boot
Build Tool	Maven
CI/CD	Jenkins (Pipeline-as-Code)
Containerization	Docker
Source Control	GitHub
Cloud	AWS EC2 (Free Tier)
OS (Deployment)	Linux
📦 Application Details

RESTful API built with Spring Boot

Actuator enabled for health monitoring

Endpoints:

GET /healthz – application health check

GET /api/hello?name=User – sample API endpoint

Container-ready and environment-agnostic

🔁 CI/CD Pipeline Flow

Code Commit

Developer pushes code to GitHub

Continuous Integration

Jenkins automatically triggers the pipeline

Maven builds the application

Unit tests are executed

Containerization

Docker image is built

Image is tagged with Jenkins build number and latest

Image Distribution

Docker image is pushed to Docker Hub

Continuous Deployment

Jenkins deploys the application to an AWS EC2 instance

Existing container is safely replaced

Application runs as a long-lived Docker container

🏗️ Architecture Overview
Developer → GitHub → Jenkins
                     ↓
                  Maven Build
                     ↓
                 Docker Image
                     ↓
                 Docker Hub
                     ↓
                 AWS EC2 (Docker)

📁 Repository Structure
devops-springboot-jenkins-aws/
│
├── Jenkinsfile              # CI/CD pipeline definition
├── docker-compose.yml       # Local container orchestration
├── app/
│   ├── Dockerfile           # Production-ready Docker image
│   ├── pom.xml              # Maven build configuration
│   └── src/                 # Spring Boot application source
│
└── README.md                # Project documentation

🔐 Design & Best Practices

Pipeline-as-Code
CI/CD logic is version-controlled and reproducible using a Jenkinsfile

Dockerized Deployment
Ensures consistent runtime environments across build, test, and production

Immutable Builds
Each Jenkins build produces a uniquely tagged Docker image

Cloud-Ready Architecture
AWS EC2 simulates a real production deployment environment

Separation of Concerns
Application logic, CI/CD, and infrastructure are clearly separated

🚧 Future Enhancements

Jenkins agent running inside Docker

Multi-stage Docker builds for smaller images

AWS IAM-based authentication

Blue-Green or Rolling Deployments

Infrastructure as Code (Terraform / CloudFormation)

Monitoring with Prometheus & Grafana

👤 Author

Lakshmi Vara Prasad Gatiganti
DevOps | Backend | Cloud Enthusiast
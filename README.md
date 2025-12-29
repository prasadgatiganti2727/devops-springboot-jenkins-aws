# 🚀 DevOps CI/CD Pipeline with Jenkins, Docker, and AWS

## 📌 Overview

This repository demonstrates a **production-style CI/CD pipeline** built around a **Spring Boot application**, showcasing real-world DevOps practices using **Jenkins, Docker, and AWS EC2**.

The project automates the **entire software delivery lifecycle** — from source code commit to containerized deployment — following industry best practices for:

- Continuous Integration & Continuous Deployment
- Containerization
- Cloud-based deployment

This repository was created as part of **hands-on DevOps skill development** and is continuously refined to reflect **enterprise-grade workflows**.

---

## 🧰 Tech Stack

| Category            | Technology                     |
|---------------------|--------------------------------|
| Language            | Java 17                        |
| Framework           | Spring Boot                    |
| Build Tool          | Maven                          |
| CI/CD               | Jenkins (Pipeline-as-Code)     |
| Containerization    | Docker                          |
| Source Control      | GitHub                          |
| Cloud Platform      | AWS EC2 (Free Tier)             |
| Deployment OS       | Linux                           |

---

## 📦 Application Details

- RESTful API built using **Spring Boot**
- **Spring Boot Actuator** enabled for health monitoring
- Container-ready and environment-agnostic

### Available Endpoints

- `GET /healthz` → Application health check  
- `GET /api/hello?name=User` → Sample API endpoint  

---

## 🔁 CI/CD Pipeline Flow

### 1. Code Commit
- Developer pushes code to GitHub

### 2. Continuous Integration
- Jenkins automatically triggers the pipeline
- Maven builds the application
- Unit tests are executed

### 3. Containerization
- Docker image is built
- Image is tagged with:
  - Jenkins build number
  - `latest`

### 4. Image Distribution
- Docker image is pushed to Docker Hub

### 5. Continuous Deployment
- Jenkins deploys the application to AWS EC2
- Existing container is safely replaced
- Application runs as a long-lived Docker container

---

## 🏗️ Architecture Overview

```text
Developer
   ↓
GitHub
   ↓
Jenkins
   ↓
Maven Build & Tests
   ↓
Docker Image
   ↓
Docker Hub
   ↓
AWS EC2 (Docker Container)
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
🔐 Design Principles & Best Practices
Pipeline-as-Code
CI/CD logic is version-controlled and reproducible using Jenkinsfile

Dockerized Deployment
Ensures consistent runtime environments across build, test, and production

Immutable Builds
Each Jenkins build produces a uniquely tagged Docker image

Cloud-Ready Architecture
AWS EC2 simulates a real production deployment environment

Separation of Concerns
Application, CI/CD, and infrastructure layers are clearly separated

🚧 Future Enhancements
Jenkins agent running inside Docker

Multi-stage Docker builds for smaller images

AWS IAM-based authentication

Blue-Green or Rolling deployments

Infrastructure as Code (Terraform / CloudFormation)

Monitoring with Prometheus & Grafana

👤 Author
Lakshmi Vara Prasad Gatiganti
DevOps | Backend | Cloud Enthusiast
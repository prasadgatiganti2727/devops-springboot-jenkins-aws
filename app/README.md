DevOps CI/CD Pipeline with Jenkins, Docker, and AWS
Overview

This project demonstrates an end-to-end CI/CD pipeline for a Spring Boot application, implementing real-world DevOps practices such as pipeline-as-code, containerization, and automated deployment.

The pipeline automates the complete software delivery lifecycle—from code commit to deployment on an AWS EC2 instance—using Jenkins and Docker.

This repository serves as a practical DevOps portfolio project.

Tech Stack

Java 17

Spring Boot

Maven

Jenkins (Pipeline as Code)

Docker & Docker Compose

GitHub

AWS EC2 (Linux, Free Tier)

Application Details

REST API built with Spring Boot

Health endpoint:

/actuator/health


Sample endpoint:

/api/hello?name=User


Spring Boot Actuator enabled for health monitoring

CI/CD Pipeline Overview

Developer pushes code to GitHub

Jenkins pipeline is triggered automatically

Jenkins:

Checks out the source code

Builds the application using Maven

Runs unit tests

Docker image is built using a multi-stage Dockerfile

Image is tagged with build metadata

Application is deployed as a Docker container

Health check validates successful deployment

Note:
The pipeline is designed for a Linux-based Jenkins agent (typical production setup).

Running the Application Locally
Using Docker Compose
docker compose up --build


Application will be available at:

http://localhost:8080


Health check:

http://localhost:8080/actuator/health

Jenkins Pipeline

Implemented using a declarative Jenkinsfile

Pipeline logic is fully version-controlled

Stages include:

Checkout

Build & Test

Docker Build

Container Smoke Test

Repository Structure
.
├── app/
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
├── docker-compose.yml
├── Jenkinsfile
├── .dockerignore
└── README.md

Design Decisions

Pipeline as Code ensures reproducibility and traceability

Docker guarantees consistent runtime environments

Multi-stage Docker build reduces final image size

Health checks enable automated validation

AWS EC2 simulates a production-like environment
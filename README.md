# DevOps CI/CD Pipeline with Jenkins, Docker, and AWS

## Overview

This project demonstrates an end-to-end CI/CD pipeline built to practice and apply real-world DevOps
concepts using a Spring Boot application.

The primary goal was to automate the entire software delivery lifecycle — from code commit to
deployment — using Jenkins, Docker, and AWS EC2, following industry best practices.

## Tech Stack

- Java 17
- Spring Boot
- Jenkins (CI/CD)
- Docker
- GitHub
- AWS EC2 (Free Tier)

## Application Details

- REST API built using Spring Boot
- Health endpoint: `/healthz`
- Sample endpoint: `/api/hello?name=User`
- Spring Boot Actuator enabled for application health monitoring

## CI/CD Pipeline Flow

1. Code is pushed to GitHub, triggering the Jenkins pipeline
2. Jenkins builds the application using Maven and runs unit tests
3. A Docker image is created and tagged with build metadata
4. The Docker image is pushed to Docker Hub
5. Jenkins deploys the application to an AWS EC2 instance using Docker, replacing the existing container

## Design Considerations

- Jenkins Pipeline-as-Code was used to keep CI/CD logic version-controlled and reproducible
- Docker was chosen to ensure consistent runtime environments across builds and deployments
- AWS EC2 Free Tier was used to simulate a production-like Linux environment at low cost

## Repository Structure

This project was built as part of hands-on DevOps skill development and is actively maintained for learning and improvement.

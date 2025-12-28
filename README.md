\# DevOps CI/CD Pipeline with Jenkins, Docker, and AWS



\## Overview

This project demonstrates an end-to-end DevOps CI/CD pipeline for a Spring Boot application.

The pipeline automates build, test, Docker image creation, image push to Docker Hub, and deployment

to an AWS EC2 instance using Jenkins.



\## Tech Stack

\- Java 17

\- Spring Boot

\- Jenkins (CI/CD)

\- Docker

\- GitHub

\- AWS EC2 (Free Tier)



\## Application Details

\- REST API built using Spring Boot

\- Health endpoint: `/healthz`

\- Sample endpoint: `/api/hello?name=User`

\- Spring Boot Actuator enabled for health checks



\## CI/CD Pipeline Flow

1\. Developer pushes code to GitHub

2\. Jenkins pipeline is triggered

3\. Maven builds the application and runs unit tests

4\. Docker image is built and tagged

5\. Docker image is pushed to Docker Hub

6\. Application is deployed/restarted on AWS EC2 using Docker



\## Repository Structure




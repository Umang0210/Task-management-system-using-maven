# TMS - Task Management System

## What
Simple Java/Spring Boot backend + static frontend. In-memory storage, no DB.

## Requirements
- Java 17+
- Maven
- Docker (optional)

## Build
mvn clean package

## Run locally
java -jar target/tms-0.1.0.jar
Open http://localhost:8080

## Docker
docker build -t tms:0.1 .
docker run -p 8080:8080 tms:0.1

## Git / GitHub
Initialize repo, push code, enable Actions (see .github/workflows/ci.yml)

## Notes
Project stores tasks in-memory; restarting server resets data.

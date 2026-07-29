little changes 
# Quiz Platform

A backend Quiz Platform built using Java and Spring Boot. This project starts as a **Monolithic** application and will gradually evolve into a **Microservices** architecture to demonstrate real-world backend development and system design.

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- REST APIs

## Current Features

- Retrieve all quiz questions
- PostgreSQL database integration
- Spring Data JPA
- Layered Architecture (Controller, Service, Repository)

## Planned Features

- User Authentication (JWT)
- Role-Based Authorization (Admin/User)
- CRUD Operations for Questions
- Quiz Management
- Categories
- Quiz Attempts
- Score Calculation
- Leaderboard
- Exception Handling
- Validation
- Swagger API Documentation
- Docker Support

## Future Migration to Microservices

This project will be refactored into the following services:

- API Gateway
- Discovery Server
- Config Server
- Auth Service
- User Service
- Question Service
- Quiz Service
- Result Service

## Project Structure

```
quiz-platform/
│
├── monolith/
│   ├── src/
│   ├── pom.xml
│   └── ...
│
├── microservices/
│
├── docs/
│
├── postman/
│
└── README.md
```

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/nikhilsable5050/quiz-platform.git
```

### Navigate to the Monolith

```bash
cd quiz-platform/monolith
```

### Configure PostgreSQL

Update your database configuration in:

```
src/main/resources/application.properties
```

### Run the Application

```bash
mvn spring-boot:run
```

## API

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/question/allQuestions` | Get all questions |

## Roadmap

- [x] Project Setup
- [x] PostgreSQL Integration
- [x] Fetch Questions API
- [ ] Add Question API
- [ ] Update Question API
- [ ] Delete Question API
- [ ] JWT Authentication
- [ ] Quiz Module
- [ ] Result Module
- [ ] Docker
- [ ] Microservices Migration

## Author

**Nikhil Sable**

GitHub: https://github.com/nikhilsable5050

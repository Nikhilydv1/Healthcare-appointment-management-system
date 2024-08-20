# Healthcare Appointment Management System

## Description

A full-stack healthcare application to manage appointments between doctors and patients.

## Features

- User authentication & authorization
- Appointment booking & management
- Doctor's schedule management
- Patient medical history
- Admin dashboard
- Email/SMS notifications
- Search functionality

## Tech Stack

- Backend: Java 14, Spring Boot, Spring Security, Spring Data JPA, MySQL
- Frontend: Angular 14, Bootstrap
- Deployment: Docker, Kubernetes, AWS
- CI/CD: Jenkins

## Setup Instructions

1. Clone the repository.
2. Configure the `application.properties` file in the backend.
3. Build and run the project using Docker:
   ```bash
   docker-compose up --build
4. Access the frontend at http://localhost:4200 and the backend API at http://localhost:8080.

## API Endpoints
- `POST /api/users/register`: Register a new user.
- `GET /api/appointments/doctor/{doctorId}`: Get appointments for a specific doctor.
- `POST /api/appointments/`: Book a new appointment.

### **Additional Steps:**

- **Expand Functionality:** Add more features like profile management, advanced search filters, etc.
- **Testing:** Implement comprehensive unit and integration tests.
- **CI/CD Pipeline:** Set up a CI/CD pipeline with Jenkins or GitLab CI.
- **Deployment:** Deploy the project to a cloud provider like AWS.


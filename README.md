# Flight Status and Notifications System

## Description
A system to provide real-time flight status updates and notifications to passengers.

## Features
- Real-time Updates: Display current flight status (delays, cancellations, gate changes).
- Push Notifications: Send notifications for flight status changes via SMS, email, or app notifications.
- Integration with Airport Systems: Pull data from airport databases for accurate information.

## Tech Stack
- **Frontend:** HTML, CSS, React.js
- **Backend:** Java (Spring Boot)
- **Database:** PostgreSQL
- **Notifications:** Kafka, RabbitMQ (Future implementation)

## Setup Instructions

### Backend
1. Configure the PostgreSQL database in `src/main/resources/application.properties`.
2. Build and run the Spring Boot application:
   ```bash
   mvn clean install
   mvn spring-boot:run

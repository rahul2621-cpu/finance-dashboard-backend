💰 Finance Dashboard Backend
📌 Project Overview

This project is a backend system built using Spring Boot and MySQL. It is designed to manage financial records such as income and expenses, and provide summary data for a dashboard.

The main goal of this project is to demonstrate backend development skills like API design, data handling, and basic business logic implementation.

🚀 Tech Stack
Java (Spring Boot)
MySQL
Spring Data JPA (Hibernate)
Maven
📂 Project Structure

src/main/java/com/rsc/Zorvyn

controller → Handles API requests
service → Contains business logic and calculations
repository → Handles database operations using JPA
model → Contains entity classes (User, FinancialRecord, etc.)
config → Security configuration
⚙️ Features Implemented
Financial Records CRUD (Create, Read)
Dashboard Summary APIs
Total Income
Total Expenses
Net Balance
Input Validation (basic)
MySQL Database Integration
Clean layered architecture
📊 API Endpoints
Create Record

POST /api/records

Example Request Body:
{
"amount": 5000,
"type": "INCOME",
"category": "Salary",
"date": "2026-04-03",
"notes": "Monthly salary"
}

Get All Records

GET /api/records

Dashboard Summary

GET /api/dashboard/summary

Example Response:
{
"income": 5000,
"expense": 2000,
"balance": 3000
}

🛠️ How to Run the Project
Clone the repository:
git clone https://github.com/rahul2621-cpu/finance-dashboard-backend.git
Open the project in IntelliJ IDEA
Configure MySQL in application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/finance_db
spring.datasource.username=root
spring.datasource.password=yourpassword
Run the application:
mvn spring-boot
Test APIs using Postman:
http://localhost:8080/api/records
⚠️ Limitations
Authentication is basic (JWT not implemented)
Role-based access control is minimal
Project is not deployed (runs locally)
🔮 Future Improvements
Add JWT Authentication
Implement proper Role-Based Access Control
Add Pagination and Filtering
Integrate Swagger API documentation
Dockerize the application
👨‍💻 Author

Rahul Singh

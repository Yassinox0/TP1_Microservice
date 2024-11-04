# TP 1: Spring Cloud and Eureka Discovery
This project is a practical application of microservices architecture using Spring Cloud and Eureka Discovery. It demonstrates service registration, discovery, and communication between microservices in a distributed environment.

Project Structure
Eureka Server: Manages service registration and discovery.
Service Client: Registers with Eureka and interacts with other services.
API Gateway: Routes requests to appropriate microservices.
H2 Database: Used as an in-memory database for testing.
Key Features
Service Discovery with Eureka: Allows microservices to register and discover each other dynamically.
API Gateway: Routes incoming requests to the appropriate services.
Inter-Service Communication with OpenFeign: Enables direct communication between microservices.
Setup
Clone the repository and import it into your IDE.
Start the Eureka Server by running EurekaServerApplication.
Start each microservice (Client, Gateway) sequentially.
Access the Eureka Dashboard at http://localhost:8761/ to view registered services.

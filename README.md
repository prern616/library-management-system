# Library Management System

## Overview
The Library Management System is designed to simplify and enhance library operations by automating tasks such as book cataloging, member registrations, and borrowing management. It aims to reduce human errors and make it easier for both users and administrators to manage information efficiently.

## Project Structure
This project is a Java-based Library Management System that utilizes a MySQL database for data storage and management. The project consists of the following key files:

### Files

1. **LibraryManagementSystem [SQL].sql**
   - This SQL file contains the database schema required for the Library Management System. It includes:
     - Table definitions for storing book details, member information, borrowing records, and other essential entities.
     - Sample data to test the system and facilitate initial setup.
     - SQL queries that initialize the tables, relationships, and constraints required for the system's functioning.

2. **JDBCConnection.java**
   - This Java file establishes a connection between the Java application and the MySQL database using JDBC (Java Database Connectivity). It includes:
     - The configuration for database URL, username, and password.
     - Methods to perform CRUD (Create, Read, Update, Delete) operations on the database.
     - Functions for handling user inputs and interactions with the database, allowing seamless integration between the frontend interface and backend database.

## Getting Started
To set up the Library Management System on your local environment:

1. Import the SQL database using the provided `.sql` file.
2. Update the `JDBCConnection.java` file with your database credentials.
3. Compile and run the Java application to start managing books, members, and borrowing data.

## Technologies Used
- **Java** for the core application logic.
- **MySQL** for the database backend.
- **JDBC** for connecting the Java application to the MySQL database.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

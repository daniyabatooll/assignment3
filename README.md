# assignment3
Assignment 2: Student Login System
Description
This project is a Student Login System designed as part of the second assignment for programming practice. It demonstrates the implementation of a user authentication system using Java and MySQL. The project includes features like connecting to a database, user login functionality, and validation mechanisms.

Features
Database Connection: Establishes a connection to a MySQL database for secure user authentication.
Login System: Allows users to log in with valid credentials.
Error Handling: Ensures proper error messages are displayed for invalid inputs or failed logins.
Project Structure
The project directory contains the following:

.idea/: IntelliJ project settings.
src/: Contains the source code files:
DatabaseConnection.java: Establishes the connection to the MySQL database.
Login.java: Handles the login logic and validation.
LoginTest.java: Includes test cases for the login functionality.
Main.java: Entry point for the application.
.gitignore: Excludes unnecessary files from version control.
A2.sql: SQL file to create and initialize the database schema for the project.
assignment2.iml: IntelliJ project file.
Steps to Set Up the Project
Clone the Repository:
git clone https://github.com/your-username/assignment3.git
Import the Project:

Open IntelliJ IDEA or any Java IDE.
Import the project using the assignment2.iml file.
Set Up the Database:

Install MySQL on your system.
Use the provided A2.sql file to create the necessary database and tables:
css
Copy code
mysql -u <username> -p < A2.sql
Update the database connection details in DatabaseConnection.java.
Run the Application:

Run the Main.java file in your IDE to start the login system.
Instructions to Use
Enter your database credentials in DatabaseConnection.java to connect to your local MySQL database.
Compile and run the application from Main.java.
Use valid login credentials (from the database) to log in.
If login fails, check the database entries and reattempt.
Requirements
Tools Used:
IntelliJ IDEA (or any Java IDE)
MySQL Server
Programming Language: Java
Database: MySQL
Version Control: GitHub for project management and file versioning.

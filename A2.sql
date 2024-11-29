-- Drop the database if it already exists
DROP DATABASE IF EXISTS a2;

-- Create the database
CREATE DATABASE IF NOT EXISTS a2;

-- Use the newly created database
USE a2;

-- Drop the table if it already exists
DROP TABLE IF EXISTS User;

-- Create the User table
CREATE TABLE User (
    userId INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100) NOT NULL,
    Email VARCHAR(100) NOT NULL UNIQUE,
    Password VARCHAR(255) NOT NULL
);
SELECT * FROM User;

-- Insert dummy data into the User table
INSERT INTO User (Name, Email, Password) VALUES 
    ('John Doe', 'johndoe@example.com', 'password123'),
    ('Jane Smith', 'janesmith@example.com', 'password456'),
    ('Mike Johnson', 'mikejohnson@example.com', 'password789'),
    ('Alice Brown', 'alicebrown@example.com', 'password101'),
    ('Tom Clark', 'tomclark@example.com', 'password202');

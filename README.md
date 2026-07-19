# Library Management System

## Overview
A Java-based Library Management System developed using Object-Oriented Programming (OOP) principles.

The system allows:
- Managing books
- Managing users (Students and Teachers)
- Borrowing books
- Returning books
- Sending notifications
- Logging system activities
- Exception handling

---

## Features

### Book Management
- Add a book
- Remove a book
- Search for a book by title
- Display all books

### User Management
- Student users
- Teacher users
- Different borrowing limits for each user type

### Borrowing System
- Borrow available books
- Return borrowed books
- Prevent borrowing unavailable books
- Enforce borrowing limits

### Notifications
- Email notification simulation when borrowing or returning books

### Logging
- Console logging for system activities

### Exception Handling
- Custom LibraryException class for handling business errors

---

## Project Structure

```text
src
├── model
│   ├── Book.java
│   ├── User.java
│   ├── Student.java
│   └── Teacher.java
│
├── service
│   ├── BorrowService.java
│   ├── NotificationService.java
│   └── EmailNotification.java
│
├── logger
│   ├── Logger.java
│   └── ConsoleLogger.java
│
├── exception
│   └── LibraryException.java
│
├── repository
│   └── Library.java
│
└── Main.java
```

---

## OOP Concepts Used

- Encapsulation
- Inheritance
- Abstraction
- Polymorphism
- Interfaces
- Exception Handling

---

## Example Output

```text
Hamza borrowed Java Basics
LOG: Hamza borrowed Java Basics

Hamza returned Java Basics
LOG: Hamza returned Java Basics

Availability: true
```

---

## Technologies Used

- Java
- Collections Framework (ArrayList)
- Git & GitHub

---

## Author

Hamza Galal
Computer Science Engineering Student

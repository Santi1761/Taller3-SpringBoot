# Library Management System

## Objective

Develop a web application using Spring Boot that exposes a REST API for managing books and authors. Additionally, implement authentication using JSON Web Tokens (JWT).

## Team Members

- [Juan Pablo Acevedo](https://github.com/juanpabblo16)
- [Jesus Garces](https://github.com/JesusGarce22)
- [Santiago Arboleda](https://github.com/Santi1761)

## Table of Contents

- [Specifications](#specifications)
- [Project Structure](#project-structure)
- [Endpoints](#endpoints)
- [Authentication](#authentication)
- [How to Run](#how-to-run)
- [Documentation](#documentation)
- [Screenshots/Demo](#screenshotsdemo)
- [Resources](#resources)

## Specifications

### Data Model

- Author:
  - id (Long, auto-incremental)
  - name (String)
  - nationality (String)

- Book:
  - id (Long, auto-incremental)
  - title (String)
  - publicationDate (Date)
  - author (Relationship with Author)

### Endpoints

#### Authors

- GET /authors: List all authors.
- GET /authors/{id}: Get details of a specific author.
- POST /authors: Create a new author.
- PUT /authors/{id}: Update an existing author.
- DELETE /authors/{id}: Delete an author.
- GET /authors/{id}/books: List books by a specific author.

#### Books

- GET /books: List all books.
- GET /books/{id}: Get details of a specific book.
- POST /books: Create a new book.
- PUT /books/{id}: Update an existing book.
- DELETE /books/{id}: Delete a book.

### Authentication

- Implement JWT authentication.
- Create a POST endpoint (/auth) that receives a username and password, and returns a JWT token if the credentials are valid.
- All endpoints (except /auth) should require a valid JWT token for access.

## Project Structure

- `/src/main/java`: Java source code.
- `/src/main/resources`: Configuration files and templates.
- `/src/test`: Test cases.
- `/docs`: Documentation files.

## How to Run

1. Clone this repository.
2. Configure your application properties.
3. Build and run the Spring Boot application.

## Documentation

Detailed documentation on how to set up, use, and test the application can be found in the `/docs` directory.

## Screenshots/Demo

[Add screenshots or demo videos here if applicable]

## Resources

- [Spring Boot](https://spring.io/projects/spring-boot)
- [JSON Web Tokens (JWT)](https://jwt.io/)
- [Spring Boot JWT Authentication Example](https://www.javainuse.com/spring/boot-jwt)

## Contributions

We welcome contributions from the community. Please fork this repository and create a pull request with your improvements.

## Technologies Used
- **Spring Boot**: A Java-based framework for building web applications.
- **Thymeleaf**: A templating engine for server-side rendering of HTML templates.
- **Spring Data JPA**: Simplifies database access using Spring applications.
- **Lombok**: A Java library to reduce boilerplate code.
- **HTML/CSS**: For creating the user interface.
- **GitHub**: For version control and collaboration.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
## Getting Started
To run the application locally, follow these steps:

1. Clone the repository: `git clone https://github.com/your-username/taller-1-intro-spring-equipo-9.git`

2. Build the project: `mvn clean install`

## [Report about activity](https://docs.google.com/document/d/1YvJYv9yR7bw0rL9Q2IR2XtSUMV3uLuMDgQbdWA1GLe0/edit?usp=sharing)

4. Run the application: `java -jar target/taller-1-intro-spring-equipo-9.jar`

5. Access the application in your web browser: `http://localhost:8080`

[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/f7rC8M9q)

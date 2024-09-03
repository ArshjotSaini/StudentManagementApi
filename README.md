ARSHJOTSAINI

**STUDENT MANAGEMENT API**

**Project Structure and File Descriptions**

pom.xml:
This is the Maven configuration file. It manages the dependencies required for the project, such as Spring Boot, Spring Data JPA, Hibernate, and MySQL connector. This file also defines the build process and specifies the Java version used.

application.properties:
This file contains the configuration for the database connection. It includes the MySQL database URL, username, password, and other JPA-related settings such as the dialect and the behavior of the Hibernate ORM.

StudentManagementApi.java:
This is the main entry point for the Spring Boot application. The @SpringBootApplication annotation enables auto-configuration and component scanning. Running this file will start the application.

StudentManagementApiController.java:
This file is the REST controller that handles HTTP requests related to student management. It contains mappings for various endpoints that allow users to create, read, update, and delete student records.

students.java:
This file defines the students entity. It maps the students class to the corresponding table in the database. This file includes the fields for the student's ID, first name, last name, and email, along with their corresponding getters and setters.

StudentManagementApiRepository.java:
This file is the repository interface that extends JpaRepository. It provides the necessary methods for performing CRUD operations on the students entity. The methods are automatically implemented by Spring Data JPA.

**How to Run the Program**

Clone the Repository:

Clone the project repository from GitHub to your local machine.

Set Up MySQL Database:

Make sure you have MySQL installed and running.
Create a database.
Update the application.properties file with your MySQL username and password.
Run the Application:
Navigate to the project directory.

Use the following Maven command to run the application:
arduino
Copy code
mvn spring-boot:run
The application will start and listen on http://localhost:8080.
API Endpoints
You can use Postman or any other API client to interact with the API. The following endpoints are available:

Get All Students:

URL: GET /get/students
Description: Retrieves a list of all students.
Example: http://localhost:8080/get/students

Create a New Student:

URL: POST /create/students
Description: Creates a new student record.

Update a Student by ID:

URL: PUT /update/students/{id}
Description: Updates the student record with the specified ID.

Delete a Student by ID:

URL: DELETE /delete/students/{id}
Description: Deletes the student record with the specified ID.
Example: http://localhost:8080/delete/students/1

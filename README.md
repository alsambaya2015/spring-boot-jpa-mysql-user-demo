# spring-boot-jpa-mysql-user-demo
Simple CRUD Application (REST Api) with Spring Data JPA

Generate your project using the https://start.spring.io/ including three main dependencies: Web, JPA, MySQL.
JPA – Represents the maven dependency for Spring Data JPA.
MySQL – Represents the maven dependency for mysql-jdbc-connector 

We will do CRUD related operations with a user object and ultimately we will build a REST api application with five endpoints
for CRUD related operations.

HTTP POST      /api/users            For creating the user
HTTP PUT       /api/users            For updating the user
HTTP DELETE    /api/users/:user_id   For deleting the user
HTTP GET       /api/users            For retrieving all the users
HTTP GET       /api/users/email/:email For retrieving all users with email like :email

You are required to create the:
   * User Entity which lives in between java object (java class) and relational table.
   * User Repository which helps to perform CRUD related operations with Entity.
   * User Controller which implement our REST endpoints for creating, updating, removing and listing users etc..
   * Configure/provide the mysql connection details in the "applications.properties" file.
   
   
Build and Run your application:
   1. Build the application  :         mvn clean install -DskipTests
   2. Run The application    :         java -jar target/spring-boot-data-jpa-example-0.0.1-SNAPSHOT.jar
   
   
   
TEST Your app using POSTMAN


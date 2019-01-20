# spring-boot-jpa-mysql-user-demo
Simple CRUD Application (REST Api) with Spring Data JPA

Generate your project using the https://start.spring.io/ including three main dependencies: Web, JPA, MySQL.
JPA – Represents the maven dependency for Spring Data JPA.
MySQL – Represents the maven dependency for mysql-jdbc-connector 

We will do CRUD related operations with a user object and ultimately we will build a REST api application with five endpoints
for CRUD related operations.

* HTTP POST      /api/users     ---------         For creating the user
* HTTP PUT       /api/users     ---------         For updating the user
* HTTP DELETE    /api/users/:user_id ------    For deleting the user
* HTTP GET       /api/users      ------        For retrieving all the users

We added a custom SQL functionality, for example querying with a LIKE statement. This is not fully supported even in JDBC since we have to pass our variable concatenated with the character ‘%’. 

      Query query = entityManager.createNativeQuery("SELECT em.* FROM spring_examples_db.user as em " +
            "WHERE em.email LIKE ?", User.class);
      query.setParameter(1, email + "%");

In order to add this functionality to our Spring Data Repository, we have to add an interface and the implementation. then change our original Spring Data repository in order to inherit the custom functionality.
Finally add a method to our controller that will call this custom method:

* HTTP GET       /api/users/email/:email  ---- For retrieving all users with email like :email
The last 


You are required to create the:
   * User Entity which lives in between java object (java class) and relational table.
   * User Repository which helps to perform CRUD related operations with Entity.
   * User Controller which implement our REST endpoints for creating, updating, removing and listing users etc..
   * Configure/provide the mysql connection details in the "applications.properties" file.
   
   
Build and Run your application:
   1. Build the application  :         mvn clean install -DskipTests
   2. Run The application    :         java -jar target/spring-boot-data-jpa-example-0.0.1-SNAPSHOT.jar
   
   
   
TEST Your app using POSTMAN


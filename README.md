# REST-API
This is a REST-API example built in Spring Boot with MVC architecture with proper implementation of Junit test cases as well.

#Build steps-
1. Created the project with the help of start.spring.io initializer to add dependencies according to our requirement.
2. It created a default mvc directory of our application
3. Application starts from the class annotated with @SpringBootApplication annotation.
4. Four major packages created - domain, controller, service and repository
5. @Entity and @Table annotations - used to mark domain classes as entity objects
6. @Controller - used to mark the class as controller which interacts with the browser to handle requests
7. @Service - used to mark the class as service which gets the request from controller class, serves the request and send back to controller.
8. @Repository - used to mark the interface as repository which interacts with the database directly.
9. @SpringBootTest - used to make the class perform testing operations with the help of @Test annotation.


#Execution steps -
1. The web request comes from browser to the controller class which handles the request.
2. Then this request goes to the service class which further performs the required operation.
3. Service class makes use of repository class to perform crud operations as requested.

**Executing test-cases**

4. Before deployment, testing operations are executed with the help of class annotated with @SpringBootTest which runs the test cases with the help of @MockBean and @Test annotation.

5. @MockBean annotation helps in creating the mockito container which mocks the database i.e. request is not going to database everytime for testing purpose

6. In this way, it is making the testing more fast and efficient.

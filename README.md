# Innovecture


Spring Boot Weather API Project

This is a Weather info project in Java / Maven / Spring Boot application.

How to Run

This application is packaged as a jar which has Tomcat 8 embedded. No Tomcat or JBoss
installation is necessary. You run it using the java -jar command.
Clone this repository

Make sure you are using JDK 1.8 and Maven 3.x

You can build the project and run the tests by running mvn clean package Once successfully
build, you can run the service by one of these two methods:

        java -jar &lt;jar-path&gt; or

        mvn spring-boot:run
        
Check the stdout to make sure no exceptions are thrown Once the application runs you should
see something like this 

{
        2021-01-07 22:25:49.065  INFO 21065 --- [on(2)-127.0.0.1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring
        DispatcherServlet &#39;dispatcherServlet&#39;
        2021-01-07 22:25:49.065  INFO 21065 --- [on(2)-127.0.0.1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet
        &#39;dispatcherServlet&#39;

        2021-01-07 22:25:49.069  INFO 21065 --- [on(2)-127.0.0.1] o.s.web.servlet.DispatcherServlet        : Completed
        initialization in 4 ms
 }

Once Application Start successfully open swagger documentation of resources Swagger
        URL: http://localhost:8081/swagger-ui/index.html

About the Service

 The service is just a simple ZIP code based Weather Info  REST service calling default online API
 available online 
 
All APIs are documented by Swagger3 using annotations. 

Get INFO Status
GET /us/getweatherinfo/{zipcode}

Test Scenario

Test Case 1 : Providing correct ZIP code
 http://localhost:8081/us/getweatherinfo/10001
 
 Test Case 2 : Providing incorrect ZIP code
example : http://localhost:8081/us/getweatherinfo/1 
(Custome Exception Message with defination)

Test Case 3 : Providing invalid URL
example : http://localhost:8081/us/getweatherinfo/weee 
or 
example : http://localhost:8081/us/getweatherinfo

Redirect to Custom Error Page
 



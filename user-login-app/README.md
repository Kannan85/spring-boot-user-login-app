# User Login Application 

A simple User login application is developed using Java 11, Spring boot in specific Spring Web, Spring Security, Thymeleaf and Restful Web Services.

## Prerequisites

1. Java 11
2. Maven 3.6.3+

## Steps to run the application in a local machine

1. Go to the root folder ```/user-login-app``` of the application.
2. Run the command ```mvn clean install```
3. Check the ```target``` directory is created with the jar file named ```user-login-app-0.0.1-SNAPSHOT.jar```
4. Run the command ```mvn spring-boot:run``` and the application will be started
5. Run the command ```curl localhost:8080/signIn.html``` or go to the local machine's browser and type the same url
6. The accepted username and password for this application are "Student" and "Student@2021"
7. Successful login page will be shown upon correct credentials
8. For incorrect credentials, Error page will be shown.

## Steps to deploy the application in AWS Beanstalk

1. Go to the website ```http://aws.amazon.com/```
2. Create a profile if not exists and here payment information is needed
3. Once logged in with correct user, type ```Elastic Beanstalk``` in the search bar
4. Select "Create Application"
5. Provide application name, platform details, source code file in ```.jar``` format and click on "Click Application" button
6. Wait for the environment to configure
7. Once the configuration of Environment is successful, the Loadbalancer Url of the deployed application will be given
8. Upon clicking the url, if the result is ```502 Bad Gateway, Ngnix error``` then click "Configuration" and select "Software" option
9. Add Environment variable as ```SERVER_PORT:5000``` and apply changes.
10. After changes is applied, the following message will be shown ```Environment update completed successfully.``` and the open the URL again


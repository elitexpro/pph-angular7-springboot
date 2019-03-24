# Angular7-SpringBoot
Sample project which uses Angular 7 for the front end and spring boot for the backend to provide services

This is a full stack java web application which implements product management services

Prerequisites to run the project

Java, IntelliJ/Eclipse, Angular 7, maven, npm, nodejs

Steps to run the project

1. Checkout the git repositoty and import the project into intellij or eclipse as maven project

2. Now cd to the root of the project and run the below command
    mvn clean install -DskipTests

3. Once the build is complete, run the java application using

    java -jar target/<project-name>.jar

4. Make sure that its running successfully. Now the backend is ready to serve the contents to the frontend

5. Navigate to the "frontend" directory and install the necessary packages for the angular application using

    npm install
    
6. Now start the frontend application using

    npm start
    
7. If there are no errors then navigate to the page http://localhost:4200

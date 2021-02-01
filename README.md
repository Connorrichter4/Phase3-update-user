# Searching for a Specific User and Updating the User Information

## Project Description

Create a Spring MVC web application that will retrieve users based on their user ID. The retrieved user data will then be edited in a form and updated in the database. The entire database processing has to be done using Hibernate. Front pages will be made in JSP.

As a part of developing an ecommerce web application, the admin backend requires a module that can retrieve users based on their user ID and update their information as required.

## Technologies Used

- Eclipse as the IDE
- Apache Tomcat as the web server
- JSP pages for the front end
- Spring MVC with Hibernate, log4j, and MySQL Connector

## Requirements

- Create a JSP page to take in a user ID
- Create a controller that will validate the user ID. If it is invalid, it will display a JSP page with an error message. If it is valid, it will retrieve user details from the database and show an edit form in JSP
- Once the edit form is submitted, the controller will update the details in the database. A confirmation JSP page will be shown
- Follow the standard methodology of creating controllers, services, dao, and entity classes
- Document the step-by-step process involved in completing this task

## Examples

### Search Page

![search-form](https://user-images.githubusercontent.com/58124052/106514238-a0792580-6499-11eb-87b6-34445d9fd058.png)

### Invalid Id Entered

![invalid-id](https://user-images.githubusercontent.com/58124052/106514236-9fe08f00-6499-11eb-93d6-bc5db0532633.png)

### User Id Does Not Exist

![id-not-exist](https://user-images.githubusercontent.com/58124052/106514235-9fe08f00-6499-11eb-8d17-09e66f7c1aef.png)

### Update Form Page

![update-form](https://user-images.githubusercontent.com/58124052/106514240-a0792580-6499-11eb-950a-f560be3ee8a4.png)

### Success Page

![success](https://user-images.githubusercontent.com/58124052/106514239-a0792580-6499-11eb-9ae7-16332bad8911.png)

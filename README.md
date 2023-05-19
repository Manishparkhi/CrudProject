# CrudProject


### Framework Used
+ Springboot

### Language Used
+  JAVA

### Data Flow

+ Controller - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.

+ Repository - Here database is stored, for which I have used arrayList. In the database layer, CRUD (create, read, update, delete) operations are performed.

+ Service -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.

+ DataBase Class - Here the class user is defined and the whatever a user class will load. e.g -userId, userName, address, phone number etc.


### Project Summary

Our project basically maintains the upcoming user information which includes -


### Student:
+ id (Long)
+  name (String)
+ surname (String)
+ email (Address)


You can create a StudentId information, read a Student information, read by specific StudentId, update Student specific Id, delete a StudentId by their using by api calls.
 

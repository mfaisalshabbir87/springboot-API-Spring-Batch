This Project is Demo for Spring boot project
it has Spring Security, Spring boot, Spring MVC, Spring Batch, JPA, Hibernate, MYSQLDB

This project is on Java 17 and Spring boot 3.2.5 

http://localhost:8080/api/jobs/importCustomers      ( to trigger the Spring batch job )

http://localhost:8080/api/users   for Get api call
http://localhost:8080/api/users/bulk   for list of data Post call
for example in body pass this 
[
  { "id": 1, "name": "John Smith 3" },
  { "id": 2, "name": "John Smith 2" },
  { "id": 3, "name": "John Smith 3" }
]

http://localhost:8080/api/users/15 for post call for 1 user
http://localhost:8080/api/users/1   for put 
http://localhost:8080/api/users/1   for delete 



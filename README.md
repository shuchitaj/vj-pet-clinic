[![CircleCI](https://circleci.com/gh/vinamraj/vj-pet-clinic.svg?style=svg)](https://circleci.com/gh/vinamraj/vj-pet-clinic)

# vj-pet-clinic

The following project is based on spring-boot and hibernate. Dependencies used are actuator, lombok, JPA, Thymeleaf.
The following project is linked with H2 database and MySQL database
vj-pet-clinic consists of two modules:-
pet-clinic-data consisting of all the data models
pet-clinic-web consists of resource files and controllers needed to run the application

The following application also consists of maven release plugin and to release a new plugin just run following commands on the terminal:-
mvn release:prepare
mvn release:perform

To run the project just run **localhost:8080/index.html** on the browser after starting the application

# License

The Spring PetClinic sample application is released under version 2.0 of the [Apache License](http://www.apache.org/licenses/LICENSE-2.0).

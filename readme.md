### Local / Remote DB

This small project shows how you can have an im memory h2 databse in test scope and another database during runtime.


#### Test using h2 database
mvn clean package - runs the test using an h2 datbase

#### Run using postgres database
mvn spring-boot:run - runs using a postgres datbase

#### Postgres docker image to run against
docker run --rm --name pg-docker: -e POSTGRES_PASSWORD=admin -d -p 5432:5432 postgres

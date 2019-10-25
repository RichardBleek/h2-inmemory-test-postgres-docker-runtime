### Local / Remote DB

This small project shows how you can have an im memory h2 databse in test scope and another database during runtime.

The h2 database gets used during test due to it being test scope. While the Postgres get used in runtime.
```
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```

The postgres properties get defined in: 

    'src/main/resources/application.properties'.

And the inmemory values for test are overridden in: 

    'src/test/resources/application.properties'.


#### Commands
Test using h2 database in memory

    mvn clean package

Run using postgres database

    mvn spring-boot:run

Postgres docker image to run against

    docker run --rm --name pg-docker: -e POSTGRES_PASSWORD=admin -d -p 5432:5432 postgres

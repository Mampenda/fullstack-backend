# Gradle & Spring Boot

Gradle is the open source build system of choice for Java, Android, and Kotlin developers.

## Installation

Follow these [steps](https://gradle.org/install/) to install Gradle or use the [sdkMAN](https://sdkman.io/) command

```bash
sdk install gradle
```

## User login and registration
I used this [video](https://www.youtube.com/watch?v=X7pGCmVxx10) and this GitHub [repository](https://github.com/Alanlands1/springbootBackend)
as a tutorial on how to implement user login and registration.

#### Dependencies used in Spring Boot Initializer:

- [Spring Web](https://spring.io/projects/spring-ws) to enable web application development
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa) aka Java Persistence API, to simplify database interactions using JPA
- [MySQL Driver](https://spring.io/guides/gs/accessing-data-mysql) which is needed to connect the project to a MySQL database. 

### Rest API w/ SpringBoot and Gradle | CRUD REST API

I used this [video](https://www.youtube.com/watch?v=B-cePk1ruuY&ab_channel=TechHelp) to initialize the API for my User-class,
and I checked that it worked with the [Postman API platform](https://www.postman.com/). I also used
this [video series](https://www.youtube.com/playlist?list=PL1oBBulPlvs84AmRmT-_3dGz4KHYuINsj) as a guide.

#### Dependencies

- [Node.js](https://nodejs.org/en), a free, open-source, cross-platform JavaScript runtime environment
- [Node Version Manager (nvm)](https://github.com/nvm-sh/nvm), to manage node.js versions
- [MySQL](https://www.mysql.com/) as a database (I have two listed, so I might have to look into that later)

#### Poll-class
I used this [video series](https://www.youtube.com/watch?v=e4tPBJ56tm4&list=PL9l1zUfnZkZkGYaUAI5lyppp8oyIBKk8d&ab_channel=KindsonTheTechPro) 
and this gitHub [repository](https://github.com/darecoder/Polling-App) to create the Poll-class and connect my user- and polls-class to the MySQL database.

There is definitely some bugs in my implementation of the Poll- and VoteOption-classes, but I am working on them. As of now, I can POST, GET, GET by id, and DELETE polls, but I am still figuring out how to implement PUT so that I can update the polls. 

### Single-Page Application

I used the video series [REACT JS TUTORIAL](https://www.youtube.com/watch?v=1w-oQ-i1XB8&ab_channel=LearnCode.academy) (click on 'From the series' on the top right-hand side to view all videoes in the series),
more specifically [this video](https://www.youtube.com/watch?v=1iAG6h9ff5s&ab_channel=LearnCode.academy) to implement single-page rendering in the front-end part for my project.

#### HERE
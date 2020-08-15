# WebFlux

### This is a WebFlux Project.

### Tech Stack 
 - Java 11
 - Spring Boot
 - WebFlux
 - MongoDB
 - Docker
 - Lombok
 
### Requirements

For building and running the application you need:
- [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or newer . 
- [Maven](https://maven.apache.org)
- [Docker](https://www.docker.com/)
- [Lombok](https://projectlombok.org/)

### Build & Run 

```
  docker-compose -f "YOUR_LOCATION\docker-compose.yml" up -d 
```

```
  mvn clean install && mvn --projects WebFlux spring-boot:run
```

### Port
```
  http://localhost:8081
```


![WebFluxPhoto](https://github.com/mehmetpekdemir/WebFlux/blob/develop/Photo/web-flux.png)

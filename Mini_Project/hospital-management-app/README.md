## Import project
Import the project on either eclipse or intellij as a maven import project

### Maven
This project is maven project which will be built using maven command.

# Build
``` 
mvn clean install
```
# Run
``` 
mvn spring-boot:run
```
## Test Application
``` 

```

## Dockerization
```
$ mvn install dockerfile:build
```
## List docker images
```
$ docker images
```
### Running the application in docker container
```
$ docker run -p 8080:8080 
```
## Build application
``` 
mvn clean install
```

## Run application
``` 
mvn spring-boot:run
```

## Test Application
```
curl --location --request GET 'localhost:8080/get/students' \
--header 'Cookie: JSESSIONID=AD9B2F61C5E019379A507B7CABB1D847'

curl --location --request GET 'localhost:8080/map/students' \
--header 'Cookie: JSESSIONID=AD9B2F61C5E019379A507B7CABB1D847'

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
$ docker run -p 8080:8080 prachi04/student-app:0.0.1-SNAPSHOT
```

## List docker running container

```
$ docker ps
```


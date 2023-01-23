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
curl --location --request POST 'localhost:8080/patient/save' \
--header 'Content-Type: application/json' \
--data-raw '{
     "id" : "123",
     "name" : "pat123",
     "age" : "30",
    "gender" : "male",
    "disease" : "bacterial"
}'

curl --location --request PUT 'localhost:8080/patient/update?disease=fever&age=35' \
--header 'Content-Type: application/json' \
--data-raw '{
     "id" : "123",
     "name" : "pat123",
     "age" : "30",
    "gender" : "male",
    "disease" : "bacterial"
}'

curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic dXNlcjEyMzpwYXNzMTIz' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=E9159EE0AD7DAF829BAC3AC19631C28A' \
--data-raw '{
     "id" : "123",
     "name" : "pat123",
     "age" : "30",
    "gender" : "male",
    "disease" : "bacterial"
}'

curl --location --request PUT 'localhost:8080/patient/update?disease=fever&age=35' \
--header 'Authorization: Basic YWRtaW4xMjM6cGFzczEyMw==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=E9159EE0AD7DAF829BAC3AC19631C28A' \
--data-raw '{
     "id" : "123",
     "name" : "pat123",
     "age" : "30",
    "gender" : "male",
    "disease" : "bacterial"
}'

```


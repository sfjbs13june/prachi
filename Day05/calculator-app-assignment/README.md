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
curl --location --request GET 'localhost:8080/add?a=10&b=20'

curl --location --request POST 'localhost:8080/sub?a=17&b=7'

curl --location --request PUT 'localhost:8080/mul?a=12&b=5'

curl --location --request DELETE 'localhost:8080/div?a=50&b=10'

```


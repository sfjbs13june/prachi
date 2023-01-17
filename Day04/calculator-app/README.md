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
curl --location --request GET 'localhost:8081/add?a=10&b=20.30'

curl --location --request GET 'localhost:8081/sub?a=45.54&b=20.23'

curl --location --request GET 'localhost:8081/mul?a=15&b=7.17'

curl --location --request GET 'localhost:8081/div?a=17.7&b=2.3'

```


# Build
``` 
mvn clean install
```


# Run
``` 
docker-compose -f docker-compose-rabbitmq.yml up -d
```


# Run Producer
``` 
rabbitmq-demo-producer> mvn spring-boot:run
```


# Test
``` 
curl --request POST 'localhost:8080/rabbitmq/hospital' \--header 'Content-Type: application/json' \--data-raw '{"name":"Hosp3","hosId":"h03","address":"Bangalore"}

curl --request POST 'localhost:8080/rabbitmq/patient' \--header 'Content-Type: application/json' \--data-raw '{"patientName":"Pat3","patId":"p03","gender":"male","age":"30"}'
```


# Run Consumer
``` 
rabbitmq-demo-consumer> mvn spring-boot:run
```


# Show data on browser::

http://localhost:15672/

user-name:guest
password:guest


## Stop Container
``` 
docker-compose -f docker-compose-rabbitmq.yml down
```

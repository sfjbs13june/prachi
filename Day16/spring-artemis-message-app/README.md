# Build
``` 
mvn clean install
```


# Run
``` 
docker-compose -f docker-compose-artemis.yml up -d
artemis-demo-producer> mvn spring-boot:run
```


# Start consumer
``` 
artemis-demo-consumer> mvn spring-boot:run
```


# Send some message though producer
``` 
curl --request GET 'localhost:1230/send/message?name=Dev&age=25'
```


## Stop Container
``` 
docker-compose -f docker-compose-artemis.yml down
```


# Show data::
``` 
http://localhost:8161/
```




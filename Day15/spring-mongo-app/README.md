## Build the app
``` 
mvn clean install
```

## Run the app
``` 
docker-compose -f docker-compose-mongo.yml up -d
mvn spring-boot:run
docker-compose -f docker-compose-mongo.yml down
```

## Post
``` 
curl --location --request POST 'localhost:8083/hospital/create' \-header 'Content-Type: application/json' \--data-raw '{"name": "Hosp4","address": "Kolkata","doctorname":"doc4"}

curl --location --request POST 'localhost:8083/patient/create' \--header 'Content-Type: application/json' \--data-raw '{"name": "Pat3","age":"30","gender":"male","disease":"fever"}'
```

## Get
``` 
curl --location --request GET 'localhost:8083/hospital/read'

curl --location --request GET 'localhost:8083/patient/read'
```

## Put
``` 
curl --location --request PUT 'localhost:8083/hospital/update?doctorname=doc2&name=Hosp2' 
```

## Delete
```
curl --location --request DELETE 'localhost:8083/hospital/delete?name=Hosp4'
```

## Show data

```
docker exec -it spring-mongo-app-mongo-1 bash

mongo

show dbs

show tables

db.hospital.find()

```


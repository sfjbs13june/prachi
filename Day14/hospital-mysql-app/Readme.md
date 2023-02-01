#Build
``` 
mvn clean install
```

#Run
```
docker-compose -f docker-compose-mysql.yml up -d

mvn spring-boot:run

docker-compose -f docker-compose-mysql.yml down

```
# training
##POST

```
curl --location --request POST 'localhost:8081/doctor/save' \
--header 'Content-Type: application/json' \
--data-raw '{
    "appointmentId":"1",    
    "patientName":"pat123",
    "doctorName":"doc123",
    "date":"31-01-2023"
}

```
## Get 

```
curl -X GET http://localhost:8081/doctor/doctorappointment 
```

## Getting inside container

docker exec -it <container-id> /bin/bash
mysql -u user -p
show databases;
use db;
show tables;
select * from user;

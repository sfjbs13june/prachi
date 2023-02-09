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
# GET Doctor Controller (getAppointments)
``` 
curl --location --request GET 'localhost:8080/doctor/doctorappointment?doctorName=doc03' \--header 'Authorization: Basic ZG9jdG9yMTIzOnBhc3Nkb2MxMjM=' \--header 'Cookie: JSESSIONID=2AA0689D3FCE5D7997231A29E716A26F'
```
# POST Doctor Controller (saveAppointment)
``` 
curl --location --request POST 'localhost:8080/doctor/save' \--header 'Authorization: Basic ZG9jdG9yMTIzOnBhc3Nkb2MxMjM=' \--header 'Content-Type: application/json' \--header 'Cookie: JSESSIONID=2AA0689D3FCE5D7997231A29E716A26F' \--data-raw '{
  "appointmentId": "a04",
  "patientName": "pat04",
  "doctorName": "doc03",
  "date": "6-2-2023",
  "prescription": {"prescriptionId": "p04","appointmentId": "a04","description": "Medicine B","patientName": "pat04","doctorName": "doc03"}
}'
```
# GET Patient Controller (getMyAppointment)
``` 
curl --location --request GET 'localhost:8080/patient/myappointment?patientName=pat01' \--header 'Authorization: Basic cGF0aWVudDEyMzpwYXNzcGF0MTIz' --header 'Cookie: JSESSIONID=2AA0689D3FCE5D7997231A29E716A26F'
```
# POST Patient Controller (saveAppointment)
``` 
curl --location --request POST 'localhost:8080/patient/save' \--header 'Authorization: Basic cGF0aWVudDEyMzpwYXNzcGF0MTIz' \--header 'Content-Type: application/json' \--header 'Cookie: JSESSIONID=2AA0689D3FCE5D7997231A29E716A26F' \--data-raw '{
  "appointmentId": "a01",
  "patientName": "pat01",
  "doctorName": "doc01",
  "date": "7-2-2023",
  "prescription": {"prescriptionId": "p01","appointmentId": "a01","description": "Medicine abc","patientName": "pat01","doctorName": "doc01"}
}'
```
# GET Prescription Controller (getAllPrescriptions)
``` 
curl --location --request GET 'localhost:8080/viewprescription?patientName=pat03' \--header 'Authorization: Basic cGF0aWVudDEyMzpwYXNzcGF0MTIz' \--header 'Cookie: JSESSIONID=2AA0689D3FCE5D7997231A29E716A26F'
```
# POST Prescription Controller (savePrescription)
``` 
curl --location --request POST 'localhost:8080/saveprescription' \--header 'Authorization: Basic cGF0aWVudDEyMzpwYXNzcGF0MTIz' \--header 'Content-Type: application/json' \--header 'Cookie: JSESSIONID=2AA0689D3FCE5D7997231A29E716A26F' \--data-raw '{
    "prescriptionId": "p01",
    "appointmentId": "a01",
    "description": "Medicine xyz",
    "patientName": "pat03",
    "doctorName": "doc03"
  }'
```


### Dockerization

## Creating a docker image
```
$ mvn install dockerfile:build
```
## List docker images
```
$ docker images
```
## List Running Containers
``` 
$ docker ps
```
## Running the application using docker-compose
```
$ docker-compose up -d 
```
## Stopping the application 
``` 
$ docker-compose down
```


### Swagger 

http://localhost:8080/swagger-ui.html

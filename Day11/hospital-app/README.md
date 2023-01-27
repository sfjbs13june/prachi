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
$ docker run -p 8080:8080 prachi04/hospital-app:1.0.0
```

## Start app With Docker-compose
```
$ docker-compose up
```

## Stop app With Docker-compose
```
$ docker-compose down
```

## Start app With Docker-compose in back groud mode
```
$ docker-compose up -d
```

## get docker container logs
```
$ docker-compose logs
```

## List all docker container
```
$ docker ps -a
```

## List only running docker container
```
$ docker ps
```

## List all docker images
```
$ docker images
```

## Stop and remove docker container
```
$ docker stop <container-id>
$ docker rm <container-id>

```

## remove docker images
```
$ docker rmi <image-id>
```

## Stop and Remove all containers
``` 
docker stop $(docker ps -a -q)
docker rm $(docker ps -a -q)
```
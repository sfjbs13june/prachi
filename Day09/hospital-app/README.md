## Dockerization
```
$ mvn install dockerfile:build
```

## List docker images
```
$ docker images
```

## List docker running container
```
$ docker ps
```

## Stop the running container
```
$ docker stop <container-ID>
```

## Remove the container
```
$ docker rm <container-ID>
```

## Removing the image
```
$ docker rmi <IMAGE ID>
```

## Pushing the image to hub
```
$ docker push  <REPOSITORY>:<TAG>
```

## Running the application
``` 
$ docker run <Repository>:<tag>
```

## Pulling the image from hub
``` 
$ docker pull <Repo>:<tag>
```

## Running the application in docker container with port
```
$ docker run -p 8080:8080 <Repository>:<tag>
```

## Container Inspection
``` 
$ docker exec -ti <container-id> /bin/sh
```







FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD target/RESTfulTask-0.0.1-SNAPSHOT.jar RESTfulTask-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","RESTfulTask-0.0.1-SNAPSHOT.jar"]
FROM openjdk:17-jdk-alpine

WORKDIR /app


COPY target/demo-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8084

$ENTRYPOINT ["java", "-jar", "/app/app.jar"]

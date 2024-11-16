# Use an official OpenJDK 17 runtime as a base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the Maven target directory to the container
# Make sure to adjust the path to the JAR file if it's different
COPY target/demo-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port that the application will run on
EXPOSE 8084

# Specify the command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

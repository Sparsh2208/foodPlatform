# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the generated JAR file from the target directory to the container
COPY target/your-app-name-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your application runs on
EXPOSE 8094

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]

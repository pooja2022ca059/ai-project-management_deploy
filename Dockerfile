# Use OpenJDK as the base image
FROM openjdk:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from your project to the container
COPY target/ai-project-management-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application runs on
EXPOSE 8073

# The command to run your Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
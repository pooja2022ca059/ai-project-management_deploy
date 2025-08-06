# Stage 1: Build the JAR file
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

# Stage 2: Build the final image
FROM openjdk:17-jdk
WORKDIR /app
COPY --from=build /app/target/ai-project-management-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8073
ENTRYPOINT ["java", "-jar", "app.jar"]
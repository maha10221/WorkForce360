# Use official OpenJDK 23 base image
FROM openjdk:23-jdk

# Set working directory inside the container
WORKDIR /app

# Copy Spring Boot jar file into the container
COPY target/*.jar app.jar

# Expose Spring Boot port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

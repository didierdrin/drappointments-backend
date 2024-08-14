# Use the official Gradle image as a parent image
FROM gradle:7.6.1-jdk17 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the gradle configuration files
COPY build.gradle settings.gradle ./

# Copy the source code
COPY src ./src

# Build the application
RUN gradle build --no-daemon

# Use OpenJDK for running the application
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built artifact from the build stage
COPY --from=build /app/build/libs/*.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java","-jar","app.jar"]
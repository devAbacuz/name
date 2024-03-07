FROM openjdk:17-jdk-slim

WORKDIR /app
COPY ./target/name-0.0.1.jar /app

EXPOSE 8082

CMD ["java", "-jar", "name-0.0.1.jar"]
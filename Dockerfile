FROM openjdk:8-jdk-alpine
EXPOSE 8082
ADD target/achat-devops-1.0.jar achat-devops-1.0.jar
LABEL authors="user"
ENTRYPOINT ["java", "-jar","/achat-devops-1.0.jar"]
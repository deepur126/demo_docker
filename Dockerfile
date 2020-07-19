FROM winamd64/openjdk:14-jdk-nanoserver
EXPOSE 8080
ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
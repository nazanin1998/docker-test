FROM openjdk:17-alpine

WORKDIR /app

COPY pom.xml ./
RUN mvn clean package -DskipTests=true  # Skip tests for faster build

COPY target/docker-test1-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080

#VOLUME /tmp
#ARG JAR_FILE=target/docker-test1-0.0.1-SNAPSHOT.jar
#ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]



#FROM openjdk:8-stretch
#
#MAINTAINER Nwanya Justin "justin.nwanya@mintfintech.com"
#
#EXPOSE 8091
#
#WORKDIR /usr/local/bin/
#
#COPY accounts-service-0.0.1-SNAPSHOT.jar accounts-service-0.0.1-SNAPSHOT.jar
#
#ENV TZ=Africa/Lagos
#
#RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
#
## ENTRYPOINT [ "sh", "-c", "java -jar accounts-service-0.0.1-SNAPSHOT.jar --spring.config.additional-location=$CONFIG_LOCATION"]
#
#ENTRYPOINT [ "sh", "-c", "java -jar accounts-service-0.0.1-SNAPSHOT.jar"]
#
#
## syntax=docker/dockerfile:1

#FROM gcr.io/distroless/java17-debian11
FROM eclipse-temurin:17

MAINTAINER Francis "Francis"

EXPOSE 8090

WORKDIR /app

#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:resolve

#COPY src ./src
COPY target/depp.jar depp.jar

#CMD ["./mvnw", "spring-boot:run"]
ENTRYPOINT ["java", "-jar", "depp.jar"]
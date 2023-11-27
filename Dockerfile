FROM eclipse-temurin:17

MAINTAINER Francis "Francis"

EXPOSE 8090

WORKDIR /app

#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:resolve

#COPY src ./src
COPY env.sh env.sh
COPY target/depp.jar depp.jar

#CMD ["./mvnw", "spring-boot:run"]
#ENTRYPOINT ["java", "-jar", "depp.jar"]
ENTRYPOINT ["/bin/bash" , "-c", "source env.sh && printenv && java -jar depp.jar"]
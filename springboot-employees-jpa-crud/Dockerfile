FROM maven:3.6.2-jdk-8 AS backendCompilation
WORKDIR /employees
COPY pom.xml .
COPY src /employees/src/
RUN mvn package

######################

FROM maven:3.5-jdk-8-alpine
WORKDIR /app
COPY --from=backendCompilation /employees/target/springboot-employees-jpa-crud-0.0.1-SNAPSHOT.jar employees-microservice.jar

# EXPOSE 3000

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar employees-microservice.jar" ]

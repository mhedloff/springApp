FROM eclipse-temurin:17-jdk-alpine AS builder
WORKDIR /opt/app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY ./src ./src
RUN ./mvnw clean install -DskipTests

FROM eclipse-temurin:17-jre-alpine
WORKDIR /opt/app
COPY --from=builder /opt/app/target/*.jar /opt/app/app.jar
COPY --from=builder /opt/app/src/main/resources/db/migration/*.sql /opt/app/migration/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/app/app.jar"]

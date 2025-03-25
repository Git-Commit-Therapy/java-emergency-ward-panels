FROM maven:3.9-eclipse-temurin-17-alpine AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:resolve dependency:resolve-plugins

COPY . .
RUN mvn package -DskipTests


FROM eclipse-temurin:17-jre-alpine AS runtime
WORKDIR /app

COPY --from=build /app/target/emergencyWardPanels-0.0.1-SNAPSHOT.jar .

VOLUME /certs
VOLUME /trust

LABEL org.opencontainers.image.source=https://github.com/Git-Commit-Therapy/java-emergency-ward-panels

ENTRYPOINT ["java", "-jar", "./emergencyWardPanels-0.0.1-SNAPSHOT.jar"]

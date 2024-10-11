FROM eclipse-temurin:21
RUN mkdir /opt/app
COPY src/main/resources/fullstack-backend-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/japp.jar"]

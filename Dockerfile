FROM adoptopenjdk/openjdk8


ENV SPRING_PROFILES_ACTIVE dev


ADD target/simple-api-0.0.1-SNAPSHOT.jar simple-api.jar

ENTRYPOINT ["java", "-jar", "./simple-api.jar"]

FROM openjdk:8-jre
ADD target/DSPrograms-2.0-SNAPSHOT.jar ds.jar
ENTRYPOINT ["java", "-jar","ds.jar"]
EXPOSE 8088
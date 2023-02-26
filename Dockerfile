FROM openjdk:8-jre
ADD target/DSPrograms-1.0-SNAPSHOT.jar ds.jar
ENTRYPOINT ["java", "-jar","ds.jars"]
EXPOSE 8088
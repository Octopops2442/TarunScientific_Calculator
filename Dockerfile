FROM openjdk:11
COPY ./target/TarunScientific_Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-jar","TarunScientific_Calculator-1.0-SNAPSHOT.jar"]
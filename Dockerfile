FROM openjdk:11
COPY ./target/TarunScientific_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","TarunScientific_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
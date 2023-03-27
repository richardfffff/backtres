FROM amazoncorretto:11-alpine-jdk
MAINTAINER RFM
COPY target/backtres-0.0.1-SNAPSHOT.jar backtres-app.jar
ENTRYPOINT ["java","-jar","/backtres-app.jar"]

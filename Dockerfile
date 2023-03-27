FROM amazoncorretto:11
MAINTAINER RFM
COPY target/backtres-0.0.1-SNAPSHOT.jar backtres-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/backtres-0.0.1-SNAPSHOT.jar"]

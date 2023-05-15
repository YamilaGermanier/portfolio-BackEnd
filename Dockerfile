FROM amazoncorretto:11-alpine-jdk
MAINTAINER emaaristimuno
COPY target/ArgPro-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/NAME-YOUR-FILE-BUILD-SPRINGBOOT.jar"]

FROM amazoncorretto:17-alpine-jdk
MAINTAINER emaaristimuno
COPY target/ArgPro-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

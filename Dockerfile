FROM openjdk:15


COPY target/yeni.jar /yeni.jar
WORKDIR yeni.jar
RUN["java","-jar","/yeni.jar"]



FROM openjdk:15

COPY target/yildiz.jar yildiz.jar


ENTRYPOINT ["java", "-jar","yildiz.jar"]


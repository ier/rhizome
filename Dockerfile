FROM openjdk:8-alpine

COPY target/uberjar/rhizome.jar /rhizome/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/rhizome/app.jar"]

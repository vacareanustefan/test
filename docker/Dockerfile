# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine

# Copy jar file
ADD /target/test-0.0.1-SNAPSHOT.jar /test.jar

# run the app
CMD ["/usr/bin/java", "-jar", "/test.jar"]
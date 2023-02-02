FROM openjdk:11
ADD target/ProjectAction-0.0.1-SNAPSHOT.jar ProjectAction.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "ProjectAction.jar"]
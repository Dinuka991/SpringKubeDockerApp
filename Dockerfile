FROM openjdk:17-oracle
WORKDIR /opt
ENV port 9090
EXPOSE 9090
COPY build/libs/SpringKubeDockerApp-0.0.1-SNAPSHOT.war /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar

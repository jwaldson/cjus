FROM openjdk:8-jdk-alpine
VOLUME /tmp
ENV JAVA_TOOL_OPTIONS="-Duser.country=BR -Duser.language=pt"
ADD target/gatewaypagtoedza-0.0.3.jar app_gatewaypagtoedza.jar
ENTRYPOINT ["java", "-jar", "/app_gatewaypagtoedza.jar"]

FROM openjdk:8-slim-stretch

LABEL maintainer="hack3d.dev@googlemail.com"

COPY build/stoxygen-webinterface*.jar /app.jar

CMD ["/usr/bin/java", "-jar", "/app.jar"]
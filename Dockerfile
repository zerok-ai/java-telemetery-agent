# FROM --platform=linux/arm64 openjdk:18-jdk-slim
# #update the above line
#
#
# WORKDIR /usr/src/app
# ARG JAR_FILE=out/artifacts/vai_maven_jar/vai-maven.jar
# COPY ${JAR_FILE} app.jar
# # ENV OTEL_METRICS_EXPORTER=logging
# ENV OTEL_TRACES_EXPORTER=zipkin
# # ENV OTEL_LOGS_EXPORTER=logging
# ENV OTEL_SERVICE_NAME=vai-maven
# COPY agent/opentelemetry-javaagent.jar opentelemetry-javaagent.jar
# COPY agent/zipkin.jar zipkin.jar
# # COPY -r agent/zipkin .
# # WORKDIR /usr/src/app/zipkin
#
#
# EXPOSE 8080
# CMD ["java", "-javaagent:opentelemetry-javaagent.jar", "-jar", "app.jar"]
# # CMD ["java", "-jar", "app.jar"]


# FROM openjdk:18
# # ARG JAR_FILE=./target/vai-maven.jar
# WORKDIR /tmp
# COPY ../vai-maven .
# # CMD ["java","-jar", "vai-maven.jar"]


FROM openjdk:18
COPY . /tmp
WORKDIR /tmp
RUN javac src/main/CourseApiApp.java
CMD ["java", "Main"]
FROM amazoncorretto:21-alpine-jdk

COPY build/libs/otel-observability-0.0.1-SNAPSHOT.jar /app.jar
COPY opentelemetry-javaagent.jar /opentelemetry-javaagent.jar

#ENV JAVA_TOOL_OPTIONS="-javaagent:/opentelemetry-javaagent.jar"
#ENV OTEL_SERVICE_NAME="your-service-name"

ENTRYPOINT ["java", "-javaagent:/opentelemetry-javaagent.jar", "-Dotel.service.name=your-service-name", "-jar","/app.jar"]

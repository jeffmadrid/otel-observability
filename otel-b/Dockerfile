FROM amazoncorretto:21-alpine-jdk

RUN apk update && \
    apk upgrade && apk add curl

WORKDIR app

COPY build/libs/otel-b.jar ./app.jar

RUN curl -LO https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar

ENTRYPOINT ["java", "-javaagent:./opentelemetry-javaagent.jar", "-jar","./app.jar"]

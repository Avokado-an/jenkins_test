FROM openjdk:8-jre-slim

EXPOSE 8070

RUN mkdir /app

COPY build/libs/*.war /app/spring-boot-application.war

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-war","/app/spring-boot-application.war"]
FROM java:8
VOLUME /tmp
EXPOSE 8080
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-jar", "/test-0.0.1-SNAPSHOT.jar"]
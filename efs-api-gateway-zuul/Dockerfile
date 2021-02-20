FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD ./target/efs-api-gateway-zuul-0.0.1-SNAPSHOT.jar efs-api-gateway-zuul.jar
ENTRYPOINT ["java","-jar","/efs-api-gateway-zuul.jar"]
FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/efs-eureka-server-0.0.1-SNAPSHOT.jar efs-eureka-server.jar
ENTRYPOINT ["java","-jar","/efs-eureka-server.jar"]
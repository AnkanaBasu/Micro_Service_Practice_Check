FROM java:8
LABEL maintainer="ankanabasu97@gmail.com"
VOLUME /tmp
EXPOSE 8087
ADD target/menuitem-service-0.0.1-SNAPSHOT.jar menuitem-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","menuitem-service-0.0.1-SNAPSHOT.jar"]
FROM openjdk:11
EXPOSE 8080
ADD target/quizer-backend-jar.jar quizer-backend-jar.jar 
ENTRYPOINT ["java","-jar","/quizer-backend-jar.jar"]
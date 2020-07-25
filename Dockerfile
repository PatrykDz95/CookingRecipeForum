FROM openjdk:11
ADD target/cookingrecipeforum.jar cookingrecipeforum.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "cookingrecipeforum.jar"]
FROM openjdk:21
LABEL authors="AndrewSalygin"
WORKDIR /app
COPY target/bot.jar /app/bot.jar
EXPOSE 8090
EXPOSE 8001
CMD ["java", "-jar", "bot.jar"]

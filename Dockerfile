# Base image
FROM openjdk:17-jre-slim

# Uygulama dosyalarını konteynere kopyala
COPY target/satisfaction-survey.jar /app.jar

# Uygulamayı çalıştır
CMD ["java", "-jar", "/app.jar"]

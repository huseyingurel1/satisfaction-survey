# Base image
FROM openjdk:17-jdk-alpine

# Uygulama dosyalarını konteynere kopyala
COPY target/*.jar /app.jar

# Uygulamayı çalıştır
CMD ["java", "-jar", "/app.jar"]


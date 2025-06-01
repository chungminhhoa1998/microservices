FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /workspace/payment-service

# Copy toàn bộ source vào đúng thư mục làm việc
COPY ../payment-service/pom.xml ./pom.xml
COPY ../payment-service/src ./src

# Build project
RUN mvn clean package -DskipTests


FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copy file jar từ stage builder
COPY --from=builder /workspace/payment-service/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

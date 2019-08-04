# Dockerfile
FROM java:8-jre

# 设置工作目录
WORKDIR /app

# 将jar文件拷贝到镜像中。注：docker-maven-plugin 会将jar文件拷贝到构建目录target/docker/中
COPY ./pms-services-1.0-SNAPSHOT.jar /app/app.jar

EXPOSE 20880
CMD ["java", "-jar", "/app/app.jar"]
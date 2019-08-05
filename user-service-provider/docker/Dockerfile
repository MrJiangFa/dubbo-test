# Dockerfile
FROM java:8-jre
ARG JAR_FILE

# 设置工作目录
# ADD ${JAR_FILE} "/app/user-service-provider.jar"
WORKDIR /app

# 将jar文件拷贝到镜像中。注：docker-maven-plugin 会将jar文件拷贝到构建目录target/docker/中
COPY ./pms-services-1.0-SNAPSHOT.jar /app/app.jar

EXPOSE 20880
CMD ["java", "-jar", "/app/app.jar"]
#ENTRYPOINT ["/app/user-service-provider.jar","run"]
#当指定了entrypoint之后，cmd的含义发生改变，不再是直接运行期命令，而是将cmd的内容作为参数传递给entrypoint指令；

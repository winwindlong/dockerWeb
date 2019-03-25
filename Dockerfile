FROM java:latest
ADD dockerweb.jar app.jar
EXPOSE 9090
ENTRYPOINT  ["java","-jar","app.jar"]     #执行的命令

#CMD ["bash","-c","java -jar app.jar"]

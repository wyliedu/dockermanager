FROM java:8
VOLUME /tmp
ADD docker-springboot-1.0-SNAPSHOT.jar app.jar
#指定对外端口号
EXPOSE 8040
#启动java程序
#--spring.profiles.active=dev 多环境下指定环境 。 -c为清除以前启动的数据
ENTRYPOINT ["java","-jar","app.jar","--spring.profiles.active=dev","-c"]
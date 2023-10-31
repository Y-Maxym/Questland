FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . /app
RUN mvn clean install

FROM tomcat:10-jdk17-openjdk-buster
WORKDIR /usr/local/tomcat/webapps/
COPY --from=build /app/target/Questland-1.0-SNAPSHOT.war ./ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
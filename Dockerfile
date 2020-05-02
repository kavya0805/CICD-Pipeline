From tomcat:8.0.51-jre8-alpine
COPY target/cicd-pipeline-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]
From tomcat:8.0.51-jre8-alpine
ADD target/ROOT.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]
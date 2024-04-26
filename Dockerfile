FROM tomcat:10
MAINTAINER kimani
COPY build/libs/ussd.war /usr/local/tomcat/webapps/

# DemoAlfrescoActivitiExtention

build 

mvn clean install


Installing the Activiti Extension JAR
Now that we got an Activiti Extension JAR, how do we get the Activiti Enterprise server to know about it. We put it on the server’s classpath. Let’s say that our Activiti Enterprise server is installed into the /opt/activiti15 directory. Then we need to put the extension JAR into the /opt/activiti15/tomcat/webapps/activiti-app/WEB-INF/lib (important: it does not work to put the JAR into tomcat/lib):

 

martin@gravitonian:/opt/activiti15/tomcat/webapps/activiti-app/WEB-INF/lib$ cp ~/src/activiti-extension-jar/target/activiti-extension-jar-1.0-SNAPSHOT.jar .

 

After we have copied the file into the classpath we need to restart the Activiti server so it has a chance to read the new JAR:

 

martin@gravitonian:/opt/activiti15$ /opt/activiti15/tomcat/bin/catalina.sh stop

martin@gravitonian:/opt/activiti15$ /opt/activiti15/h2/stop-h2.sh

martin@gravitonian:/opt/activiti15$ ./start-activiti.sh

 

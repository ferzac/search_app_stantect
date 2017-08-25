
## Required Tools
* [Maven](https://maven.apache.org/) 3.2.1
* JDK 8
* [Tomcat](https://tomcat.apache.org/download-70.cgi) 6.0.39 +
* [Solr](http://www.apache.org/dyn/closer.lua/lucene/solr/6.6.0) 6.6.0
* [Git](https://www.atlassian.com/git/tutorials/install-git) install

## Download Source Code
* Clone the following code below or download from [GIT](https://github.com/ferzac/search_app_stantect.git)
```
$>git clone https://github.com/ferzac/search_app_stantect.git
Cloning into 'search_app_stantect'...
remote: Counting objects: 73, done.
remote: Compressing objects: 100% (49/49), done.
remote: Total 73 (delta 10), reused 70 (delta 10), pack-reused 0
Unpacking objects: 100% (73/73), done.
```
* Go to *search_app_stantect/SearchWebApp* folder
```
$>cd search_app_stantect/SearchWebApp/
$>ll
total 8
-rw-r--r--  1 ferzac  staff  1451 24 Aug 15:06 pom.xml
drwxr-xr-x  3 ferzac  staff   102 24 Aug 15:06 src
```
* Create WAR file.
```
$>mvn install
[INFO] Scanning for projects...
[INFO]
[INFO] Using the builder org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder with a thread count of 1
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building SearchWebApp 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
..............
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 6.752 s
[INFO] Finished at: 2017-08-24T15:07:02-07:00
[INFO] Final Memory: 16M/118M
[INFO] ------------------------------------------------------------------------
```
## Install Tomcat
* To install tomcat follow the tutorial on [http://www.yorku.ca/jhuang/examples/tomcat-install.html](http://www.yorku.ca/jhuang/examples/tomcat-install.html)

## Install Sorl
* Download Sorl 6.6.0 from [http://apache.mirror.colo-serv.net/lucene/solr/6.6.0/](http://apache.mirror.colo-serv.net/lucene/solr/6.6.0/).
* Unzip the file.
```
$>tar -zxvf solr-6.6.0.tgz
```
### Start Solr Server and Create Collection
* Go to *solr-6.6.0* folder.
```
$>cd solr-6.6.0/
```
* Start server.
```
$>bin/solr start
```
* Create Collection.
```
$>bin/solr create -c 'tecdictionary'
```

## Deploy the Application
* From *search_app_stantect/SearchWebApp/target* copy the War file *SearchWebApp.war* to <TOMCAT_HOME>/webapps/
* Start Tomcat.
```
$><TOMCAT_HOME>/bin/startup.sh
```

# Load Data
* To load the data into the collection go to *Load Data* tab.
* Click the Load button.

# Screen-Shot (Mobile)
![Mobile](SearchApp_Mobile.png)

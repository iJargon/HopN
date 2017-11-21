HopN Web Service

Overview
--------

HopN is a carpool service designed to serve the CPP community.

With HopN you can . . . 
- Create postings for events you are going to.
- Carpool with other CPP students.

Environment Setup
-----------------

1. Install the latests Maven (http://maven.apache.org/download.cgi)
2. Install the latest Eclipse (http://www.eclipse.org/)
3. Make sure your Eclipse has Maven installed (It should have been included in the latest version of the Eclipse)

Importing the Project into Eclipse
----------------------------------

1. File->Import->Maven->Existing Maven Projects
2. Select the directory containing the pom.xml file
3. Finish

Building the Project for the First Time
---------------------------------------
1. Right-click on the project root folder->Maven->Update Project

Running the Project Locally
----------------------------------------
1. Locate the App.java in src/main/java source folder and right-click on it->Run As->Java Application
2. Verify the running process in your web browser by the following URLs:

- http://localhost:8080/
- http://localhost:8080/cs480/ping
- http://localhost:8080/cs480/home


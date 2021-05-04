# Sky Technical Test Endpoint Testing Solution

## Introduction

> Solution for the Sky Technical Test by Hashim Ali. Project implemented in a Java Maven Project utilising TestNG and RestAssured with a BDD Approach.

Please clone the solution through GIT or by downloading and extracting the zip file from https://github.com/HashimAli1996/SkyRESTAssuredSolution
Steps to download through GIT Bash or GUI can also be found at this link.

## Installation

> To execute these tests, it is essential for the following prerequisites to be in place. 

Prerequisites: 
1. Ensure Java and Maven is Installed on machine. You can do this by opening Command Prompt, to open command line click the windows button on the bottom left of the screen and search for 'Command Prompt' and open the program.

    in the Command Prompt, type in 'java -version', if you receive an error saying " 'java' is not recognized as an internal or external command,
    operable program or batch file." it may mean Java is not installed on your machine. 

    Before we move forward, please also type in 'mvn -version' to see if Maven is installed in your machine. If the same error " 'mvn' is not recognized as         
    an internal or external command, operable program or batch file." is received then it may also mean that maven is also not installed on your machine.

    If not installed go to Step 1.1. otherwise go to Step 2.
    
       1.1. Download the following files by clicking the link(s) and following respective steps(Which are not installed):
        Java: https://www.java.com/en/download/
         and click 'Agree and Start Free Download', once the file had downloaded, execute and follow the install process.
        Maven: https://maven.apache.org/download.cgi
           Once link has opened, in the 'Files' section download the 'BINARY ZIP ARCHIVE' hyperlink option. Once Installed, right click the 
           zip folder and extract to your C: Drive Program Files folder or the folder you may have to organise 3rd party Dev Tools. 
       1.2. Click the windows button on tool bar and search for 'environment variables'. Click the result: 'Edit the system environment 
            variables'. A new window will open, in the bottom right corner click the 'Environment Variables...' button.
       1.3. In the bottom section 'System Variables' click 'New' (we will be doing this 3 times to create 3 new variables)
           First variable: In variable name, type 'JAVA_HOME' and  for the variable value type in the file path for your Java JRE folder which
           you installed before, this will be found typically in your C: Program Files folder. e.g. "C:\Program Files (x86)\Java\jre1.8.0_291" and click OK

           Second variable: In variable name, type 'M2_HOME' and for the variable value field type in the file path for your maven download 
           folder which you later extracted. e.g. "C:\Program Files (x86)\apache-maven-3.8.1" and click OK

           Third variable: In variable name, type 'MAVEN_HOME' and for the variable value field type in the file path for your maven download 
           folder which you later extracted. e.g. "C:\Program Files (x86)\apache-maven-3.8.1" and click OK

       1.4. Next step is to adjust the 'PATH' variable within the 'System Variable' Section, double click 'Path' and a list should come up for
            you (WIN 10). Click new on the right side of the panel and simply paste the file path of the 'BIN' folders for the Java and Maven
            folders. e.g. "C:\Program Files (x86)\apache-maven-3.8.1\bin". Once done click OK,  in the next window click OK again and retry
            the commands in Step 1 to make sure they are installed! You should now see your respective version numbers and application name
            for each command!

2. Java IDE required such as Eclipse, if not installed, click install link -> https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-03/R/eclipse-inst-jre-win64.exe <- Click Download and open the installer. Once the installer is executed, choose Eclipse IDE for Enterprise Java and Web Developers and continue with the installation as it is.

Prerequisites complete! Now to execute the tests

## Test Execution

> To execute the tests, follow the steps below.

1. Open Eclipse IDE and launch workspace.
2. Click File, Open Projects from File System.., and Directory next to Import Source field. Select the folder from where you downloaded it.
3. Once imported, on the top toolbar click Project and deselect Build Automatically. This is due to a Recurring issue with TestNG and the pom.xml file.
4. Right click on the pom.xml file in the Project or Package Explorer, Hover over Maven and click Update Project. Ensure the project is selected and click OK
5. Click Project in toolbar and click clean, Reclick Project in toolbar and click Build All.
6. Now the Project is ready to execute tests, navigate to src/test/java in Package explorer or src > test > java in project explorer.
7. Expand packages ListOfArticles & SingleArticle, right click on any of the files within the packages, hover over 'Run as' and click TestNG Test.

This will launch the test and output the results in the console, Thanks!


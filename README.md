# mobileqachallenge
Selenium WebDriver tests which is run using Cucumber, Maven, and Java

# System Requirements
IDEA IntelliJ
-Cucumber Plugin installed in IntelliJ 
Java Development Kit version 1.8
Maven 3

# Steps to run the test through IntelliJ
1. Open the pom.xml file and load as maven project
2. Dependencies will be downloaded by Maven
3. Create Maven run configuration in IntelliJ
4. Run the Maven test configuration created

# Steps to run the test in the command line using Maven
1. Open the project's root directory in command line app
2. Type mvn test -Dcucumber.options="-t @test"

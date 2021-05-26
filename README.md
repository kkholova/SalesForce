#update libraries
mvn versions:display-dependency-updates

[INFO] The following dependencies in Dependencies have newer versions:
[INFO]   com.cedarsoftware:java-util .......................... 1.8.0 -> 1.64.0
[INFO]   io.github.bonigarcia:webdrivermanager ................. 4.4.1 -> 4.4.3
[INFO]   org.seleniumhq.selenium:selenium-java ....... 3.141.59 -> 4.0.0-beta-3
[INFO]   org.testng:testng ..................................... 7.1.0 -> 7.4.0

mvn versions:use-latest-versions

Scanning for projects...
[INFO]
[INFO] -------------------------< groupId:SalesForce >-------------------------
[INFO] Building SalesForce 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- versions-maven-plugin:2.8.1:use-latest-versions (default-cli) @ SalesForce ---
[INFO] Major version changes allowed
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.022 s
[INFO] Finished at: 2021-05-25T23:55:56+03:00

#test run
mvn clean test

[ERROR] Failures:
[ERROR] tests.ContactTest.createNewContact
[INFO]   Run 1: PASS
[INFO]   Run 2: PASS
[ERROR]   Run 3: ContactTest.createNewContact:18 Contacts Р?Р? Р?С?РєС?С?Р?Р°С?С? expected [true] but found [false]
[INFO]
[INFO]
[ERROR] Tests run: 7, Failures: 1, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  03:05 min
[INFO] Finished at: 2021-05-26T00:15:36+03:00




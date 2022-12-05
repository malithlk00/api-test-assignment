# API Test Assignment

This is a BDD api test automation project created using Cucumber-JVM framework and Rest Assured. It contains a single scenario to verify the given acceptance criteria.

API = https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false

## Acceptance Criteria:

1. Name = "Carbon credits"
2. CanRelist = true
3. The Promotions element with Name = "Gallery" has a Description that contains the text "Good position in category"

## Project Structure

#### src/main/java
- constants: this package contains api endpoints paths
- core: this package contains the common service to call apis
- models: this is where POJO classes are created


#### src/main/resources
this contains logger and test data files


#### src/test/java
- runners - having the cucumber runner class
- step_definitions - step definition files are located here with hooks


#### src/test/resources
this contains cucumber and extent report properties file
- feature - this folder contains the feature files

#### test-results
this is the folder where extent reports are saved

## Tools and tech stack:

| Tool/Plugin                | Version      |
|----------------------------|--------------|
| IntelliJ Community Edition | 2022.3       |
| Rest Assured | 5.3.0        |
| Cucumber | 7.9.0        |
| Cucumber | TestNG 7.9.0 |
| JDK | 17           |
| Apache Maven | 3.8.1        |
| Lombok | 1.18.24      |
| Jackson | 2.14.1       |
| Extent Reports | 1.9.2        |
| Log4j | 2.19.0       |



## Run Tests

Repo link: https://github.com/malithlk00/api-test-assignment

### via command line

Clone the repository
```ssh
git clone git@github.com:malithlk00/api-test-assignment.git
```
Open the project
```ssh
cd api-test-assignment
```
Run the test
```ssh
mvn clean test
```

## Reporting

### -- Extent reports --
After the execution, Extent reports are generated under test-results directory under project root directory.

#### PDF report
PDF report can be found in test-results/Extent_PdfReport directory

#### Spark report
Spark report can be found in test-results/Extent_SparkReport directory

### -- Cucumber reports --
Cucumber reports are disabled for the moment and can be enabled using below steps
- Open the cucumber.properties file in src/test/resources of root directory
- cucumber.publish.enabled=false

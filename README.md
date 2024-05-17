# Serenity JUnit Starter project

Get started quickly with Serenity BDD and JUnit 5 with this simple starter project.

## Get the code

Click on the [Use This Template button](https://github.com/serenity-bdd/serenity-junit-starter/generate) to create a new project in your own GitHub account. 

Or simply [download a zip](https://github.com/serenity-bdd/serenity-junit-starter/archive/master.zip) file.

## Running the tests under Maven

The template project comes with both Maven and Gradle build scripts. open a command window and run the following:
    
    mvn clean verify

## Running tests on multiple browsers 
  BrowserName= [Chrome,Firefox,Edge]

    mvn clean verify -Dwebdriver.driver=Firefox



## Running the same test case in multiple environments
  Environment= [default,staging,preprod,prod]

    mvn clean verify -Denvironment=default

    
## Viewing the reports

Both of the commands provided above will produce a Serenity test report in the `target/site/serenity/index.html`  or `target/site/serenity/serenity-summary.html`directory. Take a look!


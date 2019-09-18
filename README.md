# branch_Automation

This automation was scripted on page object model custom framework with Java, Selenium and Rest Assured Framework and test was excecuted with cucumber BDD feature file. You will be able to execute the test, by importing into Eclipse IDE and run it from feature file or Runner class - RunnerTest.java.

I have used maven dependencies for the libraries required and webdriver manager library for the the chrome driver.

This workflow covers the validation of API response, status codes, URL check navigation between pages and validation of click on the page using assertion and handle dynamic web tables. The locators are identified with name, id, relative CSS and relative xpath. 

The folder structure is as follows,
- src/main/java
  - branchAutomation.PageObjects
    - DashboardPage.java - Contains the class with locators of the elements in the Dashboard Page
    - LoginPage.java - Contains the class with locators of the elements in the Login Page
  - branchAutomation.PageObjects
    - RunnerTest.java - Contains Cucumber Runner Class to execute the test
    - StepDefs.java - Contains the step definitions for the corresponding feature file
  - branchAutomation.Utils
    - BaseInitialiation.java - Contains common functions used by all the pages
    - BrowserUtils.java - Contains functions which are used reused and commonly used across the entire framework
- src/test/resources
  - features
    - androidClick.feature - Contains the cucumber test scenario in gerkins
- src/main/resources
    - config.properties - Contains the static reusable inputs in file
- src/test/java
  - branchAutomation.PageNav
    - BranchAPI.java - Contains test methods that corresponds to API calls
    - DashboardPageNav.java - Contains test methods that corresponds to Dashboard Page
    - GlobalVariableManager.java - Contains the global variables, getter and setter functions for the variables
    - LoginPageNav.java - Contains test methods that corresponds to Login Page
    - NavInitialization.java - Contains the objects of the class which contains the test methods
- target
  - Reports available after the execution of unit test

# Prerequisites

1. install java devolepment kit (JDK) on your computer.

http://www.oracle.com/technetwork/java/javase/overview/index.html

# IDE Installation

5. Download and Install Eclipse

# Running automated tests

1. Clone "branch".

2. open "branch" project using Eclipse.

3. To Run automation script --

## Locally

* Assuming the JDK is already present.

Execute Runner Class or run mvn clean test in cmd:

-- This executes test cases based on tags mentioned in the Runner class 



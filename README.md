# The Internet Herokuapp Maven

**The Internet Hero Co-op Maven** is an automated testing framework for "The Internet" web application, implemented in Java with Maven. The project leverages Selenium WebDriver, TestNG, and custom logging to provide comprehensive automated tests for various web elements and user interactions.

## Technologies Used
- Java 11+  
- Maven  
- Selenium WebDriver  
- TestNG (with `@Before` and `@After` hooks)  
- Logback (for logging)  
- CSV files for test data  
- Page Object Model (POM) design pattern  

## Features
- Organized using **Page Object Model** for easy maintenance and scalability.  
- Covers functional areas including Add/Remove operations, Checkboxes, Context Menu, Drag & Drop, Dropdowns, File Uploads, Horizontal Slider, Covers, Home Page, and Login.  
- Includes **Listeners** for logging events and capturing screenshots on test failures.  
- Tests are modularized, following best practices for automated UI testing.

Project Structure Overview:
src/main/java/com/the/internet/pages — Page classes representing UI components
src/main/java/com/the/internet/config — ApplicationManager for setup and configuration
src/main/java/com/the/internet/utils — DataProvider and MyListener
src/test/java/com/the/internet/tests — Test classes for all features (Add, Remove, Checkboxes, etc.)
resources/ — Logback configuration, CSV test data, TestNG XML suites
target/ — Compiled classes and Maven reports

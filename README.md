# Automation-Java-Selenium-
Selenium Java for e-commerce flows
Automation framework built using Java + Selenium to automate core Ecommerce user flows 
This projects shows practical automation skills including UI automation , framework structure , reusable utilities

# Technology Stack

Java
Selenium WebDriver
TestNG
Maven
Page Object Model (POM)

# Project Objective

The goal of these project is to automate important user journeys is an E-Commerce application and demonstrate a clean automation framework structure suitable for real automation projects.

# Automated Test Scenarios 
Following scenarios are automated 

1. User Login
2. Product Search
3. Add product to cart
4. Checkout Flow
5. Logout

These scenarios simulate real user behaviour in an online shopping system.

# Project Structure

src/test/java

base
BaseTest.java

pages
LoginPage.java
ProductPage.java
CartPage.java

tests
LoginTest.java
OrderTest.java

utilities
DriverFactory.java
ConfigReader.java
ScreenshotUtil.java

testdata
loginData.json

pom.xml
testng.xml

# Framework Design
These framework follows Page Object Model (POM) to improve maintainability
Page classes contain element locators and page actions
Test classes contain actual test scenarios.
Reusable utilites handle driver setup, configuration, and screenshots.




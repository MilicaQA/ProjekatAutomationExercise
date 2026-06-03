# Automation Exercise - Selenium Test Automation Project

## Project Overview

This project contains automated UI tests for the Automation Exercise website:

https://automationexercise.com/

The goal of the project is to practice test automation using Java, Selenium WebDriver, TestNG and the Page Object Model (POM) design pattern.

---

## Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* ChromeDriver

---

## Project Structure

src/test/java

* Base

  * BaseTest.java

* Pages

  * HomePage.java
  * LoginPage.java
  * ProductsPage.java
  * CartPage.java
  * ContactUsPage.java

* Tests

  * LoginTest.java
  * ProductsTest.java
  * CartTest.java
  * ContactUsTest.java

---

## Automated Test Scenarios

### Login Tests

* User can log in with valid credentials
* User receives error message with invalid credentials
* User can log out successfully

### Products Tests

* User can search for a product
* User can view product details
* User can browse categories
* User can browse products by brand

### Cart Tests

* User can add a product to cart
* User can remove a product from cart

### Contact Us Tests

* User can submit the Contact Us form successfully

---

## Design Pattern

The project follows the Page Object Model (POM) design pattern.

Each page contains:

* Locators
* Page actions (methods)
* Page-specific validations

This improves code readability, maintainability and reusability.

---

## How to Run

1. Clone the repository

git clone <repository-url>

2. Open the project in IntelliJ IDEA

3. Install Maven dependencies

4. Run tests:

   * From TestNG test classes
   * Or using Maven

mvn test

---

## Author

Milica Nikolic

Junior QA Automation Practice Project

# 🛒 OpenCart Automation Project

## 📌 Project Overview

This project is an automation testing framework for the OpenCart demo e-commerce website.

The goal is to test core functionalities such as:

* User registration
* Login
* Product search
* Shopping cart

The framework is built using **Selenium WebDriver**, **TestNG**, and follows the **Page Object Model (POM)** design pattern.

---

## 🛠 Technologies Used

* Java 8+
* Selenium WebDriver 4.x
* TestNG 7.x
* Maven
* Git & GitHub

---

## 🌐 Tested Website

* https://demo.opencart.com
  *(or alternative: http://opencart.abstracta.us/ if bot protection appears)*

---

## ⚙️ Prerequisites

Before running the project, make sure you have:

* Java installed (JDK 8 or higher)
* Maven installed
* Google Chrome browser installed
* ChromeDriver configured (or WebDriverManager)

---

## 🚀 Installation & Setup

1. Clone the repository:

```
git clone https://github.com/your-username/opencart-automation-project.git
```

2. Open the project in IntelliJ IDEA

3. Install dependencies:

```
mvn clean install
```

4. Run tests:

* Right-click `testng.xml`
* Click **Run**

---

## 🧪 Test Cases

### 🔹 Registration Tests

* testSuccessfulRegistration
* testRegistrationWithExistingEmail

### 🔹 Login Tests

* testValidLogin
* testInvalidEmail
* testInvalidPassword

### 🔹 Search Tests

* testValidSearch
* testInvalidSearch
* testEmptySearch

### 🔹 Cart Tests

* testAddToCart
* testRemoveFromCart

---

## 📂 Project Structure

```
src/main/java/pages/
    HomePage.java
    SearchPage.java
    ProductPage.java
    CartPage.java
    RegisterPage.java
    LoginPage.java

src/test/java/base/
    BaseTest.java

src/test/java/tests/
    RegistrationTests.java
    LoginTests.java
    SearchTests.java
    CartTests.java
```

---

## 🧩 Page Object Model (POM)

The project uses the Page Object Model design pattern:

* Each page is represented as a class
* Locators and methods are separated from test logic
* Improves readability, reusability, and maintenance

---

## 🧪 Test Execution

Tests are organized using **TestNG groups**:

* **Smoke Tests** → critical functionality
* **Regression Tests** → full coverage

To run:

* Use `testng.xml`

---

## ⚠️ Notes

* The demo site resets every 24 hours
* Use dynamic email for registration tests
* If Cloudflare blocks automation, use:

  * http://opencart.abstracta.us/

---

## 👤 Author

Your Name
GitHub: https://github.com/your-username

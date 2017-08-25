# AppiumCalculator
Simple project to practice Appium and Cucumber.

## Prerequisites
- Java 1.7 or greater;
- Maven;
- Appium server running;
- An Android device with USB debugging enabled

## Execution
Edit the AppiumDriverSingleton.java file putting your device information and the absolute path to Calculator.apk on DesiredCapabilities, and also check the AppiumDriver URL;   
Navigate to the project's root directory and run:   
- mvn clean install   
- mvn -Dtest=RunFeatures test

## Test
After the execution, it will install the Calculator app and test the 4 basic arithmetic operations.
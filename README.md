# PlayWright-Java-ECommerce-POC
## Ready-to-use UI Test Automation Architecture using Java and Playwright.

### Languages and Frameworks
The project uses the following:

- Java 18 as the programming language.
- Playwright as the web browser automation framework using the Java binding.
- TestNG as the testing framework.
- Extent Reports as the test reporting strategy.
- Maven as the Java build tool.
- IntelliJ IDEA as the IDE.

Project Architecture

- resources
  - config- Global Configurations like URL and Credentials
  - testrunners- Contains testNG Suite file
- listeners - ExtentReportListeners
- pages- Page Object Files
- build-Extent report file
- tests - TestNG test Files
- factory- Playwright pagefactory file
- constants- application constants 
- base - BaseTest File .
- screenshots- have generated screenshots 
    
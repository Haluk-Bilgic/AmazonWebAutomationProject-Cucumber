# AmazonWebAutomationProject-Cucumber
This project is a case study that tests main functions of some pages on Amazon for Web UI Automation.
## Language and Frameworks
* Java
* Selenium WebDriver
* Maven
* Cucumber
* POM Design Pattern
* Page Factory Design
* Intellij IDE
* Chrome and Firefox as a Browser

## Test Steps
    Given navigate to ”https://www.amazon.com/”
    When Enter “socks” to search box
    And Open the second page of the results
    And Verify the second page is opened
    And Select the product on the second row and second column
    And Select first available size on the “Size” dropdown element
    And Click on the “Add to Cart” button on the newly opened right panel
    And Verify the “Added” text is visible
    Then Verify a check icon is is visible just near the “Added” text

@Contact
Feature: Login to Bank of America
@Smoketest
  Scenario: Login to Bank of America url
    Given user landed on bank homepage
    When user clicked contact.us page
    Then user registered his user name
    
 @RegressionTest
  Scenario: Login to Bank of America url2
    Given user landed on bank homepage
    When user clicked contact.us page
    Then user registered his user name

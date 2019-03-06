Feature: Mobile QA Challenge

  Scenario: 01 Navigate to Kraken website and check that the landing page title
    Given I am at http://www.kraken.com website
    When I obtain the page title
    Then I should be able to see "Bitcoin & Cryptocurrency Exchange | Bitcoin Trading Platform | Kraken" as the page title


  Scenario Outline: 02 Input a text in to a text field in Kraken's Create Account
    Given I am at http://www.kraken.com website
    When I am at the Create Account page
    And I type "<email>" in the email field
    And I type "<username>" in the
    Then I should see "<email>" in the email field
    And I should see "<username>" in the username field
    Examples:
      | email             | username |
      | elacang@gmail.com | elacang  |


  Scenario: 03 Navigate to W3Schools HTML tables page and assert a country corresponding to a company
    Given I am at https://www.w3schools.com/html/html_tables.asp website
    When I get the country for Alfreds Futterkiste company in the HTML table
    Then I should receive Germany as the company

  @test
  Scenario: 04 Select "Digtal Music" department from Amazon website
    Given I am at http://www.amazon.com website
    When I navigate to "Digital Music" department from the menu
    And I obtain the page title
    Then I should be able to see "Amazon.com: Digital Music" as the page title

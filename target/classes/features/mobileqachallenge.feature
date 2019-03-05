Feature: Mobile QA Challenge

  @test
  Scenario: 01 Navigate to Kraken website and check that the landing page title
    Given I am at http://www.kraken.com website
    When I obtain the pagetitle
    Then I should be able to see "Bitcoin & Cryptocurrency Exchange | Bitcoin Trading Platform | Kraken"

  Scenario Outline: 02 Input a text in to a text field in Kraken's Create Account
    Given I am at http://www.kraken.com website
    When I am at the Create Account page
    And I type "<email>" in the email field
    And I type "<username>" in the
    Then I should see <email> in the email field
    And I should see <username> in the username field
    Examples:
      | email             | username |
      | elacang@gmail.com | elacang  |


  Scenario: 03 Navigate to Kraken's Price page and get Volume
    Given I am at http://www.kraken.com website
    When I am at the Create Account page
    And I type "<email>" in the email field
    And I type "<username>" in the
    Then I should see <email> in the email field
    And I should see <username> in the username field
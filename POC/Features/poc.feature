Feature: Checking POC Feature

  Scenario: Testing the POC Feature
    Given user launch the application
    When user enter username and password as "standard_user" and "secret_sauce"
    And user click on login button
    Then user get named and price of first availaible item
    And user click on add to cart btn
    And user navigate to cart
    And user continue to checkout the item
    And user fill the details for delivery
    Then user verfiy the confirmation message



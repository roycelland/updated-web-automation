Feature: Market and Eats end to end transaction

  Background:
    Given user is on landing page

  Scenario: Guest | Deliver Later | Cash
    When user click eats button
    Then user gets the url of eats page
    When user select "Popeyes"
    When user select "pickup" as fulfillment type
    And user add eats product to cart
#    And user click market button
#    And user gets the url of market page
#    And user select deliver later as fulfillment type
#    And user select category
#    And user add market product to cart
    And user click cart
#    And user add quantity per item
#    And user select product to checkout
#    And user select delivery date and time
#    And user fill up contact details
#    And user select cash as payment option
#    And user click place order
#    Then user will see the tracking order
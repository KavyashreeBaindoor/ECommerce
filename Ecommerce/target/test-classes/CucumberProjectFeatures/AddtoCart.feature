
@tag
Feature: Add items to Cart and verify 
  

  
  Scenario Outline: Adding Items To Cart
    Given user is on Greenkart landing page
   When search product with shortname <Name> and extract actual name of product
    And  Add product to Cart
    And  Proceed to Checkout
    Then validate name of product selected 
    And apply and placeOrder buttons are displayed
    
    Examples:
    
    | Name |
    | tom |



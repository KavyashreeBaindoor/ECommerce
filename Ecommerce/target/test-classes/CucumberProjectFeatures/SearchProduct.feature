
@tag
Feature: Search and place order for Products
 

  @search
  Scenario Outline: Search experience of user in both home and deals page should be same
  
  #dont use click ,type,search --- it should all be business terminology  --understandable by PO
  
    Given user is on Greenkart landing page
   
    #When search product with shortname "tom" and extract actual name of product
    
     When search product with shortname <Names> and extract actual name of product
   
    Then user searches the  product <Names> with shortname in offers page to see if product exists
    
    And validate offersPage prod name validates with ProductPage prod name
    
    Examples:
    | Names |
    | Tom |
    | Beet |
  

 

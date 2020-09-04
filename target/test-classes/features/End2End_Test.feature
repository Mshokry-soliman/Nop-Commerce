Feature: Automated E2E Tests

  Scenario Outline: Customer place an order by purchasing an item from search
    Given user is in Home page
    When He search for "<productName>"
    And choose to buy two items
    And moves to checkout cart and enter personal details on check outpage and place the order
    Then he can view the order and download the invoice

    Examples: 
      | productName               |
      | Apple MacBook Pro 13-inch |

Feature: Verify Trade Me Category details
  As a user I want to get the details of the given category id so that I can verify below acceptance criteria
  - Name = "Carbon credits"
  - CanRelist = true
  - The Promotions element with Name = "Gallery" has a Description that contains the text "Good position in category"


  Scenario Outline: Verify category details for given id
    When I get the category details of "<ID>"
    Then status code is <statusCode>
    And category name is "<category_name>"
    And canrelist is set to "<relist>"
    And promotion name "<promo_name>" contains text "<description>"

    Examples:
      | ID    | statusCode | category_name     | relist | promo_name  | description |
      | 6327  |    200     | Carbon credits    | true   | Gallery     | Good position in category   |
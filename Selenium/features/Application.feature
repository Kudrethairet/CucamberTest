Feature: Test information in geico

  Scenario Outline: Test login with valid credentials
    Given Open FireFoxDriver and go to homePage
    When enter firstname"<firstname>" and lastname"<lastname>"
    Then enter address"<address>"
    Then close application

    Examples: 
      | firstname | lastname | address       |
      | Kudret    | lastname  | Honey Bee Way |
      | Kaiser    | Hairet    | Honey Bee Way |

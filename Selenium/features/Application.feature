Feature: Test information in geico

  Scenario Outline: Test login with valid credentials
    Given Open FireFoxDriver and go to homePage
    When enter firstname"<firstname>" and lastname"<lastname>"
    Then enter address"<address>"
    When enter zipcod "<zip_code>" and enter date_of_birth"<date of birth>"
    When Click submit botton
    Then Verify the title
    Then close application

    Examples: 
      | firstname | lastname | address       | zip_code | date of birth |
      | Mike      | Json     | Honey Bee Way |    20111 |      07281994 |
      | Sarea     | Jhon     | Honey Bee Way |    20151 |      10201998 |
      | Peter     | Wang     | Barbely Hill  |    22031 |      01261989 |
      | Steven    | King     | Hollywood     |    20112 |      07251978 |

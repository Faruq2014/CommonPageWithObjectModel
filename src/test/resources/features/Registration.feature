@facebook
Feature: Registration page

  @Reg
  Scenario Outline: Registration page for multiple users
    Given user open facebook application
    When user input <firstName> and <lastName>
    And user enter <mobileEmail>
    And user enter new password <passowrd>
    And user enter <month> and <day> and <year>
    And user select <gender>
    And user click reg button
    Then I verify registration page is created

    Examples: 
      | firstName | lastName | mobileEmail | passowrd   | month | day  | year   | gender   |
      | "Tania1 " | "Khan1"  | "778809"    | "TaslimaA" | "Jan" | "12" | "2002" | "female" |
      | "Tania2 " | "Khan2"  | "778809"    | "TaslimaB" | "Jan" | "12" | "2002" | "male"   |
      | "Tania3 " | "Khan3"  | "778809"    | "TaslimaC" | "Jan" | "12" | "2002" | "male"   |
      | "Tania4 " | "Khan4"  | "778809"    | "TaslimaD" | "Jan" | "12" | "2002" | "custom" |

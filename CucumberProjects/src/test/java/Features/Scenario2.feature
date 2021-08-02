Feature: Scenario2
  This  feature deals with the undergraduate student should see how many seats are still open for DSC 101 in Fall 2018 Session C

  Scenario: As a Tempe undergraduate student, I want to see how many seats are still open for DSC 101 in Fall 2018 Session C .
    Given I navigate to ASU home page
      | https://webapp4.asu.edu/catalog/  |
    And I select Term
      | Fall 2018 |
    And I select Subject
      | DSC |
    And I select CatNumber
      | 101 |
    And  I Click and Select Section
      | C |
    And I Click and  Select Location
      | Tempe |
    And I click on Advance Search
    And I select Level
      | Undergrad |

    Then I should see Number of seats available

    And I select Course From Catalog List

    Then I should see the login Form

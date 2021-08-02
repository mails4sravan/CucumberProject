Feature: Scenario1
  This feature deals with the undergraduate student stay on track for graduating next year

  Scenario: As an online undergraduate student, I want to add an English 101 course to my schedule for Fall 2018 so that I can stay on track for graduating next year.
    Given I navigate to ASU home page
      | https://webapp4.asu.edu/catalog/  |
    And I select ASU Online Classes
    And I select Term
      | Fall 2018 |
    And I select Subject
      | ENG |
    And I select CatNumber
      | 101 |
    And I click on Advance Search
    And I select Level
      | Undergrad |
    And I select Course From Catalog List
    Then I should see the login Form

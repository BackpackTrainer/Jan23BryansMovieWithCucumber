Feature:  Add a Movie

  Scenario: Everythings works for a drama movie
    Given I have a browser open
    When I navigate to "http://localhost:8080/movie/add"
    And I enter "132-45" in the ISBN box
    And I enter "Random" in the Title box
    And I select "drama" from the dropdown
    And I click the submit button
    Then I see that "Random" was successfully added

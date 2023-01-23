Feature:  Navigating the site with a Scenario Outline

  Scenario Outline:  Navigate to Index
    Given I have a <browser> browser open
    When I navigate to <url>
    Then I am on the <page title> page

    Examples:
      | browser   | url                               | page title  |
      | "Chrome"  | "http://localhost:8080"           | "Index"     |
      | "Chrome"  | "http://localhost:8080/movie"     | "Get All"   |
      | "Firefox" | "http://localhost:8080/movie/add" | "Add Movie" |



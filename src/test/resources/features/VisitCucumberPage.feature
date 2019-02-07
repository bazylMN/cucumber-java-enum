Feature: As a user i want to visit cucumber page

  Scenario: Visit cucumber as first page and wp as second page
    Given I go to "cucumber" page
      Then I should be on "https://cucumber.io/" page
      When I go to "WP" page
      Then I should be on "https://www.wp.pl/" page

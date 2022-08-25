Feature: Test

  @TestUI
  Scenario: Login into the system and sort by column
    Given login into the system
    Then user should see "Casino" header
    And user clicked on the side menu Users button
    Then appear new side menu's values and clicked player button
    Then should appear new table with credentials of Players
    When user sorted players by amount on page and select 100
    Then user should see 100 players on page

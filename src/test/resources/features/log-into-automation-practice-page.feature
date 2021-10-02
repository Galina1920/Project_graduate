Feature: Log into Automation Practice page

  @Run
  Scenario: Log into Automation Practice page
    Given user is at 'http://automationpractice.com/index.php' page
    When  user click on sign in button
    And  user complete form with valid data
      | emailAddress                    | password     |
      | andrusca.galina@gmail.com       | tayah1920    |
    Then click on submit button
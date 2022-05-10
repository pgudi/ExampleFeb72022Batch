@pp
Feature: Login and Logout functionality New4
description this feature validates login and logout functionality

Scenario: Login with valid credentials
Given I launch a Chrome browser
And I navigate the URL of the application
When I enter the username in username text field
And I enter the password in Password text field
And I click on login button
Then I find the Home Page
And I minimize the flyout window


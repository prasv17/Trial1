Feature:  Login page feature

Scenario: HomePage title

Given User is on homepage
When User gets the title of the page 
Then Page title should be "Automation Practice Site" 


Scenario: Log in with correct credentials

Given User is on homepage
When  User enters username "pras@gmail.com"
And   User enters password  "ABC123@"
And   User clicks on login button
Then  User gets to memebers area
And   The title should be "Members"
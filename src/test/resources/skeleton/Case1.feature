Feature: Application registration

Scenario: Register to the TestMe app

Given user launches chrome browser and navigates to application url
When user clicks on SignUp 
When user enters userame as "Akshita" in the username field
* User enters first name as "Akshita" in the first name field
* User enters last name as "Dixit" in the last name field
* user enters password as "Akshita123" in the password field
* user enters password as "Akshita123" in the confirm password field
* user selects gender
* user enters email as "Akshita@gmail.com"
* user enters mobile number as "1234567890"
* user enters enters dob as "01/09/1997"
* user enters address as "F-5 D Block"
* user selects security question
* user enters answer as "abc"
And user clicks on Register button
And user validates registration success 



Feature: Application login

Scenario Outline: Login to the app using registered username and password

Given user launches the chrome browser and navigates to application url
* user clicks on signIn
When user enters username as "<username>" in the username field
When user enters password as "<password>" in th epassword field
And clicks on Login
And validates login success

Examples:
|username|password|
|Lalitha|Password123|
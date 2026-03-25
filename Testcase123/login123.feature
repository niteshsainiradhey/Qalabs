Feature: Login
Background: all commans
Given launch chrome browser
When enter url "https://www.saucedemo.com/"
@positive
Scenario: login with valid input

And enter username "standard_user" and password "secret_sauce"
And click on submit
Then page title "Logged In Successfully | Practice Test Automation"
When close browser

@negative
Scenario: login with invalid input

And enter username "standard_user122" and password "secret_sauce34"
And click on submit
Then page title "Logged In Successfully | Practice Test Automation"
When close browser




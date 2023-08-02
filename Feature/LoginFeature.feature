Feature: Login

Scenario: Successfull login with valid creadential
	Given that the user launches the chrome browser
	When the User opens the URL "https://admin-demo.nopcommerce.com/login"
	And the User enters the Email as "admin@yourstore.com" and the password as "admin"
	And the User click on login button
	Then the page Titile should display "Dashboard / nopCommerce administration"
	When the User clicks on the logout button
	Then the Page Title should be display "Your store. Login"
	And the Browser is closed
	

	
Feature: Customer

Scenario: Add new Customer
	Given that the user launches the chrome browser
	When the User opens the URL "https://admin-demo.nopcommerce.com/login"
	And the User enters the Email as "admin@yourstore.com" and the password as "admin"
	And the User click on login button
	Then the page Titile should display "Dashboard / nopCommerce administration"
	When User click on customer Menu
	And Click on customer menu Item
	And Click on add new button
	Then View add new customer page
	When User enter customer info
	And click on Save button
	Then User can view confirmation message "The new customer has been added successfully."
	And the Browser is closed
	
	
Scenario: Search Customer By Email
	Given that the user launches the chrome browser
	When the User opens the URL "https://admin-demo.nopcommerce.com/login"
	And the User enters the Email as "admin@yourstore.com" and the password as "admin"
	And the User click on login button
	Then the page Titile should display "Dashboard / nopCommerce administration"
	When User click on customer Menu
	And Click on customer menu Item
 	And Enter customer email
 	When Click on search button
 	Then User should found email in the search table
 	And the Browser is closed


		
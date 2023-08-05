package StepDefination;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import PageObject.SearchCustomerPage;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage loginPg;
	public AddNewCustomerPage AddNeCuPg;
	public SearchCustomerPage SeearchCuPg;
	public String generateEmailID() {
		return (RandomStringUtils.randomAlphabetic(5));
	}
	

}

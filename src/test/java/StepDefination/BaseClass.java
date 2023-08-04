package StepDefination;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage loginPg;
	public AddNewCustomerPage AddNeCuPg;
	
	public String generateEmailID() {
		return (RandomStringUtils.randomAlphabetic(5));
	}
	

}

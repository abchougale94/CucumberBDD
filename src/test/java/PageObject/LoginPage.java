package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;

	public LoginPage(WebDriver lDriver) {
		
		ldriver = lDriver;
		PageFactory.initElements(lDriver,this);
		
	}
	
	@FindBy(id="Email")
	WebElement txtEmail;
	
	@FindBy(id="Password")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement btnLogin;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement btnLogout;
	
	public void enterEmail(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		btnLogin.click();
	}
	
	public void clickOnLogoutButton() {
		btnLogout.click();
	}
	
	

}

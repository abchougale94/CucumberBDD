package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDef extends BaseClass {
	

	
	
	@Given("that the user launches the chrome browser")
	public void that_the_user_launches_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		loginPg = new LoginPage(driver);
		
		
		
	}

	@When("the User opens the URL {string}")
	public void the_user_opens_the_url(String url) {
		
		driver.get(url);
		
	}

	@When("the User enters the Email as {string} and the password as {string}")
	public void the_user_enters_the_email_as_and_the_password_as(String email, String password) {
		loginPg.enterEmail(email);
		loginPg.enterPassword(password);
	
	}

	@When("the User click on login button")
	public void the_user_click_on_login_button() {
		loginPg.clickOnLoginButton();
		
	}

	@Then("the page Titile should display {string}")
	public void the_page_titile_should_display(String string) {

		String expectedPageTtitle=driver.getTitle();
			if(string.equals(expectedPageTtitle)) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
				
	
	}

	@When("the User clicks on the logout button")
	public void the_user_clicks_on_the_logout_button() {
		loginPg.clickOnLogoutButton();
		
	}

	@Then("the Page Title should be display {string}")
	public void the_page_title_should_be_display(String string) {
		String expectedPageTtitle=driver.getTitle();
		if(string.equals(expectedPageTtitle)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}

	@Then("the Browser is closed")
	public void the_browser_is_closed() {
			driver.quit();
	}


}

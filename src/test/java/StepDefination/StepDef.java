package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.AddNewCustomerPage;
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
		AddNeCuPg=new AddNewCustomerPage(driver);
		
		
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

	@When("User click on customer Menu")
	public void user_click_on_customer_menu() {
		AddNeCuPg.clickOnCustomerMenu();

	}

	@When("Click on customer menu Item")
	public void click_on_customer_menu_item() {
		AddNeCuPg.clickOnCustomerItem();
	}

	@When("Click on add new button")
	public void click_on_add_new_button() {
		AddNeCuPg.clickOnAddButton();
	}

	@Then("View add new customer page")
	public void view_add_new_customer_page() {
		String actualTitle=driver.getTitle();
		String expectedTitle="Add a new customer / nopCommerce administration";
		if(actualTitle.equals(expectedTitle)) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}
	
	@When("User enter customer info")
	public void user_enter_customer_info() {
		
		AddNeCuPg.enterEmailID(generateEmailID()+"@gmail.com");
		AddNeCuPg.enterPassword("Abhi1245$");
		AddNeCuPg.enterFistName("Abhi");
		AddNeCuPg.enterLastName("ch");
		AddNeCuPg.selectGender("Male");
		AddNeCuPg.enterDateOfBirth("8/4/2023");
		AddNeCuPg.enterCompanyName("Qspider");
		AddNeCuPg.selectIsTaxExempt();
//		AddNeCuPg.selectNewslatter("Your store name");
//		AddNeCuPg.selectCustomerRole("Administrators");
//		AddNeCuPg.selectManagerByVender("Vendor 1");
		AddNeCuPg.enterAdminComment("Comment");
		
		
	}

	@When("click on Save button")
	public void click_on_save_button() {
		AddNeCuPg.clickOnSaveButton();	
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
		String bodyTag=driver.findElement(By.tagName("Body")).getText();
		if(bodyTag.contains(string)) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}
	


}

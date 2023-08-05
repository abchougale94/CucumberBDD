package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage {
	
	WebDriver driver;

	public SearchCustomerPage(WebDriver lDriver) {
			driver = lDriver;
			PageFactory.initElements(lDriver, this);
	}
	
	@FindBy(id="SearchEmail")
	WebElement txtEmail;
	
	@FindBy(id="search-customers")
	WebElement btnsearchCustomer;
	
	@FindBy(id="customers-grid")
	WebElement table;
	
	@FindBy(xpath="(//table)[2]//tbody//tr")
	List<WebElement> totalRow;
	
	public void enterEmail(String email) {
		txtEmail.sendKeys(email);
	}
	public void clickOnSearchButton() {
		btnsearchCustomer.click();
	}
	public boolean searchCustomerByEmail(String email) {
		
		boolean found=false;
		List<WebElement> totalemail=driver.findElements(By.xpath("//table[@id='customers-grid']//tbody/tr//td[2]"));
		for(WebElement e:totalemail) {
			if(e.getText().equals(email)) {
				found=true;
				break;
			}
		}
		return found;
	}
	

}

package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomerPage {
	
	WebDriver ldriver;
	
	public AddNewCustomerPage(WebDriver lDriver) {
		ldriver=lDriver;
		PageFactory.initElements(lDriver, this);
	}
	
	@FindBy(xpath="//UL[@class='nav nav-pills nav-sidebar flex-column nav-legacy']/LI[4]/A[@href='#']")
	WebElement customerMenu;
	
	@FindBy(xpath="//a[@href='/Admin/Customer/List']")
	WebElement customerItem;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement btnAddNew;
	
	@FindBy(id="Email")
	WebElement txtEmail;
	
	@FindBy(id="Password")
	WebElement txtPassword;
	
	@FindBy(id="FirstName")
	WebElement txtFirstName;
	
	@FindBy(id="LastName")
	WebElement txtLastName;
	
	@FindBy(id="Gender_Male")
	WebElement ReBtnGenderMale;
	
	@FindBy(id="Gender_Female")
	WebElement ReBtnGenderFemale;
	
	@FindBy(id="DateOfBirth")
	WebElement txtDateOfBirth;
	
	@FindBy(id="Company")
	WebElement txtCompanyName;
	
	@FindBy(id="IsTaxExempt")
	WebElement ReBtnIsTaxExempt;
	
	@FindBy(id="SelectedNewsletterSubscriptionStoreIds")
	WebElement drpdwnNewsLatter;
	
	@FindBy(id="SelectedCustomerRoleIds")
	WebElement drpdwnCustomerRole;
	
	@FindBy(id="VendorId")
	WebElement drpdwnMangerVeder;
	
	@FindBy(id="Active")
	WebElement reBtnActive;
	
	@FindBy(id="AdminComment")
	WebElement txtAdminComment;
	
	@FindBy(name="save")
	WebElement BtnSave;
	
	
	public void clickOnCustomerMenu() {
		customerMenu.click();
		
	}
	public void clickOnCustomerItem() {
		customerItem.click();
	}
	
	public void clickOnAddButton() {
		btnAddNew.click();
	}
	public void enterEmailID(String email) {
		txtEmail.sendKeys(email);
	}
	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
	}
	public void enterFistName(String Firstname) {
		txtFirstName.sendKeys(Firstname);
	}
	public void enterLastName(String lastName) {
		txtLastName.sendKeys(lastName);
	}
	public void selectGender(String gender) {
		if(gender.equals("Male")) {
			ReBtnGenderMale.click();
		}
		else if(gender.equals("Female"))
			ReBtnGenderFemale.click();
		else
			ReBtnGenderFemale.click();
	}
	public void enterDateOfBirth(String DOB) {
		txtDateOfBirth.sendKeys(DOB);
	}
	public void enterCompanyName(String Cname) {
		txtCompanyName.sendKeys(Cname);
	}
	public void selectIsTaxExempt() {
		ReBtnIsTaxExempt.click();
	}

	/*
	 * public void selectNewslatter(String value) {
	 * drpdwnNewsLatter.sendKeys(value);
	 * 
	 * }
	 */
//	public void selectCustomerRole(String i) {
//		Select sl=new Select(drpdwnCustomerRole);
//		sl.selectByValue(i);
//	}
//	public void selectManagerByVender(String i) {
//		Select slt=new Select(drpdwnMangerVeder);
//		slt.selectByValue(i);
//	}
	public void enterAdminComment(String txt) {
		txtAdminComment.sendKeys(txt);
	}
	public void clickOnSaveButton() {
		BtnSave.click();
	}
	
	
	
	
	
	

}

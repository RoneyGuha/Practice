package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class OrderFormDelivery extends BasePage{
public WebDriver driver;
	
	By firstNameField = By.xpath("//input[@name='firstname' and @class='form-control']");
	By lastNameField = By.xpath("//input[@name='lasttname' and @class='form-control']");
	By companyNameField = By.xpath("//input[@name='company' and @class='form-control']");
	By addressField = By.xpath("//input[@name='address1' and @class='form-control']");
	By addressComplementField = By.xpath("//input[@name='address2' and @class='form-control']");
	By cityField = By.xpath("//input[@name='city' and @class='form-control']");
	By stateDropdown = By.xpath("//select[@name='id_state' and @class='form-control form-control-select']");
	By postcodeField = By.xpath("//input[@name='postcode' and @class='form-control']");
	By countryDropdown = By.xpath("//select[@name='id_country' and @class='form-control form-control-select js-country']");
	By phoneField = By.xpath("//input[@name='phone' and @class='form-control']");
	By invoiceSameAddCheckboc = By.xpath("//input[@name='use_same_address' and @type='checkbox']");
	By continueBtn = By.xpath("//button[@name='confirm-addresses']");
	
	public OrderFormDelivery() throws IOException {
		super();
	}
	
	public WebElement getFirstNameField() {
		this.driver = getDriver();
		return driver.findElement(firstNameField);
	}
	
	public WebElement getLastnameField() {
		this.driver = getDriver();
		return driver.findElement(lastNameField);
	}

	public WebElement getCompanyField() {
		this.driver = getDriver();
		return driver.findElement(companyNameField);
	}
	
	public WebElement getAddressField() {
		this.driver = getDriver();
		return driver.findElement(addressField);
	}
	
	public WebElement getAddressCompField() {
		this.driver = getDriver();
		return driver.findElement(addressComplementField);
	}
	
	public WebElement getCityField() {
		this.driver = getDriver();
		return driver.findElement(cityField);
	}
	
	public WebElement getStateDropdown() {
		this.driver = getDriver();
		return driver.findElement(stateDropdown);
	}
	
	public WebElement getPostcodeField() {
		this.driver = getDriver();
		return driver.findElement(postcodeField);
	}
	
	public WebElement getCountryDropdown() {
		this.driver = getDriver();
		return driver.findElement(countryDropdown);
	}

	public WebElement getPhoneField() {
		this.driver = getDriver();
		return driver.findElement(phoneField);
	}
	
	public WebElement getInvoiceSameAddCheckbox() {
		this.driver = getDriver();
		return driver.findElement(invoiceSameAddCheckboc);
	}
	
	public WebElement getContinueBtn() {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
}

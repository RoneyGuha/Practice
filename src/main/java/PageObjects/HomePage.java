package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class HomePage extends BasePage{
	public WebDriver driver;
	
	By toggle = By.xpath("//a[@class='toggle']");
	By homepageLink = By.xpath("//a[contains(text(),'Homepage')]");
	By accordionLink = By.xpath("//a[contains(text(),'Accordion')]");
	By actionsLink = By.xpath("//a[contains(text(),'Actions')]");
	By browsertabLink = By.xpath("//a[contains(text(),'Broswer Tabs')]");
	By buttonsLink = By.xpath("//a[contains(text(),'Buttons')]");
	By calculatorLink = By.xpath("//a[contains(text(),'Calculator (JS)')]");
	By contactUsLink = By.xpath("//a[contains(text(),'Contact Us Form Test')]");
	By datePickerLink = By.xpath("//a[contains(text(),'Date Picker')]");
	By dropdownLink = By.xpath("//a[contains(text(),'DropDown Checkbox Radio')]");
	By fileUploadLink = By.xpath("//a[contains(text(),'File Upload')]");
	By hiddenElementsLink = By.xpath("//a[contains(text(),'Hidden Elements')]");
	By iFrameLink = By.xpath("//a[contains(text(),'iFrames')]");
	By loaderLink = By.xpath("//a[contains(text(),'Loader')]");
	By loaderTwoLink = By.xpath("//a[contains(text(),'Loader Two')]");
	By loginPoratlLink = By.xpath("//a[contains(text(),'Login Portal Test')]");
	By mouseLink = By.xpath("//a[contains(text(),'Mouse Movement')]");
	By popupLink = By.xpath("//a[contains(text(),'Pop Ups & Alerts')]");
	By predictiveSearchlink = By.xpath("//a[contains(text(),'Predictive Search')]");
	By tablesLink = By.xpath("//a[contains(text(),'Tables')]");
	By testStoreLink = By.xpath("//a[contains(text(),'Test Store')]");
	By aboutMeLink = By.xpath("//a[contains(text(),'About Me')]");
	
	public HomePage() throws IOException {
		super();
	}
	
	public WebElement getToggle() {
		this.driver = getDriver();
		return driver.findElement(toggle);
	}
	
	public WebElement getHomepageLink() {
		this.driver = getDriver();
		return driver.findElement(homepageLink);
	}
	
	public WebElement getAccordionLink() {
		this.driver = getDriver();
		return driver.findElement(accordionLink);
	}
	
	public WebElement getActionsLink() {
		this.driver = getDriver();
		return driver.findElement(actionsLink);
	}
	
	public WebElement getBrowserTabLink() {
		this.driver = getDriver();
		return driver.findElement(browsertabLink);
	}
	
	public WebElement getButtonsLink() {
		this.driver = getDriver();
		return driver.findElement(buttonsLink);
	}
	
	public WebElement getCalculatorLink() {
		this.driver = getDriver();
		return driver.findElement(calculatorLink);
	}
	
	public WebElement getContactUsLink() {
		this.driver = getDriver();
		return driver.findElement(contactUsLink);
	}
	
	public WebElement getdatePickerLink() {
		this.driver = getDriver();
		return driver.findElement(datePickerLink);
	}
	
	public WebElement getDropdownLink() {
		this.driver = getDriver();
		return driver.findElement(dropdownLink);
	}
	
	public WebElement getFileUploadLink() {
		this.driver = getDriver();
		return driver.findElement(fileUploadLink);
	}
	
	public WebElement getHiddenElementsLink() {
		this.driver = getDriver();
		return driver.findElement(hiddenElementsLink);
	}
	
	public WebElement getIFrameLink() {
		this.driver = getDriver();
		return driver.findElement(iFrameLink);
	}
	
	public WebElement getLoaderLink() {
		this.driver = getDriver();
		return driver.findElement(loaderLink);
	}
	
	public WebElement getLoginPortalLink() {
		this.driver = getDriver();
		return driver.findElement(loginPoratlLink);
	}
	
	public WebElement getMouseLink() {
		this.driver = getDriver();
		return driver.findElement(mouseLink);
	}
	
	public WebElement getPopupLink() {
		this.driver = getDriver();
		return driver.findElement(popupLink);
	}
	
	public WebElement getPredictiveSearchLink() {
		this.driver = getDriver();
		return driver.findElement(predictiveSearchlink);
	}
	
	public WebElement getTablesLink() {
		this.driver = getDriver();
		return driver.findElement(tablesLink);
	}
	
	public WebElement getTestStoreLink() {
		this.driver = getDriver();
		return driver.findElement(testStoreLink);
	}
	public WebElement getAboutMeLink() {
		this.driver = getDriver();
		return driver.findElement(aboutMeLink);
	}
	
}

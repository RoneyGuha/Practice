package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class OrderFormPersonalInfo extends BasePage{
	public WebDriver driver;
	
	By genderMr= By.xpath("//input[@name='id_gender' and @value='1']");
	By genderMrs= By.xpath("//input[@name='id_gender' and @value='2']");
	By firstNameField = By.xpath("//input[@name='firstname']");
	By lastNameField = By.xpath("//input[@name='lastname']");
	By emailField = By.xpath("//input[@name='email']");
	By passwordField = By.xpath("//input[@name='password']");
	By birthDateField = By.xpath("//input[@name='birthday']");
	By receiveOffersCheckbox = By.xpath("//input[@name='optin']");
	By newsletterCheckbox = By.xpath("//input[@name='newsletter']");
	By termsConditionsCheckbox = By.xpath("//input[@name='psgdpr']");
	By continueBtn = By.xpath("//button[@data-link-action='register-new-customer']");
	
	By signInTab = By.xpath("//a[@data-link-action='show-login-form']");
	By signInContinueBtn=By.xpath("//button[@data-link-action='sign-in']");
	
	
	public OrderFormPersonalInfo() throws IOException {
		super();
	}
	
	public WebElement getGenderMr() {
		this.driver = getDriver();
		return driver.findElement(genderMr);
	}

	public WebElement getGenderMrs() {
		this.driver = getDriver();
		return driver.findElement(genderMrs);
	}

	public WebElement getFirstNameField() {
		this.driver = getDriver();
		return driver.findElement(firstNameField);
	}
	
	public WebElement getLastnameField() {
		this.driver = getDriver();
		return driver.findElement(lastNameField);
	}

	public WebElement getEmailField() {
		this.driver = getDriver();
		return driver.findElement(emailField);
	}
	
	public WebElement getPasswordField() {
		this.driver = getDriver();
		return driver.findElement(passwordField);
	}
	
	public WebElement getBirthDateField() {
		this.driver = getDriver();
		return driver.findElement(birthDateField);
	}
	
	public WebElement getRecOfferCheckbox() {
		this.driver = getDriver();
		return driver.findElement(receiveOffersCheckbox);
	}
	
	public WebElement getNewsletterCheckbox() {
		this.driver = getDriver();
		return driver.findElement(newsletterCheckbox);
	}
	
	public WebElement getTermsConditionsCheckbox() {
		this.driver = getDriver();
		return driver.findElement(termsConditionsCheckbox);
	}
	
	public WebElement getContinueBtn() {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
	
	public WebElement getSignInTab() {
		this.driver = getDriver();
		return driver.findElement(signInTab);
	}
	
	public WebElement getSignInContinueBtn() {
		this.driver = getDriver();
		return driver.findElement(signInContinueBtn);
	}
}

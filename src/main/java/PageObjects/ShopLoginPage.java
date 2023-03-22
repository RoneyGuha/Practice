package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class ShopLoginPage extends BasePage{

	public WebDriver driver;
	
	By emailBtn = By.xpath("//input[@class='form-control'  and @name='email']");
	By passwordBtn = By.xpath("//input[@class='form-control js-child-focus js-visible-password'  and @name='password']");
	By signinBtn = By.xpath("//button[@class='btn btn-primary'  and @type='submit']");
	By forgotPasswordLink = By.xpath("//a[contains(text(),'Forgot your password')]");
	
	public ShopLoginPage() throws IOException {
		super();
		
	}
	
	public WebElement getEmailBtn() {
		this.driver = getDriver();
		return driver.findElement(emailBtn);
	}
	public WebElement getPasswordBtn() {
		this.driver = getDriver();
		return driver.findElement(passwordBtn);
	}
	public WebElement getSigninBtn() {
		this.driver = getDriver();
		return driver.findElement(signinBtn);
	}
	public WebElement getforgotPasswordLink() {
		this.driver = getDriver();
		return driver.findElement(forgotPasswordLink);
	}
	
}

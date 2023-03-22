package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class ShopYourAccount extends BasePage{

	public WebDriver driver;
	
	By heading = By.xpath("//h1");
	By signOutBtn = By.xpath("//a[contains(text(),'Sign out')]");
	
	public ShopYourAccount() throws IOException {
		super();
		
	}
	public WebElement getHeading() {
		this.driver = getDriver();
		return driver.findElement(heading);
	}
	public WebElement getSignOutBtn() {
		this.driver = getDriver();
		return driver.findElement(signOutBtn);
	}
	
	
	
}

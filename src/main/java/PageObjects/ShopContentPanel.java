package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class ShopContentPanel extends BasePage{
	public WebDriver driver;
	
	By continueShoppingBtn =By.xpath("//button[contains(text(),'Continue')]");
	
	By checkOutBtn =By.xpath("//a[contains(text(),'Proceed')]");
	
	public ShopContentPanel() throws IOException {
		super();
	}
	public WebElement getContinueShoppingBtn() {
		this.driver = getDriver();
		return driver.findElement(continueShoppingBtn);
	}
	public WebElement getCheckOutBtn() {
		this.driver = getDriver();
		return driver.findElement(checkOutBtn);
	}
}

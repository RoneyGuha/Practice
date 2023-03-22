package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class ShoppingCart extends BasePage{
	public WebDriver driver;
	
	By quantityIncreaseBtn = By.xpath("//i[@class='material-icons touchspin-up']");
	
	By quantityDecreaseBtn = By.xpath("//i[@class='material-icons touchspin-down']");
	
	By havePromo = By.xpath("//a[contains(text(),'promo')]");
	
	By promoTextBox = By.xpath("//input[@name='discount_name']");
	
	By addPromoBtn  = By.xpath("//span[text()='Add']");
	
	By proceedToCheckOutBtn = By.xpath("//a[contains(text(),'Proceed')]");
	
	By deleteProductOne = By.xpath("//a[text()='Hummingbird printed t-shirt']/parent::div/parent::div/following-sibling::div[1]//a");
	
	By deleteProductTwo = By.xpath("//a[@data-id-product='2']");
	
	By totalItemValue =By.xpath("//div[@class='cart-summary-line cart-total']/span[@class='value']");
	
	public ShoppingCart() throws IOException {
		super();
	}
	
	public WebElement getQuantityIncreaseBtn() {
		this.driver = getDriver();
		return driver.findElement(quantityIncreaseBtn);
	}
	
	public WebElement getQuantityDecreaseBtn() {
		this.driver = getDriver();
		return driver.findElement(quantityDecreaseBtn);
	}
	
	public WebElement gethavePromo() {
		this.driver = getDriver();
		return driver.findElement(havePromo);
	}
	
	public WebElement getpromoTextBox() {
		this.driver = getDriver();
		return driver.findElement(promoTextBox);
	}
	
	public WebElement getAddPromoBtn() {
		this.driver = getDriver();
		return driver.findElement(addPromoBtn);
	}
	
	public WebElement getProceedToCheckOutBtn() {
		this.driver = getDriver();
		return driver.findElement(proceedToCheckOutBtn);
	}
	
	public WebElement getDeleteProductOne() {
		this.driver = getDriver();
		return driver.findElement(deleteProductOne);
	}
	
	
	public WebElement getDeleteProductTwo() {
		this.driver = getDriver();
		return driver.findElement(deleteProductTwo);
	}
	
	public WebElement getTotalItemValue() {
		this.driver = getDriver();
		return driver.findElement(totalItemValue);
	}
	
}

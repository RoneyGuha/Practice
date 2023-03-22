package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class ShopProductPage extends BasePage {
	public WebDriver driver;
	
	By sizeOptions =By.xpath("//*[@id=\"group_1\"]");
	
	By quantityIncreaseBtn =By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]");
	
	By quantityDecreaseBtn =By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[2]/i");

	By addToCartBtn = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button");
	
	By backToHomepageBtn = By.xpath("//span[text()='Home']");
	
	public ShopProductPage() throws IOException {
		super();
	}

	public WebElement getSizeOptions() {
		this.driver = getDriver();
		return driver.findElement(sizeOptions);
	}
	
	public WebElement getQuantityIncreaseBtn() {
		this.driver = getDriver();
		return driver.findElement(quantityIncreaseBtn);
	}
	public WebElement getQuantityDecreaseBtn() {
		this.driver = getDriver();
		return driver.findElement(quantityDecreaseBtn);
	}
	public WebElement getAddToCartBtn() {
		this.driver = getDriver();
		return driver.findElement(addToCartBtn);
	}
	
	public WebElement getbackToHomepageBtn() {
		this.driver = getDriver();
		return driver.findElement(backToHomepageBtn);
	}
}

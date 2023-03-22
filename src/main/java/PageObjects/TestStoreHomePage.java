package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class TestStoreHomePage extends BasePage{
	public WebDriver driver;
	
	 
	By productOne = By.xpath("//img[@alt='Hummingbird printed t-shirt']");
	By productTwo = By.xpath("//img[@alt='Brown bear printed sweater']");
	By productThree = By.linkText("The Best Is Yet To Come'...");
	By productFour = By.linkText("The Adventure Begins Framed...");
	By productFive = By.linkText("Today Is A Good Day Framed...");
	By productSix = By.linkText("Mug The Best Is Yet To Come");
	By productSeven = By.linkText("Mug The Adventure Begins");
	By productEight = By.linkText("Mug Today Is A Good Day");
	By signinLink = By.xpath("//span[@class='hidden-sm-down']");
	
	public TestStoreHomePage() throws IOException {
		super();
	}
	public WebElement getProductOne() {
		this.driver = getDriver();
		return driver.findElement(productOne);
	}
	
	public WebElement getProductTwo() {
		this.driver = getDriver();
		return driver.findElement(productTwo);
	}
	
	public WebElement getProductThree() {
		this.driver = getDriver();
		return driver.findElement(productThree);
	}
	public WebElement getProdFour() {
		this.driver = getDriver();
		return driver.findElement(productFour);
	}	

	public WebElement getProdFive() {
		this.driver = getDriver();
		return driver.findElement(productFive);
	}	
	
	public WebElement getProdSix() {
		this.driver = getDriver();
		return driver.findElement(productSix);
	}	
	
	public WebElement getProdSeven() {
		this.driver = getDriver();
		return driver.findElement(productSeven);
	}	
	
	public WebElement getProdEight() {
		this.driver = getDriver();
		return driver.findElement(productEight);
	}
	public WebElement getSigninLink() {
		this.driver = getDriver();
		return driver.findElement(signinLink);
	}
}

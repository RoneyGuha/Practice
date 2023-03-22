package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class OrderFormShippingMethod extends BasePage{
	public WebDriver driver;
	
	By deliverMessageTextbox =By.xpath("//textarea[@name='delivery_message']");
	By continueBtn =By.xpath("//button[@name='confirmDeliveryOption']");
	
	public OrderFormShippingMethod() throws IOException {
		super();
	}
	
	public WebElement getDeliverMessageTextbox() {
		this.driver = getDriver();
		return driver.findElement(deliverMessageTextbox);
				
	}
	
	public WebElement getContinueButton() {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
}

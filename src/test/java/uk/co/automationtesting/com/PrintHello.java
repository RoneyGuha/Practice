package uk.co.automationtesting.com;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.ExtentManager;
import Base.Hooks;
import PageObjects.HomePage;
import PageObjects.ShopContentPanel;
import PageObjects.ShopProductPage;
import PageObjects.ShoppingCart;
import PageObjects.TestStoreHomePage;
@Listeners(resources.Listeners.class)
public class PrintHello extends Hooks {

	public PrintHello() throws IOException {
		super();
	}
	@Test
	//To working tree
	//Again working in working tree
	public void printHello() throws InterruptedException, IOException {
		System.out.println("Hello");
	}
}

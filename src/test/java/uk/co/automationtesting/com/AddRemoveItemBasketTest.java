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
public class AddRemoveItemBasketTest extends Hooks {

	public AddRemoveItemBasketTest() throws IOException {
		super();
	}
	@Test
	//To working tree
	//Again working in working tree
	public void addRemoveItem() throws InterruptedException, IOException {
		ExtentManager.log("Starting AddRemoveItemBasketTest...");
		
		//creating an object for Home page and going to test store link
		HomePage home = new HomePage();
		home.getToggle().click();
		Thread.sleep(1000);
		home.getTestStoreLink().click();
		
		//creating an object for test store page and adding product one to cart
		TestStoreHomePage testStoreHome = new TestStoreHomePage();
		ExtentManager.pass("Reached the TestStoreHomePage");
		testStoreHome.getProductOne().click(); 
		
		//creating an object for shop product page ,adding the item to cart of expected quantity and size
		ShopProductPage shopProduct =new ShopProductPage();
		ExtentManager.pass("Reached the ShopProduct Page");
		shopProduct.getQuantityIncreaseBtn().click();
		ExtentManager.pass("Have successfully increased quantity");
		Select size = new Select(shopProduct.getSizeOptions());
		size.selectByVisibleText("M");
		ExtentManager.pass("Have successfully increased size");
		shopProduct.getAddToCartBtn().click();
		ExtentManager.pass("Have successfully added the product to basket");
		
		//creating an object for cart content panel(once an item was added)
		ShopContentPanel shopPanel = new ShopContentPanel();
		ExtentManager.pass("Reached the ShopContentPanel Page");
		shopPanel.getContinueShoppingBtn().click();
		
		shopProduct.getbackToHomepageBtn().click();
		ExtentManager.pass("Have successfully raeched to Home Page");
		Thread.sleep(1000);
		
		testStoreHome.getProductTwo().click();
		ExtentManager.pass("Have successfully added the 2nd product to basket");
		
		shopProduct.getAddToCartBtn().click();
		
		shopPanel.getCheckOutBtn().click();
		Thread.sleep(1000);
		
		//creating an object for shopping cart page and deleting item 2
		ShoppingCart cart = new ShoppingCart();
		cart.getDeleteProductTwo().click();
		ExtentManager.pass("Have successfully deleted the product from basket");
		
		Thread.sleep(1000);
		
		//using a wait to ensure the deletion has taken place
		waitForElement(cart.getDeleteProductTwo(),10);
		
		//using an assertion to make sure the total amount is what we are expecting
		try {
			Assert.assertEquals(cart.getTotalItemValue().getText(), "$45.24");
			ExtentManager.pass("the total amount matches the expected amount");
		}
		catch(AssertionError e){
			Assert.fail("cart amount did not match the expected,it found" + cart.getTotalItemValue().getText()+"expected $45.24");
			ExtentManager.fail("The total amount did not match the expeted amount");
		}
		
		
	}
}

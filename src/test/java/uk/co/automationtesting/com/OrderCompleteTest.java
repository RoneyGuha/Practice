package uk.co.automationtesting.com;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.ExtentManager;
import Base.Hooks;
import PageObjects.HomePage;
import PageObjects.OrderFormDelivery;
import PageObjects.OrderFormPayment;
import PageObjects.OrderFormPersonalInfo;
import PageObjects.OrderFormShippingMethod;
import PageObjects.ShopContentPanel;
import PageObjects.ShopProductPage;
import PageObjects.ShoppingCart;
import PageObjects.TestStoreHomePage;
@Listeners(resources.Listeners.class)
public class OrderCompleteTest extends Hooks {

	public OrderCompleteTest() throws IOException {
		super();
	}
	@Test
	public void endToEndTest() throws InterruptedException, IOException {
		HomePage home = new HomePage();
		home.getToggle().click();
		Thread.sleep(1000);
		home.getTestStoreLink().click();
		ExtentManager.pass("Have successfully raeched to Teststore Home page");
		
		TestStoreHomePage testStoreHome = new TestStoreHomePage();
		testStoreHome.getProductOne().click(); 
		ExtentManager.pass("Have successfully clicked product");
		
		ShopProductPage shopProduct =new ShopProductPage();
		ExtentManager.pass("Have successfully reached ShopProduct Page");
		shopProduct.getQuantityIncreaseBtn().click();
		Select size = new Select(shopProduct.getSizeOptions());
		size.selectByVisibleText("M");
		ExtentManager.pass("Have successfully selecetd product size");
		shopProduct.getAddToCartBtn().click();
		
		ShopContentPanel shopPanel = new ShopContentPanel();
		shopPanel.getCheckOutBtn().click();
		
		ShoppingCart cart = new ShoppingCart();
		cart.gethavePromo().click();
		cart.getpromoTextBox().sendKeys("20OFF");
		cart.getAddPromoBtn().click();
		ExtentManager.pass("Have successfully applied the promo code");
		cart.getProceedToCheckOutBtn().click();
		Thread.sleep(1000);
		
		OrderFormPersonalInfo pInfo = new OrderFormPersonalInfo();
		pInfo.getGenderMrs().click();
		pInfo.getFirstNameField().sendKeys("Ankita");
		pInfo.getLastnameField().sendKeys("Das");
		pInfo.getEmailField().sendKeys("dasankitaofficial546@gmail.com");
		pInfo.getTermsConditionsCheckbox().click();
		ExtentManager.pass("Have successfully signed in");
		pInfo.getContinueBtn().click();
		Thread.sleep(1000);
		
		OrderFormDelivery delivery =new OrderFormDelivery();
		delivery.getAddressField().sendKeys("Seattle");
		delivery.getCityField().sendKeys("Seattle");
		Select state = new Select(delivery.getStateDropdown());
		state.selectByVisibleText("Washington");
		delivery.getPostcodeField().sendKeys("77021");
		Select country = new Select(delivery.getCountryDropdown());
		country.selectByVisibleText("United States");
		ExtentManager.pass("Have successfully filled the address");
		delivery.getContinueBtn().click();
		Thread.sleep(1000);
		
		OrderFormShippingMethod shipping = new OrderFormShippingMethod();
		shipping.getDeliverMessageTextbox().sendKeys("Please leave my delivery outside and ring the bell! ");
		shipping.getContinueButton().click();
		ExtentManager.pass("Have successfully selected shipping method");
		
		OrderFormPayment payment = new OrderFormPayment();
		payment.getPayByCheckRadioBtn().click();
		payment.getTermsConditionsCheckbox().click();
		payment.getOrderBtn().click();
		ExtentManager.pass("Have successfully placed the order");
		Thread.sleep(1000);
	}
}

package uk.co.automationtesting.com;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import PageObjects.ShopLoginPage;
import PageObjects.ShopProductPage;
import PageObjects.ShopYourAccount;
import PageObjects.ShoppingCart;
import PageObjects.TestStoreHomePage;
@Listeners(resources.Listeners.class)
public class ShopLoginTest extends Hooks {

	public ShopLoginTest() throws IOException {
		super();
	}
	@Test
	public void addRemoveItem() throws InterruptedException, IOException {
		ExtentManager.log("Starting ShopLogintTest...");
		
		//creating an object for Home page and going to test store link
		HomePage home = new HomePage();
		home.getToggle().click();
		Thread.sleep(1000);
		home.getTestStoreLink().click();
		
		//creating an object for test store page and adding product one to cart
		TestStoreHomePage testStoreHome = new TestStoreHomePage();
		ExtentManager.pass("Reached the TestStoreHomePage");
		testStoreHome.getSigninLink().click();
		
		FileInputStream workbookLocation = new FileInputStream(System.getProperty("user.dir")
				+"\\src\\main\\java\\resources\\credentials.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(workbookLocation);
		XSSFSheet sheet = workbook.getSheetAt(0);
		/****************************************************************************
		 * Excel Spreadsheet Layout Reminder (teaching purposes only)
		 * 
		 * |Row=0 -->| Email Address (Cell 0) Password (Cell 1) *
		 * -------------------------------------------------------------------- 
		 * |Row=1 -->| test@test.com (Cell 0) test123 (Cell 1) 
		 * |Row=2 -->| john.smith@test.com (Cell 0) test123 (Cell 1)
		 * |Row=3 -->| lucy.jones@test.com (Cell 0) catlover1 (Cell 1) 
		 * |Row=4 -->| martin.brian@test.com (Cell 0) ilovepasta5 (Cell 1) 
		 ****************************************************************************/
		
		//Accessing the sheet
		Row row1 = sheet.getRow(1);
		Cell cellR1C0 = row1.getCell(0);
		Cell cellR1C1 = row1.getCell(1);
		
		String emailRow1 = cellR1C0.toString();
		String passwordRow1 = cellR1C1.toString();
		
		//creating object for ShopLoginPage
		ShopLoginPage shop = new ShopLoginPage();
		shop.getEmailBtn().sendKeys(emailRow1);
		shop.getPasswordBtn().sendKeys(passwordRow1);
		Thread.sleep(1000);
		shop.getSigninBtn().click();
		
		//creating object for ShopYourAccountPage
		ShopYourAccount yourAccount = new ShopYourAccount();
		try {
			yourAccount.getSignOutBtn().click();
			ExtentManager.pass("User has Signed in");
		}
		catch(Exception e){
			ExtentManager.fail("User could not Sign in");
		}
		
		//Accessing the sheet
		Thread.sleep(1000);
		Row row2 = sheet.getRow(2);
		Cell cellR2C0 = row2.getCell(0);
		Cell cellR2C1 = row2.getCell(1);
				
		String emailRow2 = cellR2C0.toString();
		String passwordRow2 = cellR2C1.toString();
		
		shop.getEmailBtn().sendKeys(emailRow2);
		shop.getPasswordBtn().sendKeys(passwordRow2);
		Thread.sleep(1000);
		shop.getSigninBtn().click();
		try {
			yourAccount.getSignOutBtn().click();
			ExtentManager.pass("User has Signed in");
		}
		catch(Exception e){
			ExtentManager.fail("User could not Sign in");
		}	
	}
}

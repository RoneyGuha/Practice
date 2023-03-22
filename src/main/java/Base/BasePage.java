package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	//public static WebDriver driver;
	public String url;
	private Properties prop;
	public static String screenshotDestinationPath;
	public BasePage() throws IOException {
		prop =new Properties();
		FileInputStream data = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
	}
	
	public static WebDriver getDriver() {
		return WebDriverInstance.getDriver();
	}
	public String getUrl() {
		url = prop.getProperty("url");
		return url;
	}
	public static String takesScreenshot(String name) throws IOException {
		File srcFile =((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		String destinationFile =System.getProperty("user.dir")+"\\target\\Screenshots"+timeStamp()+".png";
		screenshotDestinationPath =destinationFile;
		try {
			FileUtils.copyFile(srcFile, new File(destinationFile));
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return name;
	}
	public static String timeStamp() {
		return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
	}
	public static String getScreenshotDestinationPath() {
		return screenshotDestinationPath;
	}
	public static void waitForElement(WebElement element,int seconds) {
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(seconds)) ;
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
}

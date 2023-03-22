package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInstance {
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		if (driver.get()==null) {
			try {
				driver.set(createDriver());
			} catch (IOException e){
				e.printStackTrace();
			}
			
		}
		return driver.get();
	}
	
	public static WebDriver createDriver() throws IOException {
		WebDriver driver = null;
		Properties prop =new Properties();
		FileInputStream data = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty
			("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\src\\main\\java\\Drivers\\chromedriver.exe");
	    	//Instantiate a ChromeDriver class.
	        driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
    	//Implicit wait
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	return driver; 
	}
	
	public static void cleanupDriver() {
		driver.get().quit();
		driver.remove();
	}
}

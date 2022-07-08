package commonmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	protected static WebDriver driver;
	
	public static void openbrowser() {
		
		String browser ="chrome";
		
		if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			driver.get("http://www.advantageonlineshopping.com/");
			
			
		}else if(browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();

			driver.get("http://www.advantageonlineshopping.com/");
			
		}else if(browser.equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			 driver.manage().window().maximize();

			driver.get("http://www.advantageonlineshopping.com/");
		}
		
		
		
	}
	

}

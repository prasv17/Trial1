package Driver_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Factory {
	
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<WebDriver>();
	
	public WebDriver init_driver(String browser) {
		
		System.out.println("browser is"+ browser);
		
		if (browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		
		
        if (browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
        
        else {
        	
        	
        	System.out.println("please pass the correct browser");
        }
        
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        
        return getDriver();
	}
	
	
	public static synchronized WebDriver getDriver() {
		
		return tlDriver.get();
	}
	

}

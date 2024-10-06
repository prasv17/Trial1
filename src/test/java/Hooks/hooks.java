package Hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Driver_Factory.Driver_Factory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.Config_Reader;

public class hooks {
	
	
	
	private Driver_Factory driverFactory;
	private WebDriver driver; 
	private Config_Reader reader;
	Properties prop;
	
	@Before (order =0)
	
	public void getProperty() {
		
		reader= new Config_Reader();
		prop= reader.init_prop();
		
		
	}
	
	@Before (order=1)
	
	public void launchBrowser() {
		
		String browsername= prop.getProperty("browser");
		driverFactory=new Driver_Factory();
		driver=driverFactory.init_driver(browsername);
	}
	
	@After(order=0)
	
	public void quitbrowser() {
		
		driver.quit();
	}
	
	

}

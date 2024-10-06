package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
	
	private WebDriver driver;
	
	private By emailID= By.id("email-address");
	private By password= By.id("password");
	private By signin= By.id("SubmitLogin");
	//private By forgotPwdLink= By.linkText("Forgot your password");
	
	
	public Home_Page(WebDriver driver) {
		
		this.driver= driver;
	}
	
	public String getHomePageTitle() {
		
		return driver.getTitle();
	}
	
	
	//public boolean ForgotPasswordLinkExist() {
		
		//return driver.findElement(forgotPwdLink).isDisplayed();
	//}
		
	public void enterUserName(String enterusername) {
		
		driver.findElement(emailID).sendKeys(enterusername);
	}
	
	public void enterPassword(String user_password) {
		
		driver.findElement(password).sendKeys(user_password);
		
	}
	
	public void signin() {
		
		driver.findElement(signin).click();
	}

}

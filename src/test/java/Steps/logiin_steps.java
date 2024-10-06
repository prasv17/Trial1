package Steps;

import Driver_Factory.Driver_Factory;
import Pages.Home_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class logiin_steps {
	
	private static String title;
	private Home_Page homepage= new Home_Page(Driver_Factory.getDriver());
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
		
		Driver_Factory.getDriver().get("https://www.argos.co.uk/account/login?clickOrigin=header:home:account");
		
	   
	}

	@When("User gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		
       title=homepage.getHomePageTitle();
		
		System.out.println(title);
		
	   
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expected_title) {
		
		Assert.assertTrue(title.contains(expected_title));
		
		
	   
	}

	

	@When("User enters username {string}")
	public void user_enters_username(String username) {
		
		System.out.println(username);
	    homepage.enterUserName(username);
	}

	@When("User enters password  {string}")
	public void user_enters_password(String password) {
	    homepage.enterPassword(password);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    homepage.signin();
	}

	@Then("User gets to memebers area")
	public void user_gets_to_memebers_area() {
		
		System.out.println("I am on other page");
	  
	}

	@Then("The title should be {string}")
	public void the_title_should_be(String string) {
	   
	}
	
	
	

}

package Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.*;
public class LoginStepdef {
 
	WebDriver driver;
	
	@Given("user is already on Login Page")
	public void user_is_already_on_Login_Page() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://classic.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	}

	@When("title of login page is Free CRM")
	public void title_of_login_page_is_Free_CRM() {

		Assert.assertTrue(driver.getTitle().contains("CRMPRO"));
	}

	@Then("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
     
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		
		
		

	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	    //Add ur code here
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
	   //add ur code here
	}

	@Then("Close the browser")
	public void close_the_browser() {
	   
		driver.close();
	}


}

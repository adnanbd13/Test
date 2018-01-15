package Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory.UTubeFactory;

public class Steps {
	WebDriver driver; 
	@Given("^user is on the homepage$")
	public void user_is_on_the_homepage() throws Throwable {
	   // System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\Md Haque\\Desktop\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Haque\\Desktop\\chromedriver.exe");
	   driver = new ChromeDriver();
	   // WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.youtube.com/");
	  
	}

	@When("^user clicks on search$")
	public void user_clicks_on_search() throws Throwable {
		UTubeFactory f = new UTubeFactory (driver);
		f.SearchBox().sendKeys("selenium");
	    
	}

	@When("^enters video title$")
	public void enters_video_title() throws Throwable {
		/*UTubeFactory f = new UTubeFactory (driver);
		f.SearchBox().sendKeys("selenium");*/
	    
	}

	@When("^clicks search$")
	public void clicks_search() throws Throwable {
	    
	}

	@Then("^user will have the desired search results$")
	public void user_will_have_the_desired_search_results() throws Throwable {
	    
	}
}

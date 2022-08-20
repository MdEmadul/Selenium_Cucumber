package Steps_File;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Step {

	WebDriver driver;
	@Given("user landed on bank homepage")
	public void user_landed_on_bank_homepage() {
		System.setProperty("webdriver.chrome.driver","System.");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		System.out.println("printing landing page");
		System.out.println("new commit");
	   
	}

	@When("user clicked contact.us page")
	public void user_clicked_contact_us_page() {
		System.out.println("printing contact us page");
		System.out.println("Test pull request");
	    
	}

	@Then("user registered his user name")
	public void user_registered_his_user_name() throws InterruptedException {
		System.out.println("printing registration page");
		Thread.sleep(5000);
		driver.close();
	    
	}

	

}

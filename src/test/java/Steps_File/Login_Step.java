package Steps_File;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Step {

	WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "System.");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		System.out.println("printing landing page");
	}

	@Given("user landed webdriveruniversity home page")
	public void user_landed_on_bank_homepage() {
		System.out.println("Test execution started");
	}

	@When("user clicked contactus page")
	public void user_clicked_contact_us_page() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"contact-us\"]/div/div[1]/h1")).click();
		System.out.println("printing contact us page");
		System.out.println("Test pull request");

	}

	@Then("user registered his user name")
	public void user_registered_his_user_name() throws InterruptedException {
		String parent_window = driver.getWindowHandle();
		Set<String> totalWindows = driver.getWindowHandles();
		System.out.println("Parent window " + parent_window);

		for (String c : totalWindows) {
			System.out.println(c);
			if (!parent_window.equals(c)) {
				driver.switchTo().window(c);
				System.out.println("child window" + c);
			}
		}
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Md");
		driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='last_name']")).sendKeys("Haque");
		driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='email']"))
				.sendKeys("Haque@gmail.com");
		driver.findElement(By.xpath("//form[@id='contact_form']/textarea[@name='message']"))
				.sendKeys("No comments at this point of time");
		driver.findElement(By.xpath("//div[@id='form_buttons']/input[@value='SUBMIT']")).click();
		System.out.println("user registered his information page");
		Thread.sleep(6000);

	}

	@After
	public void teadDown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

}

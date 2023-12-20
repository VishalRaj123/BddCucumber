package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ResetCredentials {

	WebDriver driver;

	@Given("^user on login page \"(.*?)\"$")
	public void user_on_login_page(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@When("^user_enter_Username_and_Password\\(\\)$")
	public void user_enter_username_and_password() throws Throwable {
		driver.findElement(By.name("uid")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.name("Loginbutton")).click();
	}

	@When("^click on reset button$")
	public void click_on_reset_button() throws Throwable {
		driver.findElement(By.name("btnResest")).click();

	}
}

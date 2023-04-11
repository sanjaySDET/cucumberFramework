package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginScriptForVtiger {
	WebDriver driver;

	@Given("^Login to vtiger application$")
	public void login_to_vtiger_application() throws Throwable {
		driver = WebDriverManager.chromedriver().create();
		driver.get("http://localhost:8888");
	}

	@When("User login to vtiger application with username and password")
	public void user_login_to_vtiger_application_with_username_and_password() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
	}
	
	@When("User login to vtiger application with username {string} and password {string}")
	public void user_login_to_vtiger_application_with_username_and_password(String username, String password) {
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("^HomePage should be displayed$")
	public void homepage_should_be_displayed() throws Throwable {
		String title = driver.getTitle();
		if (title.contains("Home")) {
			System.out.println("home page is displayed");
		} else {
			System.out.println("homepage is not displayed");
		}
	}

}

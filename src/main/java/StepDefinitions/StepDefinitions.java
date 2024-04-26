package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions {
	
	WebDriver driver;
	
	@Given("Open Browser and enter URL")
	public void open_browser_and_enter_url() {
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.demo.guru99.com/v4");
	}

	@When("Enter Valid ID and Password")
	public void enter_valid_id_and_password() {
	    driver.findElement(By.name("uid")).sendKeys("mngr567918");
	    driver.findElement(By.name("password")).sendKeys("Etapary");
	}

	@When("Click on Submit Button")
	public void click_on_submit_button() {
	    driver.findElement(By.name("btnLogin")).click();
	}

	@Then("Should redirect to Managers Page")
	public void should_redirect_to_managers_page() {
		WebElement Mangerid=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
		assert(Mangerid.isDisplayed());
				driver.close();
	}



}

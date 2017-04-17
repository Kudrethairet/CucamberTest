package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.ThreadedRefreshHandler;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest {

	public static WebDriver driver;

	@Given("^Open FireFoxDriver and go to homePage$")
	public void open_FireFoxDriver_and_go_to_homePage() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://auto-buy.geico.com/nb#/sale/customerinformation/gskmsi");
	}

	@When("^enter firstname\"(.*?)\" and lastname\"(.*?)\"$")
	public void enter_firstname_and_lastname(String firstname, String lastname) throws Throwable {
		// enter first name
		driver.findElement(By.cssSelector("#firstName")).sendKeys(firstname);
		// enter last name
		driver.findElement(By.cssSelector("#lastName")).sendKeys(lastname);
	}

	@Then("^enter address\"(.*?)\"$")
	public void enter_address(String address) throws Throwable {
		// enter address
		driver.findElement(By.cssSelector("#street")).sendKeys(address);
	}

	@When("^enter zipcod \"(.*?)\" and enter date_of_birth\"(.*?)\"$")
	public void enter_zipcod_and_enter_date_of_birth(String zipcode, String dateofbirth) throws Throwable {
		// enter zip number
		driver.findElement(By.cssSelector("#zip")).sendKeys(zipcode);
		// enter date of birth
		driver.findElement(By.cssSelector("#date-monthdob")).sendKeys(dateofbirth);

	}

	@When("^Click submit botton$")
	public void click_submit_botton() throws Throwable {
		driver.findElement(By.cssSelector("#btnSubmit")).click();
	}

	@Then("^close application$")
	public void close_application() throws Throwable {
		Thread.sleep(3 * 1000);
		driver.quit();
	}

}

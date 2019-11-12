package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Css_2 {
	WebDriver driver;
	@Given("user launches the chrome browser and navigates to application url")
	public void user_launches_the_chrome_browser_and_navigates_to_application_url() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
		 driver.navigate().to("https://www.google.com");
		 driver.navigate().to("http://localhost:8083/TestMeApp");
		 System.out.println("user launches the website");
	}

	@Given("user clicks on signIn")
	public void user_clicks_on_signIn() {
		driver.findElement(By.linkText("SignIn")).click();
		System.out.println("user clicks on SignIn");
	}

	@When("user enters username as {string} in the username field")
	public void user_enters_username_as_in_the_username_field(String UN) {
	    driver.findElement(By.name("userName")).sendKeys(UN);
	}

	@When("user enters password as {string} in th epassword field")
	public void user_enters_password_as_in_th_epassword_field(String PWD) {
		driver.findElement(By.name("password")).sendKeys(PWD);
	}

	@When("clicks on Login")
	public void clicks_on_Login() {
		driver.findElement(By.name("Login")).click();

	}

	@When("validates login success")
	public void validates_login_success() {
	    
	}
}

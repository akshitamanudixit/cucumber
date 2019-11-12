package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Cs_1 {
	WebDriver driver;
	@Given("user launches chrome browser and navigates to application url")
	public void user_launches_chrome_browser_and_navigates_to_application_url() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
		 driver.navigate().to("https://www.google.com");
		 driver.navigate().to("http://localhost:8083/TestMeApp");
		 System.out.println("user launches the website");
	}

	@When("user clicks on SignUp")
	public void user_clicks_on_SignUp() {
		driver.findElement(By.linkText("SignUp")).click();
		System.out.println("user clicks on SignUp");	
	}

	@When("user enters userame as {string} in the username field")
	public void user_enters_userame_as_in_the_username_field(String un) {
		driver.findElement(By.id("userName")).sendKeys(un);
			 System.out.println("user enters username");
	}

	@When("User enters first name as {string} in the first name field")
	public void user_enters_first_name_as_in_the_first_name_field(String fn ) {
		driver.findElement(By.id("firstName")).sendKeys(fn);
	}

	@When("User enters last name as {string} in the last name field")
	public void user_enters_last_name_as_in_the_last_name_field(String ln) {
		driver.findElement(By.id("lastName")).sendKeys(ln);
	}

	@When("user enters password as {string} in the password field")
	public void user_enters_password_as_in_the_password_field(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("user enters password as {string} in the confirm password field")
	public void user_enters_password_as_in_the_confirm_password_field(String cnfpwd) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(cnfpwd);
	}

	@When("user selects gender")
	public void user_selects_gender() {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@When("user enters email as {string}")
	public void user_enters_email_as(String email) {
		driver.findElement(By.id("emailAddress")).sendKeys(email);
	}

	@When("user enters mobile number as {string}")
	public void user_enters_mobile_number_as(String mbno) {
		driver.findElement(By.id("mobileNumber")).sendKeys(mbno);
	}

	@When("user enters enters dob as {string}")
	public void user_enters_enters_dob_as(String Dob) {
		driver.findElement(By.id("dob")).sendKeys(Dob);

	}

	@When("user enters address as {string}")
	public void user_enters_address_as(String address) {
		driver.findElement(By.id("address")).sendKeys(address);

	}

	@When("user selects security question")
	public void user_selects_security_question() {
		driver.findElement(By.id("securityQuestion")).click();

	}

	@When("user enters answer as {string}")
	public void user_enters_answer_as(String ans) {
		driver.findElement(By.id("answer")).sendKeys(ans);

	}

	@When("user clicks on Register button")
	public void user_clicks_on_Register_button() {
		driver.findElement(By.name("Submit")).click();

	}

	@When("user validates registration success")
	public void user_validates_registration_success() {
		//driver.findElement(By.id("answer")).sendKeys(ans);

	}
}

package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver;

	@Given("User opens the application URL")
	public void user_opens_the_application_url_https_reqres_in() throws Exception {

		ChromeOptions ops = new ChromeOptions();

		ops.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(ops);

		driver.get("https://reqres.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		System.out.println("Page Opened Succesfully");

		JavascriptExecutor Jse = (JavascriptExecutor) driver;
		Jse.executeScript("window.scrollBy(0,1200)", "");

	}

	@When("User clicks the request type user")
	public void user_clicks_users() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='users']")).click();

		Thread.sleep(2000);

		System.out.println("Request for users displayed");

	}

	@And("User clicks the request type Single user")
	public void user_clicks_the_single_user() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='users-single']")).click();

		Thread.sleep(2000);

		System.out.println("Request for single user displayed");

	}

	@And("User clicks the request type Single user not found")
	public void user_clicks_the_single_user_not_found() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='users-single-not-found']")).click();

		Thread.sleep(2000);

		System.out.println("Request for Single user not found displayed");

	}

	@And("User clicks the request type unknown")
	public void user_clicks_unknown() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='unknown']")).click();

		Thread.sleep(2000);

		System.out.println("Request type of unknown displayed");

	}

	@And("User clicks the request type unknown single")
	public void user_clicks_unknown_single() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='unknown-single']")).click();

		Thread.sleep(2000);

		System.out.println("Request type unknown single displayed");

	}

	@And("User clicks the request type unknown single not found")
	public void user_clicks_unknown_single_not_found() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='unknown-single-not-found']")).click();

		Thread.sleep(2000);

		System.out.println("Request type unkown single not found displayed");
	}

	@And("User clicks the request type Post")
	public void user_clicks_post() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='post']")).click();

		Thread.sleep(2000);

		System.out.println("Request type post displayed");

	}

	@And("User clicks the request type Put")
	public void user_clicks_put() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='put']")).click();

		Thread.sleep(2000);

		System.out.println("Request type put displayed");

	}

	@And("User clicks the request type Patch")
	public void user_clicks_patch() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='patch']")).click();

		Thread.sleep(2000);

		System.out.println("Request type patch displayed");

	}

	@And("User clicks the request type Delete")
	public void user_clicks_delete() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='delete']")).click();

		Thread.sleep(2000);

		System.out.println("Request type delete displayed");

	}

	@And("User clicks the request type register Successful")
	public void user_clicks_register_successful() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='register-successful']")).click();

		Thread.sleep(2000);

		System.out.println("Request type register successful displayed");

	}

	@And("User clicks the request type register unsuccessful")
	public void user_clicks_register_unsuccessful() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='register-unsuccessful']")).click();

		Thread.sleep(2000);

		System.out.println("Request type register unsuccessful displayed");

	}

	@And("User clicks the request type login successful")
	public void user_clicks_login_successful() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='login-successful']")).click();

		Thread.sleep(2000);

		System.out.println("Request type login successful displayed");
	}

	@And("User clicks the request type login unsuccessful")
	public void user_clicks_login_unsuccessful() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='login-unsuccessful']")).click();

		Thread.sleep(2000);

		System.out.println("Request type login unsuccessful displayed");

	}

	@And("User clicks the request type delay")
	public void user_clicks_delay() throws Exception {

		driver.findElement(By.xpath("//li[@data-id='delay']")).click();

		Thread.sleep(2000);

		System.out.println("Request type delay response displayed");

	}
	
	@And("User clicks the Support Requres")
	public void user_clicks_Support() throws Exception {

		driver.findElement(By.xpath("//a[normalize-space()='Support ReqRes']")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Support ReqRes')]")).click();

		Thread.sleep(2000);
		
		System.out.println("Support Request $ 5 displayed");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id='supportRecurring']")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Support ReqRes')]")).click();

		Thread.sleep(2000);

		System.out.println("Support Request $ 5 displayed");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		JavascriptExecutor Jse2 = (JavascriptExecutor) driver;
		Jse2.executeScript("window.scrollBy(0,500)", "");
		
		
		driver.findElement(By.xpath("//button[@id='trigger-pro']")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='mce-EMAIL']")).sendKeys("mfc.sathish@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='mc-embedded-subscribe']")).click();
		
		
					

	}

	@Then("Succesfuly display the sample request and response")
	public void succesfuly_display_the_sample_request_and_response() throws Exception {

		String WinTitle = driver.getTitle();

		System.out.println(WinTitle);

		Assert.assertEquals(WinTitle, "Reqres - A hosted REST-API ready to respond to your AJAX requests");

		System.out.println("Test Completed");

		driver.close();

	}

}

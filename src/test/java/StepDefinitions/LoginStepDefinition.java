package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition 
{
	
	
	  WebDriver driver;
	  static
	  {
		  System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
	  }
	  
	  @Given("^The brower is launched$")
	  public void the_brower_is_launched()
	  {
		  driver=new ChromeDriver();
	  
	  }
	  
	  @Given("^The Apllication is loaded$")
	  public void The_apllication_is_loaded()
	  {
		  driver.get("https://demo.actitime.com/login.do");
	  
	  }
	  
	  @When("^The user Enters the valid user name$") 
	  public void The_user_enters_the_valid_user_name()
	  {
		  driver.findElement(By.name("username")).sendKeys("admin");
	  
	  }
	  
	  @When("^The user Enter the valid password$")
	  public void The_user_enter_the_valid_password()
	  {
		  driver.findElement(By.name("pwd")).sendKeys("manager");
	  
	  }
	  
	  @When("^The user Click on Login button$") 
	  public void The_user_click_on_login_button() 
	  {
		  driver.findElement(By.xpath("//div[text()='Login ']")).click();
	  
	  }
	  
	  @Then("^Dashbord will Display$") 
	  public void Dashbord_will_display() throws InterruptedException 
	  {
		   String Expected = "actiTIME - Login";
		  System.out.println("Expected:" +Expected);
		  String Actual=driver.getTitle();
		  System.out.println("Actual:"+Actual); 
		  Assert.assertEquals(Actual,Expected);
		  Thread.sleep(5000);
		  driver.quit();	  
	  }
	  
	  @When("User Click on forgotten password link")
	  public void user_click_on_forgotten_password_link() throws InterruptedException 
	  {
		  driver.findElement(By.id("toPasswordRecoveryPageLink")).click();
		  Thread.sleep(5000);
	  }

	  @Then("Forgotten your password component will display")
	  public void forgotten_your_password_component_will_display() 
	  {
		  	String Expected = "Forgot your password?";
		  	System.out.println("Expected:"+Expected);
		  	String Actual = driver.findElement(By.id("headerContainer")).getText();
		  	System.out.println("Actual:"+Actual);
		  	Assert.assertEquals(Expected, Actual);
		  	driver.quit();
	  }
	 
		
		
		  @When("The user Enters the valid user name and password") 
		  public void the_user_enters_the_valid_user_name_and_password() throws Throwable {
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager"); Thread.sleep(5000); }
		 
		 
	  
		  @When("The user Enters the valid Credential in {string} and {string}")
		  public void the_user_enters_the_valid_credential_in_and(String string, String string2)
		  {
			  driver.findElement(By.name("username")).sendKeys("admin");
			  driver.findElement(By.name("pwd")).sendKeys("manager");
		     
		  }
		  
		  		
		  // Login Feature 2 step definition
		  @When("the user enters valid username password")
		  public void the_user_enters_valid_username_password(DataTable data) throws Throwable
		  {
			  List<List<String>> dataTable = data.asLists(String.class);
			  driver.findElement(By.name("username")).sendKeys(dataTable.get(1).get(0));
			  driver.findElement(By.name("pwd")).sendKeys(dataTable.get(1).get(1));
			  Thread.sleep(4000);
		     
		  }
		  @When("the user clicks on the login button")
		  public void the_user_clicks_on_the_login_button() 
		  {
			  driver.findElement(By.xpath("//div[text()='Login ']")).click();
		  }
		  @Then("dashboard should displayed")
		  public void dashboard_should_displayed() throws Throwable 
		  {
			  String Expected = "actiTIME - Login";
			  System.out.println("Expected:" +Expected);
			  String Actual=driver.getTitle();
			  System.out.println("Actual:"+Actual); 
			  Assert.assertEquals(Actual,Expected);
			  Thread.sleep(5000);
			  driver.quit();
		  }
		  
		// Login Feature  3 step Definitions
		  @When("the user enters valid username and password")
		  public void the_user_enters_valid_username_and_password(DataTable data3) throws InterruptedException
		  {
			  List<Map<String, String>> dataMap = data3.asMaps(String.class, String.class);
			  driver.findElement(By.name("username")).sendKeys(dataMap.get(0).get("username"));
			  driver.findElement(By.name("pwd")).sendKeys(dataMap.get(0).get("password"));
			  Thread.sleep(4000);
		  }
		  
		  @When("The user must Clicks on the login button")
		  public void the_user_must_clicks_on_the_login_button() 
		  {
			  driver.findElement(By.xpath("//div[text()='Login ']")).click();
		  }
		  
		  @Then("dashboard should be displayed")
		  public void dashboard_should_be_displayed() throws Throwable
		  {
			  String Expected = "actiTIME - Login";
			  System.out.println("Expected:" +Expected);
			  String Actual=driver.getTitle();
			  System.out.println("Actual:"+Actual); 
			  Assert.assertEquals(Actual,Expected);
			  Thread.sleep(5000);
			  driver.quit();
		  }
		  
		  
		  
		  
		  
		  
		  
		 
}

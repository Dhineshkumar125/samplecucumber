package skeleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	WebDriver driver;
@Given("user is on the login page")
public void user_is_on_the_login_page() {
  System.out.println("driveris launched and navigated to login page");
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\A08019DIRP_C2C.02.02\\Downloads\\chromedriver.exe");
   driver= new ChromeDriver();
  driver.navigate().to("google.com");
}

@When("user provides the correct credentials")
public void user_provides_the_correct_credentials() {
   
}

@Then("user rendered to TestMeApp home page")
public void user_rendered_to_TestMeApp_home_page() {
    driver.close();
    System.out.println("driver is closed");
    
    
}
}

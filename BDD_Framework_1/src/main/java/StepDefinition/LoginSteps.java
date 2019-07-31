package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	WebDriver driver;
	
	@Given("^first user open the url$")
	public void first_user_open_the_url(){
	 driver=new FirefoxDriver();
	 driver.get("http://leave.aptaracorp.com/");
	           }
	
	@When("^user enter \"(.*)\" and \"(.*)\"$")
	 public void user_enter_userid_and_password(String userid, String pass)  {
			driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_TxtUserName")).sendKeys(userid);
			driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_TxtPassword")).sendKeys(pass);
			driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_BtnLogin")).click();
			    }
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
    String login_check=driver.findElement(By.cssSelector("#ctl00_LblUserName")).getText();
    Assert.assertEquals("Hi ATISH OJHA ,Welcome to eTimeWatch", login_check);
        	    }

	@Then("^user check their attendance$")
	public void user_check_their_attendance() {
		driver.findElement(By.linkText("Attendance View")).click();
		System.out.println("Now You can see of your attendance");
		        }
	    
	@Then("^After check their attendance user does logout$")
	public void user_Logout()  {
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("You have successfully Logout");
		driver.close();
	            }

       }

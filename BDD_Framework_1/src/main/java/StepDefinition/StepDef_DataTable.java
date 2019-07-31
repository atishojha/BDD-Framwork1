package StepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef_DataTable {
WebDriver driver;
	
	@Given("^user have reached at login page for login$")
	public void user_have_reached_at_login_page_for_login(){
	 driver=new FirefoxDriver();
	 driver.get("http://leave.aptaracorp.com/");
	 }

  //@When("^user enter \"(.*)\" and \"(.*)\"$")
 //public void user_enter_userid_and_password(String userid, String pass) {
	@When("^now user enter username and password$")
	public void now_user_enter_userid_and_password(DataTable credential) {
		List<List<String>>credentials=credential.raw();
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_TxtUserName")).sendKeys(credentials.get(0).get(0));
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_TxtPassword")).sendKeys(credentials.get(0).get(1));
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_BtnLogin")).click();
		}

	@Then("^after login user is on home page$")
	public void after_login_user_is_on_home_page() {
    String login_check=driver.findElement(By.cssSelector("#ctl00_LblUserName")).getText();
    Assert.assertEquals("Hi ATISH OJHA ,Welcome to eTimeWatch", login_check);
	}

	@Then("^now user check their attendance$")
	public void now_user_check_their_attendance() {
		driver.findElement(By.linkText("Attendance View")).click();
		System.out.println("Now You can see of your attendance");
	    
	}
	@Then("^after check the attendance user does logout$")
	public void after_check_the_attendance_user_does_logout()  {
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("You have successfully Logout for first time");
		driver.close();
	}
	@Given("^user again is on login page for login$")
	public void user_again_is_on_login_page_for_login(){
		 driver=new FirefoxDriver();
		 driver.get("http://leave.aptaracorp.com/");
		 }
	
	@Then("^again user enter username and password for relogin$")
	public void again_user_enter_username_and_password_for_relogin(DataTable credential) {
		List<Map<String,String>> data = credential.asMaps(String.class,String.class);
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_TxtUserName")).sendKeys(data.get(0).get("UserName"));
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_TxtPassword")).sendKeys(data.get(0).get("Password"));
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_BtnLogin")).click();
		}
	@Then("^after check user heve to be logout again$")
	public void after_check_user_heve_to_be_logout_again()  {
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("You have successfully Logout for second time");
		driver.close();
	}
}

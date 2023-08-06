package stepdefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utils.ExcelReadUtility;

public class ExcelReadParam extends BaseClass {
	
	public HomePage home;
    public LoginPage login;
    
    
    public  ExcelReadUtility utility;
    
	@Given("user is on login Page")
	public void user_is_on_login_page() {
		launch();
	   
	}

	@When("user enters Emailid and Password from given sheetname {string} and rownumber {int}")
	public void user_enters_emailid_and_password_from_given_sheetname_and_rownumber(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException 
	{
        ExcelReadUtility utility = new ExcelReadUtility();
       List<Map<String, String>> testData = utility.getData("C:\\Users\\Shuchi Zaifrani\\eclipse-workspace\\ACSACopy5\\src\\test\\java\\utils\\TestDatas.xlsx", "Sheet1");
               
    		   String Emailid =  testData.get(RowNumber).get("Emailid");
    		   String Password = testData.get(RowNumber).get("Password");
    		   System.out.println(Emailid);
    		   System.out.println(Password);
    		   
    		   login.dologin(Emailid, Password);
    		  
    		   
    		   //login.putEmailid1(null, Emailid);
    		   //login.putPassword1(Password, null);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		login= new LoginPage(driver);
		login.clickLogin();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
	
	}

	@Then("user is navigated to the home Page and compare actual homepage title with expected title")
	public void user_is_navigated_to_the_home_page_and_compare_actual_homepage_title_with_expected_title()

	{
		 home = new HomePage(driver);
			String actualTitle = driver.getTitle();
			String expectedTitle = "ACSA";
			assertEquals(expectedTitle,actualTitle);
	}
	private void assertEquals(String expectedTitle, String actualTitle) 
	{
		System.out.println("User has logged in successfully");
	}

	@Then("clicks on Logout button")
	public void clicks_on_logout_button() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-300)","");
		Thread.sleep(1000);
		home= new HomePage(driver);
		home.clickLogout();
		driver.findElement(By.xpath("//button[@class='btn customBtn']")).click();
	    System.out.println("Popup gets open");
	    Thread.sleep(3000);
	}

	@Then("user selects Yes to exit home page")
	public void user_selects_yes_to_exit_home_page() throws InterruptedException 
	{
		home= new HomePage(driver);
		driver.findElement(By.xpath("//button[.='Yes']")).click();
		Thread.sleep(1000);
	}

}

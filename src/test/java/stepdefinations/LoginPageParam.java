/*package stepdefinations;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import io.cucumber.java.en.*;

import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.ReadFileData;


/*public class LoginPageParam extends BaseClass {

	public HomePage home;
    public LoginPage login;
   
   
    


	@Given("user is on login Page")
public void user_is_on_login_page() throws Exception
{
    launch();
    
  }
	//@Test(dataProvider = "LoginData")
	
	
	
	
	@When("user enters vineet.arora@mail.vinove.com and Vineet@123")
	
	@Test(dataProvider = "LoginData")
	//@DataProvider(name="LoginData")
	public void user_enters_vineet_arora_mail_vinove_com_and_vineet(String Emailid,String Password) throws InterruptedException {
		
		 login = new LoginPage(driver);//Create object for Login Page
		Thread.sleep(3000);
		login.putEmailid();
		Thread.sleep(1000);
	    driver.findElement(By.id("email")).sendKeys(Emailid);
		Thread.sleep(1000);
		login.putPassword();
		driver.findElement(By.id("password")).sendKeys(Password);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)","");
		Thread.sleep(1000);
	    
	}


	@When("user enters saurabh.sharma2@mail.vinove.com and S@ur@bh@{int}")
	public void user_enters_saurabh_sharma2_mail_vinove_com_and_s_ur_bh(String Emailid,String Password) throws InterruptedException {
		
		    login = new LoginPage(driver);//Create object for Login Page
			Thread.sleep(3000);
			login.putEmailid();
			Thread.sleep(1000);
			driver.findElement(By.id("email")).sendKeys(Emailid);
			login.putPassword();
		     driver.findElement(By.id("password")).sendKeys(Password);
		     Thread.sleep(1000);
		
	    
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,300)","");
	    Thread.sleep(1000);
	    
	}
	 @When("clicks on login button")
  public void clicks_on_login_button() throws InterruptedException
   {
	
	login.clickLogin();
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
   }

	
	//Home Page StepDefinations
@Then("user is navigated to the home Page and compare actual homepage title with expected title")
public void user_is_navigated_to_the_home_page_() {
	 home = new HomePage(driver);
	String actualTitle = driver.getTitle();
	String expectedTitle = "ACSA";
	assertEquals(expectedTitle,actualTitle);
   
}

private void assertEquals(String expectedTitle, String actualTitle) {
	// TODO Auto-generated method stub
	System.out.println("User has logged in successfully");
}
@Then("clicks on Logout button")
public void clicks_on_logout_button() throws InterruptedException {
	
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
public void  user_selects_yes_to_exit_home_page() throws InterruptedException
{
	home= new HomePage(driver);
	driver.findElement(By.xpath("//button[.='Yes']")).click();
	Thread.sleep(1000);
	
  }
@DataProvider(name="LoginData")

public  String[][] getData() throws IOException 
{

	File excelFile = new File("C:\\Users\\Shuchi Zaifrani\\eclipse-workspace\\ACSACopy5\\src\\test\\java\\utils\\TestDatas.xlsx");
    FileInputStream fis = new FileInputStream(excelFile);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheet("Sheet1");
    int noOfRows= sheet.getPhysicalNumberOfRows();
    int noOfCol = sheet.getRow(0).getLastCellNum();


    String[][] data = new String [noOfRows-1][noOfCol];//As our excel file is 2dimensional, so to pass date from xcel file to 
         //noOfRows-1: Exclude the Header                                           //DataProvider, we need 2dimensional Array.

        for(int i=0;i<noOfRows-1;i++)
  {
	  for(int j=0;j<noOfCol;j++)
	{
		DataFormatter df = new DataFormatter();//Will convert any form of data into String type
	    data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
		//System.out.println(sheet.getRow(i+1).getCell(j).getStringCellValue());
	}
	System.out.println();
}
   workbook.close();
   fis.close();
   return data;
}



   @AfterClass
    public void tearDown()
{
	driver.quit();
}


}*/

	
	
	
	


 
   
   

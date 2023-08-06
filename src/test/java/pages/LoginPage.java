package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	
	WebDriver driver;
	
	//Locators on the Login page
	By txt_Emailid = By.id("email");
	By txt_Password = By.id("password");
	By btn_login    = By.xpath("//input[@type='submit']");
	

	//Constructor will be called once we create object for Login class using new keyword
	//Also we will pass WebDriver driver to make a connection between driver of Stepdefination Login page
	// and Login page(TestPage)
	
	public LoginPage(WebDriver driver)
	{
	  this.driver= driver;
	}
	
	//Action Methods to be done on locators
	
    public void dologin(String Emailid,String Password)
    {
    	driver.findElement(txt_Emailid).sendKeys(Emailid);
    	driver.findElement(txt_Password).sendKeys(Password);
    }
	
    public void clickLogin()
    {
  	 driver.findElement(btn_login).click();
    }
}
	
	
	/*public WebElement putEmailid()
	{
      return driver.findElement(txt_Emailid);
	}	

	public WebElement putPassword()
     {
    	 return driver.findElement(txt_Password);
     }
     
	
	
	   public void clickLogin()
	      {
	    	 driver.findElement(btn_login).click();
	      }*/
	      
	   
	      
	
	
	
	
	
	
	
  
       








	
	
	



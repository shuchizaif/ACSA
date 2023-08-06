package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	public WebDriver driver;
	
	//Locators on the HomePage
	By logout   = By.xpath("//button[@class='btn customBtn']");
	By popup    = By.xpath("//button[.='Yes']");
	
	public HomePage(WebDriver driver)
	{
	  this.driver= driver;
	}
	
	//Action Methods to be done on locators
	 public WebElement clickLogout()
     {
   	  return driver.findElement(logout);}
   	  
   	  public WebElement closePopup()
   	  {
   		  return driver.findElement(popup);
   	  }
	
	
}
	
	



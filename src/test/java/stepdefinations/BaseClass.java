package stepdefinations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import pages.HomePage;
import pages.LoginPage;

public class BaseClass {
	

	public WebDriver driver;
	public LoginPage login;
	public HomePage home;
	public Properties prop;
	

	public void launch()
	{
		System.setProperty("webDriver.chrome.driver", "../ACSACopy5\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://acsa.n6.iworklab.com/");
		driver.manage().window().maximize();
	
	}
	
	/*public void readconfig() throws IOException
	{
	     File f= new File("../ACSACopy5/Configuration/config.properties");
         FileReader fr = new FileReader(f);
         prop = new Properties();
         prop.load(fr);
        
        }
	
	// @AfterClass
	public void tearDown()
	{
		driver.quit();
	}*/
	
	
}
	
	
	


	



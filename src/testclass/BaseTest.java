package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.BuyProduct;
import pages.HomePage;
import pages.LoginPage;


public class BaseTest {
	
	static WebDriver driver;
	
	 LoginPage loginpage;
	
	 HomePage homepage;
	 
	 BuyProduct buyproduct;
	
	@BeforeSuite
	public void initBrowser()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
	}
	
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
	@BeforeClass
	public void createObject()
	{
		 loginpage = new LoginPage(driver);
		 
		  homepage = new HomePage(driver);
		  
		  buyproduct = new BuyProduct(driver);
		  
		  
	}

}

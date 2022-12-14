package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement signinhoverelement = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));

		Actions act = new Actions(driver);

		act.moveToElement(signinhoverelement).perform();

		Thread.sleep(2000);

//		driver.findElement(By.xpath("//*[@id='nav-al-your-account']//span[text()='Your Account']")).click();

		driver.findElement(By.xpath("//*[text()='Your Wish List']")).click();
		
		
	}

}

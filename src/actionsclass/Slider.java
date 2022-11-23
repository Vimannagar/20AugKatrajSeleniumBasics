package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/slider/");
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));

		driver.switchTo().frame(iframe);
		
		
		WebElement sliderhandle = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(sliderhandle).moveByOffset(100, 0).release().build().perform();
	
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//*[text()='Droppable']")).click();
		
		
	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class HomePage  {
	public  void getUrl(WebDriver driver) {
		//navigating to URL
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		//verifying the correct page is loaded
		String url= driver.getCurrentUrl();
		String actual= "https://www.ebay.com/";
		Assert.assertEquals(url, actual);
		
	}
	
	public  void clickBook(WebDriver driver) {
		//inputting search term, category and pressing search
		driver.findElement(By.xpath("//option[@value='267']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("Harry Potter");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
	}
	
	

}

package pages;



import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	static String pr;
	public  void getPrice(WebDriver driver) throws InterruptedException {
		//Getting item price and printing in console
		pr=driver.findElement(By.xpath("//div[@data-test-id=\"SUBTOTAL\"]")).getText();
		System.out.println("Price: "+pr);
		
		//Clicking go to checkout
		driver.findElement(By.xpath("//button[@data-test-id=\"cta-top\"]")).click();
		
		//Selecting continue as guest	
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@class='btn btn--fluid btn--large btn--secondary']"))));
		driver.findElement(By.xpath("//button[@class='btn btn--fluid btn--large btn--secondary']")).click();
		
	
		
	}
}



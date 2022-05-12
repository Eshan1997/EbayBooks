package pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ItemPage {
	static String title;
	public   void selectTitle(WebDriver driver) {
		//switching to opened tab
		List<String> tabs = new ArrayList (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    
		//getting title of the book	and printing	
		title= driver.findElement(By.xpath("//h1[@class='x-item-title__mainTitle']")).getText();
		System.out.println("Book Name: "+title);
		
		//getting length of the title and printing
		char ch[] = title.toCharArray();
		System.out.println("Title Length: "+ch.length);
	}
	
	public void AddCart(WebDriver driver) {
		//pressing add to cart
		driver.findElement(By.xpath("//a[@_sp='p2047675.l1473']")).click();
	}

}

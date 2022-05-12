package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.junit.Assert;

public class CheckoutPage{
	public  void Check(WebDriver driver) {
		//Verifying selected details
		ItemPage  it = new ItemPage();
		String exp=it.title;
		String actual= driver.findElement(By.xpath("//h3[@class='item-title-header']")).getText().toString();
		Assert.assertEquals(exp, actual);
		
		//Printing book price in console
		CartPage cp= new CartPage();
		String exp2=cp.pr;
		String actual2=driver.findElement(By.xpath("(//td[@class='amount'])[3]")).getText().toString();
		System.out.println("Price is: "+ actual2);
	}
	
	

}

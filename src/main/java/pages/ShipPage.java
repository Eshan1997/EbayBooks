package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShipPage {
	public void ship(WebDriver driver) {
		
		driver.findElement(By.xpath("//option[@value='LK']")).click();
		//Filling in the shipping details
		driver.findElement(By.xpath("//input[@autocomplete='given-name']")).click();
		driver.findElement(By.xpath("//input[@autocomplete='given-name']")).sendKeys("Eshan");
		driver.findElement(By.xpath("//input[@autocomplete='family-name']")).sendKeys("Herath");
		driver.findElement(By.xpath("//input[@autocomplete='address-line1']")).sendKeys("No. 11/A Kadawathgama, Kadugannawa");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Kandy");
		driver.findElement(By.xpath("//input[@autocomplete='address-level1']")).sendKeys("Central");
		driver.findElement(By.xpath("//input[@autocomplete='postal-code']")).sendKeys("20300");
		driver.findElement(By.xpath("(//input[@autocomplete='email'])[1]")).sendKeys("malingaherath1@gmail.com");
		driver.findElement(By.xpath("(//input[@autocomplete='email'])[2]")).sendKeys("malingaherath1@gmail.com");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("0778008415");
		driver.findElement(By.xpath("//button[@data-test-id='ADD_ADDRESS_SUBMIT']")).click();
		
		//Closing the tab
		driver.close();
	}

}

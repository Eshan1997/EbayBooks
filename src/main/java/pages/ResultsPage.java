package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class ResultsPage {
	public  void selectBook(WebDriver driver) throws InterruptedException {
		//selecting the first record after searching
		Actions at = new Actions(driver);
		at.click(driver.findElement(By.xpath("(//ul[@class='srp-results srp-list clearfix']/li)[1]/div/div/a"))).build().perform();
		
		
	}

}

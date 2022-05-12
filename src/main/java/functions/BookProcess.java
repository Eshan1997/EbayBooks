package functions;
import org.openqa.selenium.WebDriver;


import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ItemPage;
import pages.ResultsPage;
import pages.ShipPage;


public class BookProcess extends WebDriverConfig  {
	public void search() throws InterruptedException {
		WebDriver driver = WebDriverConfig.driver;	
		HomePage h1= new HomePage();
		h1.getUrl(driver);
		h1.clickBook(driver);
	}
	
	 public void select() throws InterruptedException { 
		WebDriver driver= WebDriverConfig.driver;
		ResultsPage r1= new ResultsPage();
		r1.selectBook(driver);
	 }	
	 
	 public void  product() throws InterruptedException {
		ItemPage i1=new ItemPage();
		i1.selectTitle(driver);
	 }
	 
	 public void  cart() throws InterruptedException {
		 ItemPage i1=new ItemPage(); 
		 i1.AddCart(driver);
	 	
		CartPage c1=new CartPage();
		c1.getPrice(driver);
	 }
	 
	 public void  checkout() {
		CheckoutPage pg = new CheckoutPage();
		pg.Check(driver);
		
		ShipPage sp= new ShipPage();
		sp.ship(driver);
		
	}
}


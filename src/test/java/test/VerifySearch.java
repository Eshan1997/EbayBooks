package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import functions.BookProcess;
import functions.WebDriverConfig;

public class VerifySearch {
	//initiating webdriver
	@BeforeTest
	public void setUp() {
		WebDriverConfig cg = new WebDriverConfig();
		cg.wb();
	}
	
	@Test(priority=0,description = "VerifySearch")
	public void Search() throws InterruptedException {
		BookProcess bp= new BookProcess();
		bp.search();
	}
	
	@Test(priority=1,description="VerifySelection")
	public void Select() throws InterruptedException{
		BookProcess bp= new BookProcess();
		bp.select();
	}
	
	@Test(priority=2,description="TitleSelection")
	public void Product() throws InterruptedException{
		BookProcess bp= new BookProcess();
		bp.product();
	}
	

	@Test(priority=3,description="AddCart")
	public void Cart() throws InterruptedException{
		BookProcess bp= new BookProcess();
		bp.cart();
	}
	

	@Test(priority=4,description="Checkout")
	public void Checkout() throws InterruptedException{
		BookProcess bp= new BookProcess();
		bp.checkout();
	}
	
	@AfterTest
	//closing webdriver
	public void close() {
	WebDriverConfig wc= new WebDriverConfig();
	wc.driverquit();
	}
	
}

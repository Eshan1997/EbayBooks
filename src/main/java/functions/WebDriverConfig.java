package functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {
	public static  WebDriver driver;
	public    void wb() {
		//Setting up chrome webdriver
		System.setProperty("webdriver.chrome.driver",  "C:\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void driverquit() {
		//Closing webdriver
		driver.quit();
	}

}

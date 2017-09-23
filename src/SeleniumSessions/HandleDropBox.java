package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");	
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");	//enter url
		
		//handle drop box:
		Select select = new Select(driver.findElement(By.id("state")));
		select.selectByVisibleText("California");
		
		
		
		
		
	}

}

package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com");
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		
		
		
		
		
		
		
		
		
	}

}

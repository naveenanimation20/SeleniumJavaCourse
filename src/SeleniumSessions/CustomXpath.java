package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");	
		
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.half.ebay.com"); //enter URL

		//absolute xpath: not recommended
		//*[@id='headersearchbar']/div/div[2]/table/tbody/tr/td[2]/input
		//1. performance issue
		//2. not reliable
		//3. can be changed at any time in future
		
		//driver.findElement(By.xpath("//input[@class='actextbox']")).sendKeys("Java");
		
		//driver.findElement(By.xpath("//input[@name='query']")).sendKeys("Java");
		
		driver.findElement(By.xpath("//input[contains(@class,'actextbox')]")).sendKeys("Java");
		
		//dynamic id: input
		//id = test_123
		//By.id("test_123")
		
		//starts-with
		//id = test_456
		//id = test_789
		//id = test_test_7890_test
		
		//ends-with
		//id = 1234_test_t
		//id = 23456_test_t
		//id = 6789_test_t
		
//		driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Test");
//		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Test");
//		driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("Test");
		
		//for links: custom xpath:
		//all the links are represented by <a> html tag:
		driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
		
		
		
		
	}

}

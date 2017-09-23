package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");	
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");	//enter url
		
		//1. xpath: -- 2
		//absolute xath should not be used. -- html/body/div[1]/div[5]/div[2]/a 
		//only relative xpath should be used. -- //*[@id='firstname']
		
//		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Tom");
//		
//		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Peter");
//		
//		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("12, new street");
		
		
		
		//2. id: --1
//		driver.findElement(By.id("firstname")).sendKeys("Tom");
//		driver.findElement(By.id("lastname")).sendKeys("Peter");
		
		//3. name: --3
		driver.findElement(By.name("firstname")).sendKeys("Tom");
		driver.findElement(By.name("lastname")).sendKeys("Peter");
		
		
		//4. linkText : this is only for links
		//driver.findElement(By.linkText("Sign in")).click();
		
		//5. partialLinkText: not useful
		//driver.findElement(By.partialLinkText("How to pick")).click();
		
		
		//6. CSSSelector: ---2
		//if id is there--- #{id}
		//if class is there --- .{class}
		driver.findElement(By.cssSelector("#address1")).sendKeys("12 new strt");
		
		//7. class name: not useful  --4
		driver.findElement(By.className("ancAsb")).click();
		
		
		
		
		
		
		
	}

}

package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");	

		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com"); //enter URL
		
		
		//1. get the total count of links on the page
		//2. get the text of each link on the page
		
		//all the links are represented by <a> html tag:

		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		//size of linkList:
		System.out.println(linkList.size());
		
		for(int i=0; i<linkList.size(); i++){
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}
		
		
		
	}

}

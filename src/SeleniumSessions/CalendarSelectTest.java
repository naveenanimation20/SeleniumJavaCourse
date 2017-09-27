package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarSelectTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/"); // enter URL
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click(); //login button
		
		driver.switchTo().frame("mainpanel");
		
		String date = "32-May-2017";
		String dateArr[] = date.split("-"); // {18,September,2017}
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]	
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]
		
		String beforeXpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath = "]/td[";
		
		final int totalWeekDays = 7;
		
		//2-1 2-2 2-3 2-4 2-5 2-6 2-7
		//3-2 3-2 3-3 3-4 3-5 3-6 3-7
		boolean flag = false;
		String dayVal = null;
		for(int rowNum=2; rowNum<=7; rowNum++){
			
			for(int colNum = 1; colNum<=totalWeekDays; colNum++){
				try{
			    dayVal =driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
				}catch (NoSuchElementException e){
					System.out.println("Please enter a correct date value");
					flag = false;
					break;
				}
				System.out.println(dayVal);
				if(dayVal.equals(day)){
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
					flag = true;
					break;
				}				
			}
			if(flag){
				break;
			}
			
		}
	
		
	}

}

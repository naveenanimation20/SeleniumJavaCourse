package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {

	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"/Users/naveenkhunteta/Documents/workspace/MorningSessions/src/SeleniumSessions/config.properties");

		prop.load(ip);

		System.out.println(prop.getProperty("name"));

		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("URL");

		System.out.println(url);

		String browserName = prop.getProperty("browser");

		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");
			driver = new ChromeDriver(); // launch chrome
		} 
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")){
			System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/internetexplorerdriver");
			driver = new InternetExplorerDriver();
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
		
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));

		driver.findElement(By.xpath(prop.getProperty("city_xpath"))).sendKeys(prop.getProperty("city"));
		

	}

}

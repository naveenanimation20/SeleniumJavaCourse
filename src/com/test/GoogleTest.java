package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	
	WebDriver driver;
	
	//1 //4 //7
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");	
		driver = new ChromeDriver(); //launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	
	//2
	@Test(priority=1,groups="Title")
	public void googleTitleTest(){
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	//8
	@Test(priority=3,groups="Logo")
	public void googleLogoTest(){
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	}

	//5
	@Test(priority=2,groups="Link Test")
	public void mailLinkTest(){
		boolean b = driver.findElement(By.linkText("GMail")).isDisplayed();
	}
	
	@Test(priority=4,groups="Test")
	public void test1(){
		System.out.println("test1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2(){
		System.out.println("test1");
	}
	
	@Test(priority=6,groups="Test")
	public void test3(){
		System.out.println("test1");
	}
	
	
	//3 //6 //9
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	

}

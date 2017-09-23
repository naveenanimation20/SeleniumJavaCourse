package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void loginTest(){
		System.out.println("login test");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest(){
		System.out.println("Home Page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest(){
		System.out.println("SearchPageTest");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void RegPageTest(){
		System.out.println("RegPageTest");
	}
	
	
	
	

}

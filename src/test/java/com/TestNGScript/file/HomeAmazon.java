package com.TestNGScript.file;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BussinessFlow.file.HomeAmazonBL;
import com.Commonutills.file.Base;
/*
 * 
 * This is chandan kumar
 * 
 */

public class HomeAmazon {
	
	@Test
	
	public void homepage() throws InterruptedException {
		
		com.Commonutills.file.Base b=new Base();
		WebDriver driver=b.driver();
		HomeAmazonBL homepagebl=PageFactory.initElements(driver, HomeAmazonBL.class);
		String url="http://www.amazon.com/";
		driver.get(url);
		driver.manage().window().maximize();
		homepagebl.homePage();
		System.out.println("Script executed");
	//	System.out.println(b.getPageTitle());
		System.out.println("Page Titile is :  " +driver.getTitle());
		
	}
	
	}

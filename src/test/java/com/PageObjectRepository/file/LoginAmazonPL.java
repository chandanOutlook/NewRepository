package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;



public class LoginAmazonPL extends Base {
	
	
	public WebDriver driver;
	
	
	
	
	public WebElement Email() {
    By mohan=By.xpath("//*[@id='ap_email'][@type='email']");
	return driver.findElement(mohan);
		
		
		
	}

}

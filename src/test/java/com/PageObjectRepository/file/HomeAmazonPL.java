package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;


public class HomeAmazonPL extends Base {

	public WebDriver driver;

	public HomeAmazonPL(WebDriver driver) {

		this.driver = driver;

	}

//	public By btnSell = By.xpath("//a[@class='nav-a'][contains(text(),'Sell')]");

	public WebElement btnSell() {
	return driver.findElement(By.xpath("//a[@class='nav-a'][contains(text(),'Sell')]"));

	}
	
	
	public WebElement btnSignIn() {
		return driver.findElement(By.cssSelector("a[data-nav-role='signin'][id='nav-link-accountList']"));
		
		
	}
	
}
package com.PageObjectRepository.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.Base;



public class LoginTanmayPL extends Base{
	
	public WebDriver driver;
	

	//Constructor 
	public LoginTanmayPL(WebDriver driver){
		this.driver = driver;		
	}
	
	
	public By fname = By.id("ts_first_name");
	
	
	public WebElement FName(){
	return driver.findElement(fname);
		
	
	}
	
	public By lname = By.id("ts_last_name");
	public WebElement LName(){
	return driver.findElement(lname);
		
		
	}
	
		
	public By address = By.id("ts_address");
	public WebElement Address(){
	return driver.findElement(address);
	}
	
	
	public WebElement Gender() {
		return driver.findElement(By.cssSelector("input[name='ts_gender'][value='male']"));
		
	}	
		
   public WebElement Nationality() {
	   
	 return driver.findElement(By.cssSelector("select[name='ts_country'][id='ts_country']"));   
	   
   }
   
   public WebElement CountryName() {
	return driver.findElement(By.cssSelector("select[name='ts_country'] > option:nth-child(2)"));
 //  	return driver.findElement(By.cssSelector("select#ts_country > option:nth-child(3)"));
	   
	   
   }
	}




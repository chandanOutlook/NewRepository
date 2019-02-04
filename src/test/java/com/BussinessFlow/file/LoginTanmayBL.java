package com.BussinessFlow.file;

import org.openqa.selenium.WebDriver;

import com.PageObjectRepository.file.LoginTanmayPL;



public class LoginTanmayBL extends LoginTanmayPL{
	

		public LoginTanmayBL(WebDriver driver) {
		super(driver);
		
	}
			
		
		public void formFillUp(String fname,String lname,String address){
			FName().clear();
			FName().sendKeys(fname);
			LName().clear();
			LName().sendKeys(lname);
			Address().clear();
			Address().sendKeys(address);	
			
			Nationality().click();
			
			CountryName().click();
			
			Gender().click();
		}


		public void Email() {
			// TODO Auto-generated method stubgit 
			
		}

	}



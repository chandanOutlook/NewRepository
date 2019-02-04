package com.BussinessFlow.file;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.LoginAmazonPL;

public class LoginAmazonBL extends LoginAmazonPL{
	
	public LoginAmazonBL() {
		
	}
	
	
	
	public void login() {
		
		Email().click();
    	Base.highLightElement(driver, Email());
    	Email().sendKeys("chandan");
		
	}
	
	
	
	

}

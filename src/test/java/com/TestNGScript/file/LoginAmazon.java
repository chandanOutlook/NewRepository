package com.TestNGScript.file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.BussinessFlow.file.LoginTanmayBL;
import com.Commonutills.file.Base;



public class LoginAmazon {
	
	//Hello All
	
	
	public void loginTest() {
		
		
		Base b=new Base();
		WebDriver driver=b.driver();
		
		LoginTanmayBL loginbl=PageFactory.initElements(driver, LoginTanmayBL.class);
		loginbl.Email();
		driver.close();
	}

}

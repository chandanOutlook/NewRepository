package com.BussinessFlow.file;

import org.openqa.selenium.WebDriver;

import com.Commonutills.file.Base;
import com.PageObjectRepository.file.HomeAmazonPL;

//This is chandan kumar
public class HomeAmazonBL extends HomeAmazonPL {

	public HomeAmazonBL(WebDriver driver) {
		super(driver);
		
	}

	    public void homePage() throws InterruptedException {
        
	    	
	     	
	    	Base.highLightElement(driver, btnSell());
	    	btnSell().click();
	    //	Thread.sleep(2000);
	    	driver.navigate().back();
	    //	Thread.sleep(2000);
	    	Base.highLightElement(driver, btnSignIn());
	    	btnSignIn().click();
	    //	Thread.sleep(2000);
	    	
	    	
	}

}

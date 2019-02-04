package com.TestNGScript.file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BussinessFlow.file.LoginTanmayBL;
import com.Commonutills.file.Base;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class LoginTanmay {

	@Test
	public void login() {


		Base b = new Base();
		WebDriver driver = b.driver();
		LoginTanmayBL loginbl = PageFactory.initElements(driver, LoginTanmayBL.class);
		String url = "http://demo.tanmaysarkar.com/sample_01.html";
		driver.get(url);
		driver.manage().window().maximize();
		loginbl.formFillUp("chandan", "kumar", "Indirapuram");
	//	loginbl.formFillUp("tanmay", "sarkar", "home");
		driver.close();


	}
}

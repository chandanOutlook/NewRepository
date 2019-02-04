package com.Commonutills.file;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestException;

import io.github.bonigarcia.wdm.WebDriverManager;

//This is a Base Class
public class Base {
	
	
	public WebDriver driver() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	
	}
	
	public String getPageTitle() {
		
		try {
					
		driver().getTitle();
		
		
		} catch (Exception e) {
			
			System.out.println("Unable to find page title");
		}
		return null ;
	
	}
	
	
	public static void highLightElement(WebDriver driver, WebElement element)
	{
	JavascriptExecutor js=(JavascriptExecutor) driver; 

	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	try 
	{
	Thread.sleep(3000);
	} 
	catch (InterruptedException e) {

	System.out.println(e.getMessage());
	} 

	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 

	}
	
		
boolean flag= true;
	
	
	public boolean typetext(WebElement element, String fieldvalue){
		
		try{
			if(element!=null && fieldvalue!=null){
			element.clear();
			element.click();
			element.sendKeys(fieldvalue);
			flag=true;
			
		} else {
			
			flag=false;
		}
		
	} catch (Exception ex) {
		System.out.println("Exception in ypetext is:=" +ex.getMessage());
	}

		System.out.println("flag status is:= " + flag);
		return flag;
				
			}
	
	
	
	public boolean takeSnapShot(WebElement element,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrnShot =((TakesScreenshot)element);

        //Call getScreenshotAs method to create image file

                File SrcnFile=scrnShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcnFile, DestFile);
				return flag;

    }


	
	}
	
	
	
	
	
	
	
	
	
	
	
	
		

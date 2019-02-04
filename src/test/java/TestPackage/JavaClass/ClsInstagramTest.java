package TestPackage.JavaClass;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.remote.MobileCapabilityType;


public class ClsInstagramTest {
	
//public static void main(String[] args) throws InterruptedException {
		
	{		//Set the Desired Capabilities
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "My Phone");
		dc.setCapability("udid", "2864004G8CCA0I2"); //Give Device ID of your mobile phone
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "6.0.1");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
	//	dc.setCapability("appPackage", "com.armourgrid.kuvrr");
	//	dc.setCapability("appPackage", "com.facebook.katana");
		dc.setCapability("appPackage", "com.instagram.android");
	//	dc.setCapability("appActivity", "com.armourgrid.kuvrr.HomeActivity");
	//	dc.setCapability("appActivity", "com.facebook.katana.LoginActivity");
		dc.setCapability("appActivity", "com.instagram.android.activity.MainTabActivity");
		//dc.setCapability("appActivity", "com.armourgrid.kuvrr.MainActivity");
		dc.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
				
			AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		//	Thread.sleep(1000);
		//	driver.findElementById("com.instagram.android:id/log_in_button").click();
			System.out.println("Login button clicked");
		//	driver.findElement(MobileBy.AndroidUIAutomator("Phone or Email")).sendKeys("chandan");
			driver.findElementById("com.instagram.android:id/login_username").clear();
			driver.findElementById("com.instagram.android:id/login_username").click();
			driver.findElementById("com.instagram.android:id/login_username").sendKeys("qa_sub");
			System.out.println("Username entered");
			
			driver.findElementById("com.instagram.android:id/password").clear();
			driver.findElementById("com.instagram.android:id/password").click();
			driver.findElementById("com.instagram.android:id/password").sendKeys("omsai11ram");
			System.out.println("Password entered");
			
		//	driver.findElementById("com.instagram.android:id/button_text").click();
		//	driver.findElementByLinkText("Log In").click();
		
		//	driver.findElementByXPath("//android.widget.Button[contains(@resource-id,'button_text�) and @text='Log In']").click();
			driver.findElement(By.xpath("//EditText[contains('Log In','[54,446][426,518]')]")).click();
			System.out.println("Login button clicked");
			
			
			
			//RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc );
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
 
}



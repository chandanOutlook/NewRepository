package JavaPackage;

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

public class AppiumKuvrrTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//Set the Desired Capabilities
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability("deviceName", "My Phone");
	dc.setCapability("udid", "2864004G8CCA0I2"); //Give Device ID of your mobile phone
	dc.setCapability("platformName", "Android");
	dc.setCapability("platformVersion", "6.0.1");
	dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
	dc.setCapability("appPackage", "com.armourgrid.kuvrr");
//	dc.setCapability("appPackage", "com.facebook.katana");
	dc.setCapability("appActivity", "com.armourgrid.kuvrr.HomeActivity");
//	dc.setCapability("appActivity", "com.facebook.katana.LoginActivity");
	//dc.setCapability("appActivity", "com.armourgrid.kuvrr.MainActivity");
	dc.setCapability("noReset", "true");
	
	//Instantiate Appium Driver
	try {
			
		AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		Thread.sleep(1000);
		
		
		
	
		
	} catch (MalformedURLException e) {
		System.out.println(e.getMessage());
	}


}



}

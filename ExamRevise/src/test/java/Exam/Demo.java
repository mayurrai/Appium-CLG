package Exam;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Demo {
	
	AppiumDriver driver;
			@Test
		    public void testMethod() throws MalformedURLException {
				UiAutomator2Options option= new UiAutomator2Options();
				option.setApp("C:\\Users\\mayur\\Downloads\\ApiDemosdebug.apk");
				option.setDeviceName("mydevice");
				
				URL url=new URL(" http://127.0.0.1:4723/");
				AndroidDriver driver=new AndroidDriver(url,option);
				
				WebElement prefrenceClick=driver.findElement(AppiumBy.accessibilityId("Preference"));
				prefrenceClick.click();
				
				WebElement depend3=driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]"));
				depend3.click();
				
				WebElement checkbox=driver.findElement(By.xpath(""));
				checkbox.click();
				}
			}



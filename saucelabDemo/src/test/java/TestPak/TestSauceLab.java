package TestPak;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestSauceLab {
	AppiumDriver driver;
	
	@Test
	
	public void TestRunner() throws  InterruptedException, MalformedURLException {
		MutableCapabilities caps = new MutableCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:app", "storage:filename=ApiDemosdebug.apk");  // The filename of the mobile app
		caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
		caps.setCapability("appium:platformVersion", "15.0");
		caps.setCapability("appium:automationName", "UiAutomator2");
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("appiumVersion", "2.11.0");
		sauceOptions.setCapability("username", "oauth-sheisnotthe1-096ff");
		sauceOptions.setCapability("accessKey", "*****4f1a");
		sauceOptions.setCapability("build", "1.1");
		sauceOptions.setCapability("name", "TestingPrefrence");
		sauceOptions.setCapability("deviceOrientation", "PORTRAIT");
		caps.setCapability("sauce:options", sauceOptions);

		// Start the session
		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, caps);

		WebElement app= driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]"));
		app.click();
		
		WebElement notification= driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Notification\"]"));
		notification.click();
		
		WebElement IncomingMessage= driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"IncomingMessage\"]"));
		IncomingMessage.click();
		
		// replace with commands and assertions
		Thread.sleep(5000);
		String jobStatus = "passed"; // or "failed"

		// end the session
		driver.executeScript("sauce:job-result=" + jobStatus);
		driver.quit();
		
		

		
	
	}

}

package Pack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Demo {
	AppiumDriver driver;

	@Test

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
		MutableCapabilities caps = new MutableCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:app", "storage:filename=ApiDemosdebug.apk");  // The filename of the mobile app
		caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
		caps.setCapability("appium:platformVersion", "current_major");
		caps.setCapability("appium:automationName", "UiAutomator2");
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("username", "oauth-helooo802-2805b");
		sauceOptions.setCapability("accessKey", "de9945c9-d020-408d-9365-f75de59f9412");
		sauceOptions.setCapability("build", "<your build id>");
		sauceOptions.setCapability("name", "<your test name>");
		sauceOptions.setCapability("deviceOrientation", "PORTRAIT");
		caps.setCapability("sauce:options", sauceOptions);

		// Start the session
		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, caps);
		
		WebElement pref = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]"));
		pref.click();
		
		WebElement prefDepen3 = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]"));
		prefDepen3.click();
		
		WebElement wifiCheckBox = driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"android:id/checkbox\"]"));
		wifiCheckBox.click();
		
		WebElement wifisettings=driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[2]/android.widget.RelativeLayout"));
		wifisettings.click();
		
		WebElement enterData = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"android:id/edit\"]"));
		enterData.sendKeys("12345678");
		
		Thread.sleep(5000);
		String jobStatus = "passed"; // or "failed"

		// end the session
		driver.executeScript("sauce:job-result=" + jobStatus);
		driver.quit();
	}

}

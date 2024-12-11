package PackageK21;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumTestCases {

    AppiumDriver driver;

    @Test
    public void testMethod() throws MalformedURLException {
        UiAutomator2Options option = new UiAutomator2Options();
        option.setApp("C:\\Users\\mayur\\Downloads\\ApiDemosdebug.apk");
        option.setDeviceName("mydevice");
        
        URL url = new URL("http://127.0.0.1:4723/");
        AndroidDriver driver= new AndroidDriver(url, option);
        WebElement PrefClick=driver.findElement(AppiumBy.accessibilityId("Preference"));
        PrefClick.click();
        WebElement PrefDepen3= driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]"));
        PrefDepen3.click();
        WebElement WifiCheckBox= driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"android:id/checkbox\"]"));
        WifiCheckBox.click();
        WebElement WifiSettings= driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[2]/android.widget.RelativeLayout"));
        WifiSettings.click();
        WebElement EnterData=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"android:id/edit\"]"));
        EnterData.sendKeys("12345678");
        WebElement button= driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
        button.click();
        
    }
}

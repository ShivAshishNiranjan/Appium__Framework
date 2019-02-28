import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstAppiumTest {


    AppiumDriver<MobileElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.APP, "/Users/grofers/Desktop/myGitRepo/Appium__Framework/src/com.shivashish/ApiDemos-debug.apk");
        cap.setCapability("avd", "Nexus_6P_API_28");
        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName", "UiAutomator");

        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);

    }

    @Test
    public void simpleTest() {
        Assert.assertNotNull(driver.getContext());
    }

}

package manage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Service {

    @BeforeClass
    public static AppiumDriver capability(
            String browserName,
            String deviceName,
            String platformName,
            String platformVersion,
            String udid,
            String automationName,
            String port)
            throws IOException {
        final String PATH_TO_APP = "src/main/app/Cripto.apk";
        File app = new File(PATH_TO_APP);
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("udid", udid);

        //Only use when you have installed the app in your mobile
            // capabilities.setCapability("appPackage", "###########");
            // capabilities.setCapability("appActivity", "##########");
            // capabilities.setCapability("skipDeviceInitialization",true);

        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset", false);
        capabilities.setCapability("app", app);
        capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);

        // Skip the installation of io.appium.settings app and the UIAutomator 2 server.
        //  capabilities.setCapability("skipDeviceInitialization", true);
        capabilities.setCapability("automationName", automationName);
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("resetKeyboard", true);

        ThreadLocalDriver.setTLDriver(new AndroidDriver(new URL("http://0.0.0.0:" + port + "/wd/hub"), capabilities));
        return ThreadLocalDriver.getTLDriver();
    }

}

package manage;

import io.appium.java_client.AppiumDriver;
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
            String port,
            String wdaLocalPort)
            throws IOException {

        final String PATH_TO_APP = "src/main/app/Cripto.apk";
        File app = new File(PATH_TO_APP);

        DesiredCapabilities capabilities = new DesiredCapabilities();

        String automationAppium = "Appium";
        String automation1 = "UiAutomator1";
        String automation2 = "UiAutomator2";

        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("udid", udid);
        capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
        capabilities.setCapability("avdLaunchTimeout", "150000");
        capabilities.setCapability("deviceReadyTimeout", "8");

        if (automationName.equals(automation1) || automationName.equals(automation2) || automationName.equals(automationAppium)) {
            //Only use when you have installed the app in your mobile
            capabilities.setCapability("appPackage", "com.binance.dev");
            capabilities.setCapability("appActivity", "com.binance.dev.SplashActivity");
            // capabilities.setCapability("skipDeviceInitialization",true);

            capabilities.setCapability("noReset", true);
            capabilities.setCapability("fullReset", false);
            capabilities.setCapability("autoGrantPermissions", true);
            //capabilities.setCapability("app", app);
            // Skip the installation of io.appium.settings app and the UIAutomator 2 server.
            //  capabilities.setCapability("skipDeviceInitialization", true);
            capabilities.setCapability("automationName", automationName);
            capabilities.setCapability("unicodeKeyboard", true);
            capabilities.setCapability("resetKeyboard", true);
        } else {
            /**skipDeviceInitialization SOLO debe activarse cuando el dispositivo ya tenga la app instalada.**/
            /**Descomentar bundleId solo si la app esta instalada y comentar la capabilitie "app".**/
            /** Skip the installation of io.appium.settings app and the UIAutomator 2 server.**/
            capabilities.setCapability("skipDeviceInitialization", true);
            capabilities.setCapability("skipServerInstallation", true);
            //  capabilities.setCapability("newCommandTimeout","120");
            //capabilities.setCapability("showXcodeLog", true);
            capabilities.setCapability("bundleId", "com.bancomer.bbva.glomoInt");
            // capabilities.setCapability("agentPath", "/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent/WebDriverAgent2.xcodeproj");
            //   capabilities.setCapability("xcodeConfigFile", "/Users/mtp/Documents/ProjectSettings.xcconfig");
            capabilities.setCapability("xcodeOrgId", "SYT7T5NCU6");
            capabilities.setCapability("wdaLocalPort", wdaLocalPort);
            capabilities.setCapability("xcodeSigningId", "iPhone Developer");
            // capabilities.setCapability("usePrebuiltWDA", true);
            // capabilities.setCapability("startIWDP",true);
        }
        ThreadLocalDriver.setTLDriver(new AppiumDriver(new URL("http://0.0.0.0:" + port + "/wd/hub"), capabilities));
        return ThreadLocalDriver.getTLDriver();
    }


}


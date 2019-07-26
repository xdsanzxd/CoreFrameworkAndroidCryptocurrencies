package utilities;

import io.appium.java_client.AppiumDriver;
import manage.ThreadLocalDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static manage.Service.capability;

public class Data {

    AppiumDriver<?> app;

    @BeforeClass
    @Parameters({"browserName", "deviceName", "platformName", "platformVersion", "udid", "automationName", "port", "author"})
    public synchronized void beforeClass(String browserName, String deviceName, String platformName, String platformVersion, String udid, String automationName, String port, String author) throws Exception {

        if (ThreadLocalDriver.getTLDriver() == null) {
            app = capability(browserName, deviceName, platformName, platformVersion, udid, automationName, port);
            System.out.print(author);
            System.out.print("Driver" + deviceName + "Started");
        } else {
            ThreadLocalDriver.getTLDriver().launchApp();
        }
    }
}

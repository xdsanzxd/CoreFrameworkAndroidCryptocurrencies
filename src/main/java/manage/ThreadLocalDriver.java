package manage;

import io.appium.java_client.AppiumDriver;

public class ThreadLocalDriver {

    private static ThreadLocal<AppiumDriver<?>> tlDriver = new ThreadLocal<>();

    public static synchronized AppiumDriver<?> getTLDriver() {
        return tlDriver.get();
    }

    public static synchronized void setTLDriver(AppiumDriver<?> driver) {
        tlDriver.set(driver);
    }
}

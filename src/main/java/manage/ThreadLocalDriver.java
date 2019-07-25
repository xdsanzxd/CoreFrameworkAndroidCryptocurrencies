package manage;

import io.appium.java_client.android.AndroidDriver;

public class ThreadLocalDriver {

    private static ThreadLocal<AndroidDriver<?>> tlDriver = new ThreadLocal<AndroidDriver<?>>();

    public static synchronized AndroidDriver<?> getTLDriver() {
        return tlDriver.get();
    }

    public static synchronized void setTLDriver(AndroidDriver<?> driver) {
        tlDriver.set(driver);
    }
}

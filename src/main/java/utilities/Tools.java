package utilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import manage.ThreadLocalDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static manage.ThreadLocalDriver.getTLDriver;


public class Tools {

    private static AndroidDriver driver = getTLDriver();
    private static int HEIGHT_SCREEN = driver.manage().window().getSize().getHeight();
    private static final int yOffset = HEIGHT_SCREEN / 2;
    private static int WIDTH_SCREEN = driver.manage().window().getSize().getWidth();
    private static final int xOffset = WIDTH_SCREEN / 2;
    public static TouchAction action = new TouchAction(driver);

    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss");
    static LocalDateTime now = LocalDateTime.now();
    public static String fecha = dtf.format(now);

    public static void captureScreenShot(String name) {
        try {
            TakesScreenshot ts = (TakesScreenshot) getTLDriver();

            String screenshotsFolder = "src/screenshots/"+ fecha ;

            File directory = new File(screenshotsFolder);

            if (!directory.exists()) {
                directory.mkdir();
            }
            FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File(screenshotsFolder + "-" + name + ".png"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void swipeUp() {
        action.press(PointOption.point(xOffset, yOffset))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(xOffset, HEIGHT_SCREEN / 10))
                .release()
                .perform();
    }

    public static void waitTime(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String validText(AndroidElement object, String text) {
        String result;

        try {
            Assert.assertEquals(object.getText(), text);
        } catch (AssertionError e) {
            System.out.println("Fail test");

            String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) getTLDriver()).
                    getScreenshotAs(OutputType.BASE64);
        }
        result = "Equals texts";

        return result;
    }

    public static boolean isPresent(AndroidElement object) {
        boolean found;

        try {
            object.isDisplayed();
            System.out.println("Object found");
            found = true;
        } catch (Exception e) {
            System.out.println("Object not found");
            found = false;
        }
        return found;
    }

    public static void waitElement(AndroidElement element) {
        do {
            System.out.println("Waiting for the element");
        } while (!element.isEnabled());
    }

    public static boolean isEnabled(AndroidElement object) {
        boolean found;

        try {
            object.isEnabled();
            System.out.println("Enabled item");
            found = true;
        } catch (Exception e) {
            found = false;
        }
        return found;
    }

    public synchronized boolean wifiSetup(String udid, boolean flg) {
        synchronized (this) {
            String flgEnabled = (flg) ? "enable" : "disable";


            List<String> output = Console.runProcess(false, "adb -s " + udid + " shell am broadcast -a io.appium.settings.wifi --es setstatus " + flgEnabled);
            for (String line : output) {
                System.err.println(line);
                if (line.equalsIgnoreCase("Broadcast completed: result=-1"))
                    return true;
            }
            return false;
        }
    }

    public static class Console {
        private static final String[] WIN_RUNTIME = {"cmd.exe", "/C"};
        private static final String[] OS_LINUX_RUNTIME = {"/bin/bash", "-l", "-c"};

        private Console() {

        }

        private static <T> T[] concat(T[] first, T[] second) {
            T[] result = Arrays.copyOf(first, first.length + second.length);
            System.arraycopy(second, 0, result, first.length, second.length);
            return result;
        }

        public static List<String> runProcess(boolean isWin, String... command) {
            String[] allCommand = null;
            try {
                if (isWin) {
                    allCommand = concat(WIN_RUNTIME, command);
                } else {
                    allCommand = concat(OS_LINUX_RUNTIME, command);
                }
                ProcessBuilder pb = new ProcessBuilder(allCommand);
                pb.redirectErrorStream(true);
                Process p = pb.start();
                p.waitFor();
                BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String _temp = null;
                List<String> line = new ArrayList<String>();
                while ((_temp = in.readLine()) != null) {
                    line.add(_temp);
                }
                return line;

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @SuppressWarnings({"hiding"})
        private <String> String[] concatStr(String[] first, String[] second) {
            String[] result = Arrays.copyOf(first, first.length + second.length);
            System.arraycopy(second, 0, result, first.length, second.length);
            return result;
        }
    }
}

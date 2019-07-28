package manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InitializePageWeb {

    public static WebDriver driver = DriverFactory.getDriver();

    protected void init(Class page) {
        PageFactory.initElements(driver, page);
    }
}

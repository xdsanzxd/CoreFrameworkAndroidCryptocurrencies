package manage;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public abstract class InitializePage {

    protected InitializePage() {
        PageFactory.initElements(new AppiumFieldDecorator(ThreadLocalDriver.getTLDriver(), Duration.ofSeconds(20)), this);
    }
}

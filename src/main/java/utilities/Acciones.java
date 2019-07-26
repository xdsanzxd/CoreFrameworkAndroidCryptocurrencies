package utilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import manage.ThreadLocalDriver;
import org.openqa.selenium.Dimension;

import java.time.Duration;

import static utilities.Tools.waitTime;

public class Acciones {

    private int alto = ThreadLocalDriver.getTLDriver().manage().window().getSize().getHeight();
    private int ancho = ThreadLocalDriver.getTLDriver().manage().window().getSize().getWidth();
    private int x = ancho / 2;
    private int y = ancho / 2;
    private TouchAction touch;

    public void scrollArriba() {
        touch = new TouchAction(ThreadLocalDriver.getTLDriver());
        waitTime(500);
        Dimension celularWindowSize = ThreadLocalDriver.getTLDriver().manage().window().getSize();
        Duration duracion = Duration.ofMillis(2000);

        //touch.press(PointOption.point(x, y / 8)).waitAction().moveTo(PointOption.point(x,  y / 2)).release().perform();
        touch.press(PointOption.point((int) (celularWindowSize.width * 0.5), (int) (celularWindowSize.height * 0.5)))
                .waitAction(WaitOptions.waitOptions(duracion))
                .moveTo(PointOption.point((int) (celularWindowSize.width * 0.5), (int) (celularWindowSize.height * 0.1)))
                .release().perform();
    }

    public void tapCoordenadas(double x, double y) {

        Dimension celularWindowSize = ThreadLocalDriver.getTLDriver().manage().window().getSize();
        TouchAction a2;

        a2 = new TouchAction(ThreadLocalDriver.getTLDriver());
        int ejex = (int) (celularWindowSize.width * x);
        int ejey = (int) (celularWindowSize.height * y);
        a2.tap(PointOption.point(ejex, ejey)).release().perform();
    }

   /* public void scroll() {

        touch = new TouchAction(ThreadLocalDriver.getTLDriver());
        waitTime(500);
        touch.press(PointOption.point(x, 9 * alto / 10)).waitAction().moveTo(PointOption.point(x, y / 2)).release().perform();
    }

    public void scrollMedio() {
        touch = new TouchAction(ThreadLocalDriver.getTLDriver());
        waitTime(500);
        touch.press(PointOption.point(x, y)).waitAction().moveTo(PointOption.point(x, y / 2)).release().perform();
    }
    public void scrollAbajoCalendarioMes() {
        touch = new TouchAction(ThreadLocalDriver.getTLDriver());
        waitTime(500);
        Dimension celularWindowSize = ThreadLocalDriver.getTLDriver().manage().window().getSize();
        Duration duracion = Duration.ofMillis(2000);

        //touch.press(PointOption.point(x, y / 8)).waitAction().moveTo(PointOption.point(x,  y / 2)).release().perform();
        touch.press(PointOption.point((int) (celularWindowSize.width * 0.5), (int) (celularWindowSize.height * 0.6)))
                .waitAction(WaitOptions.waitOptions(duracion))
                .moveTo(PointOption.point((int) (celularWindowSize.width * 0.5), (int) (celularWindowSize.height * 0.5)))
                .release().perform();
    }

    public void desplazarArriba() {
        touch = new TouchAction(ThreadLocalDriver.getTLDriver());
        waitTime(500);
        Dimension celularWindowSize = ThreadLocalDriver.getTLDriver().manage().window().getSize();
        Duration duracion = Duration.ofMillis(1000);
        //touch.press(PointOption.point(x, y / 8)).waitAction().moveTo(PointOption.point(x,  y / 2)).release().perform();
        touch.press(PointOption.point((int) (celularWindowSize.width * 0.5), (int) (celularWindowSize.height * 0.4)))
                .waitAction(WaitOptions.waitOptions(duracion))
                .moveTo(PointOption.point((int) (celularWindowSize.width * 0.5), (int) (celularWindowSize.height * 0.8)))
                .release().perform();
    }

    public void desplazarIzquierda(MobileElement androidElement) {
        touch = new TouchAction(ThreadLocalDriver.getTLDriver());
        waitTime(500);
        touch.press(ElementOption.element(androidElement)).waitAction().moveTo(PointOption.point(x / 6, y / 2)).release().perform();
    }

    public void desplazarDerecha(MobileElement androidElement) {
        touch = new TouchAction(ThreadLocalDriver.getTLDriver());
        waitTime(500);
        touch.press(ElementOption.element(androidElement)).waitAction().moveTo(PointOption.point(x + 10, y + 0)).release().perform();
    }

    public void desplazarAbajo() {
        touch = new TouchAction(ThreadLocalDriver.getTLDriver());
        waitTime(500);
        Dimension celularWindowSize = ThreadLocalDriver.getTLDriver().manage().window().getSize();
        Duration duracion = Duration.ofMillis(1000);
        //touch.press(PointOption.point(x, y / 8)).waitAction().moveTo(PointOption.point(x,  y / 2)).release().perform();
        touch.press(PointOption.point((int) (celularWindowSize.width * 0.5), (int) (celularWindowSize.height * 0.4)))
                .waitAction(WaitOptions.waitOptions(duracion))
                .moveTo(PointOption.point((int) (celularWindowSize.width * 0.5), (int) (celularWindowSize.height * 0.2)))
                .release().perform();
    }*/
    /*public void regresarCerrarSesion(MobileElement acceptCloseSession) {

        do {
            ThreadLocalDriver.getTLDriver().navigate().back();
        } while (!isPresent(acceptCloseSession));
        acceptCloseSession.click();
    }*/
}


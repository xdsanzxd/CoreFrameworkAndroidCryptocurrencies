package pages;

import io.appium.java_client.android.AndroidElement;
import manage.InitializePage;
import org.openqa.selenium.support.FindBy;
import utilities.Tools;

import static utilities.Tools.*;

public class MainPage extends InitializePage {

    private String nameCoin;

    @FindBy(xpath = "//*[@text='Markets']")
    private AndroidElement btnMarkets;

    @FindBy(xpath = "//*[@text='BTC']")
    private AndroidElement btnBTC;

    @FindBy(xpath="//*[@resource-id='com.binance.dev:id/sortChg']")
    private AndroidElement btn24hChg;

    @FindBy(xpath="//*[@resource-id='com.binance.dev:id/search']")
    private AndroidElement btnSearch;

    @FindBy(id="editSearch")
    private AndroidElement btnEditSearch;

    @FindBy(xpath = "//*[@text='BTC / USDT']")
    private AndroidElement txtBTCusdt;

    @FindBy(id="tvFullName")
    private AndroidElement GraphCoin;

    @FindBy(id="chevronLeft")
    private AndroidElement btnBack;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Home')]")
    private AndroidElement btnHome;

    @FindBy(id="tvGainers")
    private AndroidElement btnGainers;

    @FindBy(id="tvLosers")
    private AndroidElement btnLossers;

    public void fieldValidations(String udid) {
        Tools tool = new Tools();
        tool.wifiSetup(udid,true);
        waitTime(2000);
        isPresent(btnMarkets);
        validText(btnMarkets,"Markets");
    }

    public void getScreenshot24hrs() {
        btnMarkets.click();
        btnBTC.click();
        btn24hChg.click();
        Tools.captureScreenShot("24 Chg% +");
        btn24hChg.click();
        Tools.captureScreenShot("24 Chg% -");
    }

    public void getGraphsOfCoins()
    {
        btnSearch.click();
        btnEditSearch.click();
        btnEditSearch.sendKeys("USDT");
        txtBTCusdt.click();
        waitElement(txtBTCusdt);
        nameCoin=txtBTCusdt.getText();
        Tools.captureScreenShot("BTC");
        btnBack.click();
    }

    public void getValueCoin(String coin)
    {
       1.- //primero implementar que se abra por medio del package y activity
 // METODO FootbarFounds
       2.- //abrir el aparatado "founds"
       3.- //Scroll con coordenadas
//METODO getValuesCoin
       4.- //Haces un switch . dependiendo el texto que busca es el click donde buscaras.
       5.- //una vez elegida la opc . obtener el precio , y los satochis
       6.- // Imprimir el precio y los satochis actuales
       7.- // calcular la diferencia del precio comprado al actual. e imprimir "
               // Mayor por (Ganancia): $___ / ___satochis___"(color verde) en caso de de mayor.
               // o Menor por (perdida) : $____/satochis (Color ROJO) en caso de menor.

       6.- //click "atras"

    }

    public void GetGainnersAndLossersCoins()
    {
        isPresent(btnHome);
        btnHome.click();
        swipeUp();
        swipeUp();
        btnGainers.click();
        Tools.captureScreenShot("GainnersCoin ");
        waitTime(1000);
        btnLossers.click();
        Tools.captureScreenShot("LossersCoin ");
    }
}

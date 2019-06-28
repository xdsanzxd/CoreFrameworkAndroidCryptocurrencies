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

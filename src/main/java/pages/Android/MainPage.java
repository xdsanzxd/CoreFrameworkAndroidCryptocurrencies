package pages.Android;


import io.appium.java_client.android.AndroidElement;
import manage.InitializePage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import utilities.Acciones;
import utilities.ConsoleColors;
import utilities.Tools;

import static General.Constantes.*;
import static utilities.Tools.*;

public class MainPage extends InitializePage {

    private String nameCoin;

    @FindBy(xpath = "//*[@text='Markets']")
    private AndroidElement btnMarkets;

    @FindBy(xpath = "//*[@text='BTC']")
    private AndroidElement btnBTC;

    @FindBy(xpath = "//*[@resource-id='com.binance.dev:id/sortChg']")
    private AndroidElement btn24hChg;

    @FindBy(xpath = "//*[@resource-id='com.binance.dev:id/search']")
    private AndroidElement btnSearch;

    @FindBy(id = "editSearch")
    private AndroidElement btnEditSearch;

    @FindBy(xpath = "//*[@text='BTC / USDT']")
    private AndroidElement txtBTCusdt;

    @FindBy(id = "tvFullName")
    private AndroidElement GraphCoin;

    @FindBy(id = "chevronLeft")
    private AndroidElement btnBack;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Home')]")
    private AndroidElement btnHome;

    @FindBy(id = "tvGainers")
    private AndroidElement btnGainers;

    @FindBy(id = "tvLosers")
    private AndroidElement btnLossers;
    @FindBy(xpath = "//*[@text='Funds']")
    private AndroidElement btnFounds;
    @FindBy(xpath = "//*[contains(@text,'POE')]")
    private AndroidElement btnPoe;
    @FindBy(xpath = "//*[contains(@text,'QSP')]")
    private AndroidElement btnQsp;
    @FindBy(xpath = "//*[contains(@text,'XRP')]")
    private AndroidElement btnXrp;
    @FindBy(xpath = "//*[contains(@text,'ADA')]")
    private AndroidElement btnAda;
    @FindBy(xpath = "//*[contains(@text,'POWR')]")
    private AndroidElement btnPowr;
    @FindBy(xpath = "//*[contains(@text,'NANO')]")
    private AndroidElement btnNano;
    @FindBy(xpath = "//*[contains(@text,'OMG')]")
    private AndroidElement btnOmg;
    @FindBy(xpath = "//*[contains(@text,'LUN')]")
    private AndroidElement btnLun;
    @FindBy(xpath = "//*[contains(@text,'NEO')]")
    private AndroidElement btnNeo;
    @FindBy(xpath = "//*[contains(@text,'LTC')]")
    private AndroidElement btnLtc;
    @FindBy(xpath = "//*[contains(@text,'XMR')]")
    private AndroidElement btnXmr;


    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='POE / BTC']]]"),
            @FindBy(id = "tvPrice")
    })
    private AndroidElement SatochisPoe;
    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='POE / BTC']]]"),
            @FindBy(id = "tvCash")
    })
    private AndroidElement PricePoe;

    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='QSP / BTC']]]"),
            @FindBy(id = "tvPrice")
    })
    private AndroidElement SatochisQsp;
    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='QSP / BTC']]]"),
            @FindBy(id = "tvCash")
    })
    private AndroidElement PriceQsp;

    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='XRP / BTC']]]"),
            @FindBy(id = "tvPrice")
    })
    private AndroidElement SatochisXrp;
    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='XRP / BTC']]]"),
            @FindBy(id = "tvCash")
    })
    private AndroidElement PriceXrp;

    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='ADA / BTC']]]"),
            @FindBy(id = "tvPrice")
    })
    private AndroidElement SatochisAda;
    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='ADA / BTC']]]"),
            @FindBy(id = "tvCash")
    })
    private AndroidElement PriceAda;

    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='POWR / BTC']]]"),
            @FindBy(id = "tvPrice")
    })
    private AndroidElement SatochisPowr;
    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='POWR / BTC']]]"),
            @FindBy(id = "tvCash")
    })
    private AndroidElement PricePowr;

    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='NANO / BTC']]]"),
            @FindBy(id = "tvPrice")
    })
    private AndroidElement SatochisNano;
    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='NANO / BTC']]]"),
            @FindBy(id = "tvCash")
    })
    private AndroidElement PriceNano;

    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='OMG / BTC']]]"),
            @FindBy(id = "tvPrice")
    })
    private AndroidElement SatochisOmg;
    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='OMG / BTC']]]"),
            @FindBy(id = "tvCash")
    })
    private AndroidElement PriceOmg;

    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='NEO / BTC']]]"),
            @FindBy(id = "tvPrice")
    })
    private AndroidElement SatochisNeo;
    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='NEO / BTC']]]"),
            @FindBy(id = "tvCash")
    })
    private AndroidElement PriceNeo;

    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='LTC / BTC']]]"),
            @FindBy(id = "tvPrice")
    })
    private AndroidElement SatochisLtc;
    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='LTC / BTC']]]"),
            @FindBy(id = "tvCash")
    })
    private AndroidElement PriceLtc;

    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='XMR / BTC']]]"),
            @FindBy(id = "tvPrice")
    })
    private AndroidElement SatochisXmr;
    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='XMR / BTC']]]"),
            @FindBy(id = "tvCash")
    })
    private AndroidElement PriceXmr;

    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='LUN / BTC']]]"),
            @FindBy(id = "tvPrice")
    })
    private AndroidElement SatochisLun;
    @FindBys({
            @FindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='LUN / BTC']]]"),
            @FindBy(id = "tvCash")
    })
    private AndroidElement PriceLun;


    public void fieldValidations(String udid) {
        Tools tool = new Tools();
        tool.wifiSetup(udid, true);
        waitTime(2000);
        isPresent(btnMarkets);
        validText(btnMarkets, "Markets");
    }

    public void getScreenshot24hrs() {
        btnMarkets.click();
        btnBTC.click();
        btn24hChg.click();
        Tools.captureScreenShot("24 Chg% +");
        btn24hChg.click();
        Tools.captureScreenShot("24 Chg% -");
    }

    public void getGraphsOfCoins() {
        btnSearch.click();
        btnEditSearch.click();
        btnEditSearch.sendKeys("USDT");
        txtBTCusdt.click();
        waitElement(txtBTCusdt);
        nameCoin = txtBTCusdt.getText();
        Tools.captureScreenShot("BTC");
        btnBack.click();
    }

    public void OpenFounds() {
        btnFounds.click();
        swipeUp();
    }

    public double percentageOfLossOrGain(double B2, double B1) {
        double percentageOfLossOrGain = ((B2 - B1) / B1 * 100);
        return percentageOfLossOrGain;
    }

    public void getProfitAndLoss(String coin) {
        Acciones tool = new Acciones();
        tool.scrollArriba();
        switch (coin) {
            case poe:
                btnPoe.click();
                System.out.print("\n\n" + ConsoleColors.BLACK + "======= P O E =========" + ConsoleColors.RESET + "\n");
                ObtainCoinProfit(SatochisPoe, PricePoe, PURCHASE_PRICE_DOLLAR_POE, PURCHASE_PRICE_SATOCHIS_POE);
                break;

            case qsp:
                btnQsp.click();
                System.out.print("\n\n" + ConsoleColors.BLACK + "======= Q S P =========" + ConsoleColors.RESET + "\n");
                ObtainCoinProfit(SatochisQsp, PriceQsp, PURCHASE_PRICE_DOLLAR_QSP, PURCHASE_PRICE_DOLLAR_QSP);
                break;

            case xrp:
                break;

            case ada:
                btnAda.click();
                System.out.print("\n\n" + ConsoleColors.BLACK + "======= A D A =========" + ConsoleColors.RESET + "\n");
                ObtainCoinProfit(SatochisAda, PriceAda, PURCHASE_PRICE_DOLLAR_ADA, PURCHASE_PRICE_SATOCHIS_ADA);
                break;

            case powr:
                btnPowr.click();
                System.out.print("\n\n" + ConsoleColors.BLACK + "======= POWR =========" + ConsoleColors.RESET + "\n");
                ObtainCoinProfit(SatochisPowr, PricePowr, PURCHASE_PRICE_DOLLAR_POWR, PURCHASE_PRICE_SATOCHIS_POWR);
                break;

            case nano:
                btnNano.click();
                System.out.print("\n\n" + ConsoleColors.BLACK + "======= NANO =========" + ConsoleColors.RESET + "\n");
                ObtainCoinProfit(SatochisNano, PriceNano, PURCHASE_PRICE_DOLLAR_NANO, PURCHASE_PRICE_SATOCHIS_NANO);
                break;

            case omg:
                btnOmg.click();
                System.out.print("\n\n" + ConsoleColors.BLACK + "======= O M G =========" + ConsoleColors.RESET + "\n");
                ObtainCoinProfit(SatochisOmg, PriceOmg, PURCHASE_PRICE_DOLLAR_OMG, PURCHASE_PRICE_SATOCHIS_OMG);
                break;

            case lun:
                btnLun.click();
                System.out.print("\n\n" + ConsoleColors.BLACK + "======= L U N =========" + ConsoleColors.RESET + "\n");
                ObtainCoinProfit(SatochisLun, PriceLun, PURCHASE_PRICE_DOLLAR_LUN, PURCHASE_PRICE_SATOCHIS_LUN);
                break;
            case neo:
                btnNeo.click();
                System.out.print("\n\n" + ConsoleColors.BLACK + "======= N E O =========" + ConsoleColors.RESET + "\n");
                ObtainCoinProfit(SatochisNeo, PriceNeo, PURCHASE_PRICE_DOLLAR_NEO, PURCHASE_PRICE_SATOCHIS_NEO);
                break;

            case ltc:
                btnLtc.click();
                System.out.print("\n\n" + ConsoleColors.BLACK + "======= L T C =========" + ConsoleColors.RESET + "\n");
                ObtainCoinProfit(SatochisLtc, PriceLtc, PURCHASE_PRICE_DOLLAR_LTC, PURCHASE_PRICE_SATOCHIS_LTC);
                break;
            case xmr:
                btnXmr.click();
                System.out.print("\n\n" + ConsoleColors.BLACK + "======= X M R =========" + ConsoleColors.RESET + "\n");
                ObtainCoinProfit(SatochisXmr, PriceXmr, PURCHASE_PRICE_DOLLAR_XMR, PURCHASE_PRICE_SATOCHIS_XMR);

                break;


            default:
                break;
        }
    }

    private void ObtainCoinProfit(AndroidElement satochisElement, AndroidElement priceElement, double purchaseDollar, double purchaseSatochis) {
        double CurrentSatochis = Double.parseDouble(satochisElement.getText());

        String obtainedPrice = priceElement.getText();
        int inicio = obtainedPrice.indexOf("$");
        String textCut = obtainedPrice.substring(inicio + 1);
        double currentCoinPrice = Double.parseDouble(textCut);

        if (CurrentSatochis > purchaseSatochis) {
            double possitiveDifferenceDollar = currentCoinPrice - purchaseDollar;
            double possitiveDifferenceSatochis = CurrentSatochis - purchaseSatochis;

            System.out.print(ConsoleColors.BLACK_BOLD
                    + " Satochis profit: "
                    + ConsoleColors.GREEN_BOLD + possitiveDifferenceSatochis + ConsoleColors.RESET + "\n");


            System.out.print(" Dollar Profit: " + possitiveDifferenceDollar + "\n");
            System.out.print(" You have a profit of: "
                    + percentageOfLossOrGain(CurrentSatochis, purchaseSatochis)
                    + "% of Satochis" + "\n");

        } else {
            System.out.print(" You have a loss of: "
                    + ConsoleColors.RED + percentageOfLossOrGain(CurrentSatochis, purchaseSatochis)
                    + ConsoleColors.RESET
                    + " % of Satochis" + "\n");
        }
        driver.navigate().back();
    }

    public void GetGainnersAndLossersCoins() {
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

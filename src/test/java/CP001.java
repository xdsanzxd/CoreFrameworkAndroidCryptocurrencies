import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.Data;

public class CP001 extends Data {


    @Test(testName = "CP001", description = "Open the app and get the information with screenshot of the parcentajes in 24 hrs. Saving the screenshot with current date." +
            "( negatives and positives ) with the objective of take better decisions in the near future.")
    @Parameters("udid")
    public void     getStadistics24hrs(String udid) {
        MainPage mainpage = new MainPage();
        mainpage.fieldValidations(udid);
        mainpage.getScreenshot24hrs();
    }

    @Test(description = "Get current graphs of especific coins")
    public void getGraphCoins() {
        MainPage mainpage = new MainPage();
        mainpage.getGraphsOfCoins();
        mainpage.getValueCoin("ZRX");
    }

    @Test(description = "Get current gainers of the moment")
    public void getCurrentGainersCoin() {
        MainPage mainpage = new MainPage();
        mainpage.GetGainnersAndLossersCoins();
    }


}

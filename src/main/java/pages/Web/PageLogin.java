package pages.Web;

import manage.InitializePageWeb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLogin extends InitializePageWeb {

    @FindBy(id = "exchange-header-register")
    private static WebElement usuario;

    @FindBy(id = "RegisterForm-input-email")
    private static WebElement campoCorreo;

    public void initElements() {
        init(PageLogin.class);
    }

    public void registroNuevo() {
        initElements();
        usuario.click();
        campoCorreo.sendKeys("sati@gmail.com");

    }


}

package Web;

import manage.DriverFactory;
import manage.ProjectProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Web.PageLogin;

public class CP001 extends DriverFactory {
    private WebDriver driver = manage.DriverFactory.getDriver();

    @Test(description = "Abrir pagina web + login + ")
    public void abrirPagina() {
        // Log4J.startTestCase("Abrir Navegador");
        driver.get(ProjectProperties.properties.getProperty("browser.url"));
    }

    @Test(description = "Ingresar Datos Login", dependsOnMethods = "abrirPagina")
    public void login() {
        //   Log4J.startTestCase("Ingresar datos login");
        PageLogin pagelogin = new PageLogin();
        pagelogin.registroNuevo();
    }
}

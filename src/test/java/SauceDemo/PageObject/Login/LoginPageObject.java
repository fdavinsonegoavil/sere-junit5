package SauceDemo.PageObject.Login;

import SauceDemo.PageObject.BasePageObject.SauceDemoPOM;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject extends SauceDemoPOM {

    @FindBy(id = "user-name")
    public WebElementFacade txtUserName;
    @FindBy(id = "password")
    public WebElementFacade txtPassword;
    @FindBy(id = "login-button")
    public WebElementFacade btnLogin;

    public void iniciarSesión(String strUserName, String strPassword) {

        escribir(txtUserName, strUserName);
        escribir(txtPassword, strPassword);
        seleccionarEnElBoton(btnLogin);
    }
}

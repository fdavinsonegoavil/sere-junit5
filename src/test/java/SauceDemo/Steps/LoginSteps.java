package SauceDemo.Steps;

import SauceDemo.PageObject.BasePageObject.SauceDemoPOM;
import SauceDemo.PageObject.Login.LoginPageObject;
import net.serenitybdd.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {
    String actor;
    LoginPageObject pagLogin;

    @Step(" inicia sesión en la pagina de sauceDemo con el usuario: {0} y contraseña {1}. ")
    public void ingresarCredenciales(String strUserName, String strPassword){
        pagLogin.open();
        pagLogin.iniciarSesión(strUserName,strPassword);
    }

}

package SauceDemo.Steps;

import SauceDemo.PageObject.BasePageObject.SauceDemoPOM;
import SauceDemo.PageObject.Login.LoginPageObject;
import net.serenitybdd.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps{
    String actor;
    LoginPageObject pagLogin;
    @Step("Abrir el navegador")
    public void abrirNavegador(){
        pagLogin.open();
    }

    @Step("Iniciar sesión con las credenciales ")
    public void ingresarCredenciales(String strUserName, String strPassword){
        pagLogin.iniciarSesión(strUserName,strPassword);
    }

}

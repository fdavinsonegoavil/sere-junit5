package SauceDemo.Runner.Login;

import SauceDemo.Steps.LoginSteps;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class SauceDemoLoginRunnerSuite {
     @Managed
    WebDriver driver;
    @Steps
    LoginSteps loginStps;

    @ParameterizedTest
    @Title("Test de iniciar sesión.")
    @CsvFileSource(resources = "/dataDriven/dataLogin.csv", numLinesToSkip = 1)
    public void testIngresarASauceDemo(String strUserName,String strPassword){
        loginStps.ingresarCredenciales(strUserName,strPassword);
    }


}

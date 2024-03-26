package SauceDemo.Runner.AgregarAlCarro;

import SauceDemo.Steps.HomeSteps;
import SauceDemo.Steps.LoginSteps;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class AgregarAlCarroRunnerSuite {
     @Managed
    WebDriver driver;
    @Steps
    HomeSteps homeSteps;

    @ParameterizedTest
    @Title("Test de agregar pructos al carrito.")
    @CsvFileSource(resources = "/dataDriven/carritoHome.csv", numLinesToSkip = 1)
    public void testAgregarProductosAlCarrito(String strUserName,String strPassword){
        homeSteps.ingresarCredenciales(strUserName,strPassword);
        homeSteps.agregarMochila();
        homeSteps.agregarSweater();
        homeSteps.irAlCarritoCompra();
    }


}

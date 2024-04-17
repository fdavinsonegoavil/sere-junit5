package SauceDemo.Runner.AgregarAlCarro;

import SauceDemo.Steps.HomeSteps;
import SauceDemo.Steps.LoginSteps;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Tag;
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
    @Tag("preprod")
    @Title("Test de agregar pructos al carrito.")
    @CsvFileSource(resources = "/dataDriven/carritoHome.csv", numLinesToSkip = 1)
    public void testAgregarProductosAlCarrito(String strUserName,String strPassword){
        homeSteps.ingresarCredenciales(strUserName,strPassword);
        homeSteps.agregarMochila();
        homeSteps.agregarSweater();
        homeSteps.irAlCarritoCompra();
    }

    @ParameterizedTest
    @Title("Completa el flujo de compra")
    @CsvFileSource(resources = "/dataDriven/completarLaCompra.csv", numLinesToSkip = 1)
    public void completarElFlujoDeCompra(String strUserName,String strPassword,String strFirstName, String strLastName, String strPostalCode){
        homeSteps.ingresarCredenciales(strUserName,strPassword);
        homeSteps.agregarMochila();
        homeSteps.agregarSweater();
        homeSteps.irAlCarritoCompra();
        homeSteps.botonCheckout();
        homeSteps.inputsCheckout(strFirstName,strLastName,strPostalCode);
        homeSteps.botonContinuar();
        homeSteps.botonFinish();
        homeSteps.mensajeConfirmacionCompra();
    }


}

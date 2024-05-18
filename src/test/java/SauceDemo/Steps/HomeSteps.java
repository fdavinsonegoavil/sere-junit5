package SauceDemo.Steps;

import SauceDemo.PageObject.Home.HomePageObject;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;

public class HomeSteps {
    HomePageObject homeStps;

    @Step("Selecciona en agregar al carrito de compra a la mochila ")
    public void agregarMochila(){
        homeStps.seleccionarAgregarMochila();
    }
    @Step("Selecciona en agregar al carrito de compra el sweater ")
    public void agregarSweater(){
        homeStps.seleccionarAgregarSweater();
    }
    @Step("Selecciona en el carrito de compra")
    public void irAlCarritoCompra(){
        homeStps.seleccionarCarritoCompras();
    }
    @Step("Selecciona en el boton de checkout")
    public void botonCheckout(){
        homeStps.seleccionarBtnCheckout();
    }
    @Step("Completa los datos de nombre, apellido y codigo postal")
    public void inputsCheckout(String strFirstName, String strLastName, String strPostalCode){
        homeStps.completarCheckoutInformación(strFirstName,strLastName,strPostalCode);
    }
    @Step("Selecciona en continuar")
    public void botonContinuar(){
        homeStps.seleccionarEnContinuar();
    }
    @Step("Selecciona en finish")
    public void botonFinish(){
        homeStps.seleccionarEnFinish();
    }
    @Step("Verifica la compra")
    public void mensajeConfirmacionCompra(){
        homeStps.confirmarciónDeLaCompra();
    }

}

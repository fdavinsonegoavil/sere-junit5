package SauceDemo.Steps;

import SauceDemo.PageObject.Home.HomePageObject;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;

public class HomeSteps extends LoginSteps {
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



}

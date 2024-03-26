package SauceDemo.PageObject.Home;

import SauceDemo.PageObject.Login.LoginPageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.mockito.internal.matchers.Find;
import org.openqa.selenium.support.FindBy;


public class HomePageObject extends LoginPageObject {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElementFacade btnAddToCartBackPack;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    public WebElementFacade btnAddToCarSweater;
    @FindBy(css = ".shopping_cart_links")
    public WebElementFacade btnShoppingCartLink;
    public void seleccionarAgregarMochila(){
        seleccionarEnElBoton(btnAddToCartBackPack);
    }
    public void seleccionarAgregarSweater(){
        seleccionarEnElBoton(btnAddToCarSweater);
    }
    public void seleccionarCarritoCompras(){
        seleccionarEnElBoton(btnShoppingCartLink);
    }
}

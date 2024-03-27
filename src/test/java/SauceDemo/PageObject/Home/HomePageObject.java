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
    @FindBy(css = ".shopping_cart_link")
    public WebElementFacade btnShoppingCartLink;
    @FindBy(id = "checkout")
    public WebElementFacade btnCheckout;
    @FindBy(id = "first-name")
    public WebElementFacade txtFirstName;
    @FindBy(id = "last-name")
    public WebElementFacade txtLastName;
    @FindBy(id = "postal-code")
    public WebElementFacade txtPostalCode;
    @FindBy(id = "continue")
    public WebElementFacade btnCheckoutContinue;
    @FindBy(id = "cancel")
    public WebElementFacade btnCheckoutCancel;
    @FindBy(id = "finish")
    public WebElementFacade btnCheckoutFinish;
    @FindBy(css = ".complete-header")
    public WebElementFacade lblBuySuccess;
    public void seleccionarAgregarMochila(){
        seleccionarEnElBoton(btnAddToCartBackPack);
    }
    public void seleccionarAgregarSweater(){
        seleccionarEnElBoton(btnAddToCarSweater);
    }
    public void seleccionarCarritoCompras(){
        seleccionarEnElBoton(btnShoppingCartLink);
    }
    public void seleccionarBtnCheckout(){
        seleccionarEnElBoton(btnCheckout);
    }
    public void completarCheckoutInformación(String strFirstName, String strLastName, String strPostalCode){
        escribir(txtFirstName,strFirstName);
        escribir(txtLastName,strLastName);
        escribir(txtPostalCode,strPostalCode);
    }
    public void seleccionarEnContinuar(){
        seleccionarEnElBoton(btnCheckoutContinue);
    }
    public void seleccionarEnFinish(){
        seleccionarEnElBoton(btnCheckoutFinish);
    }
    public void confirmarciónDeLaCompra(){
        verificarAssertDelLocator(lblBuySuccess,"Thank you for your order!");
    }


}

package SauceDemo.PageObject.BasePageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SauceDemoPOM extends PageObject {


    public void escribir(WebElementFacade elem, String strTxt){
        esperarElementoWEF(elem);
        elem.type(strTxt);
    }
    public void seleccionarEnElBoton(WebElementFacade elem){
        seleccionarLocatorClickeable(elem);
    }

    public void esperarElementoWEF(WebElementFacade elem){
        if(!elem.isEnabled()){
            Assertions.fail("No se encontro el Locator");
        }
        moveToWEF(elem);
    }
    public void esperarElementoWEFClickeable(WebElementFacade elem){
        if(!elem.isClickable()){
            Assertions.fail("No se encontro el Locator");
        }
        moveToWEF(elem);
    }
    public void seleccionarLocatorClickeable(WebElementFacade elem){
        esperarElementoWEFClickeable(elem);
        elem.click();
    }
    public void moveToWEF(WebElement elem){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(elem).perform();
    }
    public WebElement ejecutarJS(String strLocator, WebElementFacade elem){
        esperarElementoWEF(elem);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        WebElement webElem = (WebElement) js.executeScript(strLocator);
        Actions action = new Actions(getDriver());
        action.moveToElement(webElem).perform();
        return webElem;
    }

}

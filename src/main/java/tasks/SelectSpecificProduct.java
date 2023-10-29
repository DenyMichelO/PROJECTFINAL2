package tasks;

import ui.HomeUI;
import actions.Click;
import org.openqa.selenium.WebDriver;

public class SelectSpecificProduct {

    public static void selectProduct(WebDriver driver, String namep){

        Click.on(driver, HomeUI.productItemToSearch(namep));
    }
    }






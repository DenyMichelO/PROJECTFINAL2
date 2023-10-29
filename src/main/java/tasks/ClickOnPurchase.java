package tasks;

import ui.BillInformationUI;
import actions.Click;
import org.openqa.selenium.WebDriver;

public class ClickOnPurchase {

    public static void clickPurchase(WebDriver driver) {
        Click.on(driver, BillInformationUI.buttonPurchase);


    }
}

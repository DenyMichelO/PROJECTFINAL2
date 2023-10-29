package tasks;

import ui.PlaceOrderUI;
import actions.Click;
import org.openqa.selenium.WebDriver;

public class PlaceOrders {

    public static void PlaceOrderTask(WebDriver driver){
        Click.on(driver, PlaceOrderUI.PlaceOrderButton);
    }
}

package tasks;

import ui.DescriptionProductUI;
import actions.Click;
import org.openqa.selenium.WebDriver;

public class GoToCart {

    public static void GoToCartButton(WebDriver driver) {
        Click.on(driver, DescriptionProductUI.GotoCartButton);
    }
}
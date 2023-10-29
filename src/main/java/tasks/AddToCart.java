package tasks;

import ui.DescriptionProductUI;
import actions.Click;
import org.openqa.selenium.WebDriver;

public class AddToCart {

    public static void AddButton(WebDriver driver){
        Click.on(driver, DescriptionProductUI.AddToCartButton);
    }
}


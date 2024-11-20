package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoggedInAreaView {

    public static Target WELCOME_TEXT = Target
            .the("welcome text")
            .located(By.xpath("//android.widget.TextView[contains(@text,'You are logged in as')]"));

    public static Target TITLE = Target
            .the("title")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Secret')]"));

    public static Target LOG_OUT_BUTTON = Target
            .the("welcome text")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Logout')]"));


}

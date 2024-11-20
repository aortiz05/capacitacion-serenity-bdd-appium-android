package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class HomeView {
    public static Target LOG_IN_LINK = Target.the("Login task")
            .located(By.xpath("//android.widget.TextView[@text='Login Screen']"));
}

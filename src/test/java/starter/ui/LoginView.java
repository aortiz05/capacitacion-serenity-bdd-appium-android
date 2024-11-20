package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {
    public static Target USER_NAME = Target.the("username")
            .located(AppiumBy.accessibilityId("username"));

    public static Target PASSWORD = Target.the("password")
            .located(AppiumBy.accessibilityId("password"));

    public static Target LOGIN_BUTTON = Target.the("login button")
            .located(By.xpath("(//android.widget.TextView[@text='Login'])[2]"));

    public static Target INVALID_LOGIN_TEXT = Target.the("Invalid login")
            .located(By.xpath("//android.widget.TextView[@resource-id='android:id/message']"));

}

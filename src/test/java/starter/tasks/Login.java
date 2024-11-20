package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.LoginView;

public class Login implements Task {

    private final String userName;
    private final String password;

    public Login(String username, String password) {
        this.userName = username;
        this.password = password;

    }

    public static Performable withAdminUser(String username, String password) {
        return new Login(username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(userName).into(LoginView.USER_NAME),
                SendKeys.of(password).into(LoginView.PASSWORD),
                Click.on(LoginView.LOGIN_BUTTON)
        );
    }
}

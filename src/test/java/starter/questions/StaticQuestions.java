package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.ui.LoggedInAreaView;
import starter.ui.LoginView;

public class StaticQuestions {


    public static Question<String> getTitle() {
        return actor -> Text.of(LoggedInAreaView.TITLE).answeredBy(actor);
    }

    public static Question<String> getLogoutText() {
        return actor -> Text.of(LoggedInAreaView.LOG_OUT_BUTTON).answeredBy(actor);
    }

    public static Question<String> getInvalidLogin() {
        return actor -> Text.of(LoginView.INVALID_LOGIN_TEXT).answeredBy(actor);
    }


}

package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.googlePages.GooglePage;

public class GoogleSteps extends ScenarioSteps {

    private GooglePage googlePage;

    @Step
    public void enterToAccount(String email, String password) {
        googlePage.open();
        googlePage.clickEnterButton();
        googlePage.enterToAccount(email, password);
    }

    public boolean isLoginSuccessful(String login) {
        return googlePage.isLoginSuccessful(login);
    }
}

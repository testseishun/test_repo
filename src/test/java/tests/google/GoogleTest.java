package tests.google;

import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import steps.GoogleSteps;
import tests.CommonGoogleTest;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleTest extends CommonGoogleTest {

    private String login = "314526398test@gmail.com";
    private String password = "4815162342Lost";

    @Steps
    private GoogleSteps googleSteps;

    @Test
    public void user_can_login_to_google_account() {
        googleSteps.enterToAccount(login, password);

        assertThat(googleSteps.isLoginSuccessful(login)).describedAs("Не смогли залогиниться").isTrue();
    }
}

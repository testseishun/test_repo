package pages.googlePages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import pages.CommonPageObject;

public class ServiceLoginPage extends CommonPageObject {

    @FindBy(id = "Email")
    private WebElementFacade emailInput;

    @FindBy(id = "Passwd")
    private WebElementFacade passwordInput;

    @FindBy(id = "signIn")
    private WebElementFacade signInButton;

    public ServiceLoginPage(WebDriver driver) {super(driver);}

    public void enterToAccount(String email, String password) {
        enter(email).into(emailInput);
        enter(password).into(passwordInput);
        signInButton.click();
    }
}

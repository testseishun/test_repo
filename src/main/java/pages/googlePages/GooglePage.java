package pages.googlePages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import pages.CommonPageObject;

/**
 * Created by t.elizarova on 09.03.2015 (Moedelo.Ltd)).
 */
public class GooglePage extends CommonPageObject {

    private ServiceLoginPage serviceLoginPage;

    @FindBy(xpath = "//*[text()='Войти']")
    private WebElementFacade enterButton;

    private WebElementFacade loginLink(String login) {
        return findBy(String.format("//a[text()='%s']", login));
    }

    public GooglePage(WebDriver driver) {super(driver);}

    public void clickEnterButton() {
        enterButton.click();
    }

    public void enterToAccount(String email, String password) {
        serviceLoginPage.enterToAccount(email, password);
    }

    public boolean isLoginSuccessful(String login) {
        return loginLink(login).isDisplayed();
    }
}

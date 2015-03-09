package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static java.lang.String.format;

/**
 * Created by t.elizarova on 09.03.2015 (Moedelo.Ltd)).
 */
public class CommonPageObject extends PageObject {

    public CommonPageObject(WebDriver driver) {super(driver);}

    public String getBaseUrl() {
        String currentUrl = this.getDriver().getCurrentUrl();
        URL url = null;
        try {
            url = new URL(currentUrl);
        } catch (MalformedURLException e) {
        }
        return format("%s://%s", url.getProtocol(), url.getHost());
    }
}

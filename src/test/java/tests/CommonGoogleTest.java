package tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by t.elizarova on 09.03.2015 (Moedelo.Ltd)).
 */
@Ignore
@RunWith(ThucydidesRunner.class)
public class CommonGoogleTest {

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "https://www.google.ru")
    public Pages pages;
}

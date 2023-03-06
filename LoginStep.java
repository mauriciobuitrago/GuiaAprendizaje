package steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pageobjects.LoginPage;

public class LoginStep {
    LoginPage loginPage = new LoginPage();

    @Step
    public void openBrowser() {
        loginPage.open();
    }

    @Step
    public void clickSingIn() {
        loginPage.getDriver().findElement(loginPage.getBTN_SIGNIN()).click();

    }

    @Step
    public void enterCredentials() {
        loginPage.getDriver().findElement
                (loginPage.getTXT_USERNAME()).sendKeys("maob13@yopmail.com");
        loginPage.getDriver().findElement
                (loginPage.getTXT_PASSWORD()).sendKeys("1234");
    }

    @Step
    public void clickLogin() {
        loginPage.getDriver().findElement(loginPage.getBTN_LOGIN()).click();
    }

    @Step
    public void compareName() {
        Assert.assertThat(loginPage.getDriver()
                .findElement(loginPage.getLBL_COMPARE_NAME())
                .isDisplayed(), Matchers.is(true));
    }

}

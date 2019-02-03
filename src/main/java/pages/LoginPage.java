package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import locators.LoginPageLocators;
import utils.PropertiesReader;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static org.testng.Assert.assertEquals;

/**
 * Class Loan page.
 */
public class LoginPage extends LoginPageLocators {
    /**
     * Navigate to main page landing page.
     *
     * @return the landing page
     */
    public LoginPage navigateToMainPage() {
        Selenide.open(PropertiesReader.getProperty("URL"));
        return this;
    }


    /**
     * Method clickOnNavigateToEnterButton.
     *
     * @return the loan page
     */
    public LoginPage clickOnNavigateToEnterButton() {
        $(NAVIGATE_TO_ENTER_BUTTON).click();
        return this;
    }

    /**
     * Method clickOnNavigateToRegButton.
     *
     * @return the loan page
     */
    public LoginPage clickOnNavigateToRegButton() {
        $(REG_LINK).click();
        $(PAGE_TITLE).shouldBe(Condition.visible).should(Condition.text("Создать учетную запись"));
        return this;
    }

    /**
     * Method clickOnSubmitLoginFormButton.
     *
     * @return the loan page
     */
    public LoginPage clickOnSubmitLoginFormButton() {
        $(LOGIN_FORM_SUBMIT_BUTTON).click();
        return this;
    }

    /**
     * Method checkThatPageIsCompletelyLoaded.
     *
     * @return the loan page
     */
    public LoginPage checkThatPageIsCompletelyLoaded() {
        assertEquals("complete", executeJavaScript("return document.readyState"));
        return this;
    }

    /**
     * Method checkThatErrorMessageIsPresent.
     *
     * @return the loan page
     */
    public LoginPage checkThatErrorMessageIsPresent() {
        $(ERROR_MESSAGE_OF_LOGIN_FIELD).shouldBe(Condition.visible);
        return this;
    }

    /**
     * Method enterEmail.
     *
     * @param value the value
     * @return the loan page
     */
    public LoginPage enterEmail(final String value) {
        $(EMAIL_FIELD).sendKeys(value);
        return this;
    }

    /**
     * Method enterPassword.
     *
     * @param value the value
     * @return the loan page
     */
    public LoginPage enterPassword(final String value) {
        $(PASSWORD_FIELD).sendKeys(value);
        return this;
    }
}

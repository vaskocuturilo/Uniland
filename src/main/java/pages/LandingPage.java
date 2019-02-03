package pages;

import com.codeborne.selenide.Selenide;
import locators.LandingPageLocators;
import utils.PropertiesReader;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Class Landing page.
 */
public class LandingPage extends LandingPageLocators {
    /**
     * Navigate to main page landing page.
     *
     * @return the landing page
     */
    public LandingPage navigateToMainPage() {
        Selenide.open(PropertiesReader.getProperty("URL"));
        return this;
    }

    /**
     * Method openAmountDropDown.
     *
     * @return the landing page
     */
    public LandingPage openAmountDropDown() {
        $(SEARCH_INPUT).click();
        return this;
    }

    /**
     * Method openCategoryDropDown.
     *
     * @return the landing page
     */
    public LandingPage openCategoryDropDown() {
        $(CATEGORY_DROP_DOWN).click();
        return this;
    }

    /**
     * Method selectValue.
     *
     * @param value the value
     * @return the landing page
     */
    public LandingPage selectValue(final String value) {
        $(SEARCH_INPUT).setValue(value).pressEnter();
        return this;
    }

    /**
     * Method searchData.
     *
     * @param value the value
     * @return the landing page
     */
    public LandingPage searchData(final String value) {
        openAmountDropDown();
        selectValue(value);
        return this;
    }

    /**
     * Method selectCategory.
     *
     * @return the landing page
     */
    public LandingPage selectCategory() {
        openCategoryDropDown();
        $x(SELECT_CATEGORY).click();
        return this;
    }

    /**
     * Method clickOnNavigateToLogoButton.
     *
     * @return the loan page
     */
    public LoginPage clickOnNavigateToLogoButton() {
        $(LOGO_BUTTON).click();
        return new LoginPage();
    }
}

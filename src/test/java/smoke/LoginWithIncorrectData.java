package smoke;

import driver.BaseTest;
import org.testng.annotations.Test;
import pages.LandingPage;
import ru.yandex.qatools.allure.annotations.Title;

public class LoginWithIncorrectData extends BaseTest {
    @Title("Login with incorrect data")
    @Test
    public void loginThenLogOut() {
        new LandingPage()
                .navigateToMainPage()
                .searchData("1000")
                .selectCategory()
                .clickOnNavigateToLogoButton()
                .checkThatPageIsCompletelyLoaded()
                .clickOnNavigateToRegButton()
                .clickOnNavigateToEnterButton()
                .enterEmail("test@test.com")
                .enterPassword("blablabla")
                .clickOnSubmitLoginFormButton()
                .checkThatErrorMessageIsPresent();
    }
}

package locators;

/**
 * Class LandingPageLocators.
 */
public class LandingPageLocators {

    /**
     * The constant SEARCH_INPUT.
     */
    protected static final String SEARCH_INPUT = "input[id='search']";

    /**
     * The constant CATEGORY_DROP_DOWN.
     */
    protected static final String CATEGORY_DROP_DOWN = "select[onchange='if(this.value) setLocation(this.value)']";

    /**
     * The constant SELECT_CATEGORY.
     */
    protected static final String SELECT_CATEGORY = "//option[contains(.,'Только в наличии')]";

    /**
     * The constant LOGO_BUTTON.
     */
    protected static final String LOGO_BUTTON = "div.b-header__logo";
}

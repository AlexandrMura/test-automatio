package loginPage;

import basePage.BasePage;
import io.qameta.allure.Step;

public class LoginPage extends BasePage {

    private static final String LOGIN_PAGE_URL = "https://sisters.by/";


    public static void openLoginPage() {
        openPage(LOGIN_PAGE_URL);
    }
    @Step("click the enter button")
    public static void clickOpen() {
        clickButton(LoginPageLocators.OPEN_CLICK);
    }
    @Step("Entering e-mail")
    public static void insertUserName(String text){
        input(LoginPageLocators.USERNAME_INPUT, text );
    }
    @Step("Entering password")
    public static void insertUserPassword(String text) {
        input(LoginPageLocators.PASSWORD_INPUT, text);
    }
    @Step("click the enter button")
    public static void clickSignInButton() {
        clickButton(LoginPageLocators.SIGN_IN_BUTTON);
    }
    @Step("The user logged in to his personal account")
    public static boolean comparingTitleLoginPage(String text) {
        return comparingPageTitles(text);
    }

    @Step("Closing the browser")
    public static void browserClose() {
        closeBrowser();
    }
}


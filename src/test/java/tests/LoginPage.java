package tests;

import tests.basePage.BasePage;

import static tests.LoginPageLocators.*;

public class LoginPage extends BasePage {

    private static final String LOGIN_PAGE_URL = "https://sisters.by/";


    public static void openLoginPage() {
        openPage(LOGIN_PAGE_URL);
    }

    public static void clickOpen() {
        clickButton(OPEN_CLICK);
    }

    public static void insertUserName(String text){
        input(USERNAME_INPUT, text );
    }

    public static void insertUserPassword(String text) {
        input(PASSWORD_INPUT, text);
    }

    public static void clickSignInButton() {
        clickButton(SIGN_IN_BUTTON);
    }
}


package tests.loginTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.LoginPage;

public class LoginTest {
    @BeforeTest
    void initDriver() {
        LoginPage.openLoginPage();

    }

    @Test
    void AuthPage(){
        LoginPage.clickOpen();
        LoginPage.insertUserName("");
        LoginPage.insertUserPassword("");
        LoginPage.clickSignInButton();
    }



    }




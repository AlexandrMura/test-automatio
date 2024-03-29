import io.qameta.allure.Description;
import loginPage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeTest
    public void initDriver() {
        LoginPage.openLoginPage();
    }

    @Test(priority = 1)
    @Description("user authentication")
    public void AuthPage(){
        LoginPage.clickOpen();
        LoginPage.insertUserName("");
        LoginPage.insertUserPassword("");
        LoginPage.clickSignInButton();
        Assert.assertTrue(LoginPage.comparingTitleLoginPage("My account"));

    }
}













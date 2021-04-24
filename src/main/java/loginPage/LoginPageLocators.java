package loginPage;
import org.openqa.selenium.By;

public class LoginPageLocators {
    final static By OPEN_CLICK = By.xpath("/html/body/header/div/div/div[2]/div[1]/span/a");
    final static By USERNAME_INPUT =  By.xpath("//*[@id=\"login\"]");
    final static By PASSWORD_INPUT =  By.xpath("//*[@id=\"password\"]");
    final static By SIGN_IN_BUTTON =  By.xpath("//*[@id=\"enter\"]/div/form/input");

}


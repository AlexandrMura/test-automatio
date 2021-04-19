package tests.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.driver.Driver;

public class BasePage {

    private static WebDriver driver = Driver.getDriver();

    protected static void openPage(String pageURL) {
        driver.get(pageURL);
        //driver.get();
    }


    protected static WebElement initElement(By by){
        return driver.findElement(by);
    }

    //protected static String getTitle(){
        //return driver.getTitle();
    //}

    protected static void input(By element, String text){
        initElement(element).sendKeys(text);
    }
    protected static void clickButton(By element){
        initElement(element).click();
    }



}


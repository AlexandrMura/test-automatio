package tests.basketLocators;

import org.openqa.selenium.By;

public class BasketLocators {
    public final static By OPEN_CLICK_BASKET = By.xpath("/html/body/div[1]/div[2]/div/header/div[2]/div/div[2]/a[1]/span");
    public final static By GO_TO_CATALOG = By.xpath("/html/body/div[1]/div[2]/div/div/section/a");
    public final static By CHOOSE_A_PRODUCT = By.xpath("//*[@id=\"items-place\"]/div[1]/article/a[2]/span[3]");
    public final static By ADD_TO_CART = By.xpath("/html/body/div[1]/div[2]/div/div/article/div[2]/div/div[2]/a[1]");
    public final static By TO_CART = By.xpath("//*[@id=\"added\"]/div/div/a[3]");

}

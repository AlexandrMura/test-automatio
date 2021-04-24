package basketLocators;

import basePage.BasePage;
import io.qameta.allure.Step;

import static basketLocators.BasketLocators.*;


public class ProductAddition extends BasePage {
    private static final String BASKET_URL = "https://sisters.by/";

    public static void openBasket(){
        openPage(BASKET_URL);
    }
    @Step("click the cart button")
    public static void goToCart(){
        clickButton(BasketLocators.OPEN_CLICK_BASKET);
    }
    @Step("go to the catalog")
    public static void toCatalog() {
        clickButton(GO_TO_CATALOG);
    }
    @Step("choose a product")
    public static void chooseProduct(){
        clickButton(CHOOSE_A_PRODUCT);
    }
    @Step("click add to cart")
    public static void addCart(){
        clickButton(ADD_TO_CART);
    }
    @Step("in cart")
    public static void toBasket() {
        clickButton(TO_CART);
    }
}


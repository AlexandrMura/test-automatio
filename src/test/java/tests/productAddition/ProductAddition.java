package tests.productAddition;

import tests.basePage.BasePage;
import tests.basketLocators.BasketLocators;

import static tests.basketLocators.BasketLocators.*;


public class ProductAddition extends BasePage {
    private static final String BASKET_URL = "https://sisters.by/";

    public static void openBasket(){
        openPage(BASKET_URL);
    }

    public static void goToCart(){
        clickButton(BasketLocators.OPEN_CLICK_BASKET);
    }

    public static void toCatalog() {
        clickButton(GO_TO_CATALOG);
    }

    public static void chooseProduct(){
        clickButton(CHOOSE_A_PRODUCT);
    }

    public static void addCart(){
        clickButton(ADD_TO_CART);
    }

    public static void toBasket() {
        clickButton(TO_CART);
    }
}


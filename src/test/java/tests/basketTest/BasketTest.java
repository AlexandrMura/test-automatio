package tests.basketTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.productAddition.ProductAddition;

public class BasketTest {
    @BeforeTest
    void initDriver(){
        ProductAddition.openBasket();

    }
    @Test
    void BasketTest(){
        ProductAddition.goToCart();
        ProductAddition.toCatalog();
        ProductAddition.chooseProduct();
        ProductAddition.addCart();
        ProductAddition.toBasket();
    }
}

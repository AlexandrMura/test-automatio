import basketLocators.ProductAddition;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasketTest extends BaseTest {
    @BeforeTest
    void initDriver(){
        ProductAddition.openBasket();

    }
    @Test(priority = 1)
    @Description("add an item to cart")
    public void BasketTest(){
        ProductAddition.goToCart();
        ProductAddition.toCatalog();
        ProductAddition.chooseProduct();
        ProductAddition.addCart();
        ProductAddition.toBasket();
    }
}

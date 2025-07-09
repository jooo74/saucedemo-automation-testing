import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends ParentPage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public MyInfoPage checkoutButton()
    {
        WebElement checkoutElement = driver.findElement(By.name("checkout"));
        Cliking(checkoutElement);
        return new MyInfoPage(driver);
    }

}

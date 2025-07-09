import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ParentPage {
    protected WebDriver driver ;

    public ParentPage (WebDriver driver)
    {
        this.driver = driver;
    }

    public static void fillData(WebElement element , String data)
    {
        element.sendKeys(data);
    }

    public static void Cliking(WebElement element)
    {
        element.click();
    }


}

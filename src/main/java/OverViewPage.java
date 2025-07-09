import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverViewPage extends ParentPage {

    public OverViewPage(WebDriver driver) {
        super(driver);
    }

    public CompletePage finishField()
    {
        WebElement finishElement = driver.findElement(By.name("finish"));
        Cliking(finishElement);
        return new CompletePage(driver);
    }
}

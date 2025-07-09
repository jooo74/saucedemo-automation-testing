import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyInfoPage extends ParentPage {

    public MyInfoPage(WebDriver driver) {
        super(driver);
    }

    public void firstnameField(String firstname)
    {
        WebElement firstnameElement = driver.findElement(By.name("firstName"));
        fillData(firstnameElement,firstname);
    }
    public void lastnameField(String lastname)
    {
        WebElement lastnameElement = driver.findElement(By.name("lastName"));
        fillData(lastnameElement,lastname);
    }
    public void postalCodeField(String postalCode)
    {
        WebElement postalCodeElement = driver.findElement(By.name("postalCode"));
        fillData(postalCodeElement,postalCode);
    }
    public OverViewPage continueField()
    {
        WebElement continueElement = driver.findElement(By.name("continue"));
        Cliking(continueElement);
        return new OverViewPage(driver);
    }
}

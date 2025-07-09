import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletePage extends ParentPage{


    public CompletePage(WebDriver driver) {
        super(driver);
    }


    //Assertion Part
    public String ActualMessage()
    {
        String ActualMessage = driver.findElement(By.className("complete-header")).getText() ;
        return ActualMessage ;
    }
    public String ExpectedMessage()
    {
        String ExpectedMessage = "Thank you for your order!" ;
        return ExpectedMessage;
    }

}

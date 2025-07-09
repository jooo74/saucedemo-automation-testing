import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class PageBaseTest {

    WebDriver driver ;
    @BeforeMethod
    public void SetWebsite()
    {
        driver = new EdgeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void closeWebsite()
    {
        driver.close();
    }
}

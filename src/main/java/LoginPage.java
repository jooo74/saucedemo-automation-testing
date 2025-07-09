import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends ParentPage {

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    //Locators Part
    public void fillUsername(String Uname)
    {
        WebElement usernameElement = driver.findElement(By.name("user-name"));
        fillData(usernameElement,Uname);
    }

    public void fillPassword(String pass)
    {
        WebElement passwordElement = driver.findElement(By.name("password"));
        fillData(passwordElement,pass);
    }

    public ShopPage loginClick()
    {
        WebElement loginElement = driver.findElement(By.name("login-button"));
        Cliking(loginElement);
        return new ShopPage(driver);
    }

    //Assertion Part
    public String ActualLoggedIn()
    {
        String Actual =  driver.findElement(By.xpath("//span[@data-test='title']")).getText();
        return Actual ;
    }

    public String expectedLoggedIn()
    {
        String Expected = "Products";
        return Expected ;
    }

    public String ActualNotLogged()
    {
       String Actuall = driver.findElement(By.xpath("//h3[@data-test='error']")).getText() ;
       return Actuall ;
    }

    public String expectedNotLogged()
    {
        String Expectedd = "Epic sadface" ;
        return Expectedd ;
    }

    public void backTC(WebDriver driver)
    {
        driver.navigate().back();
    }

    public void forwardTC(WebDriver driver)
    {
        driver.navigate().forward();
    }








}

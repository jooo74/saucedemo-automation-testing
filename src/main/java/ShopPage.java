import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage extends ParentPage {

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    //Locators Part
    public void cart1()
    {
        WebElement cart1Element = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        Cliking(cart1Element);
    }
    public void cart2()
    {
        WebElement cart2Element = driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
        Cliking(cart2Element);
    }
    public void cart3()
    {
        WebElement cart3Element = driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt"));
        Cliking(cart3Element);
    }
    public void cart4()
    {
        WebElement cart4Element = driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket"));
        Cliking(cart4Element);
    }
    public void cart5()
    {
        WebElement cart5Element = driver.findElement(By.name("add-to-cart-sauce-labs-onesie"));
        Cliking(cart5Element);
    }
    public void cart6()
    {
        WebElement cart6Element = driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]"));
        Cliking(cart6Element);
    }
    public CartPage BucketIcon()
    {
       WebElement bucketiconElement = driver.findElement(By.className("shopping_cart_link"));
       Cliking(bucketiconElement);
       return new CartPage(driver);
    }



    //Assertions Part
    public String remove1()
    {
        String remove1 = driver.findElement(By.name("remove-sauce-labs-backpack")).getText();
        return remove1;
    }
    public String remove1Text()
    {
        String remove1Text = "Remove" ;
        return remove1Text;
    }

    public String remove2()
    {
        String remove2 = driver.findElement(By.name("remove-sauce-labs-bike-light")).getText();
        return remove2;
    }
    public String remove2Text()
    {
        String remove2Text = "Remove" ;
        return remove2Text;
    }

    public String remove3()
    {
        String remove3 = driver.findElement(By.name("remove-sauce-labs-bolt-t-shirt")).getText();
        return remove3;
    }
    public String remove3Text()
    {
        String remove3Text = "Remove" ;
        return remove3Text;
    }

    public String remove4()
    {
        String remove4 = driver.findElement(By.name("remove-sauce-labs-fleece-jacket")).getText();
        return remove4;
    }
    public String remove4Text()
    {
        String remove4Text = "Remove" ;
        return remove4Text;
    }

    public String remove5()
    {
        String remove5 = driver.findElement(By.name("remove-sauce-labs-onesie")).getText();
        return remove5;
    }
    public String remove5Text()
    {
        String remove5Text = "Remove" ;
        return remove5Text;
    }

    public String remove6()
    {
        String remove6 = driver.findElement(By.xpath("//button[@name='remove-test.allthethings()-t-shirt-(red)']")).getText();
        return remove6;
    }
    public String remove6Text()
    {
        String remove6Text = "Remove" ;
        return remove6Text;
    }


}




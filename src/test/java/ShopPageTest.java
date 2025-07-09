import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ShopPageTest extends PageBaseTest {

    LoginPage loginPage ;
    ShopPage shopPage ;
    SoftAssert softAssert = new SoftAssert();

    @DataProvider(name = "Data3")
    public static Object [][] Data3 ()
    {
        return new Object[][]
                {
                        {"standard_user","secret_sauce"}
                };
    }
    @Test(dataProvider = "Data3")
    public void addtoCartTest(String username ,String password) throws InterruptedException {
      loginPage = new LoginPage(driver);
      loginPage.fillUsername(username);
      loginPage.fillPassword(password);
        Thread.sleep(1000);
        shopPage = loginPage.loginClick();

        shopPage.cart1();
        Thread.sleep(1000);
        shopPage.cart2();
        Thread.sleep(1000);
        shopPage.cart3();
        Thread.sleep(1000);
        shopPage.cart4();
        Thread.sleep(1000);
        shopPage.cart5();
        Thread.sleep(1000);
        shopPage.cart6();
        Thread.sleep(1000);

      String Actual1 = shopPage.remove1();
      String Expected1 = shopPage.remove1Text();
      String Actual2 = shopPage.remove2();
      String Expected2 = shopPage.remove2Text();
      String Actual3 = shopPage.remove3();
      String Expected3 = shopPage.remove3Text();
      String Actual4 = shopPage.remove4();
      String Expected4 = shopPage.remove4Text();
      String Actual5 = shopPage.remove5();
      String Expected5 = shopPage.remove5Text();
      String Actual6 = shopPage.remove6();
      String Expected6 = shopPage.remove6Text();

      softAssert.assertEquals(Actual1,Expected1);
      softAssert.assertEquals(Actual2,Expected2);
      softAssert.assertEquals(Actual3,Expected3);
      softAssert.assertEquals(Actual4,Expected4);
      softAssert.assertEquals(Actual5,Expected5);
      softAssert.assertEquals(Actual6,Expected6);

      softAssert.assertAll();

    }


}

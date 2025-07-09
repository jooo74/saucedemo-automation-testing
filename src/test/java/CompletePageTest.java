import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CompletePageTest extends PageBaseTest {
    LoginPage loginPage;
    ShopPage shopPage;
    CartPage cartPage ;
    MyInfoPage myInfoPage ;
    OverViewPage overViewPage ;
    CompletePage completePage ;
    SoftAssert softAssert = new SoftAssert();


    @DataProvider(name = "Data4")
    public static Object [][] Data4 ()
    {
        return new Object[][]
                {
                        {"standard_user","secret_sauce"}
                };
    }
    @Test(dataProvider = "Data4" ,priority = 1)
    public void CompleteShoppingWithProductTest(String username ,String password) throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.fillUsername(username);
        loginPage.fillPassword(password);
        Thread.sleep(1000);

        shopPage = loginPage.loginClick();
        shopPage.cart1();
        shopPage.cart2();
        shopPage.cart3();
        shopPage.cart4();
        shopPage.cart5();
        shopPage.cart6();
        Thread.sleep(1000);

        cartPage = shopPage.BucketIcon();
        Thread.sleep(1000);

        myInfoPage = cartPage.checkoutButton();
        myInfoPage.firstnameField("Ahmed");
        myInfoPage.lastnameField("Medhat");
        myInfoPage.postalCodeField("11617");
        Thread.sleep(1000);

        overViewPage = myInfoPage.continueField();
        Thread.sleep(1000);

        completePage = overViewPage.finishField();
        Thread.sleep(1000);

        String ActualWithData = completePage.ActualMessage();
        String ExpectedWithData = completePage.ExpectedMessage();
        Thread.sleep(1000);

        softAssert.assertEquals(ActualWithData,ExpectedWithData);
        softAssert.assertAll();
    }

    @Test(dataProvider = "Data4" ,priority = 2)
    public void CompleteShoppingWithoutProductTest(String username ,String password) throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.fillUsername(username);
        loginPage.fillPassword(password);
        Thread.sleep(1000);

        shopPage = loginPage.loginClick();
        Thread.sleep(1000);

        cartPage = shopPage.BucketIcon();
        Thread.sleep(1000);

        myInfoPage = cartPage.checkoutButton();
        myInfoPage.firstnameField("Ahmed");
        myInfoPage.lastnameField("Medhat");
        myInfoPage.postalCodeField("11617");
        Thread.sleep(1000);

        overViewPage = myInfoPage.continueField();
        Thread.sleep(1000);

        completePage = overViewPage.finishField();
        Thread.sleep(1000);

        String ActualWithoutData = completePage.ActualMessage();
        String ExpectedWithoutData = completePage.ExpectedMessage();
        Thread.sleep(1000);

        softAssert.assertNotEquals(ActualWithoutData,ExpectedWithoutData);
        softAssert.assertAll();
    }
}

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.Time;

public class LoginPageTest extends PageBaseTest {

    LoginPage loginPage;
    SoftAssert softAssert = new SoftAssert();


    @DataProvider(name = "Data1")
    public static Object [][] Data1 ()
    {
        return new Object[][]
                {
                        {"standard_user","secret_sauce", true},
                        {"tandard_user","secret_sauc",false},
                        {"standard_user","secret_sauc",false},
                        {"tandard_user","secret_sauce",false},
                        {"","secret_sauce",false},
                        {"standard_user","",false}
                };
    }

    @Test(dataProvider = "Data1", priority = 1)
    public void loginTest(String userName ,String Password ,boolean check) throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.fillUsername(userName);
        loginPage.fillPassword(Password);
        loginPage.loginClick();
        Thread.sleep(3000);
        if (check == true)
        {
            String ActualLogged = loginPage.ActualLoggedIn();
            String ExpectedLogged = loginPage.expectedLoggedIn();
            softAssert.assertEquals(ActualLogged,ExpectedLogged);
        }
        else {
            String ActualNotLogged = loginPage.ActualNotLogged();
            String ExpectedNotLogged = loginPage.expectedNotLogged();
            softAssert.assertTrue(ActualNotLogged.contains(ExpectedNotLogged));
        }
        softAssert.assertAll();
    }

    @DataProvider(name = "Data2")
    public static Object [][] Data2 ()
    {
        return new Object[][]
                {
                        {"standard_user","secret_sauce"}
                };
    }
    @Test(dataProvider = "Data2" ,priority = 2)
    public void BackthenForwardAfterLoggedinTest(String username ,String password) throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.fillUsername(username);
        loginPage.fillPassword(password);
        loginPage.loginClick();
        Thread.sleep(3000);

        loginPage.backTC(driver);
        Thread.sleep(3000);

        loginPage.forwardTC(driver);
        Thread.sleep(3000);

        String ActualLogged = loginPage.ActualLoggedIn();
        String ExpectedLogged = loginPage.expectedLoggedIn();
        softAssert.assertNotEquals(ActualLogged,ExpectedLogged);
        softAssert.assertAll();

    }
}

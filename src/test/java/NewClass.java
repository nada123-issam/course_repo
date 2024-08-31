import AppAuth.Login;
import AppAuth.Logout;
import ClientManagment.AddClient;
import ClientManagment.ClientAction;
import ClientManagment.SearchClient;
import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.*;

import static AppAuth.Login.driver;

public class NewClass {

    @BeforeMethod
    public static void login() {
        Login.loginApp();
    }

    @Test (priority = 1 , dataProvider = "test_data")
    public static void TestValidData1 ( String clientName , String updateClient )
    {
//        String clientName = "Mona" ;
//        String updateName = "Mona Ahmed" ;
        AddClient.addClient(clientName);
        SearchClient.searchClient(clientName);
        ClientAction.editClient(updateClient);
    }

//    @Test (priority = 2)
//    public static void TestValidData2 () {
//        String clientName = "Hoor" ;
//        AddClient.addClient(clientName);
//    }
//    @Test (priority = 3)
//    public static void EnterBlankData() {
//
//        AddClient.addClient("");
//        WebElement errormsg = driver.findElement(By.cssSelector("div[class=\"error-message\"]"));
//        Assert.assertTrue(errormsg.isDisplayed());
//        driver.findElement(By.xpath("//*[@id=\"breadcrumb\"]/li[1]/a")).click();
//    }

//    @AfterMethod
//    public static void logOut () {
//        Logout.logoutApp();
//    }

    @DataProvider
    public String [][] test_data() {
        return new String[][]
                {
                        {"Hassan" , "Hassan Mohammed"}
                };
    }
}

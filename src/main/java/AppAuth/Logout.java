package AppAuth;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
    private static WebDriver driver = WebDriverFactory.getDriver();
    public static void logoutApp() {
        driver.findElement(By.xpath("(//a[@href ='/settings'])[2]")).click();
        driver.findElement(By.xpath("//a[@href ='/owner/owners/logout']")).click();
    }


}

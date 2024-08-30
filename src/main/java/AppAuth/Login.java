package AppAuth;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static WebDriver driver = WebDriverFactory.getDriver();

    public static void loginApp() {


        driver.get("https://nifahac390.daftra.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("Email")).sendKeys("nifahac390@ndiety.com");
        driver.findElement(By.id("Password")).sendKeys("Asd@zxc1");
        driver.findElement(By.xpath("/html/body/div[1]/div/form/button")).click();
    }


}

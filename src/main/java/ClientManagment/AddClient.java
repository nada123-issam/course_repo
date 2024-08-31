package ClientManagment;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.HttpClientName;

public class AddClient
{
    private static WebDriver driver = WebDriverFactory.getDriver();

    static By AddClientElement = By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/ol/div[2]/div[2]/div[4]/div/div[4]/a");
    public static void addClient(String ClientName) {


        driver.findElement(AddClientElement).click();
        driver.findElement(By.id("ClientBusinessName")).sendKeys(ClientName);
        driver.findElement(By.id("submitBtn")).click();


    }
}

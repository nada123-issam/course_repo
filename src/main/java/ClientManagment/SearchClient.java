package ClientManagment;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchClient {
    private static WebDriver driver = WebDriverFactory.getDriver();
    public static void searchClient ( String clientName) {

        driver.findElement(By.xpath("//*[@id=\"breadcrumb\"]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"treasuries-filters\"]/div/div/div[2]/div/div/input")).sendKeys(clientName);
        driver.findElement(By.xpath("//*[@id=\"treasuries-filters\"]/div/div/div[12]/button")).click();


    }
}

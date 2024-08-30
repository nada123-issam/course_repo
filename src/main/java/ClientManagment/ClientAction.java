package ClientManagment;

import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientAction {
    private static WebDriver driver = WebDriverFactory.getDriver();
    public static void editClient (String UpdateName) {
        driver.findElement(By.xpath("//*[@id=\"lising-table\"]/tbody/tr[1]/td[4]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"lising-table\"]/tbody/tr[1]/td[4]/div/div/a[2]")).click();
        WebElement clientname = driver.findElement(By.id("ClientBusinessName"));
        clientname.clear();
        clientname.sendKeys(UpdateName);
        driver.findElement(By.id("submitBtn")).click();

        // search by new name after edit
        driver.findElement(By.xpath("//*[@id=\"breadcrumb\"]/li[1]/a")).click();
        WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"treasuries-filters\"]/div/div/div[2]/div/div/input"));
        searchbox.clear();
        searchbox.sendKeys("Gamila Ahmed");
        driver.findElement(By.xpath("//*[@id=\"treasuries-filters\"]/div/div/div[12]/button")).click();
    }
    public static void viewClient () {

    }
    public static void deleteClient () {

    }
}

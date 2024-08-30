package Utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    private static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null) {

            // Initialize ChromeDriver
            driver = new ChromeDriver();
        }
        return driver;
    }
}

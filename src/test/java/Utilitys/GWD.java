package Utilitys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GWD {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));

        }
        return driver;
    }

    public static void quitDriver() {

        try {
            Thread.sleep(3000L);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (driver != null) {
            driver.quit();
            driver = null;


        }

    }
}

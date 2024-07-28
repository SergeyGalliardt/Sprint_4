import Constants.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Constants.AboutArenda.*;
import static Constants.CustomerInformation.*;

public class MakeOrder {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        String browserName = System.getenv("BROWSER_NAME");
        driver = getWebDriver(Browser.valueOf(browserName));
    }

    @After
    public void teardown() {
        driver.quit();
    }

    WebDriver getWebDriver(Browser browser) {
        switch (browser) {
            case CHROME:
                return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();
            default:
                throw new RuntimeException("unable create a web driver");
        }
    }

    @Test
    public void openPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(HomePage.ButtonOrder).click();
        driver.findElement(HomePage.ButtonCookie).click();
        driver.findElement(FieldName).sendKeys("Сергей");
        driver.findElement(FieldSername).sendKeys("Галлиардт");
        driver.findElement(FieldAdress).sendKeys("улица Гагарина 19");
        driver.findElement(FieldMetro).click();
        driver.findElement(FieldMetroStation).click();
        driver.findElement(FieldPhoneNumber).sendKeys("89999999999");
        driver.findElement(ButtonNext).click();
        driver.findElement(FieldStartingDay).click();
        driver.findElement(DayInCalendar).click();
        driver.findElement(FieldArendaDuration).click();
        driver.findElement(ArendaDays).click();
        driver.findElement(Color).click();
        driver.findElement(ButtonFinalOrder).click();
        driver.findElement(ButtonYes).click();

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(driver.findElement(windowOrderPlaced)));
    }

    @Test
    public void AnotherButtonOpenPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(HomePage.ButtonCookie).click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,1600)");
        driver.findElement(HomePage.ButtonAnotherOrder).click();
        driver.findElement(FieldName).sendKeys("Володя");
        driver.findElement(FieldSername).sendKeys("Володиев");
        driver.findElement(FieldAdress).sendKeys("улица Володи 1");
        driver.findElement(FieldMetro).click();
        driver.findElement(AnotherFieldMetroStation).click();
        driver.findElement(FieldPhoneNumber).sendKeys("88888888888");
        driver.findElement(ButtonNext).click();
        driver.findElement(FieldStartingDay).click();
        driver.findElement(AnotherDayInCalendar).click();
        driver.findElement(FieldArendaDuration).click();
        driver.findElement(AnotherArendaDays).click();
        driver.findElement(AnotherColor).click();
        driver.findElement(ButtonFinalOrder).click();
        driver.findElement(ButtonYes).click();

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(driver.findElement(windowOrderPlaced)));
    }

    enum Browser {
        CHROME, FIREFOX;
    }
}

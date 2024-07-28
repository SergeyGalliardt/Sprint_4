package Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    //Заголовок страницы
    public final By homeHeader = By.className("Home_Header__iJKdX");
    //Кнопка куки
    public static final By ButtonCookie = By.className("App_CookieButton__3cvqF");
    //Кнопка заказать вверху страницы
    public static final By ButtonOrder = By.className("Button_Button__ra12g");
    //Кнопка заказать внизу страницы
    public static final By ButtonAnotherOrder = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage waitLoadHomePage() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver -> (driver.findElement(homeHeader).getText() != null
                && !driver.findElement(homeHeader).getText().isEmpty()
        ));
        return this;
    }

    public void scrollToQuestions() {
        ((JavascriptExecutor) driver).executeScript("scroll(0,2600)");
    }

    public void ClickCoockie() {
        driver.findElement(ButtonCookie).click();
    }
    public HomePage clickQuestion(By question) {
        
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(question))
                .click();
        return this;
    }

    public void waitLoadQuestion(By accordionLabel) {
              new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver -> (driver.findElement(accordionLabel).getText() != null
                && !driver.findElement(accordionLabel).getText().isEmpty()));
    }

}

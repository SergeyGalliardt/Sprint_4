package Constants;

import org.openqa.selenium.By;

public class AboutArenda {
    public static final By FieldStartingDay = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    public static final By DayInCalendar = By.cssSelector("div.react-datepicker__day.react-datepicker__day--031");
    public static final By AnotherDayInCalendar = By.cssSelector("div.react-datepicker__day.react-datepicker__day--030");
    public static final By FieldArendaDuration = By.cssSelector("div.Dropdown-placeholder");
    public static final By ArendaDays = By.xpath(".//div[text() = 'двое суток']");
    public static final By AnotherArendaDays = By.xpath(".//div[text() = 'сутки']");
    public static final By Color = By.id("black");
    public static final By AnotherColor = By.id("grey");
    public static final By ButtonFinalOrder = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать']");
    public static final By ButtonYes = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Да']");
    public static final By windowOrderPlaced = By.xpath(".//div[text()='Заказ оформлен']");
}

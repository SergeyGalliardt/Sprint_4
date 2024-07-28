package Constants;

import org.openqa.selenium.By;

public class CustomerInformation {
    //Поле Имя
    public static final By FieldName = By.xpath(".//input[@placeholder='* Имя']");
    //Поле Фамилия
    public static final By FieldSername = By.xpath(".//input[@placeholder='* Фамилия']");
    //Поле Адрес
    public static final By FieldAdress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //Поле Станция метро
    public static final By FieldMetro = By.xpath(".//input[@placeholder='* Станция метро']");
    //Станиця метро из выпадающего списка
    public static final By FieldMetroStation = By.xpath(".//button[@tabindex='-1' and @value='51']");
    //Станиця метро из выпадающего списка
    public static final By AnotherFieldMetroStation = By.xpath(".//button[@tabindex='-1' and @value='55']");
    //Поле телефон
    public static final By FieldPhoneNumber = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Кнопка далее
    public static final By ButtonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
}

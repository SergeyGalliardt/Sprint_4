package Constants;


import org.openqa.selenium.By;


public class HomepageConstants {
    //Вопрос: Сколько это стоит? И как оплатить?
    public static final By QUESTION1 = By.id("accordion__heading-0");
    //Вопрос: Хочу сразу несколько самокатов! Так можно?
    public static final By QUESTION2 = By.id("accordion__heading-1");
    //Вопрос: Как рассчитывается время аренды?
    public static final By QUESTION3 = By.id("accordion__heading-2");
    //Вопрос: Можно ли заказать самокат прямо на сегодня?
    public static final By QUESTION4 = By.id("accordion__heading-3");
    //Вопрос: Можно ли продлить заказ или вернуть самокат раньше?
    public static final By QUESTION5 = By.id("accordion__heading-4");
    //Вопрос: Вы привозите зарядку вместе с самокатом?
    public static final By QUESTION6 = By.id("accordion__heading-5");
    //Вопрос: Можно ли отменить заказ?
    public static final By QUESTION7 = By.id("accordion__heading-6");
    //Вопрос: Я жизу за МКАДом, привезёте?
    public static final By QUESTION8 = By.id("accordion__heading-7");

    //Ответ: Сутки — 400 рублей. Оплата курьеру — наличными или картой.
    public static final By ANSWER1 = By.xpath(".//div[@aria-labelledby='accordion__heading-0']");
    //Ответ: Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.
    public static final By ANSWER2 = By.xpath(".//div[@aria-labelledby='accordion__heading-1']");
    //Ответ: Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.
    public static final By ANSWER3 = By.xpath(".//div[@aria-labelledby='accordion__heading-2']");
    //Ответ: Только начиная с завтрашнего дня. Но скоро станем расторопнее.
    public static final By ANSWER4 = By.xpath(".//div[@aria-labelledby='accordion__heading-3']");
    //Ответ: Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.
    public static final By ANSWER5 = By.xpath(".//div[@aria-labelledby='accordion__heading-4']");
    //Ответ: Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.
    public static final By ANSWER6 = By.xpath(".//div[@aria-labelledby='accordion__heading-5']");
    //Ответ: Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.
    public static final By ANSWER7 = By.xpath(".//div[@aria-labelledby='accordion__heading-6']");
    //Ответ: Сутки — Да, обязательно. Всем самокатов! И Москве, и Московской области.
    public static final By ANSWER8 = By.xpath(".//div[@aria-labelledby='accordion__heading-7']");

    public static final String TEXT_ANSWER_0 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String TEXT_ANSWER_1 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String TEXT_ANSWER_2 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String TEXT_ANSWER_3 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String TEXT_ANSWER_4 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String TEXT_ANSWER_5 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String TEXT_ANSWER_6 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String TEXT_ANSWER_7 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    public static final By ITEM_ANSWER_0 = By.xpath(".//*[@data-accordion-component='AccordionItemPanel' and @aria-labelledby='accordion__heading-0']");
    public static final By ITEM_ANSWER_1 = By.xpath(".//*[@data-accordion-component='AccordionItemPanel' and @aria-labelledby='accordion__heading-1']");
    public static final By ITEM_ANSWER_2 = By.xpath(".//*[@data-accordion-component='AccordionItemPanel' and @aria-labelledby='accordion__heading-2']");
    public static final By ITEM_ANSWER_3 = By.xpath(".//*[@data-accordion-component='AccordionItemPanel' and @aria-labelledby='accordion__heading-3']");
    public static final By ITEM_ANSWER_4 = By.xpath(".//*[@data-accordion-component='AccordionItemPanel' and @aria-labelledby='accordion__heading-4']");
    public static final By ITEM_ANSWER_5 = By.xpath(".//*[@data-accordion-component='AccordionItemPanel' and @aria-labelledby='accordion__heading-5']");
    public static final By ITEM_ANSWER_6 = By.xpath(".//*[@data-accordion-component='AccordionItemPanel' and @aria-labelledby='accordion__heading-6']");
    public static final By ITEM_ANSWER_7 = By.xpath(".//*[@data-accordion-component='AccordionItemPanel' and @aria-labelledby='accordion__heading-7']");



}


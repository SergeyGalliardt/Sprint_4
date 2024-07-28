import Constants.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Constants.HomepageConstants.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckAnswerAndQuestion {
    private WebDriver driver;
    private final By question;
    private final By answer;
    private final By labelResult;
    private final String expected;

    public CheckAnswerAndQuestion(By question, By answer, By labelResult, String expected) {
        this.question = question;
        this.answer = answer;
        this.labelResult = labelResult;
        this.expected = expected;
    }
        @Parameterized.Parameters
        public static Object[][] getParameters() {
            return new Object[][]{
                    {QUESTION1, ANSWER1, ITEM_ANSWER_0, TEXT_ANSWER_0},
                    {QUESTION2, ANSWER2, ITEM_ANSWER_1, TEXT_ANSWER_1},
                    {QUESTION3, ANSWER3, ITEM_ANSWER_2, TEXT_ANSWER_2},
                    {QUESTION4, ANSWER4, ITEM_ANSWER_3, TEXT_ANSWER_3},
                    {QUESTION5, ANSWER5, ITEM_ANSWER_4, TEXT_ANSWER_4},
                    {QUESTION6, ANSWER6, ITEM_ANSWER_5, TEXT_ANSWER_5},
                    {QUESTION7, ANSWER7, ITEM_ANSWER_6, TEXT_ANSWER_6},
                    {QUESTION8, ANSWER8, ITEM_ANSWER_7, TEXT_ANSWER_7},
            };
        }

    @Before
        public void setUp() throws Exception {
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
        }

    @After
    public void teardown() {
        driver.quit();
    }


    @Test
    public void CheckAnswerAndQuestion() {
        HomePage objHomePage = new HomePage(driver);
        objHomePage.waitLoadHomePage();
        objHomePage.scrollToQuestions();
        objHomePage.ClickCoockie();
        objHomePage.clickQuestion(question);
        objHomePage.waitLoadQuestion(labelResult);
        String result = driver.findElement(answer).getText();

        assertEquals(expected, result);

    }
}

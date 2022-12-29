package ru.buttonone.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import ru.buttonone.utils.Props;

public class YandexPage extends BasePage {
    private final WebElement searchField;

    public YandexPage(WebDriver driver) {
        super(driver);
        driver.navigate().to(Props.getProperty("url"));
        searchField = driver.findElement(By.xpath("//input[contains(@class, 'input')]"));
    }

    public SearchingResultPage searchByPhraseOnPageAndClickEnter(String phrase) {
        Actions actions = new Actions(driver);
        actions.moveToElement(searchField).click().build().perform();
        searchField.sendKeys(phrase);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", searchField);

        searchField.sendKeys(Keys.RETURN);
        return new SearchingResultPage(driver);
    }
}

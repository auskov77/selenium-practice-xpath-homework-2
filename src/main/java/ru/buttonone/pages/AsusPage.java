package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Getter
public class AsusPage extends BasePage {
    @FindBy(xpath = "//*[@id='skipContentFocus']/div[5]/h2")
    private WebElement eventsAndPromotions;

    public AsusPage(WebDriver driver) {
        super(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By xpathEventsAndPromotions = By.xpath("//*[@id='skipContentFocus']/div[5]/h2");
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpathEventsAndPromotions));
    }
}

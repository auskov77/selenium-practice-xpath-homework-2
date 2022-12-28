package ru.buttonone.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SearchingResultPage extends BasePage {
    @FindBy(xpath = "//a[@href='https://www.drive2.ru/']")
    private WebElement mySearchElementOnPageDrive2Ru;

    @FindBy(xpath = "//b[text()='asus.com']")
    private WebElement mySearchElementOnPageAsus;

    public SearchingResultPage(WebDriver driver) {
        super(driver);
    }
}

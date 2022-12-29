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
public class Drive2Page extends BasePage {
    @FindBy(xpath = "//button[@class='x-box-more']")
    private WebElement allBrandsOfCars;

    @FindBy(xpath = "//h1[@class='x-header']")
    private WebElement searchByBrand;

    public Drive2Page(WebDriver driver) {
        super(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By xpathAllBrandsOfCars = By.xpath("//button[@class='x-box-more']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpathAllBrandsOfCars));
        By xpathSearchByBrand = By.xpath("//h1[@class='x-header']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpathSearchByBrand));
    }
}

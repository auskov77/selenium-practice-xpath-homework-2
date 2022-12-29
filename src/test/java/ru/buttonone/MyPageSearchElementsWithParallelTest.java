package ru.buttonone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import ru.buttonone.pages.*;

import java.util.ArrayList;

@DisplayName("Проверка поиска и открытия через ya.ru")
public class MyPageSearchElementsWithParallelTest extends BaseTest {

    @DisplayName(" элемента на странице Drive2Ru - \"Все марки машин\"")
    @Test
    public void shouldHaveCorrectToOpenDrive2RuAllBrandsOfCars() {
        System.out.println("1. Зайти на страницу ya.ru");
        YandexPage yandexPage = new YandexPage(driver);

        System.out.println("2. В поиске найти drive2");
        SearchingResultPage searchingResultPage = yandexPage.searchByPhraseOnPageAndClickEnter("drive2");

        System.out.println("3. Кликнуть по ссылке официального сайта drive2");
        searchingResultPage.getMySearchElementOnPageDrive2Ru().click();

        System.out.println("4. Проверить, что есть кнопка с названием \"Все марки машин\"");
        ArrayList<String> mySearchingPage = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(mySearchingPage.get(1));
        Drive2Page drive2Page = new Drive2Page(driver);
        WebElement allBrandsOfCars = drive2Page.getAllBrandsOfCars();

        Assertions.assertEquals("Все марки машин", allBrandsOfCars.getText());
    }

    @DisplayName(" элемента на странице Drive2Ru")
    @Test
    public void shouldHaveCorrectToOpenDrive2RuSearchByBrand() {
        System.out.println("1. Зайти на страницу ya.ru");
        YandexPage yandexPage = new YandexPage(driver);

        System.out.println("2. В поиске найти drive2");
        SearchingResultPage searchingResultPage = yandexPage.searchByPhraseOnPageAndClickEnter("drive2");

        System.out.println("3. Кликнуть по ссылке официального сайта drive2");
        searchingResultPage.getMySearchElementOnPageDrive2Ru().click();

        System.out.println("4. Проверить, что есть блок с названием \"Искать по марке\"");
        ArrayList<String> mySearchingPage = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(mySearchingPage.get(1));
        Drive2Page drive2Page = new Drive2Page(driver);
        WebElement searchByBrand = drive2Page.getSearchByBrand();

        Assertions.assertEquals("Искать по марке", searchByBrand.getText());
    }

    @DisplayName(" элемента на странице Asus.com")
    @Test
    public void shouldHaveCorrectToOpenAsusCom() {
        System.out.println("1. Зайти на страницу ya.ru");
        YandexPage yandexPage = new YandexPage(driver);

        System.out.println("2. В поиске найти asus.com");
        SearchingResultPage searchingResultAsusPage = yandexPage.searchByPhraseOnPageAndClickEnter("asus.com");

        System.out.println("3. Кликнуть по ссылке официального сайта asus.com");
        searchingResultAsusPage.getMySearchElementOnPageAsus().click();

        System.out.println("4. Проверить, что есть блок с названием \"События и акции\"");
        ArrayList<String> mySearchingPage = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(mySearchingPage.get(1));
        AsusPage asusPage = new AsusPage(driver);
        WebElement eventsAndPromotions = asusPage.getEventsAndPromotions();

        Assertions.assertEquals("События и акции", eventsAndPromotions.getText());
    }
}

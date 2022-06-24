import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ElementsOfSiteHeader extends BasePage{

    ElementsOfSiteHeader(WebDriver driver) {
        super(driver);
    }

    String site = "https://ba.org.ua/";

    public WebElement getPartyBtn() {
        return driver.findElement(By.xpath("//li[@class = 'submenu']/a[@href='#' and @ title='Партія']"));
    }

    public WebElement getGovernmantOfParty() {
        return driver.findElement(By.xpath("//span[contains(text(),'Керівні органи')]"));
    }

    public WebElement getHeadOfParty() {
        return driver.findElement(By.xpath("//a[@title='Голова партії' and contains(text(),'Голова партії')]"));
    }

    public WebElement getfirstViceHeadOfParty() {
        return driver.findElement(By.xpath("//a[ contains(text(),'Перший заступник Голови партії')]"));
    }

    public WebElement getViceHeadsOfParty() {
        return driver.findElement(By.xpath("//a[contains(text(),'Заступники Голови партії')]"));
    }

    public WebElement getpresidiumPoliticalCouncilParty() {
        return driver.findElement(By.xpath("//a[contains(text(),'Президія Політичної ради партії')]"));
    }

    public WebElement getPoliticalCouncilParty() {
        return driver.findElement(By.xpath("//a[contains(text(),'Політична рада партії')]"));
    }

    public WebElement getCentralControlRevisionCommissionParty() {
        return driver.findElement(By.xpath("//a[@title='Центральна КРК партії']"));
    }

    public WebElement getStruktureOfParty() {
        return driver.findElement(By.xpath("//a[contains(text(),'Структура')]"));
    }

    public WebElement getRigionalPartsOfParty() {
        return driver.findElement(By.xpath("//a[contains(text(),'Регіональні осередки')]"));
    }

    public WebElement getStatenmentOfParty() {
        return driver.findElement(By.xpath("//a[contains(text(),'Статут партії')]"));
    }

    public WebElement getElectionProgramOfParty() {
        return driver.findElement(By.xpath("//a[contains(text(),'Передвиборна програма')]"));
    }


//    public WebElement getAboutUsDropDown() {
//        return driver.findElement(By.xpath("//span[@class='ch_menu_id101_link a']"));
//    }
//
//    public WebElement getAboutUsBrendsCatalog() {
//        return driver.findElement(By.xpath("//a[@class='ch_menu_id211_link']"));
//    }
//
//    public WebElement getAboutUsIbisShops() {
//        return driver.findElement(By.xpath("//a[@class='ch_menu_id131_link']"));
//    }
//
//    public WebElement getWorldOfHobbiesMagazine() {
//        return driver.findElement(By.xpath("//a[@class='ch_menu_id151_link']"));
//    }
//
//    public WebElement getKitchenHouse() {
//        return driver.findElement(By.xpath("//a[@class='ch_menu_id161_link']"));
//    }
//
//    public WebElement getForClientDropDown() {
//        return driver.findElement(By.xpath("//span[@class='ch_menu_id461_link a']"));
//    }
//
//    public WebElement getDiscountOffer() {
//        return driver.findElement(By.xpath("//a[@class='ch_menu_id171_link']"));
//    }
//
//    public WebElement getGiftCertificate() {
//        return driver.findElement(By.xpath("//a[@class='ch_menu_id644_link']"));
//    }
//
//    public WebElement getWarranty() {
//        return driver.findElement(By.xpath("//a[@class='ch_menu_id521_link']"));
//    }
//
//    public WebElement getTermsOfPurchase() {
//        return driver.findElement(By.xpath("//a[@class='ch_menu_id647_link']"));
//    }
//
//    public WebElement getDeliveryAndPayment() {
//        return driver.findElement(By.xpath("//a[@class='ch_menu_id491_link']"));
//    }
//
//    public WebElement getAction() {
//        return driver.findElement(By.xpath("//a[@class='ch_menu_id381_link']"));
//    }
}
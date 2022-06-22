import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ElementsOfSiteHeader extends BasePage{

    ElementsOfSiteHeader(WebDriver driver) {
        super(driver);
    }

    String site = "https://ibis.net.ua/ua/";

    public WebElement getAboutUsDropDown() {
        return driver.findElement(By.xpath("//span[@class='ch_menu_id101_link a']"));
    }

    public WebElement getAboutUsBrendsCatalog() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id211_link']"));
    }

    public WebElement getAboutUsIbisShops() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id131_link']"));
    }

    public WebElement getWorldOfHobbiesMagazine() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id151_link']"));
    }

    public WebElement getKitchenHouse() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id161_link']"));
    }

    public WebElement getForClientDropDown() {
        return driver.findElement(By.xpath("//span[@class='ch_menu_id461_link a']"));
    }

    public WebElement getDiscountOffer() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id171_link']"));
    }

    public WebElement getGiftCertificate() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id644_link']"));
    }

    public WebElement getWarranty() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id521_link']"));
    }

    public WebElement getTermsOfPurchase() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id647_link']"));
    }

    public WebElement getDeliveryAndPayment() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id491_link']"));
    }

    public WebElement getAction() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id381_link']"));
    }
}
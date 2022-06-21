import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HeaderOfSiteElements extends BasePage{

    HeaderOfSiteElements(WebDriver driver) {
        super(driver);
    }

    String site = "https://ibis.shop/ua/";

    public WebElement getAboutUsDropDown() {
        return driver.findElement(By.xpath("//li[@class='ch_menu_id101  ch_menu_haschilds']"));
    }

    public WebElement getAboutUsDropDownIBISCompany() {
        return driver.findElement(By.xpath("//a[contains(text(),'Компанія Ібіс')]"));
    }

    public WebElement getAboutUsDropDownBrendsCatalog() {
        return driver.findElement(By.xpath("//a[@class = 'ch_menu_id211_link' and contains(text(),'Каталог брендів')]"));
    }

    public WebElement getAboutUsIbisShops() {
        return driver.findElement(By.xpath("//a[contains(text(),'Мережа магазинів «ІБІС»')]"));
    }

    public WebElement getCustomerServiceDropDown() {
        return driver.findElement(By.xpath("//span[@class='ch_menu_id461_link a']"));
    }

    public WebElement getGiftCertificate() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id644_link' and contains(text(),'Подарункові сертифікати')]"));
    }

    public WebElement getFAQ() {
        return driver.findElement(By.xpath("//a[contains(text(),'Питання та відповіді')]"));
    }
}
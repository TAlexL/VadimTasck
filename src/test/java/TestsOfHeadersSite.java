import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsOfHeadersSite extends TestInit{

    @Test
    public void aboutUsBrendsCatalogTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getAboutUsDropDown().click();
        elementsOfSiteHeader.getAboutUsBrendsCatalog().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/categories_brands/"));
    }
    @Test
    public void aboutUsIbisShopsTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getAboutUsDropDown().click();
        elementsOfSiteHeader.getAboutUsIbisShops().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/shops/"));
    }

    @Test
    public void aboutUsWorldOfHobbiesMagazineTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getAboutUsDropDown().click();
        elementsOfSiteHeader.getWorldOfHobbiesMagazine().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://gunmag.com.ua/"));
    }

    @Test
    public void aboutUsKitchenHouseTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getAboutUsDropDown().click();
        elementsOfSiteHeader.getKitchenHouse().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://kuldom.ua/"));
    }

    @Test
    public void forClientsDiscountOfferTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getForClientDropDown().click();
        elementsOfSiteHeader.getDiscountOffer().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/programma-lojalynosti/"));
    }

    @Test
    public void forClientsGiftCertificateTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getForClientDropDown().click();
        elementsOfSiteHeader.getGiftCertificate().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/gift-certificate/"));
    }

    @Test
    public void forClientsWarrantyTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getForClientDropDown().click();
        elementsOfSiteHeader.getWarranty().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/garantijnye-objazatelstva/"));
    }
    @Test
    public void forClientsTermsOfPurchaseTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getForClientDropDown().click();
        elementsOfSiteHeader.getTermsOfPurchase().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/uslovyia-pryobrytenyia-oruzhyia/"));
    }

    @Test
    public void forClientsDeliveryAndPaymentTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getForClientDropDown().click();
        elementsOfSiteHeader.getDeliveryAndPayment().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/dostavka-i-oplata/"));
    }

    @Test
    public void forClientsActionTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getForClientDropDown().click();
        elementsOfSiteHeader.getAction().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/posts/akcii/"));
    }
}

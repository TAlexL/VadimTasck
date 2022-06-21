import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsOfHeadersSite extends TestInit{

    @Test
    public void aboutUsIBISCompanyTest(){
        HeaderOfSiteElements he = new HeaderOfSiteElements(driver);
        driver.get(he.site);
        he.getAboutUsDropDown().click();
        he.getAboutUsDropDownIBISCompany().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.shop/ua/"));
    }
    @Test
    public void aboutUsBrendsCatalogTest(){
        HeaderOfSiteElements he = new HeaderOfSiteElements(driver);
        driver.get(he.site);
        he.getAboutUsDropDown().click();
        he.getAboutUsDropDownBrendsCatalog().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.shop/ua/categories_brands/"));
    }
    @Test
    public void aboutUsIbisShopsTest(){
        HeaderOfSiteElements he = new HeaderOfSiteElements(driver);
        driver.get(he.site);
        he.getAboutUsDropDown().click();
        he.getAboutUsIbisShops().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.shop/ua/shops/"));
    }
    @Test
    public void customerServiceGiftCertificateTest(){
        HeaderOfSiteElements he = new HeaderOfSiteElements(driver);
        driver.get(he.site);
        he.getCustomerServiceDropDown().click();
        he.getGiftCertificate().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.shop/ua/gift-certificate/"));
    }

    @Test
    public void customerServiceFAQTest(){
        HeaderOfSiteElements he = new HeaderOfSiteElements(driver);
        driver.get(he.site);
        he.getCustomerServiceDropDown().click();
        he.getFAQ().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.shop/ua/faq_page/"));
    }

}

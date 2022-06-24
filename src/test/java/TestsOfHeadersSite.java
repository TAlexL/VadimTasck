import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsOfHeadersSite extends TestInit{


    @Test
    public void headOfPartyTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getPartyBtn().click();
        elementsOfSiteHeader.getGovernmantOfParty().click();
        elementsOfSiteHeader.getHeadOfParty().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ba.org.ua/lider/"));
    }

    @Test
    public void firstViceHeadOfPartyTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getPartyBtn().click();
        elementsOfSiteHeader.getGovernmantOfParty().click();
        elementsOfSiteHeader.getfirstViceHeadOfParty().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ba.org.ua/pershij-zastupnik-golovi-parti%d1%97/"));
    }

    @Test
    public void viceHeadsOfPartyTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getPartyBtn().click();
        elementsOfSiteHeader.getGovernmantOfParty().click();
        elementsOfSiteHeader.getViceHeadsOfParty().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ba.org.ua/zastupniki-2/"));
    }

    @Test
    public void  presidiumPoliticalCouncilPartyTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getPartyBtn().click();
        elementsOfSiteHeader.getGovernmantOfParty().click();
        elementsOfSiteHeader.getpresidiumPoliticalCouncilParty().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ba.org.ua/prezidiya-politichno%d1%97-radi-parti%d1%97/"));
    }

    @Test
    public void  politicalCouncilPartyTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getPartyBtn().click();
        elementsOfSiteHeader.getGovernmantOfParty().click();
        elementsOfSiteHeader.getPoliticalCouncilParty().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ba.org.ua/politichna-rada-parti%d1%97/"));
    }

    @Test
    public void  centralControlRevisionCommissionPartyTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getPartyBtn().click();
        elementsOfSiteHeader.getGovernmantOfParty().click();
        elementsOfSiteHeader.getCentralControlRevisionCommissionParty().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ba.org.ua/centralna-kontrolno-revizijna-komisiya-parti%d1%97/"));
    }

    @Test
    public void  struktureOfPartyTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getPartyBtn().click();
        elementsOfSiteHeader.getStruktureOfParty().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ba.org.ua/structure/"));
    }

    @Test
    public void  rigoinalPartsOfPartyTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getPartyBtn().click();
        elementsOfSiteHeader.getRigionalPartsOfParty().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ba.org.ua/regionalni-oseredki/"));
    }

    @Test
    public void  statenmentOfPartyTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getPartyBtn().click();
        elementsOfSiteHeader.getStatenmentOfParty().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ba.org.ua/statut/"));
    }

    @Test
    public void  electionProgramOfPartyTest(){
        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
        driver.get(elementsOfSiteHeader.site);
        elementsOfSiteHeader.getPartyBtn().click();
        elementsOfSiteHeader.getElectionProgramOfParty().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ba.org.ua/programm/"));
    }








//    @Test
//    public void aboutUsBrendsCatalogTest(){
//        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
//        driver.get(elementsOfSiteHeader.site);
//        elementsOfSiteHeader.getAboutUsDropDown().click();
//        elementsOfSiteHeader.getAboutUsBrendsCatalog().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/categories_brands/"));
//    }
//    @Test
//    public void aboutUsIbisShopsTest(){
//        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
//        driver.get(elementsOfSiteHeader.site);
//        elementsOfSiteHeader.getAboutUsDropDown().click();
//        elementsOfSiteHeader.getAboutUsIbisShops().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/shops"));
//    }
//
//    @Test
//    public void aboutUsWorldOfHobbiesMagazineTest(){
//        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
//        driver.get(elementsOfSiteHeader.site);
//        elementsOfSiteHeader.getAboutUsDropDown().click();
//        elementsOfSiteHeader.getWorldOfHobbiesMagazine().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://gunmag.com.ua/"));
//    }
//
//    @Test
//    public void aboutUsKitchenHouseTest(){
//        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
//        driver.get(elementsOfSiteHeader.site);
//        elementsOfSiteHeader.getAboutUsDropDown().click();
//        elementsOfSiteHeader.getKitchenHouse().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://kuldom.ua/"));
//    }
//
//    @Test
//    public void forClientsDiscountOfferTest(){
//        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
//        driver.get(elementsOfSiteHeader.site);
//        elementsOfSiteHeader.getForClientDropDown().click();
//        elementsOfSiteHeader.getDiscountOffer().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/programma-lojalynosti/"));
//    }
//
//    @Test
//    public void forClientsGiftCertificateTest(){
//        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
//        driver.get(elementsOfSiteHeader.site);
//        elementsOfSiteHeader.getForClientDropDown().click();
//        elementsOfSiteHeader.getGiftCertificate().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/gift-certificate/"));
//    }
//
//    @Test
//    public void forClientsWarrantyTest(){
//        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
//        driver.get(elementsOfSiteHeader.site);
//        elementsOfSiteHeader.getForClientDropDown().click();
//        elementsOfSiteHeader.getWarranty().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/garantijnye-objazatelstva/"));
//    }
//    @Test
//    public void forClientsTermsOfPurchaseTest(){
//        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
//        driver.get(elementsOfSiteHeader.site);
//        elementsOfSiteHeader.getForClientDropDown().click();
//        elementsOfSiteHeader.getTermsOfPurchase().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/uslovyia-pryobrytenyia-oruzhyia/"));
//    }
//
//    @Test
//    public void forClientsDeliveryAndPaymentTest(){
//        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
//        driver.get(elementsOfSiteHeader.site);
//        elementsOfSiteHeader.getForClientDropDown().click();
//        elementsOfSiteHeader.getDeliveryAndPayment().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/dostavka-i-oplata/"));
//    }
//
//    @Test
//    public void forClientsActionTest(){
//        ElementsOfSiteHeader elementsOfSiteHeader = new ElementsOfSiteHeader(driver);
//        driver.get(elementsOfSiteHeader.site);
//        elementsOfSiteHeader.getForClientDropDown().click();
//        elementsOfSiteHeader.getAction().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/posts/akcii/"));
//    }
}

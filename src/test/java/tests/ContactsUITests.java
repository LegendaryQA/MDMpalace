package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class ContactsUITests extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        if (!driver.getCurrentUrl().endsWith("/#contacts"))startPage.clickOnContactsPager();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='contacts']/div[2]/div[1]/div[2]/div[1]/div[1]/i")));
    }

    @Test
    public void checkPresenceOfContactsTitle(){
        Assert.assertTrue(contactsPage.checkIfPresentTitle());
    }
    @Test
    public void checkPresenceOfAddressTitle(){
        Assert.assertTrue(contactsPage.checkIfPresentAddressTitle());
    }
    @Test
    public void checkPresenceOfAddressDescription(){
        Assert.assertTrue(contactsPage.checkIfPresentAddressDescription());
    }
    @Test
    public void checkPresenceOfShowOnMapTitle(){
        Assert.assertTrue(contactsPage.checkIfPresentShowOnMapTitle());
    }
    @Test
    public void checkPresenceOfYandexLink(){
        Assert.assertTrue(contactsPage.checkIfPresentYandexLink());
    }
    @Test
    public void checkPresenceOfGoogleLink(){
        Assert.assertTrue(contactsPage.checkIfPresentGoogleLink());
    }
    @Test
    public void checkPresenceOfCashboxTitle(){
        Assert.assertTrue(contactsPage.checkIfPresentCashboxTitle());
    }
    @Test
    public void checkPresenceOfCashboxPhone(){
        Assert.assertTrue(contactsPage.checkIfPresentCashboxPhone());
    }
    @Test
    public void checkPresenceOfReceptionTitle(){
        Assert.assertTrue(contactsPage.checkIfPresentReceptionTitle());
    }
    @Test
    public void checkPresenceOfReceptionPhones(){
        Assert.assertTrue(contactsPage.checkIfPresentReceptionPhone1());
        Assert.assertTrue(contactsPage.checkIfPresentReceptionPhone2());
    }
    @Test
    public void checkPresenceOfEmailTitle(){
        Assert.assertTrue(contactsPage.checkIfPresentEmailTitle());
    }
    @Test
    public void checkPresenceOfEmailAddress(){
        Assert.assertTrue(contactsPage.checkIfPresentEmailAddress());
    }
    @Test
    public void checkPresenceOfPrintButton(){
        Assert.assertTrue(contactsPage.checkIfPresentPrintButton());
    }
    @Test
    public void checkPresenceOfZoomInButton(){
        Assert.assertTrue(contactsPage.checkIfPresentZoomInButton());
    }
    @Test
    public void checkPresenceOfZoomOutButton(){
        Assert.assertTrue(contactsPage.checkIfPresentZoomOutButton());
    }
    @Test
    public void checkPresenceOfZoomFitButton(){
        Assert.assertTrue(contactsPage.checkIfPresentZoomFitButton());
    }
    @Test
    public void checkContactsTitleText(){ Assert.assertEquals(contactsPage.getTitleText(),"Контакты"); }
    @Test
    public void checkContactsAddressTitleText(){
        Assert.assertEquals(contactsPage.getAddressTitleText(),"Адрес");
    }
    @Test
    public void checkContactsAddressDescriptionText(){
        Assert.assertTrue(contactsPage.getAddressDescriptionText().contains("119146, г. Москва, Комсомольский"));
        Assert.assertTrue(contactsPage.getAddressDescriptionText().contains("проспект д.28 (м. Фрунзенская)"));
    }
    @Test
    public void checkContactsShowOnMapTitleText(){ Assert.assertTrue(contactsPage.getShowOnMapTitleText().contains("Показать в")); }
    @Test
    public void checkContactsShowOnMapLinksText(){
        Assert.assertEquals(contactsPage.getYandexLinkText(),"Яндекс картах");
        Assert.assertEquals(contactsPage.getGoogelLinkText(),"Google maps");
    }
    @Test
    public void checkContactsTheatreCashboxTitleText(){ Assert.assertEquals(contactsPage.getCashboxTitle(),"Театральная касса"); }
    @Test
    public void checkContactsTheatreCashboxPhoneText(){ Assert.assertEquals(contactsPage.getCashboxPhone(),"+7 (495) 739 37 37"); }
    @Test
    public void checkContactsReceptionTitleText(){ Assert.assertEquals(contactsPage.getReceptionTitle(),"Ресепшен"); }
    @Test
    public void checkContactsReceptionPhonesText(){
        Assert.assertEquals(contactsPage.getReceptionPhone1(),"+7 (499) 246-18-46");
        Assert.assertEquals(contactsPage.getReceptionPhone2(),"+7 (499) 248-66-88");
    }
    @Test
    public void checkContactsEmailTitleText(){ Assert.assertEquals(contactsPage.getEmailTitle(),"E-mail"); }
    @Test
    public void checkContactsEmailAddressText(){ Assert.assertEquals(contactsPage.getEmailAddress(),"info@mdmpalace.ru"); }
    @Test
    public void checkMdmMapIconTextBox(){
        contactsPage.focusOnMdmMapIcon();
        contactsPage.focusOnMdmMapIconTextBox();
        Assert.assertEquals(contactsPage.getMdmMapIconBoxText(),"АО «Московский дворец молодежи»");
    }
    @Test
    public void checkMetroMapIconTextBox(){
        contactsPage.focusOnMetroMapIcon();
        contactsPage.focusOnMetroMapIconTextBox();
        Assert.assertEquals(contactsPage.getMetroMapIconBoxText(),"Станция метро Фрунзенская");
    }
    @Test
    public void checkTtkMapIconTextBox(){
        contactsPage.focusOnTtkMapIcon();
        contactsPage.focusOnTtkMapIconTextBox();
        Assert.assertEquals(contactsPage.getTtkMapIconBoxText(),"ТТК");
    }
    @Test
    public void checkRingMapIconTextBox(){
        contactsPage.focusOnRingMapIcon();
        contactsPage.focusOnRingMapIconTextBox();
        Assert.assertEquals(contactsPage.getRingMapIconBoxText(),"Садовое кольцо");
    }
    @Test
    public void checkParkMapIconTextBox(){
        contactsPage.focusOnParkMapIcon();
        contactsPage.focusOnParkMapIconTextBox();
        Assert.assertEquals(contactsPage.getParkMapIconBoxText(),"Парк Усадьба Трубецких в Хамовниках");
    }
    @Test
    public void checkParkingMapIconTextBox(){
        contactsPage.focusOnParkingMapIcon();
        contactsPage.focusOnParkingMapIconTextBox();
        Assert.assertEquals(contactsPage.getParkingMapIconBoxText(),"Удобная парковка");
    }

}

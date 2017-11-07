package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class ParquetHallUITests extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        if (driver.getCurrentUrl().equals(BASEURL))startPage.clickOnRentPager();
        if (!driver.getCurrentUrl().endsWith("/halls/parket.html") && rentPage.checkIfPresentWatchAllRoomsLink()) rentPage.clickParquetHallLink();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='subtitle2']//child::a[@href='http://www.mdmpalace.ru/halls/great.html']")));
    }
    @Test
    public void checkPresenceOfHomeButton(){
        Assert.assertTrue(parquetHallPage.checkIfPresentHomeButton());
    }
    @Test
    public void checkPresenceOfBackButton(){
        Assert.assertTrue(parquetHallPage.checkIfPresentBackButton());
    }
    @Test
    public void check1BlockPresenceOfTitle(){
        Assert.assertTrue(parquetHallPage.checkIfPresentTitle());
    }
    @Test
    public void check1BlockPresenceOfGreatHallSwitchLink(){
        Assert.assertTrue(parquetHallPage.checkIfPresentLinkToGreatHall());
    }
    @Test
    public void check2BlockPresenceOfPhonesTitle(){
        if (!parquetHallPage.checkIfPresentPhonesTitle())parquetHallPage.scrollUntilHallInfoIsVisible();
        Assert.assertTrue(parquetHallPage.checkIfPresentPhonesTitle());
    }
    @Test
    public void check2BlockPresenceOfPhone1(){
        Assert.assertTrue(parquetHallPage.checkIfPresentPhone1());
    }
    @Test
    public void check2BlockPresenceOfPhone2(){
        Assert.assertTrue(parquetHallPage.checkIfPresentPhone2());
    }
    @Test
    public void check2BlockPresenceOfParketHallDescription(){
        Assert.assertTrue(parquetHallPage.checkIfPresentParketHallDescription());
    }
    @Test
    public void check2BlockPresenceOfEquipmentTitle(){
        Assert.assertTrue(parquetHallPage.checkIfPresentEquipmentTitle());
    }
    @Test
    public void check2BlockPresenceOfEquipLightAndSound(){
        Assert.assertTrue(parquetHallPage.checkIfPresentEquipmentLightAndSound());
    }
    @Test
    public void check2BlockPresenceOfEquipDanceFloor(){
        Assert.assertTrue(parquetHallPage.checkIfPresentEquipmentDanceFloor());
    }
    @Test
    public void check2BlockPresenceOfEquipPodiums(){
        Assert.assertTrue(parquetHallPage.checkIfPresentEquipmentPodiums());
    }
    @Test
    public void check2BlockPresenceOfEquipRestaurant(){
        Assert.assertTrue(parquetHallPage.checkIfPresentEquipmentRestaurant());
    }
    @Test
    public void check2BlockPresenceOfEquipWardrobe(){
        Assert.assertTrue(parquetHallPage.checkIfPresentEquipmentWardrobe());
    }
    @Test
    public void check2BlockPresenceOfParketHallAdditionalDescription(){
        Assert.assertTrue(parquetHallPage.checkIfPresentParketAdditionalDescription());
    }
    @Test
    public void check2BlockPresenceOfEvent1(){
        Assert.assertTrue(parquetHallPage.checkIfPresentEvent1());
    }
    @Test
    public void check2BlockPresenceOfEvent2(){
        Assert.assertTrue(parquetHallPage.checkIfPresentEvent2());
    }
    @Test
    public void check2BlockPresenceOfEvent3(){
        Assert.assertTrue(parquetHallPage.checkIfPresentEvent3());
    }
    @Test
    public void check2BlockPresenceOfEvent4(){
        Assert.assertTrue(parquetHallPage.checkIfPresentEvent4());
    }
    @Test
    public void check2BlockPresenceOfEvent5(){
        Assert.assertTrue(parquetHallPage.checkIfPresentEvent5());
    }
    @Test
    public void check2BlockPresenceOfEvent6(){
        Assert.assertTrue(parquetHallPage.checkIfPresentEvent6());
    }
    @Test
    public void check3BlockPresenceOfPhotoGalleryTitle(){
        if (!parquetHallPage.checkIfPresentPhotoGalleryTitle()) parquetHallPage.scrollUntilPhotoGalleryIsVisible();
        Assert.assertTrue(parquetHallPage.checkIfPresentPhotoGalleryTitle());
    }
    @Test
    public void check3BlockPresenceOfNextPhotoButton(){
        Assert.assertTrue(parquetHallPage.checkIfPresentNextPhotoButton());
    }
    @Test
    public void check3BlockPresenceOfPreviousPhotoButton(){
        Assert.assertTrue(parquetHallPage.checkIfPresentPreviousPhotoButton());
    }
    @Test
    public void check4BlockPresenceOfMapTitle(){
        if (!parquetHallPage.checkIfPresentMap()) parquetHallPage.scrollUntilMapSeactionIsVisible();
        Assert.assertTrue(parquetHallPage.checkIfPresentMapTitle());
    }
    @Test
    public void check4BlockPresenceOfMap(){
        Assert.assertTrue(parquetHallPage.checkIfPresentMap());
    }
    @Test
    public void check4BlockPresenceOfZoomInButton(){
        Assert.assertTrue(parquetHallPage.checkIfPresentZoomInButton());
    }
    @Test
    public void check4BlockPresenceOfZoomOutButton(){ Assert.assertTrue(parquetHallPage.checkIfPresentZoomOutButton()); }
    @Test
    public void check4BlockPresenceOfZoomResetButton(){ Assert.assertTrue(parquetHallPage.checkIfPresentZoomResetButton()); }
    @Test
    public void check5BlockPresenceOfPanoramaTitle(){
        if (!parquetHallPage.checkIfPresentPanoramaTitle()) parquetHallPage.scrollUntilPanoramaIsVisible();
        Assert.assertTrue(parquetHallPage.checkIfPresentPanoramaTitle());
    }
    @Test
    public void check6BlockPresenceOfRentRequestTitle(){
        if (!parquetHallPage.checkIfPresentSendRentRequestButton()) parquetHallPage.scrollUntilRenRequestFieldsAreVisible();
        Assert.assertTrue(parquetHallPage.checkIfPresentRentRequestTitle());
    }
    @Test
    public void check6BlockPresenceOfNameField(){
        Assert.assertTrue(parquetHallPage.checkIfPresentNameField());
    }
    @Test
    public void check6BlockPresenceOfPhoneField(){
        Assert.assertTrue(parquetHallPage.checkIfPresentPhoneField());
    }
    @Test
    public void check6BlockPresenceOfEmailField(){
        Assert.assertTrue(parquetHallPage.checkIfPresentEmailField());
    }
    @Test
    public void check6BlockPresenceOfFormatField(){
        Assert.assertTrue(parquetHallPage.checkIfPresentFormatField());
    }
    @Test
    public void check6BlockPresenceOfDateField(){
        Assert.assertTrue(parquetHallPage.checkIfPresentDateField());
    }
    @Test
    public void check6BlockPresenceOfGuestsField(){
        Assert.assertTrue(parquetHallPage.checkIfPresentGuestsField());
    }
    @Test
    public void check6BlockPresenceOfTimeField(){
        Assert.assertTrue(parquetHallPage.checkIfPresentTimeField());
    }
    @Test
    public void check6BlockPresenceOfTimeMontageField(){ Assert.assertTrue(parquetHallPage.checkIfPresentTimeMontageField()); }
    @Test
    public void check6BlockPresenceOfCommentsField(){ Assert.assertTrue(parquetHallPage.checkIfPresentCommentsField()); }
    @Test
    public void check6BlockPresenceOfRequiredFieldsMessage(){ Assert.assertTrue(parquetHallPage.checkIfPresentRequiredFieldsTitle()); }
    @Test
    public void check1BlockMainTitleText(){ Assert.assertEquals(parquetHallPage.getTitleText(),"Паркетный зал"); }
    @Test
    public void check1BlockParquetHallLinkText(){ Assert.assertEquals(parquetHallPage.getGreatHallLinkText(),"Перейти в Большой зал"); }
    @Test
    public void check2BlockPhonesTitleText(){
        if (!parquetHallPage.checkIfPresentPhonesTitle())parquetHallPage.scrollUntilHallInfoIsVisible();
        Assert.assertEquals(parquetHallPage.getPhonesTitleText(),"Контакты для связи по аренде концертных помещений:");
    }
    @Test
    public void check2BlockPhone1Text(){ Assert.assertEquals(parquetHallPage.getPhone1Text(),"+7 (985) 920 02 78"); }
    @Test
    public void check2BlockPhone2Text(){ Assert.assertEquals(parquetHallPage.getPhone2Text(),"+7 (499) 248 57 81"); }
    @Test
    public void check2BlockParketHallDescriptionText(){
        Assert.assertEquals(parquetHallPage.getParketDescriptionText(),"Паркетный зал / фойе Большого зала / - площадка с возможностью зонирования и застройки под пожелания Заказчика общей площадью – 1 200 кв. м.");
    }
    @Test
    public void check2BlockEquipmentTitleText(){ Assert.assertEquals(parquetHallPage.getEquipmentTitleText(),"Оснащение:"); }
    @Test
    public void check2BlockEquipmentLightAndSoundText(){ Assert.assertEquals(parquetHallPage.getEquipmentLightAndSoundText(),"Современное световое и звуковое оборудование;"); }
    @Test
    public void check2BlockEquipmentDanceFloorText(){ Assert.assertEquals(parquetHallPage.getEquipmentDanceFloorText(),"Танцпол – 470 м2;"); }
    @Test
    public void check2BlockEquipmentPodiumsText(){ Assert.assertEquals(parquetHallPage.getEquipmentPodiumsText(),"Выделенные подиумы;"); }
    @Test
    public void check2BlockEquipmentRestauranttext(){ Assert.assertEquals(parquetHallPage.getEquipmentRestaurantText(),"Зона рестрана вместимостью до 200 человек;"); }
    @Test
    public void check2BlockEquipmentWardrobeText(){ Assert.assertEquals(parquetHallPage.getEquipmentWardrobeText(),"Гардероб на 1800 мест и ВИП гардероб на 500 мест."); }
    @Test
    public void check2BlockParketHallAdditionalDescriptionText(){
        Assert.assertEquals(parquetHallPage.getparketHallAdditionalDescriptionText(),"Паркетный зал может использоваться совместно с Большим залом и, как самостоятельная площадка для проведения:");
    }
    @Test
    public void check2BlockEvent1Text(){ Assert.assertEquals(parquetHallPage.getEvent1Text(),"банкетов до 650 человек;"); }
    @Test
    public void check2BlockEvent2Text(){ Assert.assertEquals(parquetHallPage.getEvent2Text(),"фуршетов с частичной рассадкой и фуршетов до 1500 человек;"); }
    @Test
    public void check2BlockEvent3Text(){ Assert.assertEquals(parquetHallPage.getEvent3Text(),"концертных программ в режиме дискотеки;"); }
    @Test
    public void check2BlockEvent4Text(){
        Assert.assertEquals(parquetHallPage.getEvent4Text(),"свадеб;");
    }
    @Test
    public void check2BlockEvent5Text(){
        Assert.assertEquals(parquetHallPage.getEvent5Text(),"выставок;");
    }
    @Test
    public void check2BlockEvent6Text(){ Assert.assertEquals(parquetHallPage.getEvent6Text(),"корпоративных мероприятий и т.п."); }
    @Test
    public void check3BlockPhotoGalleryTitleText(){
        Assert.assertEquals(parquetHallPage.getPhotoGalleryTitleText(),"Фотогалерея Паркетного зала");
    }
    @Test
    public void check4BlockMapTitleText(){
        Assert.assertEquals(parquetHallPage.getSchemaMapTitleText(),"План Паркетного зала");
    }
    @Test
    public void check5BlockPanoramaTitleText(){
        Assert.assertEquals(parquetHallPage.getPanoramaTitleText(),"Панорама Паркетного зала");
    }
    @Test
    public void check5BlockRentRequestTitleText(){
        Assert.assertEquals(parquetHallPage.getRentRequestTitleText(),"Форма заявки на аренду");
    }
    @Test
    public void check5BlockNameFieldTitleText(){
        Assert.assertEquals(parquetHallPage.getNameFieldTitleText(),"Имя");
    }
    @Test
    public void check5BlockPhoneFieldTitleText(){
        Assert.assertEquals(parquetHallPage.getPhoneFieldTitleText(),"Телефон");
    }
    @Test
    public void check5BlockEmailFieldTitleText(){
        Assert.assertEquals(parquetHallPage.getEmailFieldTitleText(),"E-mail");
    }
    @Test
    public void check5BlockDateFieldTitleText(){
        Assert.assertEquals(parquetHallPage.getDateFieldTitleText(),"Желаемая дата");
    }
    @Test
    public void check5BlockGuestsFieldTitleText(){
        Assert.assertTrue(parquetHallPage.getGuestsFieldTitleText().contains("Количество"));
        Assert.assertTrue(parquetHallPage.getGuestsFieldTitleText().contains("гостей"));
    }
    @Test
    public void check5BlockTimeFieldTitleText(){
        Assert.assertTrue(parquetHallPage.getTimeFieldTitleText().contains("Временные рамки"));
        Assert.assertTrue(parquetHallPage.getTimeFieldTitleText().contains("мероприятия"));
    }
    @Test
    public void check5BlockTimeMontageFieldTitleText(){
        Assert.assertTrue(parquetHallPage.getTimeMontageFieldTitleText().contains("Временные рамки"));
        Assert.assertTrue(parquetHallPage.getTimeMontageFieldTitleText().contains("монтажа / демонтажа"));
    }
    @Test
    public void check5BlockCommentsFieldTitleText(){
        Assert.assertEquals(parquetHallPage.getCommentsFieldTitleText(),"Комментарий");
    }
    @Test
    public void check5BlockFormatFieldTitleText(){
        Assert.assertEquals(parquetHallPage.getFormatFieldTitleText(),"Формат мероприятия");
    }
    @Test
    public void check5BlockRequiredFieldsTitleText(){
        Assert.assertEquals(parquetHallPage.getRequiredFieldsTitleText(),"- Поля обязательные для заполнения");
    }
    @Test
    public void check5BlockSendRentRequestButtonText(){
        Assert.assertEquals(parquetHallPage.getSendRentRequestButtonText(),"Отправить заявку");
    }
}

package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class GreatHallUITests extends BasicTestConditions{

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        if (driver.getCurrentUrl().equals(BASEURL))startPage.clickOnRentPager();
        if (!driver.getCurrentUrl().endsWith("/halls/great.html") && rentPage.checkIfPresentWatchAllRoomsLink()) rentPage.clickGreatHallLink();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='subtitle2']//child::a[@href='http://www.mdmpalace.ru/halls/parket.html']")));
    }
    @Test
    public void checkPresenceOfHomeButton(){
        Assert.assertTrue(greatHallPage.checkIfPresentHomeButton());
    }
    @Test
    public void checkPresenceOfBackButton(){
        Assert.assertTrue(greatHallPage.checkIfPresentBackButton());
    }
    @Test
    public void check1BlockPresenceOfTitle(){
        Assert.assertTrue(greatHallPage.checkIfPresentTitle());
    }
    @Test
    public void check1BlockPresenceOfParquetHallSwitchLink(){
        Assert.assertTrue(greatHallPage.checkIfPresentLinkToParquetHall());
    }
    @Test
    public void check2BlockPresenceOfPhonesTitle(){
        if (!greatHallPage.checkIfPresentPhonesTitle())greatHallPage.scrollUntilHallInfoIsVisible();
        Assert.assertTrue(greatHallPage.checkIfPresentPhonesTitle());
    }
    @Test
    public void check2BlockPresenceOfPhone1(){
        Assert.assertTrue(greatHallPage.checkIfPresentPhone1());
    }
    @Test
    public void check2BlockPresenceOfPhone2(){
        Assert.assertTrue(greatHallPage.checkIfPresentPhone2());
    }
    @Test
    public void check2BlockPresenceOfMdmDescription(){
        Assert.assertTrue(greatHallPage.checkIfPresentMdmDescription());
    }
    @Test
    public void check2BlockPresenceOfEquipmentTitle(){
        Assert.assertTrue(greatHallPage.checkIfPresentEquipmentTitle());
    }
    @Test
    public void check2BlockPresenceOfEquipStage(){
        Assert.assertTrue(greatHallPage.checkIfPresentEquipmentStage());
    }
    @Test
    public void check2BlockPresenceOfEquipBackStage(){
        Assert.assertTrue(greatHallPage.checkIfPresentEquipmentBackStage());
    }
    @Test
    public void check2BlockPresenceOfLightAndSound(){
        Assert.assertTrue(greatHallPage.checkIfPresentEquipmentLightAndSound());
    }
    @Test
    public void check2BlockPresenceOfVipOpportunitiesTitle(){
        Assert.assertTrue(greatHallPage.checkIfPresentVipOpportunitiesTitle());
    }
    @Test
    public void check2BlockPresenceOfVipOpportunitiesDescription(){
        Assert.assertTrue(greatHallPage.checkIfPresentVipOpportunitiesDescription());
    }
    @Test
    public void check2BlockPresenceOfEventsTitle(){
        Assert.assertTrue(greatHallPage.checkIfPresentEventsTitle());
    }
    @Test
    public void check2BlockPresenceOfEvent1(){
        Assert.assertTrue(greatHallPage.checkIfPresentEvent1());
    }
    @Test
    public void check2BlockPresenceOfEvent2(){
        Assert.assertTrue(greatHallPage.checkIfPresentEvent2());
    }
    @Test
    public void check2BlockPresenceOfEvent3(){
        Assert.assertTrue(greatHallPage.checkIfPresentEvent3());
    }
    @Test
    public void check2BlockPresenceOfEvent4(){
        Assert.assertTrue(greatHallPage.checkIfPresentEvent4());
    }
    @Test
    public void check2BlockPresenceOfEvent5(){
        Assert.assertTrue(greatHallPage.checkIfPresentEvent5());
    }
    @Test
    public void check3BlockPresenceOfPhotoGalleryTitle(){
        if (!greatHallPage.checkIfPresentPhotoGalleryTitle()) greatHallPage.scrollUntilPhotoGalleryIsVisible();
        Assert.assertTrue(greatHallPage.checkIfPresentPhotoGalleryTitle());
    }
    @Test
    public void check3BlockPresenceOfNextPhotoButton(){
        Assert.assertTrue(greatHallPage.checkIfPresentNextPhotoButton());
    }
    @Test
    public void check3BlockPresenceOfPreviousPhotoButton(){
        Assert.assertTrue(greatHallPage.checkIfPresentPreviousPhotoButton());
    }
    @Test
    public void check4BlockPresenceOfPlanMapButton(){
        if (!greatHallPage.checkIfPlanMapDispalyed()) greatHallPage.scrollUntilMapSeactionIsVisible();
        Assert.assertTrue(greatHallPage.checkIfPresentPlanMapButton());
    }
    @Test
    public void check4BlockPresenceOfSchemaMapButton(){
        Assert.assertTrue(greatHallPage.checkIfPresentSchemaMapButton());
    }
    @Test
    public void check4BlockPresenceOfPlanMap(){
        Assert.assertTrue(greatHallPage.checkIfPresentPlanMap());
    }
    @Test
    public void check4BlockPresenceOfZoomInButton(){
        Assert.assertTrue(greatHallPage.checkIfPresentPlanZoomInButton());
    }
    @Test
    public void check4BlockPresenceOfZoomOutButton(){
        Assert.assertTrue(greatHallPage.checkIfPresentPlanZoomOutButton());
    }
    @Test
    public void check4BlockPresenceOfZoomResetButton(){
        Assert.assertTrue(greatHallPage.checkIfPresentPlanZoomResetButton());
    }
    @Test
    public void check5BlockPresenceOfPanoramaTitle(){
        if (!greatHallPage.checkIfPresentPanoramaTitle()) greatHallPage.scrollUntilPanoramaIsVisible();
        Assert.assertTrue(greatHallPage.checkIfPresentPanoramaTitle());
    }
    @Test
    public void check6BlockPresenceOfRentRequestTitle(){
        if (!greatHallPage.checkIfPresentSendRentRequestButton()) greatHallPage.scrollUntilRenRequestFieldsAreVisible();
        Assert.assertTrue(greatHallPage.checkIfPresentRentRequestTitle());
    }
    @Test
    public void check6BlockPresenceOfNameField(){
        Assert.assertTrue(greatHallPage.checkIfPresentNameField());
    }
    @Test
    public void check6BlockPresenceOfPhoneField(){
        Assert.assertTrue(greatHallPage.checkIfPresentPhoneField());
    }
    @Test
    public void check6BlockPresenceOfEmailField(){
        Assert.assertTrue(greatHallPage.checkIfPresentEmailField());
    }
    @Test
    public void check6BlockPresenceOfFormatField(){
        Assert.assertTrue(greatHallPage.checkIfPresentFormatField());
    }
    @Test
    public void check6BlockPresenceOfDateField(){
        Assert.assertTrue(greatHallPage.checkIfPresentDateField());
    }
    @Test
    public void check6BlockPresenceOfGuestsField(){
        Assert.assertTrue(greatHallPage.checkIfPresentGuestsField());
    }
    @Test
    public void check6BlockPresenceOfTimeField(){
        Assert.assertTrue(greatHallPage.checkIfPresentTimeField());
    }
    @Test
    public void check6BlockPresenceOfTimeMontageField(){
        Assert.assertTrue(greatHallPage.checkIfPresentTimeMontageField());
    }
    @Test
    public void check6BlockPresenceOfCommentsField(){
        Assert.assertTrue(greatHallPage.checkIfPresentCommentsField());
    }
    @Test
    public void check6BlockPresenceOfRequiredFieldsMessage(){
        Assert.assertTrue(greatHallPage.checkIfPresentRequiredFieldsTitle());
    }
    @Test
    public void check1BlockMainTitleText(){
        Assert.assertEquals(greatHallPage.getTitleText(),"Большой зал");
    }
    @Test
    public void check1BlockParquetHallLinkText(){
        Assert.assertEquals(greatHallPage.getParquetHallLinkText(),"Перейти в Паркетный зал");
    }
    @Test
    public void check2BlockPhonesTitleText(){
        if (!greatHallPage.checkIfPresentPhonesTitle())greatHallPage.scrollUntilHallInfoIsVisible();
        Assert.assertEquals(greatHallPage.getPhonesTitleText(),"Контакты для связи по аренде концертных помещений:");
    }
    @Test
    public void check2BlockPhone1Text(){
        Assert.assertEquals(greatHallPage.getPhone1Text(),"+7 (985) 920 02 78");
    }
    @Test
    public void check2BlockPhone2Text(){
        Assert.assertEquals(greatHallPage.getPhone2Text(),"+7 (499) 248 57 81");
    }
    @Test
    public void check2BlockMdmDescriptionText(){
        Assert.assertEquals(greatHallPage.getMdmDescriptionText(),"Большой зал МДМ - одна из немногих площадок в центре Москвы, рассчитанная на 1800 посадочных мест.");
    }
    @Test
    public void check2BlockEquipmentTitleText(){
        Assert.assertEquals(greatHallPage.getEquipmentTitleText(),"Оснащение:");
    }
    @Test
    public void check2BlockEquipmentStageText(){
        Assert.assertEquals(greatHallPage.getEquipmentStageText(),"Сцена – площадью 300 метров.");
    }
    @Test
    public void check2BlockEquipmentBackStageText(){
        Assert.assertEquals(greatHallPage.getEquipmentBackStageText(),"Backstage – площадью 450 метров.");
    }
    @Test
    public void check2BlockEquipmentLightAndSoundText(){
        Assert.assertEquals(greatHallPage.getEquipmentLightAndSoundText(),"Современное световое, звуковое и сценическое оборудование.");
    }
    @Test
    public void check2BlockVipOpportunitiesTitletext(){
        Assert.assertEquals(greatHallPage.getVipOpportunitiesTitleText(),"VIP возможности:");
    }
    @Test
    public void check2BlockVipOpportunitiesDescriptionText(){
        Assert.assertEquals(greatHallPage.getVipOpportunitiesDescriptionText(),"Для корпоративных и VIP клиентов в зале оборудована Ложа повышенной комфортности, рассчитанная на 15 мест.");
    }
    @Test
    public void check2BlockEventsTitle(){
        Assert.assertEquals(greatHallPage.getEventsTitleText(),"Большой зал очень удобен для проведения:");
    }
    @Test
    public void check2BlockEvent1Text(){
        Assert.assertEquals(greatHallPage.getEvent1Text(),"корпоративных мероприятий;");
    }
    @Test
    public void check2BlockEvent2Text(){
        Assert.assertEquals(greatHallPage.getEvent2Text(),"конференций;");
    }
    @Test
    public void check2BlockEvent3Text(){
        Assert.assertEquals(greatHallPage.getEvent3Text(),"концертов;");
    }
    @Test
    public void check2BlockEvent4Text(){
        Assert.assertEquals(greatHallPage.getEvent4Text(),"кино просмотров;");
    }
    @Test
    public void check2BlockEvent5Text(){
        Assert.assertEquals(greatHallPage.getEvent5Text(),"спектаклей и т.п.");
    }
    @Test
    public void check3BlockPhotoGalleryTitleText(){
        Assert.assertEquals(greatHallPage.getPhotoGalleryTitleText(),"Фотогалерея Большого зала");
    }
    @Test
    public void check4BlockPlanMapButtonText(){
        Assert.assertEquals(greatHallPage.getPlanMapButtonText(),"План Большого зала");
    }
    @Test
    public void check4BlockSchemaMapButtonText(){
        Assert.assertEquals(greatHallPage.getSchemaMapButtonText(),"Схема зрительного зала");
    }
    @Test
    public void check5BlockPanoramaTitleText(){
        Assert.assertEquals(greatHallPage.getPanoramaTitleText(),"Панорама Большого зала");
    }
    @Test
    public void check5BlockRentRequestTitleText(){
        Assert.assertEquals(greatHallPage.getRentRequestTitleText(),"Форма заявки на аренду");
    }
    @Test
    public void check5BlockNameFieldTitleText(){
        Assert.assertEquals(greatHallPage.getNameFieldTitleText(),"Имя");
    }
    @Test
    public void check5BlockPhoneFieldTitleText(){
        Assert.assertEquals(greatHallPage.getPhoneFieldTitleText(),"Телефон");
    }
    @Test
    public void check5BlockEmailFieldTitleText(){
        Assert.assertEquals(greatHallPage.getEmailFieldTitleText(),"E-mail");
    }
    @Test
    public void check5BlockDateFieldTitleText(){
        Assert.assertEquals(greatHallPage.getDateFieldTitleText(),"Желаемая дата");
    }
    @Test
    public void check5BlockGuestsFieldTitleText(){
        Assert.assertTrue(greatHallPage.getGuestsFieldTitleText().contains("Количество"));
        Assert.assertTrue(greatHallPage.getGuestsFieldTitleText().contains("гостей"));
    }
    @Test
    public void check5BlockTimeFieldTitleText(){
        Assert.assertTrue(greatHallPage.getTimeFieldTitleText().contains("Временные рамки"));
        Assert.assertTrue(greatHallPage.getTimeFieldTitleText().contains("мероприятия"));
    }
    @Test
    public void check5BlockTimeMontageFieldTitleText(){
        Assert.assertTrue(greatHallPage.getTimeMontageFieldTitleText().contains("Временные рамки"));
        Assert.assertTrue(greatHallPage.getTimeMontageFieldTitleText().contains("монтажа / демонтажа"));
    }
    @Test
    public void check5BlockCommentsFieldTitleText(){
        Assert.assertEquals(greatHallPage.getCommentsFieldTitleText(),"Комментарий");
    }
    @Test
    public void check5BlockFormatFieldTitleText(){
        Assert.assertEquals(greatHallPage.getFormatFieldTitleText(),"Формат мероприятия");
    }
    @Test
    public void check5BlockRequiredFieldsTitleText(){
        Assert.assertEquals(greatHallPage.getRequiredFieldsTitleText(),"- Поля обязательные для заполнения");
    }
    @Test
    public void check5BlockSendRentRequestButtonText(){
        Assert.assertEquals(greatHallPage.getSendRentRequestButtonText(),"Отправить заявку");
    }

}

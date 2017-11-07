package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class RoomInfoPageUITests extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        if (driver.getCurrentUrl().equals(BASEURL))startPage.clickOnRentPager();
        if (!driver.getCurrentUrl().contains("/rent/") && rentPage.checkIfPresentWatchAllRoomsLink()) rentPage.clickWatchAllRoomsLink();
        if (!driver.getCurrentUrl().contains("/rent/rent")) roomsRentPage.clickOnFirstRoomInTable();
    }
    @Test
    public void checkPresenceOfTitle(){
        Assert.assertTrue(roomInfoPage.checkIfPresentTitle());
    }
    @Test
    public void checkPresenceOfTitleSpace(){
        Assert.assertTrue(roomInfoPage.checkIfPresentSpaceTitle());
    }
    @Test
    public void checkPresenceOfValueSpace(){
        Assert.assertTrue(roomInfoPage.checkIfPresentSpaceValue());
    }
    @Test
    public void checkPresenceOfTitleFloor(){
        Assert.assertTrue(roomInfoPage.checkIfPresentFloorTitle());
    }
    @Test
    public void checkPresenceOfValueFloor(){
        Assert.assertTrue(roomInfoPage.checkIfPresentFloorValue());
    }
    @Test
    public void checkPresenceOfTitleRentType(){
        Assert.assertTrue(roomInfoPage.checkIfPresentRentTypeTitle());
    }
    @Test
    public void checkPresenceOfValueRentType(){
        Assert.assertTrue(roomInfoPage.checkIfPresentRentTypeValue());
    }
    @Test
    public void checkPresenceOfTitleMonthRent(){
        Assert.assertTrue(roomInfoPage.checkIfPresentMonthRentTitle());
    }
    @Test
    public void checkPresenceOfValueMonthRent(){
        Assert.assertTrue(roomInfoPage.checkIfPresenMonthRentValue());
    }
    @Test
    public void checkPresenceOfTitleYearRent(){
        Assert.assertTrue(roomInfoPage.checkIfPresentYearRentTitle());
    }
    @Test
    public void checkPresenceOfValueYearRent(){
        Assert.assertTrue(roomInfoPage.checkIfPresentYearRentValue());
    }
    @Test
    public void checkPresenceOfValueDeposit(){
        if (roomInfoPage.checkIfPresentDepositTitle()) Assert.assertTrue(roomInfoPage.checkIfPresentDepositValue());
        else System.out.println("Deposit info was not provided.");
    }
    @Test
    public void checkPresenceOfValueRentPeriod(){
        if (roomInfoPage.checkIfPresentRentPeriodTitle()) Assert.assertTrue(roomInfoPage.checkIfPresentRentPeriodValue());
        else System.out.println("Rent period info was not provided.");
    }
    @Test
    public void checkPresenceOfTitleCommonPlan(){
        Assert.assertTrue(roomInfoPage.checkIfPresentTitleCommonPlan());
    }
    @Test
    public void checkPresenceOfTitleLargePlan(){
        Assert.assertTrue(roomInfoPage.checkIfPresentTitleLargePlan());
    }
    @Test
    public void checkPresenceOfZoomInButton(){
        Assert.assertTrue(roomInfoPage.checkIfPresentCommonZoomInButton());
    }
    @Test
    public void checkPresenceOfZoomOutButton(){
        Assert.assertTrue(roomInfoPage.checkIfPresentCommonZoomOutButton());
    }
    @Test
    public void checkPresenceOfZoomResetButton(){ Assert.assertTrue(roomInfoPage.checkIfPresentCommonZoomResetButton()); }
    @Test
    public void checkPresenceOfReserveRoomButton(){ Assert.assertTrue(roomInfoPage.checkIfPresentRoomReserverButton()); }
    @Test
    public void checkPresenceOfTitlePhones(){
        Assert.assertTrue(roomInfoPage.checkIfPresentPhonesTitle());
    }
    @Test
    public void checkPresenceOfPhones(){
        Assert.assertTrue(roomInfoPage.checkIfPresentPhone1Value());
        Assert.assertTrue(roomInfoPage.checkIfPresentPhone2Value());
    }
    @Test
    public void checkPresenceOfPlanSwitchButton(){Assert.assertTrue(roomInfoPage.checkIfPresentPlanSwitchButton());}
    @Test
    public void checkPresenceOfPhotoSlider(){Assert.assertTrue(roomInfoPage.checkIfPresentPhotoSlider());}
    @Test
    public void checkTitleText(){
        Assert.assertNotEquals(roomInfoPage.getRoomTitleText(), "");
    }
    @Test
    public void checkTitleSpaceText(){
        Assert.assertEquals(roomInfoPage.getRoomSpaceTitleText(), "Общая площадь");
    }
    @Test
    public void checkValueSpaceText(){
        Assert.assertNotEquals(roomInfoPage.getSpaceValueText(), "");
    }
    @Test
    public void checkTitleRentTypeText(){ Assert.assertEquals(roomInfoPage.getRoomRentTypeTitleText(), "Тип аренды:"); }
    @Test
    public void checkValueRentTypeText(){
        Assert.assertNotEquals(roomInfoPage.getRentTypeValueText(), "");
    }
    @Test
    public void checkTitleRentPeriodText(){
        if (roomInfoPage.checkIfPresentRentPeriodTitle())Assert.assertEquals(roomInfoPage.getRoomRentPeriodTitleText(), "Срок аренды:");
        else System.out.println("Rent period info was not provided.");
    }
    @Test
    public void checkTitleDepositText(){
        if (roomInfoPage.checkIfPresentDepositTitle())Assert.assertEquals(roomInfoPage.getRoomDepositTitleText(), "Депозит:");
        else System.out.println("Deposit info was not provided.");
    }
    @Test
    public void checkTitleFloorText(){
        Assert.assertEquals(roomInfoPage.getRoomFloorTitleText(), "Этаж");
    }
    @Test
    public void checkValueFloorText(){
        Assert.assertNotEquals(roomInfoPage.getFloorValueText(), "");
    }
    @Test
    public void checkTitleMonthRentText(){ Assert.assertEquals(roomInfoPage.getRoomMonthRentTitleText(), "Арендная ставка в месяц:"); }
    @Test
    public void checkValueMonthRentText(){
        Assert.assertNotEquals(roomInfoPage.getMonthRentValueText(), "");
    }
    @Test
    public void checkTitleYearRentText(){ Assert.assertEquals(roomInfoPage.getRoomYearRentTitleText(), "Арендная ставка в год:"); }
    @Test
    public void checkValueYearRentText(){
        Assert.assertNotEquals(roomInfoPage.getYearRentValueText(), "");
    }
    @Test
    public void checkTitlePhonesText(){ Assert.assertEquals(roomInfoPage.getRoomPhonesTitleText(), "Заявки по телефонам:"); }
    @Test
    public void checkValuePhonesText(){
        Assert.assertEquals(roomInfoPage.getPhone1ValueText(), "+7 (499) 917 02 95");
        Assert.assertEquals(roomInfoPage.getPhone2ValueText(), "+7 (916) 024 49 02");
    }
    @Test
    public void checkValueRentPeriodText(){
        if (roomInfoPage.checkIfPresentRentPeriodValue()) Assert.assertNotEquals(roomInfoPage.getRentPeriodValueText(), "");
        else System.out.println("Rent period info was not provided.");
    }
    @Test
    public void checkValueDepositText(){
        if (roomInfoPage.checkIfPresentDepositValue()) Assert.assertNotEquals(roomInfoPage.getDepositValueText(), "");
        else System.out.println("Deposit info was not provided.");
    }
    @Test
    public void checkReserveRoomButtonText(){Assert.assertEquals(roomInfoPage.getRoomReserveButtonText(),"Заявка на аренду");}

}

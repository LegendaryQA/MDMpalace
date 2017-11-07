package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class RoomInfoPageFunctionalTests extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        if (driver.getCurrentUrl().equals(BASEURL))startPage.clickOnRentPager();
        if (!driver.getCurrentUrl().contains("/rent/") && rentPage.checkIfPresentWatchAllRoomsLink()) rentPage.clickWatchAllRoomsLink();
        if (!driver.getCurrentUrl().contains("/rent/rent")) roomsRentPage.clickOnFirstRoomInTable();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='control esvg-zoom-in']")));
    }
    @Test
    public void returnToAllRoomsPage(){
        roomInfoPage.clickBackButton();
        Assert.assertTrue(roomsRentPage.checkIfPresentFirstRoomInTable());
    }
    @Test
    public void returnToMainPage(){
        roomInfoPage.clickHomeButton();
        Assert.assertTrue(driver.getCurrentUrl().equals(BASEURL));
    }
    @Test
    public void openReserveRoomPopUp(){
        roomInfoPage.clickReserveRoomButton();
        Assert.assertTrue(reserveRoomPopUp.checkIfPresentReservePopUp());
        reserveRoomPopUp.clickPopUpCloseButton();
    }
    @Test
    public void switchToGeneralPlanView(){
        roomInfoPage.clickSwitchPlanButton();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("#plan-large"));
    }
    @Test
    public void switchToLargePlanView(){
        roomInfoPage.clickSwitchPlanButton();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("#plan-common"));
    }
    @Test
    public void openPhotoPopUp(){
        roomInfoPage.openFirstPhotoInTheList();
        Assert.assertTrue(roomInfoPage.checkIfPresentPopUpCloseButton());
        roomInfoPage.clickPhotoPopUpCloseButton();
    }
    @Test
    public void openNextPhotoInSlider(){
        String startPhoto = roomInfoPage.getCurrentSliderPhotoName();
        if(roomInfoPage.checkIfPresentNextPhotoButton()){
            roomInfoPage.clickNextPhotoButton();
            String newPhoto = roomInfoPage.getCurrentSliderPhotoName();
            Assert.assertTrue(newPhoto != startPhoto);
        }
        else System.out.println("Only one photo is present in the list.");
    }
    @Test
    public void switchToNextPhotoInPopUp(){
        roomInfoPage.openFirstPhotoInTheList();
        String startPhoto = roomInfoPage.getCurrentPopUpPhotoName();
        roomInfoPage.clickPhotoPopUpNext();
        String newPhoto = roomInfoPage.getCurrentPopUpPhotoName();
        Assert.assertTrue(newPhoto != startPhoto);
        roomInfoPage.clickPhotoPopUpCloseButton();
    }
    @Test
    public void switchToPreviousPhotoInPopUp(){
        roomInfoPage.openFirstPhotoInTheList();
        String startPhoto = roomInfoPage.getCurrentPopUpPhotoName();
        roomInfoPage.clickPhotoPopUpPrevious();
        String newPhoto = roomInfoPage.getCurrentPopUpPhotoName();
        Assert.assertTrue(newPhoto != startPhoto);
        roomInfoPage.clickPhotoPopUpCloseButton();
    }
    @Test
    public void zoomInCommonPlan(){
        while (!driver.getCurrentUrl().endsWith("#plan-common")) { roomInfoPage.clickSwitchPlanButton(); }
        double oldScale = roomInfoPage.getCommonPlanScale();
        roomInfoPage.clickCommonZoomInButton();
        double newScale = roomInfoPage.getCommonPlanScale();
        Assert.assertTrue(newScale > oldScale);
    }
    @Test
    public void zoomResetCommonPlan(){
        while (!driver.getCurrentUrl().endsWith("#plan-common")) {
            roomInfoPage.clickSwitchPlanButton();
            driver.navigate().refresh();
        }
        double oldScale = roomInfoPage.getCommonPlanScale();
        roomInfoPage.clickCommonZoomInButton();
        roomInfoPage.clickCommonZoomInButton();
        roomInfoPage.clickCommonZoomResetButton();
        double newScale = roomInfoPage.getCommonPlanScale();
        Assert.assertEquals(newScale,oldScale);
    }
    @Test
    public void zoomOutCommonPlan(){
        while (!driver.getCurrentUrl().endsWith("#plan-common")) { roomInfoPage.clickSwitchPlanButton(); }
        double oldScale = roomInfoPage.getCommonPlanScale();
        roomInfoPage.clickCommonZoomInButton();
        roomInfoPage.clickCommonZoomOutButton();
        double newScale = roomInfoPage.getCommonPlanScale();
        Assert.assertEquals(newScale,oldScale);
    }
    @Test
    public void zoomInLargePlan(){
        while (!driver.getCurrentUrl().endsWith("#plan-large")) roomInfoPage.clickSwitchPlanButton();
        double oldScale = roomInfoPage.getLargePlanScale();
        roomInfoPage.clickLargeZoomInButton();
        double newScale = roomInfoPage.getLargePlanScale();
        Assert.assertTrue(newScale>oldScale);
    }
    @Test
    public void zoomResetLargePlan(){
        while (!driver.getCurrentUrl().endsWith("#plan-large")) {
            roomInfoPage.clickSwitchPlanButton();
            driver.navigate().refresh();
        }
        double oldScale = roomInfoPage.getLargePlanScale();
        roomInfoPage.clickLargeZoomInButton();
        roomInfoPage.clickLargeZoomInButton();
        roomInfoPage.clickLargeZoomResetButton();
        double newScale = roomInfoPage.getLargePlanScale();
        Assert.assertEquals(newScale,oldScale);
    }
    @Test
    public void zoomOutLargePlan(){
        while (!driver.getCurrentUrl().endsWith("#plan-large")) roomInfoPage.clickSwitchPlanButton();
        double oldScale = roomInfoPage.getLargePlanScale();
        roomInfoPage.clickLargeZoomInButton();
        roomInfoPage.clickLargeZoomOutButton();
        double newScale = roomInfoPage.getLargePlanScale();
        Assert.assertEquals(newScale,oldScale);
    }

}

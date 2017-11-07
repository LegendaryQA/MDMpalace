package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class RoomsRentFunctionalTests extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        if (driver.getCurrentUrl().equals(BASEURL))startPage.clickOnRentPager();
        if (!driver.getCurrentUrl().contains("/rent/") && rentPage.checkIfPresentWatchAllRoomsLink()) rentPage.clickWatchAllRoomsLink();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='list']/div[1]/div | //*[@id='map']/div[1]/nav")));
    }
    @Test
    public void returnToMainPage(){
        roomsRentPage.clickOnHomePageButton();
        Assert.assertTrue(driver.getCurrentUrl().equals(BASEURL));
    }
    @Test
    public void switchToMapView(){
        roomsRentPage.clickOnSwitchViewButton();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("#map"));
    }
    @Test
    public void switchToListView(){
        roomsRentPage.clickOnSwitchViewButton();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("#list"));
    }
    @Test
    public void zoomIn(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        double oldScale = roomsRentPage.getMapScale();
        roomsRentPage.clickZoomInButton();
        double newScale = roomsRentPage.getMapScale();
        Assert.assertTrue(newScale > oldScale);
    }
    @Test
    public void zoomReset(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        driver.navigate().refresh();
        double oldScale = roomsRentPage.getMapScale();
        roomsRentPage.clickZoomInButton();
        roomsRentPage.clickZoomInButton();
        roomsRentPage.clickZoomResetButton();
        double newScale = roomsRentPage.getMapScale();
        Assert.assertEquals(newScale,oldScale);
    }
    @Test
    public void zoomOut(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        double oldScale = roomsRentPage.getMapScale();
        roomsRentPage.clickZoomInButton();
        roomsRentPage.clickZoomOutButton();
        double newScale = roomsRentPage.getMapScale();
        Assert.assertEquals(newScale,oldScale);
    }
    @Test
    public void switchToSecondMapTab(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        roomsRentPage.clickOnSecondFloorTab();
        Assert.assertTrue(roomsRentPage.getCurrentFloorTabText().contentEquals(roomsRentPage.getSecondFloorTabText()));
    }
    @Test
    public void switchToThirdMapTab(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        roomsRentPage.clickOnThirdFloorTab();
        Assert.assertTrue(roomsRentPage.getCurrentFloorTabText().contentEquals(roomsRentPage.getThirdFloorTabText()));
    }
    @Test
    public void switchToFourthMapTab(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        roomsRentPage.clickOnFourthFloorTab();
        Assert.assertTrue(roomsRentPage.getCurrentFloorTabText().contentEquals(roomsRentPage.getFourthFloorTabText()));
    }
    @Test
    public void switchToPrimaryFirstMapTab(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        roomsRentPage.clickOnFirstFloorTab();
        Assert.assertTrue(roomsRentPage.getCurrentFloorTabText().contentEquals(roomsRentPage.getFirstFloorTabText()));
    }
    @Test
    public void checkCorrectMapIsDisplayedForPrimaryFirstMapTab(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        roomsRentPage.clickOnFirstFloorTab();
        Assert.assertTrue(roomsRentPage.isRightFloorMapDisplayed("1"));
    }
    @Test
    public void checkCorrectMapIsDisplayedForSecondMapTab(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        roomsRentPage.clickOnSecondFloorTab();
        Assert.assertTrue(roomsRentPage.isRightFloorMapDisplayed("2"));
    }
    @Test
    public void checkCorrectMapIsDisplayedForThirdMapTab(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        roomsRentPage.clickOnThirdFloorTab();
        Assert.assertTrue(roomsRentPage.isRightFloorMapDisplayed("3"));
    }
    @Test
    public void checkCorrectMapIsDisplayedForFourthMapTab(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        roomsRentPage.clickOnFourthFloorTab();
        Assert.assertTrue(roomsRentPage.isRightFloorMapDisplayed("4"));
    }
    @Test
    public void redirectToRoomDetails(){
        while (!driver.getCurrentUrl().endsWith("#list")) { roomsRentPage.clickOnSwitchViewButton(); }
        roomsRentPage.clickOnFirstRoomInTable();
        Assert.assertTrue(driver.getCurrentUrl().contains("/rent/rent"));
    }
    @AfterMethod
    public void cleanUp(){
        if(driver.getCurrentUrl().contains("/rent/rent")) driver.navigate().back();
    }
}

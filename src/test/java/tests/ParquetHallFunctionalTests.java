package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class ParquetHallFunctionalTests extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        if (driver.getCurrentUrl().equals(BASEURL))startPage.clickOnRentPager();
        if (!driver.getCurrentUrl().endsWith("/halls/parket.html") && rentPage.checkIfPresentWatchAllRoomsLink()) rentPage.clickParquetHallLink();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='subtitle2']//child::a[@href='http://www.mdmpalace.ru/halls/great.html']")));
    }
    @Test
    public void redirectToMainPage(){
        if(!parquetHallPage.checkIfPresentHomeButton())parquetHallPage.scrollUntilTitleIsVisible();
        parquetHallPage.clickHomeButton();
        Assert.assertTrue(driver.getCurrentUrl().equals(BASEURL));
    }
    @Test
    public void redirectToHallsPage(){
        if(!parquetHallPage.checkIfPresentBackButton())parquetHallPage.scrollUntilTitleIsVisible();
        parquetHallPage.clickBackButton();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/halls/"));
    }
    @Test
    public void openNextPhotoInGallery(){
        if (!parquetHallPage.checkIfPresentNextPhotoButton()) parquetHallPage.scrollUntilPhotoGalleryIsVisible();
        String oldState = parquetHallPage.getCurrentPhoto();
        parquetHallPage.clickNextPhotoButton();
        String newState = parquetHallPage.getCurrentPhoto();
        Assert.assertNotEquals(newState,oldState);
    }
    @Test
    public void openPreviousPhotoInGallery(){
        if (!parquetHallPage.checkIfPresentNextPhotoButton()) parquetHallPage.scrollUntilPhotoGalleryIsVisible();
        String oldState = parquetHallPage.getCurrentPhoto();
        parquetHallPage.clickPreviousPhotoButton();
        String newState = parquetHallPage.getCurrentPhoto();
        Assert.assertNotEquals(newState,oldState);
    }

    @Test
    public void planZoomIn(){
        if (!parquetHallPage.checkIfPresentZoomResetButton()) parquetHallPage.scrollUntilMapSeactionIsVisible();
        double oldScale = parquetHallPage.getMapScale();
        parquetHallPage.clickOnZoomInButton();
        double newScale = parquetHallPage.getMapScale();
        Assert.assertTrue(newScale > oldScale);
    }
    @Test
    public void planZoomOut(){
        if (!parquetHallPage.checkIfPresentZoomResetButton()) parquetHallPage.scrollUntilMapSeactionIsVisible();
        double oldScale = parquetHallPage.getMapScale();
        parquetHallPage.clickOnZoomInButton();
        parquetHallPage.clickOnZoomOutButton();
        double newScale = parquetHallPage.getMapScale();
        Assert.assertEquals(newScale,oldScale);
    }
    @Test
    public void planZoomReset(){
        driver.navigate().refresh();
        if (!parquetHallPage.checkIfPresentZoomResetButton()) parquetHallPage.scrollUntilMapSeactionIsVisible();
        double oldScale = parquetHallPage.getMapScale();
        parquetHallPage.clickOnZoomInButton();
        parquetHallPage.clickOnZoomInButton();
        parquetHallPage.clickOnZoomResetButton();
        double newScale = parquetHallPage.getMapScale();
        Assert.assertEquals(newScale,oldScale);
    }
    @Test
    public void switchToGreatHall(){
        if (!parquetHallPage.checkIfPresentTitle()) parquetHallPage.scrollUntilTitleIsVisible();
        parquetHallPage.clickSwitchToGreatHallLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/halls/great.html"));
    }
    @Test
    public void checkEmptyFieldsErrorsForRentRequest(){
        if (!parquetHallPage.checkIfPresentSendRentRequestButton()) parquetHallPage.scrollUntilRenRequestFieldsAreVisible();
        parquetHallPage.clickSendRentRequestButton();
        Assert.assertTrue(parquetHallPage.checkIfNameRentRequestError());
        Assert.assertTrue(parquetHallPage.checkIfPhoneRentRequestError());
        Assert.assertTrue(parquetHallPage.checkIfEmailRentRequestError());
        Assert.assertTrue(parquetHallPage.checkIfDateRentRequestError());
        Assert.assertTrue(parquetHallPage.checkIfFormatRentRequestError());
        Assert.assertTrue(parquetHallPage.checkIfGuestsRentRequestError());
        Assert.assertTrue(parquetHallPage.checkIfTimeRentRequestError());
    }

    @AfterMethod
    public void cleanUp(){
        if (!driver.getCurrentUrl().endsWith("/halls/parket.html")) driver.navigate().back();
    }

}

package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class GreatHallFunctionalTests extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        if (driver.getCurrentUrl().equals(BASEURL))startPage.clickOnRentPager();
        if (!driver.getCurrentUrl().endsWith("/halls/great.html") && rentPage.checkIfPresentWatchAllRoomsLink()) rentPage.clickGreatHallLink();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='subtitle2']//child::a[@href='http://www.mdmpalace.ru/halls/parket.html']")));
    }
    @Test
    public void redirectToMainPage(){
        greatHallPage.clickHomeButton();
        Assert.assertTrue(driver.getCurrentUrl().equals(BASEURL));
    }
    @Test
    public void redirectToHallsPage(){
        greatHallPage.clickBackButton();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/halls/"));
    }
    @Test
    public void openNextPhotoInGallery(){
        if (!greatHallPage.checkIfPresentNextPhotoButton()) greatHallPage.scrollUntilPhotoGalleryIsVisible();
        String oldState = greatHallPage.getCurrentPhoto();
        greatHallPage.clickNextPhotoButton();
        String newState = greatHallPage.getCurrentPhoto();
        Assert.assertNotEquals(newState,oldState);
    }
    @Test
    public void openPreviousPhotoInGallery(){
        if (!greatHallPage.checkIfPresentNextPhotoButton()) greatHallPage.scrollUntilPhotoGalleryIsVisible();
        String oldState = greatHallPage.getCurrentPhoto();
        greatHallPage.clickPreviousPhotoButton();
        String newState = greatHallPage.getCurrentPhoto();
        Assert.assertNotEquals(newState,oldState);
    }
    @Test
    public void switchToSchemaMap(){
        if (!greatHallPage.checkIfPresentPlanMapButton()) greatHallPage.scrollUntilMapSeactionIsVisible();
        greatHallPage.clickSchemaMapButton();
        Assert.assertTrue(greatHallPage.checkIfSchemaMapDispalyed());
    }
    @Test
    public void switchToThePlanMap(){
        if (!greatHallPage.checkIfPresentPlanMapButton()) greatHallPage.scrollUntilMapSeactionIsVisible();
        greatHallPage.clickPlanMapButton();
        Assert.assertTrue(greatHallPage.checkIfPlanMapDispalyed());
    }
    @Test
    public void planZoomIn(){
        if (!greatHallPage.checkIfPresentPlanMapButton()) greatHallPage.scrollUntilMapSeactionIsVisible();
        if(!greatHallPage.checkIfPlanViewIsActive()) greatHallPage.clickPlanMapButton();
        double oldScale = greatHallPage.getPlanMapScale();
        greatHallPage.clickOnPlanZoomInButton();
        double newScale = greatHallPage.getPlanMapScale();
        Assert.assertTrue(newScale > oldScale);
    }
    @Test
    public void planZoomOut(){
        if (!greatHallPage.checkIfPresentPlanMapButton()) greatHallPage.scrollUntilMapSeactionIsVisible();
        if(!greatHallPage.checkIfPlanViewIsActive()) greatHallPage.clickPlanMapButton();
        double oldScale = greatHallPage.getPlanMapScale();
        greatHallPage.clickOnPlanZoomInButton();
        greatHallPage.clickOnPlanZoomOutButton();
        double newScale = greatHallPage.getPlanMapScale();
        Assert.assertEquals(newScale,oldScale);
    }
    @Test
    public void planZoomReset(){
        driver.navigate().refresh();
        if (!greatHallPage.checkIfPresentPlanMapButton()) greatHallPage.scrollUntilMapSeactionIsVisible();
        if (!greatHallPage.checkIfPlanViewIsActive()) greatHallPage.clickPlanMapButton();
        double oldScale = greatHallPage.getPlanMapScale();
        greatHallPage.clickOnPlanZoomInButton();
        greatHallPage.clickOnPlanZoomInButton();
        greatHallPage.clickOnPlanZoomResetButton();
        double newScale = greatHallPage.getPlanMapScale();
        Assert.assertEquals(newScale,oldScale);
    }
    @Test
    public void schemaZoomIn(){
        if (!greatHallPage.checkIfPresentPlanMapButton()) greatHallPage.scrollUntilMapSeactionIsVisible();
        if (!greatHallPage.checkIfSchemaViewIsActive()) greatHallPage.clickSchemaMapButton();
        double oldScale = greatHallPage.getSchemaMapScale();
        greatHallPage.clickOnSchemaZoomInButton();
        double newScale = greatHallPage.getSchemaMapScale();
        Assert.assertTrue(newScale > oldScale);
    }
    @Test
    public void schemaZoomOut(){
        if (!greatHallPage.checkIfPresentPlanMapButton()) greatHallPage.scrollUntilMapSeactionIsVisible();
        if (!greatHallPage.checkIfSchemaViewIsActive()) greatHallPage.clickSchemaMapButton();
        double oldScale = greatHallPage.getSchemaMapScale();
        greatHallPage.clickOnSchemaZoomInButton();
        greatHallPage.clickOnSchemaZoomOutButton();
        double newScale = greatHallPage.getSchemaMapScale();
        Assert.assertEquals(newScale,oldScale);
    }
    @Test
    public void schemaZoomReset(){
        driver.navigate().refresh();
        if (!greatHallPage.checkIfPresentPlanMapButton()) greatHallPage.scrollUntilMapSeactionIsVisible();
        if(!greatHallPage.checkIfSchemaViewIsActive()) greatHallPage.clickSchemaMapButton();
        double oldScale = greatHallPage.getSchemaMapScale();
        greatHallPage.clickOnSchemaZoomInButton();
        greatHallPage.clickOnSchemaZoomInButton();
        greatHallPage.clickOnSchemaZoomResetButton();
        double newScale = greatHallPage.getSchemaMapScale();
        Assert.assertEquals(newScale,oldScale);
    }
    @Test
    public void switchToParquetHall(){
        if (!greatHallPage.checkIfPresentTitle()) greatHallPage.scrollUntilTitleIsVisible();
        greatHallPage.clickSwitchToParquetHallLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/halls/parket.html"));
    }
    @Test
    public void checkEmptyFieldsErrorsForRentRequest(){
        if (!greatHallPage.checkIfPresentSendRentRequestButton()) greatHallPage.scrollUntilRenRequestFieldsAreVisible();
        greatHallPage.clickSendRentRequestButton();
        Assert.assertTrue(greatHallPage.checkIfNameRentRequestError());
        Assert.assertTrue(greatHallPage.checkIfPhoneRentRequestError());
        Assert.assertTrue(greatHallPage.checkIfEmailRentRequestError());
        Assert.assertTrue(greatHallPage.checkIfDateRentRequestError());
        Assert.assertTrue(greatHallPage.checkIfFormatRentRequestError());
        Assert.assertTrue(greatHallPage.checkIfGuestsRentRequestError());
        Assert.assertTrue(greatHallPage.checkIfTimeRentRequestError());
    }

    @AfterMethod
    public void cleanUp(){
        if (!driver.getCurrentUrl().endsWith("/halls/great.html")) driver.navigate().back();
    }
}

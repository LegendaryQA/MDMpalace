package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class RentFunctionalTest extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        if (rentPage.checkIfPresentWatchAllRoomsLink() == false) {startPage.clickOnRentPager();}
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rent']/div[2]/div/div[1]/div[2]/div[1]")));
    }

    @Test
    public void openRentBlock(){
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/#rent"));
        Assert.assertTrue(rentPage.checkIfPresentWatchAllRoomsLink());
    }
    @Test
    public void openReserveRoomPopUp(){
        rentPage.focusOnFirstRoomInTheRoomList();
        rentPage.clickReserverRoomButton();
        Assert.assertTrue(reserveRoomPopUp.checkIfPresentReservePopUp());
        reserveRoomPopUp.clickPopUpCloseButton();
    }
    @Test
    public void redirectToWatchAllRoomsLink(){
        rentPage.clickWatchAllRoomsLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/rent/"));
    }
    @Test
    public void redirectToGreatHallLink(){
        rentPage.clickGreatHallLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/halls/great.html"));
    }
    @Test
    public void redirectToParquetHallLink(){
        rentPage.clickParquetHallLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/halls/parket.html"));
    }
    @Test
    public void redirectToGreatHallOrder(){
        rentPage.focusOnGreatHallLink();
        rentPage.clickGreatHallOrderLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/halls/great.html#gorent"));
    }
    @Test
    public void redirectToParquetHallOrder(){
        rentPage.focusOnParquetHallLink();
        rentPage.clickParquetHallOrderLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/halls/parket.html#gorent"));
    }
    @Test
    public void redirectToAllRoomsLink() {
        rentPage.scrollUntilAllRoomsIsVisible();
        rentPage.clickAllRoomsLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/rent/"));
    }
    @Test
    public void switchToGreatHallFromParquet(){
        rentPage.clickParquetHallLink();
        rentPage.switchToGreatHall();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/halls/great.html"));
    }
    @AfterMethod
    public void getInitialTestSetup(){
        while (!driver.getCurrentUrl().endsWith("/#rent")) {
            driver.navigate().back();
        }
    }
}

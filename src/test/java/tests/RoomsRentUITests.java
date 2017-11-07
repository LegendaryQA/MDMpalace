package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class RoomsRentUITests extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        if (driver.getCurrentUrl().equals(BASEURL))startPage.clickOnRentPager();
        if (!driver.getCurrentUrl().contains("/rent/") && rentPage.checkIfPresentWatchAllRoomsLink()) rentPage.clickWatchAllRoomsLink();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='list']/div[1]/div | //*[@id='map']/div[1]/nav")));
    }
    @Test
    public void checkPresenceOfHomePageButton(){
        Assert.assertTrue(roomsRentPage.checkIfPresentHomePageButton());
    }
    @Test
    public void checkPresenceOfTitle(){
        Assert.assertTrue(roomsRentPage.checkIfPresentTitle());
    }
    @Test
    public void checkListPresenceOfPhotoHeader(){
        Assert.assertTrue(roomsRentPage.checkIfPresentPhotoHeader());
    }
    @Test
    public void checkListPresenceOfFloorHeader(){
        Assert.assertTrue(roomsRentPage.checkIfPresentFloorHeader());
    }
    @Test
    public void checkListPresenceOfSpaceHeader(){
        Assert.assertTrue(roomsRentPage.checkIfPresentSpaceHeader());
    }
    @Test
    public void checkListPresenceOfRentTypeHeader(){
        Assert.assertTrue(roomsRentPage.checkIfPresentRentTypeHeader());
    }
    @Test
    public void checkListPresenceOfMonthPriceHeader(){
        Assert.assertTrue(roomsRentPage.checkIfPresentMonthPriceHeader());
    }
    @Test
    public void checkListPresenceOfYearPriceHeader(){
        Assert.assertTrue(roomsRentPage.checkIfPresentYearPriceHeader());
    }
    @Test
    public void checkPresenceOfListTile(){
        Assert.assertTrue(roomsRentPage.checkIfPresentListTitle());
    }
    @Test
    public void checkPresenceOfMapTitle(){
        Assert.assertTrue(roomsRentPage.checkIfPresentMapTitle());
    }
    @Test
    public void checkPresenceOfSwitchViewButton(){
        Assert.assertTrue(roomsRentPage.checkIfPresentSwitchViewButton());
    }
    @Test
    public void checkMapPresenceOfFirstFloorTab(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        Assert.assertTrue(roomsRentPage.checkIfPresentFirstFloorTab());
    }
    @Test
    public void checkMapPresenceOfSecondFloorTab(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        Assert.assertTrue(roomsRentPage.checkIfPresentSecondFloorTab());
    }
    @Test
    public void checkMapPresenceOfThirdFloorTab(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        Assert.assertTrue(roomsRentPage.checkIfPresentThirdFloorTab());
    }
    @Test
    public void checkMapPresenceOfFourthFloorTab(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        Assert.assertTrue(roomsRentPage.checkIfPresentFourthFloorTab());
    }
    @Test
    public void checkMapPresenceOfZoomInButton(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        Assert.assertTrue(roomsRentPage.checkIfPresentZoomInButton());
    }
    @Test
    public void checkMapPresenceOfZoomOutButton(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        Assert.assertTrue(roomsRentPage.checkIfPresentZoomOutButton());
    }
    @Test
    public void checkMapPresenceOfZoomResetButton(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        Assert.assertTrue(roomsRentPage.checkIfPresentZoomResetButton());
    }
    @Test
    public void checkTitleText(){
        Assert.assertEquals(roomsRentPage.getTitleText(),"Аренда нежилых помещений");
    }
    @Test
    public void checkListPhotoHeaderText(){
        Assert.assertEquals(roomsRentPage.getPhotoHeaderText(),"Фотография");
    }
    @Test
    public void checkListSpaceHeaderText(){
        Assert.assertEquals(roomsRentPage.getSpaceHeaderText(),"Площадь");
    }
    @Test
    public void checkListRentTypeHeaderText(){
        Assert.assertEquals(roomsRentPage.getRentTypeHeaderText(),"Тип аренды");
    }
    @Test
    public void checkListMonthPriceHeaderText(){
        Assert.assertTrue(roomsRentPage.getMonthPriceHeaderText().contains("Цена за месяц"));
        Assert.assertTrue(roomsRentPage.getMonthPriceHeaderText().contains("руб. за м"));
    }
    @Test
    public void checkListYearPriceHeaderText(){
        Assert.assertTrue(roomsRentPage.getYearPriceHeaderText().contains("Цена за год"));
        Assert.assertTrue(roomsRentPage.getYearPriceHeaderText().contains("руб. за м"));
    }
    @Test
    public void checkListFloorHeaderText(){
        Assert.assertEquals(roomsRentPage.getFloorHeaderText(),"Этаж");
    }
    @Test
    public void checkListTitleText(){
        Assert.assertEquals(roomsRentPage.getListTitleText(),"СПИСОК");
    }
    @Test
    public void checkMapTitleText(){
        Assert.assertEquals(roomsRentPage.getMapTitleText(),"КАРТА");
    }
    @Test
    public void checkListRoomNumberValueIsNotEmpty(){
        Assert.assertNotEquals(roomsRentPage.get1stLineNumberColumnValueText(),"");
    }
    @Test
    public void checkListRoomSpaceValueIsNotEmpty(){
        Assert.assertNotEquals(roomsRentPage.get1stLineSpaceColumnValueText(),"");
    }
    @Test
    public void checkListRoomMonthPriceValueIsNotEmpty(){
        Assert.assertNotEquals(roomsRentPage.get1stLineMonthPriceColumnValueText(),"");
    }
    @Test
    public void checkListRoomYearPriceValueIsNotEmpty(){
        Assert.assertNotEquals(roomsRentPage.get1stLineYearPriceColumnValueText(),"");
    }
    @Test
    public void checkListRoomFloorValueIsNotEmpty(){
        Assert.assertNotEquals(roomsRentPage.get1stLineFloorColumnValueText(),"");
    }
    @Test
    public void checkListRoomRentTypeValueIsNotEmpty(){
        Assert.assertNotEquals(roomsRentPage.get1stLineRentTypeColumnValueText(),"");
    }
    @Test
    public void checkMapFirstFloorTabText(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        Assert.assertEquals(roomsRentPage.getFirstFloorTabText(),"1 Этаж");
    }
    @Test
    public void checkMapSecondFloorTabText(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        Assert.assertEquals(roomsRentPage.getSecondFloorTabText(),"2 Этаж");
    }
    @Test
    public void checkMapThirdFloorTabText(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        Assert.assertEquals(roomsRentPage.getThirdFloorTabText(),"3 Этаж");
    }
    @Test
    public void checkMapFourthFloorTabText(){
        while (!driver.getCurrentUrl().endsWith("#map")) { roomsRentPage.clickOnSwitchViewButton(); }
        Assert.assertEquals(roomsRentPage.getFourthFloorTabText(),"4 Этаж");
    }

}

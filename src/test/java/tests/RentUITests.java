package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class RentUITests extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        if (rentPage.checkIfPresentWatchAllRoomsLink() == false) {
            startPage.clickOnRentPager();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rent']/div[2]/div/div[1]/div[1]")));
        }
    }
    @Test
    public void checkPresenceOfInnerTitle(){
        Assert.assertTrue(rentPage.checkIfPresentInnerTitle());
    }
    @Test
    public void checkPresenceOfInnerSubTitle(){
        Assert.assertTrue(rentPage.checkIfPresentInnerSubTitle());
    }
    @Test
    public void checkPresenceOfHallsTitle(){
        Assert.assertTrue(rentPage.checkIfPresentHallsTitle());
    }
    @Test
    public void checkPresenceOfGreatHallTitle(){
        Assert.assertTrue(rentPage.checkIfPresentGreatHallTitle());
    }
    @Test
    public void checkPresenceOfGreatHallDescription(){ Assert.assertTrue(rentPage.checkIfPresentGreatHallDescription()); }
    @Test
    public void checkPresenceOfGreatHallButton(){
        Assert.assertTrue(rentPage.checkIfPresentGreatHallButton());
    }
    @Test
    public void checkPresenceOfGreatHallOrderButton(){
        rentPage.focusOnGreatHallLink();
        Assert.assertTrue(rentPage.checkIfPresentGreatHallOrderButton());
    }
    @Test
    public void checkPresenceOfParquetHallTitle(){
        Assert.assertTrue(rentPage.checkIfPresentParquetHallTitle());
    }
    @Test
    public void checkPresenceOfParquetHallDescription(){ Assert.assertTrue(rentPage.checkIfPresentParquetHallDescription()); }
    @Test
    public void checkPresenceOfParquetHallButton(){
        Assert.assertTrue(rentPage.checkIfPresentParquetHallButton());
    }
    @Test
    public void checkPresenceOfParquetHallOrderButton(){
        rentPage.focusOnParquetHallLink();
        Assert.assertTrue(rentPage.checkIfPresentParquetHallOrderButton());
    }
    @Test
    public void checkPresenceOfAllRoomsTitle(){
        Assert.assertTrue(rentPage.checkIfPresentAllRoomsTitle());
    }
    @Test
    public void checkPresenceOfAllRoomsButton(){
        rentPage.scrollUntilAllRoomsIsVisible();
        Assert.assertTrue(rentPage.checkIfPresentAllRoomsButton());
        rentPage.scrollToTheTopOfRent();
    }
    @Test
    public void checkPresenceOfWatchAllRoomsButton(){
        Assert.assertTrue(rentPage.checkIfPresentWatchAllRoomsLink());
    }
    @Test
    public void checkPresenceOfCloseButton(){
        Assert.assertTrue(rentPage.checkIfPresentCloseButton());
    }
    @Test
    public void checkRentInnerTitle(){
        Assert.assertEquals(rentPage.getRentInnerTitle(),"Аренда");
    }
    @Test
    public void checkRentInnerSubTitle(){
        Assert.assertEquals(rentPage.getRentInnerSubTitle(),"ПЛОЩАДИ И СТАВКИ");
    }
    @Test
    public void checkRentWatchAllRoomsButtonText(){ Assert.assertEquals(rentPage.getRentWatchAllRoomsButtonText(),"ПОСМОТРЕТЬ ВСЕ"); }
    @Test
    public void checkRentHallsTitle(){
        Assert.assertEquals(rentPage.getRentHallsTitle(),"Концертные залы");
    }
    @Test
    public void checkRentGreatHallTitle(){ Assert.assertEquals(rentPage.getRentGreatHallTitleText(),"Большой зал / 1 800 мест"); }
    @Test
    public void checkRentGreatHallDescription(){ Assert.assertTrue(rentPage.getRentGreatHallDescriptionText().contains("СЦЕНА,")); }
    @Test
    public void checkRentGreatHallButtonText(){ Assert.assertEquals(rentPage.getRentGreatHallButtonText(),"ПОДРОБНЕЕ"); }
    @Test
    public void checkRentParquetHallTitle(){ Assert.assertTrue(rentPage.getRentParquetHallTitleText().contains("Паркетный зал / 1200 м")); }
    @Test
    public void checkRentParquetHallDescription(){ Assert.assertEquals(rentPage.getRentParquetHallDescriptionText(),"ФОЙЕ БОЛЬШОГО ЗАЛА"); }
    @Test
    public void checkRentParquetHallButtonText(){ Assert.assertEquals(rentPage.getRentParquetHallButtonText(),"ПОДРОБНЕЕ"); }
    @Test
    public void checkRentAllRoomsTitle(){
        Assert.assertEquals(rentPage.getRentAllRoomsTitle(),"Свободные площади");
    }
    @Test
    public void checkRentGreatHallOrderButtonText(){
        rentPage.focusOnGreatHallLink();
        Assert.assertEquals(rentPage.getRentGreatHallOrderButtonText(),"Отправить запрос");
    }
    @Test
    public void checkRentParquetHallOrderButtonText(){
        rentPage.focusOnParquetHallLink();
        Assert.assertEquals(rentPage.getRentParquetHallOrderButtonText(),"Отправить запрос");
    }
    @Test
    public void checkRentAllRoomsButtonText(){
        rentPage.scrollUntilAllRoomsIsVisible();
        Assert.assertEquals(rentPage.getRentAllRoomsButtonText(),"Все помещения");
    }
    @Test
    public void checkRoomOrderPopUp(){

    }
    @AfterMethod
    public void cleanUp(){
        if (rentPage.checkIfPresentWatchAllRoomsLink()== false){rentPage.scrollToTheTopOfRent();}
    }
}

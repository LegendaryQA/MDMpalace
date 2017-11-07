package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

import java.util.concurrent.TimeUnit;

public class AdvantagesUITests extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        if (!driver.getCurrentUrl().endsWith("/#advantages"))startPage.clickOnAdvantagesPager();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='advantages']/div[2]/div/div[5]/div[2]/div[3]/a")));
    }
    @Test
    public void checkPresenceOfInnerTitle(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentInnerTitle());
    }
    @Test
    public void checkPresenceOfInnerSubTitle(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentInnerSubTitle());
    }
    @Test
    public void checkPresenceOfDescription(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentDescription());
    }
    @Test
    public void checkPresenceOfMetroTitle(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentMetroTitle());
    }
    @Test
    public void checkPresenceOfMetroDescription(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentMetroDescription());
    }
    @Test
    public void checkPresenceOfMetroButton(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentMetroButton());
    }
    @Test
    public void checkPresenceOfTtkTitle(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentTtkTitle());
    }
    @Test
    public void checkPresenceOfTtkDescription(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentTtkDescription());
    }
    @Test
    public void checkPresenceOfTtkButton(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentTtkButton());
    }
    @Test
    public void checkPresenceOfParkingTitle(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentParkingTitle());
    }
    @Test
    public void checkPresenceOfParkingDescription(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentParkingDescription());
    }
    @Test
    public void checkPresenceOfParkingButton(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentParkingButton());
    }
    @Test
    public void checkPresenceOfParkTitle(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentParkTitle());
    }
    @Test
    public void checkPresenceOfParkDescription(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentParkDescription());
    }
    @Test
    public void checkPresenceOfParkButton(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentParkButton());
    }
    @Test
    public void checkPresenceOfMapLinkButton(){
        Assert.assertTrue(advantagesPage.checkIfPresentMapLink());
    }
    @Test
    public void checkPresenceOfMdmVideoLink(){
        Assert.assertTrue(advantagesPage.checkAdvanPresentMdmVideoButton());
    }
    @Test
    public void checkAdvantagesInnerTitle(){
        Assert.assertEquals(advantagesPage.getAdvantagesInnerTitleText(),"Преимущества");
    }
    @Test
    public void checkAdvantagesInnerSubTitle(){
        Assert.assertEquals(advantagesPage.getAdvantagesInnerSubTitleText(),"УДОБСТВА ДЛЯ ВСЕХ");
    }
    @Test
    public void checkAdvanatgesDescription(){
        Assert.assertEquals(advantagesPage.getAdvantagesDescriptionText(),"Место, которое подойдет для всех");
    }
    @Test
    public void checkAdvantagesLinkButtonText(){
        Assert.assertEquals(advantagesPage.getAdvantagesMapLinkButtonText(),"ПОСМОТРЕТЬ НА КАРТЕ");
    }
    @Test
    public void checkMetroTitle(){
        Assert.assertEquals(advantagesPage.getAdvantagesMetroTitleText(),"Станция метро Фрунзенская");
    }
    @Test
    public void checkMetroDecription(){
        Assert.assertEquals(advantagesPage.getAdvantagesMetroDescriptionText(),"УДОБНОЕ РАСПОЛОЖЕНИЕ РЯДОМ С МЕТРО");
    }
    @Test
    public void checkMetroButtonText(){
        Assert.assertEquals(advantagesPage.getAdvantagesMetroButtonText(),"НА ПЛАНЕ");
    }
    @Test
    public void checkTtkTitle(){
        Assert.assertEquals(advantagesPage.getAdvantagesTtkTitleText(),"Садовое кольцо и ТТК");
    }
    @Test
    public void checkTtkDescription(){
        Assert.assertEquals(advantagesPage.getAdvantagesTtkDescriptionText(),"ЛЕГКИЙ ДОСТУП НА МАШИНЕ С ЛЮБОГО ИЗ ТРАНСПОРТНЫХ КОЛЕЦ");
    }
    @Test
    public void checkTtkButtonText(){
        Assert.assertEquals(advantagesPage.getAdvantagesTtkButtonText(),"НА ПЛАНЕ");
    }
    @Test
    public void checkParkingTitle(){
        Assert.assertEquals(advantagesPage.getAdvantagesParkingTitleText(),"Удобная парковка");
    }
    @Test
    public void checkParkingDescription(){
        Assert.assertEquals(advantagesPage.getAdvantagesParkingDescriptionText(),"БОЛЬШАЯ И УДОБНАЯ, ВСЕГДА ЕСТЬ СВОБОДНЫЕ МЕСТА");
    }
    @Test
    public void checkParkingButtonText(){
        Assert.assertEquals(advantagesPage.getAdvantagesParkingButtonText(),"НА ПЛАНЕ");
    }
    @Test
    public void checkParkTitle(){
        Assert.assertEquals(advantagesPage.getAdvantagesParkTitleText(),"Парк Усадьба Трубецких в Хамовниках");
    }
    @Test
    public void checkParkDescription(){
        Assert.assertEquals(advantagesPage.getAdvantagesParkDescriptionText(),"ЗАМЕЧАТЕЛЬНОЕ МЕСТО ДЛЯ ПРОГУЛОК, ВСТРЕЧ И ОТДЫХА");
    }
    @Test
    public void checkParkButtonText(){
        Assert.assertEquals(advantagesPage.getAdvantagesParkButtonText(),"НА ПЛАНЕ");
    }
    @Test
    public void checkMdmVideoText(){
        Assert.assertEquals(advantagesPage.getAdvantagesMdmVideoButtonText(),"Видеознакомство с МДМ");
    }


}

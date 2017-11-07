package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

import java.util.concurrent.TimeUnit;

public class EventsUITests extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        if (!driver.getCurrentUrl().endsWith("/#events"))startPage.clickOnEventsPager();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='events']/div[2]/div[1]/div[1]/div[2]/div[1]")));
    }
    @Test
    public void checkPresenceOfInnerTitle(){
        Assert.assertTrue(eventsPage.checkIfPresentInnerTitle());
    }
    @Test
    public void checkPresenceOfInnerSubTitle(){
        Assert.assertTrue(eventsPage.checkIfPresentInnerSubTitle());
    }
    @Test
    public void checkPresenceOfMusicleTitle(){
        Assert.assertTrue(eventsPage.checkIfPresentMusicleTitle());
    }
    @Test
    public void checkPresenceOfMusicleDecription(){
        Assert.assertTrue(eventsPage.checkIfPresentMusicleDescription());
    }
    @Test
    public void checkPresenceOfVipLink(){
        Assert.assertTrue(eventsPage.checkIfPresentVipLink());
    }
    @Test
    public void checkEventsInnerTitle(){
        Assert.assertEquals(eventsPage.getEventsInnerTitleText(),"Афиша");
    }
    @Test
    public void checkEventsInnerSubTitle(){ Assert.assertEquals(eventsPage.getEventsInnerSubTitleText(),"МЕРОПРИЯТИЯ"); }
    @Test
    public void checkEventsMusicleTitle(){
        Assert.assertTrue(eventsPage.getEventsMusicleTitle().contains("Мюзикл"));
    }
    @Test
    public void checkEventsMusicleDescription(){ Assert.assertNotEquals(eventsPage.getEventsMusicleDescriptionText(),""); }
    @Test
    public void checkEventsEventButtonText(){
        Assert.assertEquals(eventsPage.getEventsEventButtonText(),"Подробнее");
    }
    @Test
    public void checkEventsVipLinkButtonText(){
        Assert.assertTrue(eventsPage.getEventsVipLinkImage());
    }


}

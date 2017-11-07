package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class HistoryUITests extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        if (!driver.getCurrentUrl().endsWith("/history/")){
            startPage.clickLeftMenuButton();
            startPage.clickMdmHistoryLink();
        }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='item-1']//h1")));
    }

    @Test
    public void checkPresenceOfLeftCornerTitle(){
        Assert.assertFalse(historyPage.checkIfPresentLeftCornerTitle());
    }
    @Test
    public void checkPresenceOfHistoryTitle(){
        Assert.assertTrue(historyPage.checkIfPresentHistoryTitle());
    }
    @Test
    public void checkPresenceOfHistoryIntro(){
        Assert.assertTrue(historyPage.checkIfPresentHistoryIntro());
    }
    @Test
    public void checkPresenceOfHistoryDescription(){
        Assert.assertTrue(historyPage.checkIfPresentHistoryDescription());
    }
    @Test
    public void checkPresenceOfHistoryBlock(){
        Assert.assertTrue(historyPage.checkIfPresentHistoryBlock());
    }
    @Test
    public void checkPresenceOfIdeaBlock(){
        Assert.assertTrue(historyPage.checkIfPresentIdeaBlock());
    }
    @Test
    public void checkPresenceOfMusicleBlock(){
        Assert.assertTrue(historyPage.checkIfPresentMusicleBlock());
    }
    @Test
    public void checkPresenceOfNextButton(){
        Assert.assertTrue(historyPage.checkIfPresentNextButton());
    }
    @Test
    public void checkPresenceOfPreviousButton(){
        Assert.assertFalse(historyPage.checkIfPresentPreviousButton());
    }
    @Test
    public void checkHistoryTitleText(){
        Assert.assertEquals(historyPage.getHistoryTitleText(),"История");
    }
    @Test
    public void checkHistoryIntroText(){
        Assert.assertEquals(historyPage.getHistoryIntroText(),"МДМ является особым символом Москвы. Расположенный в непосредственной близости от исторического центра, в 4-х км от Кремля, над станцией метро «Фрунзенская», МДМ является эпицентром культурной жизни столицы.");
    }
    @Test
    public void checkHistoryDescriptionText(){
        Assert.assertNotEquals(historyPage.getHistoryDescriptionText(),"");
    }
    @Test
    public void checkHistoryBlockText(){
        Assert.assertEquals(historyPage.getHistoryBlockText(),"История МДМ");
    }
    @Test
    public void checkIdeaBlockText(){
        Assert.assertEquals(historyPage.getIdeaBlockText(),"От идеи до наших дней");
    }
    @Test
    public void checkMusicleBlockText(){
        Assert.assertEquals(historyPage.getMusicleBlockText(),"Мюзиклы на сцене МДМ");
    }
}

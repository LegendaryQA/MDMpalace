package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class HistoryFunctionalTests extends BasicTestConditions {

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
    public void checkPreviousButtonAppearsAfterOpeningNextBlock(){
        historyPage.clickNext();
        Assert.assertTrue(historyPage.checkIfPresentPreviousButton());
    }
    @Test
    public void checkNextButtonIsHiddenOnTheLastBlock(){
        historyPage.clickNext();
        historyPage.clickNext();
        Assert.assertFalse(historyPage.checkIfPresentNextButton());
    }
    @Test
    public void openNextBlockByButton(){
        String oldBlock = historyPage.getCurrentBlockText();
        historyPage.clickNext();
        String newBlock = historyPage.getCurrentBlockText();
        Assert.assertNotEquals(newBlock,oldBlock);
    }
    @Test
    public void openPreviousBlockByButton(){
        String oldBlock = historyPage.getCurrentBlockText();
        historyPage.clickPrevious();
        String newBlock = historyPage.getCurrentBlockText();
        Assert.assertNotEquals(newBlock,oldBlock);
    }
    @Test
    public void openHistoryInfoByClickOnBlock(){
        if(historyPage.getCurrentBlockText() == historyPage.getHistoryBlockText()) historyPage.clickNext();
        historyPage.clickOnHistoryBlock();
        Assert.assertTrue(historyPage.checkIfPresentHistoryTitle());
    }
    @Test
    public void openIdeaInfoByClickOnBlock(){
        if(historyPage.getCurrentBlockText() == historyPage.getIdeaBlockText()) historyPage.clickNext();
        historyPage.clickOnIdeaBlock();
        Assert.assertTrue(historyPage.checkIfPresentLeftCornerTitle());
        Assert.assertTrue(historyPage.checkIfPresentIdeaTitle());
    }
    @Test
    public void openMusicleInfoByClickOnBlock(){
        if(historyPage.getCurrentBlockText() == historyPage.getMusicleBlockText()) historyPage.clickPrevious();
        historyPage.clickOnMusicleBlock();
        Assert.assertTrue(historyPage.checkIfPresentLeftCornerTitle());
        Assert.assertTrue(historyPage.checkIfPresentMusicleTitle());
    }
    @Test
    public void verifyIdeaTitleText(){
        if(historyPage.getCurrentBlockText() != historyPage.getIdeaBlockText()) historyPage.clickOnIdeaBlock();
        Assert.assertEquals(historyPage.getIdeaTitleText(),"От идеи до наших дней");
    }
    @Test
    public void verifyIdeaIntroText(){
        if(historyPage.getCurrentBlockText() != historyPage.getIdeaBlockText()) historyPage.clickOnIdeaBlock();
        Assert.assertEquals(historyPage.getIdeaIntroText(),"Уникальное сооружение, расположенное в центральной части города, всегда привлекало внимание, не только своей фундаментальностью, но и безграничными возможностями, которые открывает Дворец.  Создатели этого грандиозного строения изначально задумывали его, как место для времяпрепровождения москвичей и гостей столицы.");
    }
    @Test
    public void verifyIdeaDescription(){
        if(historyPage.getCurrentBlockText() != historyPage.getIdeaBlockText()) historyPage.clickOnIdeaBlock();
        Assert.assertNotEquals(historyPage.getIdeaDescription1Text(),"");
        Assert.assertNotEquals(historyPage.getIdeaDescription2Text(),"");
        Assert.assertNotEquals(historyPage.getIdeaDescription3Text(),"");
    }
    @Test
    public void verifyMusicleTitleText(){
        if(historyPage.getCurrentBlockText() != historyPage.getMusicleBlockText()) historyPage.clickOnMusicleBlock();
        Assert.assertEquals(historyPage.getMusicleTitleText(),"Мюзиклы на сцене МДМ");
    }
    @Test
    public void verifyMusicleIntroText(){
        if(historyPage.getCurrentBlockText() != historyPage.getMusicleBlockText()) historyPage.clickOnMusicleBlock();
        Assert.assertEquals(historyPage.getMusicleIntroText(),"С 2002 г. Большой зал МДМ стал использоваться в качестве прокатной площадки мюзиклов «42-я улица» (2002) и «12 стульев» (2003—2004). C 2005 года в МДМ проходят мюзиклы международной театральной компании «Стейдж Энтертейнмент»: «Кошки» (2005—2006), «MAMMA MIA!» (2006 —2008, 2012—2013), «Красавица и чудовище» (2008—2010), «Zorro» (2010—2011), «Звуки музыки» (2011—2012), «Чикаго» (2013—2014), «Призрак оперы» (2014—2016), «Бал вампиров» (2016—2017).");
    }
    @Test
    public void verifyMusicleDescription(){
        if(historyPage.getCurrentBlockText() != historyPage.getMusicleBlockText()) historyPage.clickOnMusicleBlock();
        Assert.assertNotEquals(historyPage.getMusicleDescriptionText(),"");
    }
    @Test
    public void verifyMusicleBuyTicketButton(){
        if(historyPage.getCurrentBlockText() != historyPage.getMusicleBlockText()) historyPage.clickOnMusicleBlock();
        Assert.assertTrue(historyPage.checkIfPresentBuyTicketButton());
        Assert.assertEquals(historyPage.getBuyTicketButtonText(),"Купить билет");
    }
    @Test
    public void redirectToEvent(){
        if(historyPage.getCurrentBlockText() != historyPage.getMusicleBlockText()) historyPage.clickOnMusicleBlock();
        historyPage.clickOnBuyTicketButton();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/event/"));
    }

    @AfterMethod
    public void cleanUp(){
        if (!driver.getCurrentUrl().endsWith("/history/"))driver.navigate().back();
    }

}

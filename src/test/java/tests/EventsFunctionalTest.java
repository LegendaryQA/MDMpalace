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

import static tools.UsefullFunctions.closeNonUsefullTabs;
import static tools.UsefullFunctions.switchToNewTab;

public class EventsFunctionalTest extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        if (!driver.getCurrentUrl().endsWith("/#events"))startPage.clickOnEventsPager();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='events']/div[2]/div[1]/div[1]/div[2]/div[1]")));
    }

    @Test
    public void openEventsBlock(){
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/#events"));
        Assert.assertTrue(eventsPage.checkIfPresentEventLink());
    }

    @Test
    public void redirectToEventInfo(){
        eventsPage.clickEventLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/event/"));
    }
    @Test
    public void redirectToEventVIPInfo(){
        eventsPage.clickVipLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/event/#gotorasp"));
    }
    @Test
    public void redirectToBuyVipService(){
        eventsPage.clickVipLink();
        eventsPage.clickBuyVipServiceLink();
        switchToNewTab();
        Assert.assertTrue(driver.getCurrentUrl().startsWith("http://www.parter.ru/"));
    }

    @AfterMethod
    public void getInitialTestSetup(){
        if (!driver.getCurrentUrl().startsWith(BASEURL)){ closeNonUsefullTabs(); }
        if (!driver.getCurrentUrl().endsWith("/#events")) {driver.navigate().back(); }
        if (eventsPage.checkIfPresentEventLink() == false) { startPage.clickOnEvents();}
    }

}

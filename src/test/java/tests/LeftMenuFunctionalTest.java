package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class LeftMenuFunctionalTest extends BasicTestConditions{

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        startPage.clickLeftMenuButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@class='h-overlay__menu']/ul/li//child::a[@href='/index/']")));
    }

    @Test
    public void redirectToMdmHistory(){
        startPage.clickMdmHistoryLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/history/"));
    }

    @Test
    public void redirectToConcertHallsRent(){
        startPage.clickHallsRentLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/halls/"));
    }

    @Test
    public void redirectToEventsLink(){
        startPage.clickEventsLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/event/"));
    }

    @Test
    public void redirectToInfrastructureLink(){
        startPage.clickInfrastructureLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/infrastructure/"));
    }

    @Test
    public void redirectToRoomsRentLink(){
        startPage.clickRoomsRentLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/rent/"));
    }

    @Test
    public void redirectToPartnersLink(){
        startPage.clickPartnersLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/partners/"));
    }

    @Test
    public void redirectToContactsLink(){
        startPage.clickContactsLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/contacts/"));
    }

    @Test
    public void redirectToMainPage(){
        startPage.clickMainPageLink();
        Assert.assertEquals(driver.getCurrentUrl(), BASEURL );
    }

}

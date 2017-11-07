package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

import static tools.UsefullFunctions.closeNonUsefullTabs;
import static tools.UsefullFunctions.switchToNewTab;

public class ContactsFunctionalTest extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        if (!driver.getCurrentUrl().endsWith("/#contacts"))startPage.clickOnContactsPager();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='contacts']/div[2]/div[1]/div[2]/div[1]/div[1]/i")));
    }

    @Test
    public void openContactsBlock(){
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/#contacts"));
        Assert.assertTrue(contactsPage.checkIfPresentGoogleLink());
    }

    @Test
    public void redirectToGoogleMaps(){
        contactsPage.goToGoogleMaps();
        switchToNewTab();
        Assert.assertTrue(driver.getCurrentUrl().startsWith("https://www.google.ru/maps/"));
    }

    @AfterMethod
    public void getInitialTestSetup(){
        if (!driver.getCurrentUrl().startsWith(BASEURL)){ closeNonUsefullTabs(); }
        if (!driver.getCurrentUrl().endsWith("/#contacts")) {driver.navigate().back(); }
        if (contactsPage.checkIfPresentGoogleLink() == false) { startPage.clickOnContactsPager();}
    }
}
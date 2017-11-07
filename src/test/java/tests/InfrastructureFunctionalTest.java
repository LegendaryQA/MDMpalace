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

public class InfrastructureFunctionalTest extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        if (!driver.getCurrentUrl().endsWith("/#infrastructure"))startPage.clickOnInfrastructurePager();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='infrastructure']/div[1]/div[2]/div")));
    }

    @Test
    public void openInfrastructureBlock(){
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/#infrastructure"));
        Assert.assertTrue(infrastructurePage.checkIfPresentAllArendatorsTab());
    }

    @Test
    public void redirectToAllArendatorsTGILink(){
        infrastructurePage.goToAllArendatorsTGILink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl(), "http://tgifridays.ru/" );
    }

    @Test
    public void redirectToRestaurantStarBucksLink(){
        infrastructurePage.goToRestaurantsSubTab();
        infrastructurePage.goToRestaurantStarBucksLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.starbucks.com/" );
    }

    @Test
    public void redirectToMusicleLink(){
        infrastructurePage.goToMusicleSubTab();
        infrastructurePage.goToMusicleLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl().toString(), "http://stage-musical.ru/" );
    }

    @Test
    public void redirectToSportPilatesLink(){
        infrastructurePage.goToHealthSportSubTab();
        infrastructurePage.goToSportPilatesLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl().toString(), "https://pilatesplus.studio/" );
    }

    @Test
    public void redirectToShopEliteLink(){
        infrastructurePage.goToShopsSubTab();
        infrastructurePage.goToShopElitLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl().toString(), "http://tdelit.ru/" );
    }

    @Test
    public void redirectToBankTrustLink() {
        infrastructurePage.goToBanksSubTab();
        infrastructurePage.goToBankTrustLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl().toString(), "http://www.trust.ru/" );
    }

    @Test
    public void redirectToServiceDelovarLink() {
        infrastructurePage.goToServicesSubTab();
        infrastructurePage.goToServicesDelovarLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl().toString(), "http://coworking-delovar.ru/" );
    }

    @AfterMethod
    public void getInitialTestSetup(){
        if (!driver.getCurrentUrl().startsWith(BASEURL)){ closeNonUsefullTabs(); }
    }

}

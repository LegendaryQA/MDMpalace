package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;
import static tools.UsefullFunctions.closeNonUsefullTabs;
import static tools.UsefullFunctions.switchToNewTab;

public class StartPageFunctionalTest extends BasicTestConditions {


    @Test
    public void closeAdvantagesBlock(){
        advantagesPage.clickOnAdvantages();
        advantagesPage.clickAdvantagesCloseButton();
        Assert.assertFalse(advantagesPage.checkIfPresentMapLink());
    }
    @Test
    public void closeRestaurantsBlock(){
        startPage.clickOnRestaurants();
        restaurantsPage.clickRestaurantsCloseButton();
        Assert.assertFalse(restaurantsPage.checkIfPresentRestaurantsLink());
    }
    @Test
    public void closeEventsBlock(){
        startPage.clickOnEvents();
        eventsPage.clickEventsCloseButton();
        Assert.assertFalse(eventsPage.checkIfPresentEventLink());
    }
    @Test
    public void closeRentBlock(){
        startPage.clickOnRent();
        rentPage.clickRentCloseButton();
        Assert.assertFalse(rentPage.checkIfPresentWatchAllRoomsLink());
    }
    @Test
    public void redirectToMediaStormLink(){
        startPage.goToMediaStormWebSite();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl().toString(), "http://www.media-storm.ru/" );
    }
    @Test
    public void redirecToVK(){
        startPage.clickVkLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl().toString(), "https://vk.com/mdmpalace" );
    }
    @Test
    public void redirecToFacebook(){
        startPage.clickFaceBookLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl().toString(), "https://www.facebook.com/mdmpalace" );
    }
    @Test
    public void redirecToTwitter(){
        startPage.clickTwitterLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl().toString(), "https://twitter.com/mdmpalace" );
    }
    @Test
    public void redirecToOK(){
        startPage.clickOkLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl().toString(), "https://ok.ru/group/53369862946952" );
    }
    @Test
    public void redirecToInstagram(){
        startPage.clickInstagramLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl().toString(), "https://www.instagram.com/mdmpalace/" );
    }

    @AfterMethod
    public void cleanUp(){
        if (!driver.getCurrentUrl().startsWith(BASEURL)){ closeNonUsefullTabs(); }
        if (driver.getCurrentUrl().endsWith("/#infrastructure")||driver.getCurrentUrl().endsWith("/#contacts")) {startPage.clickOnStartPager();}
    }

}

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


public class RestaurantsFunctionalTest extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        if (!driver.getCurrentUrl().endsWith("/#restaurants"))startPage.clickOnRestaurantsPager();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='restaurants']/div[2]/div/div[1]/div[2]/div[1]")));
    }

    @Test
    public void openRestaurantsBlock(){
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/#restaurants"));
        Assert.assertTrue(restaurantsPage.checkIfPresentRestaurantsLink());
    }

    @Test
    public void redirectToRestaurantsMap(){
        restaurantsPage.clickAllRestaurantsLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/infrastructure/renters/#1"));
    }

    @Test
    public void redirectToCoffeTimeWebSite(){
        restaurantsPage.clickCoffeeTimeLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.24coffee.ru/" );
    }

    @Test
    public void redirectToFudaWebSite(){
        restaurantsPage.clickFudaLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl(), "http://fuda.su/" );
    }

    @Test
    public void redirectToPrazdnikVkusaWebSite(){
        restaurantsPage.clickPrazdnikVkusaLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl(), "http://www.prazdnikvkusa.ru/" );
    }

    @Test
    public void redirectToStarBucksWebSite(){
        restaurantsPage.clickStarBucksLink();
        switchToNewTab();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.starbucks.com/" );;
    }

    @Test
    public void redirectToAllArendatorsList() {
        restaurantsPage.clickAllArendatorsLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/infrastructure/renters/"));
    }


    @AfterMethod
    public void getInitialTestSetup(){
        if (!driver.getCurrentUrl().startsWith(BASEURL)){ closeNonUsefullTabs(); }
        if (!driver.getCurrentUrl().endsWith("/#restaurants")) {driver.navigate().back(); }
        if (restaurantsPage.checkIfPresentRestaurantsLink() == false) {startPage.clickOnRestaurants();}
    }

}

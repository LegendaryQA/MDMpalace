package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class RestaurantsUITests extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        if (!driver.getCurrentUrl().endsWith("/#restaurants")){
            startPage.clickOnRestaurantsPager();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='restaurants']/div[2]/div/div[1]/div[2]/div[1]")));
        }
    }

    @Test
    public void checkPresenceOfInnerTitle(){
        Assert.assertTrue(restaurantsPage.checkIfPresentInnerTitle());
    }
    @Test
    public void checkPresenceOfMostPopularTitle(){
        Assert.assertTrue(restaurantsPage.checkIfPresentMostPopularTitle());
    }
    @Test
    public void checkPresenceOfCoffeeTimeTitle(){
        Assert.assertTrue(restaurantsPage.checkIfPresentCoffeeTimeTitle());
    }
    @Test
    public void checkPresenceOfCoffeeTimeDescription(){
        Assert.assertTrue(restaurantsPage.checkIfPresentCoffeeTimeDescription());
    }
    @Test
    public void checkPresenceOfCoffeeTimeLink(){
        Assert.assertTrue(restaurantsPage.checkIfPresentCoffeeTimeButton());
    }
    @Test
    public void checkPresenceOfFudaTitle(){
        Assert.assertTrue(restaurantsPage.checkIfPresentFudaTitle());
    }
    @Test
    public void checkPresenceOfFudaDescription(){
        Assert.assertTrue(restaurantsPage.checkIfPresentFudaDescription());
    }
    @Test
    public void checkPresenceOfFudaLink(){
        Assert.assertTrue(restaurantsPage.checkIfPresentFudaButton());
    }
    @Test
    public void checkPresenceOfVkusaTitle(){
        Assert.assertTrue(restaurantsPage.checkIfPresentVkusaTitle());
    }
    @Test
    public void checkPresenceOfVkusaDescription(){
        Assert.assertTrue(restaurantsPage.checkIfPresentVkusaDescription());
    }
    @Test
    public void checkPresenceOfVkusaLink(){
        Assert.assertTrue(restaurantsPage.checkIfPresentVkusaButton());
    }
    @Test
    public void checkPresenceOfStarBucksTitle(){
        Assert.assertTrue(restaurantsPage.checkIfPresentStarBucksTitle());
    }
    @Test
    public void checkPresenceOfStarBucksDescription(){
        Assert.assertTrue(restaurantsPage.checkIfPresentStarBucksDescription());
    }
    @Test
    public void checkPresenceOfStarBucksLink(){
        Assert.assertTrue(restaurantsPage.checkIfPresentStarBucksButton());
    }
    @Test
    public void checkPresenceOfAllArendatorsButton(){
        Assert.assertTrue(restaurantsPage.checkIfPresentAllArendatorsButton());
    }
    @Test
    public void checkPresenceOfRestaurantsLink(){
        Assert.assertTrue(restaurantsPage.checkIfPresentRestaurantsLink());
    }
    @Test
    public void checkRestInnerTitle(){
        Assert.assertEquals(restaurantsPage.getRestInnerTitle(),"Рестораны");
    }
    @Test
    public void checkRestMostPopularTitle(){
        Assert.assertEquals(restaurantsPage.getRestMostPopularTitle(),"Самые популярные");
    }
    @Test
    public void checkRestAllRestsButtonText(){
        Assert.assertEquals(restaurantsPage.getRestAllRestsButtonText(),"ПОСМОТРЕТЬ ВСЕ");
    }
    @Test
    public void checkRestCoffeTimeTitle(){
        Assert.assertEquals(restaurantsPage.getRestCoffeTimeTitle(),"Кофе-Тайм");
    }
    @Test
    public void checkRestCoffeTimeDescription(){
        Assert.assertEquals(restaurantsPage.getRestCoffeTimeDescription(),"РЕСТОРАН");
    }
    @Test
    public void checkRestCoffeTimeButtonText(){
        Assert.assertEquals(restaurantsPage.getRestCoffeTimeButtonText(),"ПОДРОБНЕЕ");
    }
    @Test
    public void checkRestFudaTitle(){
        Assert.assertEquals(restaurantsPage.getRestFudaTitle(),"ФУДА");
    }
    @Test
    public void checkRestFudaDescription(){
        Assert.assertEquals(restaurantsPage.getRestFudaDescription(),"РЕСТОРАН КИТАЙСКОЙ КУХНИ");
    }
    @Test
    public void checkRestFudaButtonText(){
        Assert.assertEquals(restaurantsPage.getRestFudaButtonText(),"ПОДРОБНЕЕ");
    }
    @Test
    public void checkRestVkusaTitle(){
        Assert.assertEquals(restaurantsPage.getRestVkusaTitle(),"Праздник вкуса");
    }
    @Test
    public void checkRestVkusaDescription(){
        Assert.assertEquals(restaurantsPage.getRestVkusaDescription(),"ТЕАТРАЛЬНЫЙ БУФЕТ");
    }
    @Test
    public void checkRestVkusaButtonText(){
        Assert.assertEquals(restaurantsPage.getRestVkusaButtonText(),"ПОДРОБНЕЕ");
    }
    @Test
    public void checkRestStarBucksTitle(){
        Assert.assertEquals(restaurantsPage.getRestStarBucksTitle(),"Starbucks");
    }
    @Test
    public void checkRestStarBucksDescription(){
        Assert.assertEquals(restaurantsPage.getRestStarBucksDescription(),"РЕСТОРАН");
    }
    @Test
    public void checkRestStarBucksButtonText(){
        Assert.assertEquals(restaurantsPage.getRestStarBucksButtonText(),"ПОДРОБНЕЕ");
    }
    @Test
    public void checkRestAlLArendatorsButtonText(){
        Assert.assertEquals(restaurantsPage.getRestAllArendatorsButtonText(),"Все арендаторы");
    }
}

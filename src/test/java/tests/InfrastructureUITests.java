package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

public class InfrastructureUITests extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        if (!driver.getCurrentUrl().endsWith("/#infrastructure"))startPage.clickOnInfrastructurePager();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='infrastructure']/div[1]/div[2]/div")));
    }
    @Test
    public void checkInfrasTitleText(){
        Assert.assertEquals(infrastructurePage.getInfraTitleText(),"Инфраструктура");
    }
    @Test
    public void checkInfrasAllTabText(){
        Assert.assertEquals(infrastructurePage.getInfraAllTabText(),"Все арендаторы");
    }
    @Test
    public void checkInfrasRestaurantsTabText(){ Assert.assertEquals(infrastructurePage.getInfraRestsTabText(),"Рестораны"); }
    @Test
    public void checkInfrasMusicleTabText(){
        Assert.assertEquals(infrastructurePage.getInfraMusicleTabText(),"Мюзикл");
    }
    @Test
    public void checkInfrasHealthSportTabText(){
        Assert.assertEquals(infrastructurePage.getInfraHealthSportTabText(),"Здоровье и спорт");
    }
    @Test
    public void checkInfrasShopsTabText(){
        Assert.assertEquals(infrastructurePage.getInfraShopsTabText(),"Магазины");
    }
    @Test
    public void checkInfrasBanksTabText(){
        Assert.assertEquals(infrastructurePage.getInfraBanksTabText(),"Банки");
    }
    @Test
    public void checkInfrasServicesTabText(){
        Assert.assertEquals(infrastructurePage.getInfraServicesTabText(),"Услуги");
    }
    @Test
    public void checkIfSearchIsPresent(){
        Assert.assertTrue(infrastructurePage.checkIfSearchFieldIsPresent());
        Assert.assertTrue(infrastructurePage.checkIfSearchButtonIsPresent());
    }
    @Test
    public void checkPresenceOfTitle(){Assert.assertTrue(infrastructurePage.checkIfPresentTitle());}
    @Test
    public void checkPresenceOfAllTab(){Assert.assertTrue(infrastructurePage.checkIfPresentAllArendatorsTab());}
    @Test
    public void checkPresenceOfMusicleTab(){Assert.assertTrue(infrastructurePage.checkIfPresentMusicleTab());}
    @Test
    public void checkPresenceOfHealthSportTab(){Assert.assertTrue(infrastructurePage.checkIfPresentHealthSportTab());}
    @Test
    public void checkPresenceOfShopsTab(){Assert.assertTrue(infrastructurePage.checkIfPresentShopsTab());}
    @Test
    public void checkPresenceOfRestaurantsTab(){Assert.assertTrue(infrastructurePage.checkIfPresentRestaurantsTab());}
    @Test
    public void checkPresenceOfServicesTab(){Assert.assertTrue(infrastructurePage.checkIfPresentServicesTab());}
    @Test
    public void checkPresenceOfBanksTab(){Assert.assertTrue(infrastructurePage.checkIfPresentBanksTab());}

}

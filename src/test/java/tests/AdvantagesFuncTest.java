package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tools.BasicTestConditions;
import static tools.UsefullFunctions.switchToMainTab;
import static tools.UsefullFunctions.switchToNewTab;


public class AdvantagesFuncTest extends BasicTestConditions {

    @BeforeMethod
    public void prepareTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        if (!driver.getCurrentUrl().endsWith("/#advantages"))startPage.clickOnAdvantagesPager();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='advantages']/div[2]/div/div[5]/div[2]/div[3]/a")));
    }

    @Test
    public void openAdvantagesBlock(){
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/#advantages"));
        Assert.assertTrue(advantagesPage.checkIfPresentMapLink());
    }

    @Test
    public void redirectToAdvantagesMap(){
        advantagesPage.clickAdvantagesMapLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/contacts/"));
    }

    @Test
    public void redirectToMetroMap(){
        advantagesPage.clickMetroLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/contacts/#marker-metro"));
    }

    @Test
    public void redirectToTtkMap(){
        advantagesPage.clickTtkLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/contacts/#marker-ttk"));
    }

    @Test
    public void redirectToParkingMap(){
        advantagesPage.clickParkingLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/contacts/#marker-parking"));
    }

    @Test
    public void redirectToParkMap(){
        advantagesPage.clickParkLink();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/contacts/#marker-park"));
    }

    @Test
    public void redirectToMdmVideo(){
        advantagesPage.clickMdmLink();
        switchToNewTab();
        Assert.assertTrue(driver.getCurrentUrl().endsWith("/netcat_files/MDM.mp4"));
        driver.close();
        switchToMainTab();
    }

    @AfterMethod
    public void getInitialTestSetup(){
        if (!driver.getCurrentUrl().endsWith("/#advantages")) {driver.navigate().back(); }
        if (advantagesPage.checkIfPresentMapLink() == false) { startPage.clickOnAdvantages();}
    }
}

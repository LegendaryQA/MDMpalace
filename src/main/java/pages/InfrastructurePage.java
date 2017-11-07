package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InfrastructurePage extends StartPage {
    public InfrastructurePage(WebDriver driver) {
        super(driver);
    }
    private void waitForElementToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    private void waitUntilVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    private void Wait(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /** INFRASTRUCTURE BLOCK BUTTONS AND ACTIONS */
    @FindBy(xpath = "//nav[@class='tabs tablet-hide']/ul/li[1]")
    private WebElement allArendatorsTab;
    @FindBy (xpath = "//div[@class='org__more']/a[@href='http://tgifridays.ru/']")
    private WebElement allArendatorsTGILink;
    @FindBy (xpath="//nav[@class='tabs tablet-hide']/ul/li[2]")
    private WebElement restaurantsTab;
    @FindBy (xpath = "//div[@class='org__more']/a[@href='http://www.starbucks.com/']")
    private WebElement restaurantStarBucksLink;
    @FindBy (xpath="//nav[@class='tabs tablet-hide']/ul/li[3]")
    private WebElement musicleTab;
    @FindBy (xpath = "//div[@class='org__more']/a[@href='http://stage-musical.ru/']")
    private WebElement musicleLink;
    @FindBy (xpath="//nav[@class='tabs tablet-hide']/ul/li[4]")
    private WebElement healthSportTab;
    @FindBy (xpath = "//div[@class='org__more']/a[@href='http://pilatesmdm.ru/']")
    private WebElement sportPilatesLink;
    @FindBy (xpath="//nav[@class='tabs tablet-hide']/ul/li[5]")
    private WebElement shopsTab;
    @FindBy (xpath = "//div[@class='org__more']/a[@href='http://tdelit.ru/']")
    private WebElement shopElitLink;
    @FindBy (xpath="//nav[@class='tabs tablet-hide']/ul/li[6]")
    private WebElement banksTab;
    @FindBy (xpath = "//div[@class='org__more']/a[@href='http://www.trust.ru/']")
    private WebElement bankTrustLink;
    @FindBy (xpath="//nav[@class='tabs tablet-hide']/ul/li[7]")
    private WebElement servicesTab;
    @FindBy (xpath = "//div[@class='org__more']/a[@href='http://coworking-delovar.ru/']")
    private WebElement servicesDelovarLink;

    @FindBy (xpath = "//*[@id='infrastructure']//descendant::div[@class='panel__title2 nmf']")
    private WebElement infrasTitle;
    @FindBy (xpath = "//input[@id='renters_search']")
    private WebElement infraSearchField;
    @FindBy (xpath = "//button[@type='submit']")
    private WebElement infraSearchButton;

    public void goToAllArendatorsSubTab (){
        Wait();
        allArendatorsTab.click();}
    public void goToAllArendatorsTGILink (){
        Wait();
        allArendatorsTGILink.click();}
    public void goToRestaurantsSubTab (){
        Wait();
        restaurantsTab.click();}
    public void goToRestaurantStarBucksLink (){
        Wait();
        restaurantStarBucksLink.click();}
    public void goToMusicleSubTab (){
        Wait();
        musicleTab.click();}
    public void goToMusicleLink (){
        Wait();
        musicleLink.click();}
    public void goToHealthSportSubTab (){
        Wait();
        healthSportTab.click();}
    public void goToSportPilatesLink (){
        Wait();
        sportPilatesLink.click();}
    public void goToShopsSubTab (){
        Wait();
        shopsTab.click();}
    public void goToShopElitLink (){
        Wait();
        shopElitLink.click();}
    public void goToBanksSubTab (){
        Wait();
        banksTab.click();}
    public void goToBankTrustLink (){
        Wait();
        bankTrustLink.click();}
    public void goToServicesSubTab (){
        Wait();
        servicesTab.click();}
    public void goToServicesDelovarLink (){
        Wait();
        servicesDelovarLink.click();}
    public String getInfraTitleText(){return infrasTitle.getText();}
    public String getInfraAllTabText(){return allArendatorsTab.getText();}
    public String getInfraRestsTabText(){return restaurantsTab.getText();}
    public String getInfraMusicleTabText(){return musicleTab.getText();}
    public String getInfraHealthSportTabText(){return healthSportTab.getText();}
    public String getInfraShopsTabText(){return shopsTab.getText();}
    public String getInfraBanksTabText(){return banksTab.getText();}
    public String getInfraServicesTabText(){return servicesTab.getText();}
    public boolean checkIfPresentTitle(){
        Wait();
        return infrasTitle.isDisplayed();
    }
    public boolean checkIfPresentAllArendatorsTab(){
        Wait();
        return allArendatorsTab.isDisplayed();
    }
    public boolean checkIfSearchFieldIsPresent(){
        Wait();
        return infraSearchField.isDisplayed();
    }
    public boolean checkIfSearchButtonIsPresent(){
        Wait();
        return infraSearchButton.isDisplayed();
    }
    public boolean checkIfPresentShopsTab(){
        Wait();
        return shopsTab.isDisplayed();
    }
    public boolean checkIfPresentMusicleTab(){
        Wait();
        return musicleTab.isDisplayed();
    }
    public boolean checkIfPresentRestaurantsTab(){
        Wait();
        return restaurantsTab.isDisplayed();
    }
    public boolean checkIfPresentBanksTab(){
        Wait();
        return banksTab.isDisplayed();
    }
    public boolean checkIfPresentServicesTab(){
        Wait();
        return servicesTab.isDisplayed();
    }
    public boolean checkIfPresentHealthSportTab(){
        Wait();
        return healthSportTab.isDisplayed();
    }
}
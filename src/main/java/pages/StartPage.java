package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartPage {
    protected WebDriver driver;
    public StartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public WebDriver getDriver() {
        return driver;
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

    /** MAINPAGE MENU BUTTONS - NAVIGATE BUTTONS - MAINPAGE ACTIONS  */
    @FindBy (xpath = "//*[@class='intro__top']//child::div[@class='intro__title']")
    private WebElement mainTitle;
    @FindBy (xpath = "//*[@class='intro__top']//child::div[@class='intro__subtitle']")
    private WebElement mainSubTitle;
    @FindBy (xpath ="//*[@class='intro__menu-item intro__menu-item--advantages panel-activate']")
    private WebElement advantagesBlock;
    @FindBy (xpath = "//*[@class='intro__menu-item intro__menu-item--advantages panel-activate']//descendant::div[@class='intro__menu-item-title']")
    private WebElement advantagesTitle;
    @FindBy (xpath = "//*[@class='intro__menu-item intro__menu-item--advantages panel-activate']//descendant::div[@class='intro__menu-item-subtitle']")
    private WebElement advantagesSubTitle;
    @FindBy (xpath ="//*[@class='intro__menu-item intro__menu-item--restaurants panel-activate']")
    private WebElement restaurantsBlock;
    @FindBy (xpath = "//*[@class='intro__menu-item intro__menu-item--restaurants panel-activate']//descendant::div[@class='intro__menu-item-title']")
    private WebElement restaurantsTitle;
    @FindBy (xpath = "//*[@class='intro__menu-item intro__menu-item--restaurants panel-activate']//descendant::div[@class='intro__menu-item-subtitle']")
    private WebElement restaurantsSubTitle;
    @FindBy (xpath ="//*[@class='intro__menu-item intro__menu-item--events panel-activate']")
    private WebElement eventsBlock;
    @FindBy (xpath = "//*[@class='intro__menu-item intro__menu-item--events panel-activate']//descendant::div[@class='intro__menu-item-title']")
    private WebElement eventsTitle;
    @FindBy (xpath = "//*[@class='intro__menu-item intro__menu-item--events panel-activate']//descendant::div[@class='intro__menu-item-subtitle']")
    private WebElement eventsSubTitle;
    @FindBy (xpath ="//*[@class='intro__menu-item intro__menu-item--rent panel-activate']")
    private WebElement rentBlock;
    @FindBy (xpath = "//*[@class='intro__menu-item intro__menu-item--rent panel-activate']//descendant::div[@class='intro__menu-item-title']")
    private WebElement rentTitle;
    @FindBy (xpath = "//*[@class='intro__menu-item intro__menu-item--rent panel-activate']//descendant::div[@class='intro__menu-item-subtitle']")
    private WebElement rentSubTitle;
    @FindBy (xpath = "//*[@class='footer hide-at-320']//child::div[@class='footer__left']")
    private WebElement leftFooter;
    @FindBy (xpath = "//*[@class='footer__right']//child::span")
    private WebElement rightFooter;

    /** Pager buttons */
    @FindBy (xpath ="//*[@class='pager-dots']//child::a[@href='#']")
    private WebElement startPager;
    @FindBy (xpath ="//*[@class='pager-dots']//child::a[@href='#advantages']")
    private WebElement advantagesPager;
    @FindBy (xpath ="//*[@class='pager-dots']//child::a[@href='#restaurants']")
    private WebElement restaurantsPager;
    @FindBy (xpath ="//*[@class='pager-dots']//child::a[@href='#events']")
    private WebElement eventsPager;
    @FindBy (xpath ="//*[@class='pager-dots']//child::a[@href='#rent']")
    private WebElement rentPager;
    @FindBy (xpath ="//*[@class='pager-dots']//child::a[@href='#infrastructure']")
    private WebElement infrastructurePager;
    @FindBy (xpath ="//*[@class='pager-dots']//child::a[@href='#contacts']")
    private WebElement contactsPager;
    @FindBy (xpath = "//*[@class='font-light']//child::a[@href='http://www.media-storm.ru/']")
    private WebElement mediaStormLink;

    /** Social network Links*/
    @FindBy (xpath = "//*[@class='social tablet-hide']//descendant::a[@href='https://vk.com/mdmpalace']")
    private WebElement vkLink;
    @FindBy (xpath = "//*[@class='social tablet-hide']//descendant::a[@href='https://facebook.com/mdmpalace']")
    private WebElement facebookLink;
    @FindBy (xpath = "//*[@class='social tablet-hide']//descendant::a[@href='https://twitter.com/mdmpalace']")
    private WebElement twitterLink;
    @FindBy (xpath = "//*[@class='social tablet-hide']//descendant::a[@href='https://instagram.com/mdmpalace']")
    private WebElement instagramLink;
    @FindBy (xpath = "//*[@class='social tablet-hide']//descendant::a[@href='https://ok.ru/group/53369862946952']")
    private WebElement okLink;

    public void clickOnAdvantages(){
        Wait();
        advantagesBlock.click();
    }
    public void clickOnRestaurants(){
        Wait();
        restaurantsBlock.click();
    }
    public void clickOnEvents(){
        Wait();
        eventsBlock.click();}
    public void clickOnRent(){
        Wait();
        rentBlock.click();}
    public void clickOnStartPager(){
        Wait();
        startPager.click();}
    public void clickOnAdvantagesPager(){
        Wait();
        advantagesPager.click();}
    public void clickOnRestaurantsPager(){
        Wait();
        restaurantsPager.click();}
    public void clickOnEventsPager(){
        Wait();
        eventsPager.click();}
    public void clickOnRentPager(){
        Wait();
        rentPager.click();}
    public void clickOnInfrastructurePager(){
        Wait();
        infrastructurePager.click();}
    public void clickOnContactsPager(){
        Wait();
        contactsPager.click();}
    public void goToMediaStormWebSite(){
        Wait();
        mediaStormLink.click();}
    public void clickVkLink(){
        Wait();
        vkLink.click();
    }
    public void clickOkLink(){
        Wait();
        okLink.click();
    }
    public void clickFaceBookLink(){
        Wait();
        facebookLink.click();
    }
    public void clickTwitterLink(){
        Wait();
        twitterLink.click();
    }
    public void clickInstagramLink(){
        Wait();
        instagramLink.click();
    }
    public boolean checkIfAdvantagesPagerIsPresent(){
        Wait();
        return advantagesPager.isDisplayed();
    }
    public boolean checkIfRestaurantsPagerIsPresent(){
        Wait();
        return restaurantsPager.isDisplayed();
    }
    public boolean checkIfEventsPagerIsPresent(){
        Wait();
        return eventsPager.isDisplayed();
    }
    public boolean checkIfRentPagerIsPresent(){
        Wait();
        return rentPager.isDisplayed();
    }
    public boolean checkIfInfrastructurePagerIsPresent(){
        Wait();
        return infrastructurePager.isDisplayed();
    }
    public boolean checkIfContactsPagerIsPresent(){
        Wait();
        return contactsPager.isDisplayed();
    }
    public boolean checkIfAdvanatgesBlockIsPresent(){
        Wait();
        return advantagesBlock.isDisplayed();
    }
    public boolean checkIfRestaurantsBlockIsPresent(){
        Wait();
        return restaurantsBlock.isDisplayed();
    }
    public boolean checkIfEventsBlockIsPresent(){
        Wait();
        return eventsBlock.isDisplayed();
    }
    public boolean checkIfRentBlockIsPresent(){
        Wait();
        return rentBlock.isDisplayed();
    }
    public boolean checkIfMainPagerIsPresent(){
        Wait();
        return startPager.isDisplayed();
    }
    public boolean checkIfPresentMainTitle(){
        Wait();
        return mainTitle.isDisplayed();
    }
    public boolean checkIfPresentSubTitle(){
        Wait();
        return mainSubTitle.isDisplayed();
    }
    public boolean checkIfPresentVkLink(){
        Wait();
        return vkLink.isDisplayed();
    }
    public boolean checkIfPresentFaceBookLink(){
        Wait();
        return facebookLink.isDisplayed();
    }
    public boolean checkIfPresentInstagramLink(){
        Wait();
        return instagramLink.isDisplayed();
    }
    public boolean checkIfPresentOkLink(){
        Wait();
        return okLink.isDisplayed();
    }
    public boolean checkIfPresentTwitterLink(){
        Wait();
        return twitterLink.isDisplayed();
    }
    public String getMainTitleText(){return mainTitle.getText();}
    public String getMainSubTitleText(){return mainSubTitle.getText();}
    public String getAdvantagesTitleText(){ return advantagesTitle.getText(); }
    public String getAdvatagesSubTitleText(){return advantagesSubTitle.getText();}
    public String getRestaurantsTitleText(){return restaurantsTitle.getText();}
    public String getRestaurantsSubTitelText(){return restaurantsSubTitle.getText();}
    public String getEventsTitleText(){return eventsTitle.getText();}
    public String getEventsSubTitleText(){return eventsSubTitle.getText();}
    public String getRentTitleText(){return rentTitle.getText();}
    public String getRentSubTitleText(){return rentSubTitle.getText();}
    public String getRightFooterText(){return rightFooter.getText();}
    public String getLeftFooterText(){return leftFooter.getText();}
    public String getMediaStormLinkText(){return mediaStormLink.getText();}

    /** LEFT MENU BUTTONS AND ACTIONS */

    @FindBy (xpath = "//*[@class='h-overlay-switcher']")
    private WebElement leftMenuButton;
    @FindBy (xpath = "//nav[@class='h-overlay__menu']/ul/li//child::a[@href='/history/']")
    private WebElement mdmHistoryLink;
    @FindBy (xpath = "//nav[@class='h-overlay__menu']/ul/li//child::a[@href='/halls/']")
    private WebElement hallsRentLink;
    @FindBy (xpath = "//nav[@class='h-overlay__menu']/ul/li//child::a[@href='/event/']")
    private WebElement eventsLink;
    @FindBy (xpath = "//nav[@class='h-overlay__menu']/ul/li//child::a[@href='/infrastructure/']")
    private WebElement infrastructureLink;
    @FindBy (xpath = "//nav[@class='h-overlay__menu']/ul/li//child::a[@href='/rent/']")
    private WebElement roomsRentLink;
    @FindBy (xpath = "//nav[@class='h-overlay__menu']/ul/li//child::a[@href='/partners/']")
    private WebElement partnersLink;
    @FindBy (xpath = "//nav[@class='h-overlay__menu']/ul/li//child::a[@href='/contacts/']")
    private WebElement contactsLink;
    @FindBy (xpath = "//nav[@class='h-overlay__menu']/ul/li//child::a[@href='/index/']")
    private WebElement mainPageLink;

    public void clickLeftMenuButton(){
        leftMenuButton.click();}
    public void clickMdmHistoryLink(){ Wait(); mdmHistoryLink.click();}
    public void clickHallsRentLink(){ Wait();hallsRentLink.click();}
    public void clickEventsLink(){
        Wait();eventsLink.click();}
    public void clickInfrastructureLink(){
        Wait();infrastructureLink.click();}
    public void clickRoomsRentLink(){
        Wait();roomsRentLink.click();}
    public void clickPartnersLink(){
        Wait();partnersLink.click();}
    public void clickContactsLink(){
        Wait();contactsLink.click();}
    public void clickMainPageLink(){
        Wait();mainPageLink.click();}
    public boolean chekcIfPresentMainPageLink(){
        Wait();
        return mainPageLink.isDisplayed();
    }
    public boolean checkIfLeftMenuButtonIsPresent(){
        Wait();
        return leftMenuButton.isDisplayed();
    }

}

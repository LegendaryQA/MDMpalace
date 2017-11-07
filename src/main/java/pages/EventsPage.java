package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventsPage extends StartPage {
    public EventsPage(WebDriver driver) {
        super(driver);
    }

    private void Wait(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /** EVENTS BLOCK BUTTONS AND ACTIONS */
    @FindBy(xpath = "//*[@class='g-blocks-more']//child::a[@href='/event/']")
    private WebElement eventLink;
    @FindBy (xpath = "//*[@class='g-blocks-more']//child::a[@href='/event/#gotorasp']")
    private WebElement VipLink;
    @FindBy (xpath = "//*[@class='container']/a")
    private WebElement buyVipService;
    @FindBy(xpath ="//*[@id='events']//child::div[@class='panel__close panel-deactivate']")
    private WebElement eventsCloseButton;
    @FindBy (xpath = "//*[@id='events']//descendant::div[@class='g-block__title']")
    private WebElement eventsInnerTitle ;
    @FindBy (xpath = "//*[@id='events']//descendant::div[@class='g-block__subtitle']")
    private WebElement eventsInnerSubTitle;
    @FindBy (xpath = "//*[@id='events']//descendant::div[@class='panel__title noline']")
    private WebElement eventsMusicleTitle;
    @FindBy (xpath = "//*[@id='events']//descendant::div[@class='panel__summary']")
    private WebElement eventsMusicleDescription;
    @FindBy (xpath = "//*[@href='/event/#gotorasp']//child::img[@src='/markup/img/button_VIP.png']")
    private WebElement vipLinkImage;

    public void clickEventLink(){
        Wait();
        eventLink.click();
    }
    public void clickVipLink(){
        Wait();
        VipLink.click();
    }
    public void clickBuyVipServiceLink(){
        Wait();
        buyVipService.click();
    }
    public void clickEventsCloseButton(){
        Wait();
        eventsCloseButton.click();
    }
    public boolean checkIfPresentEventLink(){
        Wait();
        return eventLink.isDisplayed();
    }
    public boolean checkIfPresentVipLink(){
        Wait();
        return VipLink.isDisplayed();
    }
    public boolean checkIfPresentInnerTitle(){
        Wait();
        return eventsInnerTitle.isDisplayed();
    }
    public boolean checkIfPresentInnerSubTitle(){
        Wait();
        return eventsInnerSubTitle.isDisplayed();
    }
    public boolean checkIfPresentMusicleTitle(){
        Wait();
        return eventsMusicleTitle.isDisplayed();
    }
    public boolean checkIfPresentMusicleDescription(){
        Wait();
        return eventsMusicleDescription.isDisplayed();
    }
    public String getEventsInnerTitleText(){return eventsInnerTitle.getText();}
    public String getEventsInnerSubTitleText(){return eventsInnerSubTitle.getText();}
    public String getEventsMusicleTitle(){return eventsMusicleTitle.getText();}
    public String getEventsMusicleDescriptionText(){return eventsMusicleDescription.getText();}
    public String getEventsEventButtonText(){return eventLink.getText();}
    public boolean getEventsVipLinkImage(){
        Wait();
        return (vipLinkImage.getAttribute("src").contains("/markup/img/button_VIP.png"));
    }
}

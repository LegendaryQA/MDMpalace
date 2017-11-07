package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvantagesPage extends StartPage {
    public AdvantagesPage(WebDriver driver) {
        super(driver);
    }

    private void Wait(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /** ADVANTAGES BLOCK BUTTONS AND ACTIONS */
    @FindBy(xpath = "//*[@class='g-block__more']//child::a[@href='/contacts/']")
    private WebElement advantagesMapLink;
    @FindBy(xpath = "//*[@class='g-block__more']//child::a[@href='/contacts/#marker-metro']")
    private WebElement metroLink;
    @FindBy (xpath = "//*[@class='g-block__more']//child::a[@href='/contacts/#marker-ttk']")
    private WebElement ttkLink;
    @FindBy (xpath = "//*[@class='g-block__more']//child::a[@href='/contacts/#marker-parking']")
    private WebElement parkingLink;
    @FindBy (xpath = "//*[@class='g-block__more']//child::a[@href='/contacts/#marker-park']")
    private WebElement parkLink;
    @FindBy (xpath = "//*[@id='advantages']//descendant::a[@href='/netcat_files/MDM.mp4']")
    private WebElement mdmVideoLink;
    @FindBy (xpath ="//*[@id='advantages']//child::div[@class='panel__close panel-deactivate']")
    private WebElement advantagesCloseButton;
    @FindBy (xpath = "//*[@id='advantages']//descendant::div[@class='g-block__title']")
    private WebElement advantagesInnerTitle;
    @FindBy (xpath = "//*[@id='advantages']//descendant::div[@class='g-block__subtitle']")
    private WebElement advantagesInnerSubTitle;
    @FindBy (xpath = "//*[@id='advantages']//descendant::div[@class='panel__title']")
    private WebElement advantagesDescription;
    @FindBy (xpath = "//*[@class='g-block g-block--train']//child::div[@class='g-block__title']")
    private WebElement metroTitle;
    @FindBy (xpath = "//*[@class='g-block g-block--train']//child::div[@class='g-block__subtitle g-block__subtitle--small']")
    private WebElement metroDescription;
    @FindBy (xpath = "//*[@class='g-block g-block--lights']//child::div[@class='g-block__title']")
    private WebElement ttkTitle;
    @FindBy (xpath = "//*[@class='g-block g-block--lights']//child::div[@class='g-block__subtitle g-block__subtitle--small']")
    private WebElement ttkDescription;
    @FindBy (xpath = "//*[@class='g-block g-block--parking']//child::div[@class='g-block__title']")
    private WebElement parkingTitle;
    @FindBy (xpath = "//*[@class='g-block g-block--parking']//child::div[@class='g-block__subtitle g-block__subtitle--small']")
    private WebElement parkingDescription;
    @FindBy (xpath = "//*[@class='g-block g-block--trees']//child::div[@class='g-block__title']")
    private WebElement parkTitle;
    @FindBy (xpath = "//*[@class='g-block g-block--trees']//child::div[@class='g-block__subtitle g-block__subtitle--small']")
    private WebElement parkDescription;

    public void clickAdvantagesMapLink(){
        Wait();
        advantagesMapLink.click();}
    public void clickMetroLink(){
        Wait();
        metroLink.click();}
    public void clickTtkLink(){
        Wait();
        ttkLink.click();}
    public void clickParkingLink(){
        Wait();
        parkingLink.click();}
    public void clickParkLink(){
        Wait();
        parkLink.click();}
    public void clickMdmLink(){
        Wait();
        mdmVideoLink.click();}
    public void clickAdvantagesCloseButton(){
        Wait();
        advantagesCloseButton.click();}
    public boolean checkIfPresentMapLink(){
        Wait();
        return advantagesMapLink.isDisplayed();
    }
    public boolean checkAdvanPresentInnerTitle(){
        Wait();
        return advantagesInnerTitle.isDisplayed();
    }
    public boolean checkAdvanPresentInnerSubTitle(){
        Wait();
        return advantagesInnerSubTitle.isDisplayed();
    }
    public boolean checkAdvanPresentDescription(){
        Wait();
        return advantagesDescription.isDisplayed();
    }
    public boolean checkAdvanPresentMetroTitle(){
        Wait();
        return metroTitle.isDisplayed();
    }
    public boolean checkAdvanPresentMetroDescription(){
        Wait();
        return metroDescription.isDisplayed();
    }
    public boolean checkAdvanPresentMetroButton(){
        Wait();
        return  metroLink.isDisplayed();
    }
    public boolean checkAdvanPresentTtkTitle(){
        Wait();
        return ttkTitle.isDisplayed();
    }
    public boolean checkAdvanPresentTtkDescription(){
        Wait();
        return ttkDescription.isDisplayed();
    }
    public boolean checkAdvanPresentTtkButton(){
        Wait();
        return ttkLink.isDisplayed();
    }
    public boolean checkAdvanPresentParkingTitle(){
        Wait();
        return parkingTitle.isDisplayed();
    }
    public boolean checkAdvanPresentParkingDescription(){
        Wait();
        return parkingDescription.isDisplayed();
    }
    public boolean checkAdvanPresentParkingButton(){
        Wait();
        return parkingLink.isDisplayed();
    }
    public boolean checkAdvanPresentParkTitle(){
        Wait();
        return parkTitle.isDisplayed();
    }
    public boolean checkAdvanPresentParkDescription(){
        Wait();
        return parkDescription.isDisplayed();
    }
    public boolean checkAdvanPresentParkButton(){
        Wait();
        return parkLink.isDisplayed();
    }
    public boolean checkAdvanPresentMdmVideoButton(){
        Wait();
        return mdmVideoLink.isDisplayed();
    }
    public String getAdvantagesInnerTitleText(){return advantagesInnerTitle.getText();}
    public String getAdvantagesInnerSubTitleText(){return advantagesInnerSubTitle.getText();}
    public String getAdvantagesMapLinkButtonText(){return advantagesMapLink.getText();}
    public String getAdvantagesDescriptionText(){return advantagesDescription.getText();}
    public String getAdvantagesMetroTitleText(){return metroTitle.getText();}
    public String getAdvantagesMetroDescriptionText(){return metroDescription.getText();}
    public String getAdvantagesMetroButtonText(){return metroLink.getText();}
    public String getAdvantagesTtkTitleText(){return ttkTitle.getText();}
    public String getAdvantagesTtkDescriptionText(){return ttkDescription.getText();}
    public String getAdvantagesTtkButtonText(){return ttkLink.getText();}
    public String getAdvantagesParkingTitleText(){return parkingTitle.getText();}
    public String getAdvantagesParkingDescriptionText(){return parkingDescription.getText();}
    public String getAdvantagesParkingButtonText(){return parkingLink.getText();}
    public String getAdvantagesParkTitleText(){return parkTitle.getText();}
    public String getAdvantagesParkDescriptionText(){return parkDescription.getText();}
    public String getAdvantagesParkButtonText(){return parkLink.getText();}
    public String getAdvantagesMdmVideoButtonText(){return mdmVideoLink.getText();}
}

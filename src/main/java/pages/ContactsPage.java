package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactsPage extends StartPage {
    public ContactsPage(WebDriver driver) {
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

    /** CONTACTS BLOCK BUTTONS AND ACTIONS */
    @FindBy(xpath = "//*[@id='contacts']/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/a[2]")
    private WebElement googleMapAddressLink;
    @FindBy (xpath = "//*[@id='contacts']/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/a[1]")
    private WebElement yandexMapsAddressLink;
    @FindBy (xpath = "//*[@id='contacts']//descendant::div[@class='panel__title2']")
    private WebElement contTitle;
    @FindBy (xpath = "//*[@class='scontact']//child::div[@class='scontact__title']")
    private WebElement contAddressTitle;
    @FindBy (xpath = "//*[@id='contacts']//descendant::div[@class='scontact__summary']")
    private WebElement contAddressDescription;
    @FindBy (xpath = "//*[@class='scontact']//descendant::div[@class='scontact__title print-hide']")
    private WebElement contShowOnMapTitle;
    @FindBy (xpath = "//*[@class='scontact scontact--tablet-left']/div[2]/div[1]")
    private WebElement contTheatreCashboxTitle;
    @FindBy (xpath = "//*[@class='scontact scontact--tablet-left']/div[2]/div[2]")
    private WebElement contTheatreCashboxPhone;
    @FindBy (xpath = "//*[@class='scontact scontact--tablet-left']/div[2]/div[3]")
    private WebElement contReceptionTitle;
    @FindBy (xpath = "//*[@class='scontact scontact--tablet-left']/div[2]/div[4]")
    private WebElement contReceptionPhone1;
    @FindBy (xpath = "//*[@class='scontact scontact--tablet-left']/div[2]/div[5]")
    private WebElement contReceptionPhone2;
    @FindBy (xpath = "//*[@class='scontact scontact--tablet-right']//descendant::div[@class='scontact__title']")
    private WebElement contEmailTitle;
    @FindBy (xpath = "//*[@class='scontact__mail']")
    private WebElement contEmailAddress;
    @FindBy (xpath = "//*[@class='control control--top-right tablet-hide']")
    private WebElement contMapPrintButton;
    @FindBy (xpath = "//*[@class='control control-zoom-in']")
    private WebElement contMapZoomInButton;
    @FindBy (xpath = "//*[@class='control control-zoom-out']")
    private WebElement contMapZoomOutButton;
    @FindBy (xpath = "//*[@class='control control-zoom-fit']")
    private WebElement contMapZoomFitButton;
    @FindBy (xpath = "//*[@class='marker-circle__icon marker-circle__icon--parking']")
    private WebElement contParkingMapIcon;
    @FindBy (xpath = "//*[@id='marker-parking']//descendant::div[@class='marker-circle__text-inner']")
    private WebElement contParkingMapIconText;
    @FindBy (xpath = "//*[@class='marker-circle__icon marker-circle__icon--metro']")
    private WebElement contMetroMapIcon;
    @FindBy (xpath = "//*[@id='marker-metro']//descendant::div[@class='marker-circle__text-inner']")
    private WebElement contMetroMapIconText;
    @FindBy (xpath = "//*[@class='marker-drop__inner']")
    private WebElement contMdmMapIcon;
    @FindBy (xpath = "//*[@class='marker-drop__text-inner']")
    private WebElement contMdmMapIconText;
    @FindBy (xpath = "//*[@class='marker-circle__icon marker-circle__icon--ttk']")
    private WebElement contTtkMapIcon;
    @FindBy (xpath = "//*[@id='marker-ttk']//descendant::div[@class='marker-circle__text-inner']")
    private WebElement contTtkMapIconText;
    @FindBy (xpath = "//*[@class='marker-circle__icon marker-circle__icon--park']")
    private WebElement contParkMapIcon;
    @FindBy (xpath = "//*[@id='marker-park']//descendant::div[@class='marker-circle__text-inner']")
    private WebElement contParkMapIconText;
    @FindBy (xpath = "//*[@class='marker-circle__icon marker-circle__icon--ring']")
    private WebElement contRingMapIcon;
    @FindBy (xpath = "//*[@id='marker-ring']//descendant::div[@class='marker-circle__text-inner']")
    private WebElement contRingMapIconText;

    public void goToGoogleMaps(){
        waitForElementToBeClickable(googleMapAddressLink);
        googleMapAddressLink.click();}
    public void goToYandexMaps(){
        waitForElementToBeClickable(yandexMapsAddressLink);
        yandexMapsAddressLink.click();}
    public void clickZoomInButton(){
        Wait();
        contMapZoomInButton.click();
    }
    public void clickZoomOutButton(){
        Wait();
        contMapZoomOutButton.click();
    }
    public void clickZoomFitButton(){
        Wait();
        contMapZoomFitButton.click();
    }
    public void clickPrintButton(){
        Wait();
        contMapPrintButton.click();
    }
    public void focusOnMetroMapIcon(){
        new Actions(driver).moveToElement(contMetroMapIcon).perform();
        Wait();
    }
    public void focusOnTtkMapIcon(){
        new Actions(driver).moveToElement(contTtkMapIcon).perform();
        Wait();
    }
    public void focusOnRingMapIcon(){
        new Actions(driver).moveToElement(contRingMapIcon).perform();
        Wait();
    }
    public void focusOnParkMapIcon(){
        new Actions(driver).moveToElement(contParkMapIcon).perform();
        Wait();
    }
    public void focusOnParkingMapIcon(){
        new Actions(driver).moveToElement(contParkingMapIcon).perform();
        Wait();
    }
    public void focusOnMdmMapIcon(){
        new Actions(driver).moveToElement(contMdmMapIcon).perform();
        Wait();
    }
    public void focusOnMetroMapIconTextBox(){
        new Actions(driver).moveToElement(contMetroMapIconText).perform();
        Wait();
    }
    public void focusOnTtkMapIconTextBox(){
        new Actions(driver).moveToElement(contTtkMapIconText).perform();
        Wait();
    }
    public void focusOnRingMapIconTextBox(){
        new Actions(driver).moveToElement(contRingMapIconText).perform();
        Wait();
    }
    public void focusOnParkMapIconTextBox(){
        new Actions(driver).moveToElement(contParkMapIconText).perform();
        Wait();
    }
    public void focusOnParkingMapIconTextBox(){
        new Actions(driver).moveToElement(contParkingMapIconText).perform();
        Wait();
    }
    public void focusOnMdmMapIconTextBox(){
        new Actions(driver).moveToElement(contMdmMapIconText).perform();
        Wait();
    }
    public boolean checkIfPresentGoogleLink(){
        Wait();
        return googleMapAddressLink.isDisplayed();
    }
    public boolean checkIfPresentYandexLink(){
        Wait();
        return yandexMapsAddressLink.isDisplayed();
    }
    public boolean checkIfPresentTitle(){
        Wait();
        return contTitle.isDisplayed();
    }
    public boolean checkIfPresentAddressTitle(){
        Wait();
        return contAddressTitle.isDisplayed();
    }
    public boolean checkIfPresentAddressDescription(){
        Wait();
        return contAddressDescription.isDisplayed();
    }
    public boolean checkIfPresentShowOnMapTitle(){
        Wait();
        return contShowOnMapTitle.isDisplayed();
    }
    public boolean checkIfPresentCashboxTitle(){
        Wait();
        return contTheatreCashboxTitle.isDisplayed();
    }
    public boolean checkIfPresentCashboxPhone(){
        Wait();
        return contTheatreCashboxPhone.isDisplayed();
    }
    public boolean checkIfPresentReceptionTitle(){
        Wait();
        return contReceptionTitle.isDisplayed();
    }
    public boolean checkIfPresentReceptionPhone1(){
        Wait();
        return contReceptionPhone1.isDisplayed();
    }
    public boolean checkIfPresentReceptionPhone2(){
        Wait();
        return contReceptionPhone2.isDisplayed();
    }
    public boolean checkIfPresentEmailTitle(){
        Wait();
        return contEmailTitle.isDisplayed();
    }
    public boolean checkIfPresentEmailAddress(){
        Wait();
        return contEmailAddress.isDisplayed();
    }
    public boolean checkIfPresentMdmMapIcon(){
        Wait();
        return contMdmMapIcon.isDisplayed();
    }
    public boolean checkIfPresentMdmMapIconTextBox(){
        Wait();
        return contMdmMapIconText.isDisplayed();
    }
    public boolean checkIfPresentRingMapIcon(){
        Wait();
        return contRingMapIcon.isDisplayed();
    }
    public boolean checkIfPresentRingMapIconTextBox(){
        Wait();
        return contRingMapIconText.isDisplayed();
    }
    public boolean checkIfPresentTtkMapIcon(){
        Wait();
        return contTtkMapIcon.isDisplayed();
    }
    public boolean checkIfPresentTtkMapIconTextBox(){
        Wait();
        return contTtkMapIconText.isDisplayed();
    }
    public boolean checkIfPresentParkMapIcon(){
        Wait();
        return contParkMapIcon.isDisplayed();
    }
    public boolean checkIfPresentParkMapIconTextBox(){
        Wait();
        return contParkMapIconText.isDisplayed();
    }
    public boolean checkIfPresentParkingMapIcon(){
        Wait();
        return contParkingMapIcon.isDisplayed();
    }
    public boolean checkIfPresentParkingMapIconTextBox(){
        Wait();
        return contParkingMapIconText.isDisplayed();
    }
    public boolean checkIfPresentMetroMapIcon(){
        Wait();
        return contMetroMapIcon.isDisplayed();
    }
    public boolean checkIfPresentMetroMapIconTextBox(){
        Wait();
        return contMetroMapIconText.isDisplayed();
    }
    public boolean checkIfPresentPrintButton(){
        Wait();
        return contMapPrintButton.isDisplayed();
    }
    public boolean checkIfPresentZoomInButton(){
        Wait();
        return contMapZoomInButton.isDisplayed();
    }
    public boolean checkIfPresentZoomOutButton(){
        Wait();
        return contMapZoomOutButton.isDisplayed();
    }
    public boolean checkIfPresentZoomFitButton(){
        Wait();
        return contMapZoomFitButton.isDisplayed();
    }
    public String getTitleText(){return contTitle.getText();}
    public String getAddressTitleText(){return contAddressTitle.getText();}
    public String getAddressDescriptionText(){return contAddressDescription.getText();}
    public String getShowOnMapTitleText(){return contShowOnMapTitle.getText();}
    public String getGoogelLinkText(){return googleMapAddressLink.getText();}
    public String getYandexLinkText(){return yandexMapsAddressLink.getText();}
    public String getCashboxTitle(){return contTheatreCashboxTitle.getText();}
    public String getCashboxPhone(){return contTheatreCashboxPhone.getText();}
    public String getReceptionTitle(){return contReceptionTitle.getText();}
    public String getReceptionPhone1(){return contReceptionPhone1.getText();}
    public String getReceptionPhone2(){return contReceptionPhone2.getText();}
    public String getEmailTitle(){return contEmailTitle.getText();}
    public String getEmailAddress(){return contEmailAddress.getText();}
    public String getMdmMapIconBoxText(){Wait();return contMdmMapIconText.getText();}
    public String getRingMapIconBoxText(){Wait();return contRingMapIconText.getText();}
    public String getTtkMapIconBoxText(){Wait();return contTtkMapIconText.getText();}
    public String getParkMapIconBoxText(){Wait();return contParkMapIconText.getText();}
    public String getParkingMapIconBoxText(){Wait();return contParkingMapIconText.getText();}
    public String getMetroMapIconBoxText(){Wait();return contMetroMapIconText.getText();}
}

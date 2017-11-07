package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.UsefullFunctions;

public class ParquetHallPage extends StartPage {
    public ParquetHallPage(WebDriver driver) {
        super(driver);
    }
    private void Wait(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void waitUntilVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    @FindBy (xpath = "//*[@class='h-overlay-switcher']//*[@class='h-overlay-switcher__icon home ']")
    private WebElement homeButton;
    @FindBy (xpath = "//*[@class='section section--bg section--bg-hall']//a[@href='/halls/']")
    private WebElement backButton;
    @FindBy(xpath = "//h1[@class='h1']")
    private WebElement Title;
    @FindBy (xpath = "//*[@class='subtitle2']//child::a[@href='http://www.mdmpalace.ru/halls/great.html']")
    private WebElement linkToGreatHall;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']")
    private WebElement descriptionContainer;
    @FindBy (xpath = "//*[@class='section']//div[@class='container']//div[@class='contacts-panel__title']")
    private WebElement phonesTitle;
    @FindBy (xpath = "//*[@class='section']//*[@class='container']//*[@class='contacts-panel__content']/span[1]")
    private WebElement phone1;
    @FindBy (xpath = "//*[@class='section']//*[@class='container']//*[@class='contacts-panel__content']/span[2]")
    private WebElement phone2;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/div[@class='intro-text intro-text--medium']")
    private WebElement parketHallDescription;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/div[@class='intro-text2']/p[1]")
    private WebElement equipmentTitle;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/div[@class='intro-text2']/ul/li[1]")
    private WebElement equipLightAndSound;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/div[@class='intro-text2']/ul/li[2]")
    private WebElement equipDanceFloor;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/div[@class='intro-text2']/ul/li[3]")
    private WebElement equipPodiums;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/div[@class='intro-text2']/ul/li[4]")
    private WebElement equipRestaurant;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/div[@class='intro-text2']/ul/li[5]")
    private WebElement equipWardrobe;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/p")
    private WebElement parketAdditionalDescription;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/ul/li[1]")
    private WebElement parketHallEvent1;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/ul/li[2]")
    private WebElement parketHallEvent2;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/ul/li[3]")
    private WebElement parketHallEvent3;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/ul/li[4]")
    private WebElement parketHallEvent4;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/ul/li[5]")
    private WebElement parketHallEvent5;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/ul/li[6]")
    private WebElement parketHallEvent6;
    @FindBy (xpath = "//*[@class='section section--gallery']//descendant::h2")
    private WebElement photoGalleryTitle;
    @FindBy (xpath = "//*[@id='slider-gallery']/div[@class='slider__next']/i")
    private WebElement nextPhotoButton;
    @FindBy (xpath = "//*[@id='slider-gallery']/div[@class='slider__prev']/i")
    private WebElement previousPhotoButton;
    @FindBy (xpath = "//*[@id='slider-gallery']//div[@class='owl-stage-outer']/div[@class='owl-stage']")
    private WebElement currentPhoto;
    @FindBy (xpath = "//*[@class='section section--schema']//h2")
    private WebElement schemaMapTitle;
    @FindBy (xpath = "//*[@class='section section--schema']//*[@class='svg-pan-zoom_viewport']")
    private WebElement schemaMap;
    @FindBy (xpath = "//*[@class='section section--schema']//div[@class='controls']/div[@class='control esvg-zoom-in']/i")
    private WebElement zoomInButton;
    @FindBy (xpath = "//*[@class='section section--schema']//div[@class='controls']/div[@class='control esvg-zoom-out']/i")
    private WebElement zoomOutButton;
    @FindBy (xpath = "//*[@class='section section--schema']//div[@class='controls']/div[@class='control esvg-zoom-reset']/i")
    private WebElement zoomResetButton;
    @FindBy (xpath = "//*[@class='section section--panorama-360']//h2")
    private WebElement panoramaTitle;
    // RENT HALL REQUEST FIELDS
    @FindBy (xpath = "//*[@class='section section--quote']//div[@class='form__title']")
    private WebElement rentRequestTitle;
    @FindBy (xpath = "//*[@class='form__item form__item--col form__item--name']/*[@class='form__item-label form__item-label--absolute']")
    private WebElement nameFieldTitle;
    @FindBy (xpath = "//*[@class='form__item form__item--col form__item--email']/*[@class='form__item-label form__item-label--absolute']")
    private WebElement emailFieldTitle;
    @FindBy (xpath = "//*[@class='form__item form__item--col form__item--phone']/*[@class='form__item-label form__item-label--absolute']")
    private WebElement phoneFieldTitle;
    @FindBy (xpath = "//*[@class='form__item form__item--col form__item--date form__item--col--320-2']/*[@class='form__item-label form__item-label--absolute']")
    private WebElement dateFieldTitle;
    @FindBy (xpath = "//*[@class='form__item form__item--col form__item--event-format']/*[@class='form__item-label form__item-label--absolute']")
    private WebElement formatFieldTitle;
    @FindBy (xpath = "//*[@class='form__item form__item--col form__item--guests form__item--col--320-2']/*[@class='form__item-label form__item-label--absolute form__item-label--double']")
    private WebElement guestsFieldTitle;
    @FindBy (xpath = "//*[@class='form__item form__item--col form__item--time1 form__item--col--320-2']/label")
    private WebElement timeFieldTitle;
    @FindBy (xpath = "//*[@class='form__item form__item--col form__item--time2 form__item--col--320-2']/label")
    private WebElement timeMontageFieldTitle;
    @FindBy (xpath = "//*[@class='section section--quote']//*[@class='form__item']/*[@class='form__item-label form__item-label--absolute']")
    private WebElement commentsFieldTitle;
    @FindBy (xpath = "//*[@class='section section--quote']//*[@class='form__items']/*[@class='form__required']")
    private WebElement requiredFieldTitle;

    @FindBy (xpath = "//*[@class='form__item form__item--col form__item--name']//input[@name='f_Name']")
    private WebElement nameField;
    @FindBy (xpath = "//*[@class='form__item-field']//input[@name='f_Email']")
    private WebElement emailField;
    @FindBy (xpath = "//*[@class='form__item-field']//input[@name='f_Phone']")
    private WebElement phoneField;
    @FindBy (xpath = "//*[@class='form__item-field']//input[@name='f_Format']")
    private WebElement formatField;
    @FindBy (xpath = "//*[@class='form__item-field']//input[@name='f_Date']")
    private WebElement dateField;
    @FindBy (xpath = "//*[@class='form__item-field']//input[@name='f_Guests']")
    private WebElement guestsField;
    @FindBy (xpath = "//*[@class='form__item-field']//input[@name='f_Time']")
    private WebElement timeField;
    @FindBy (xpath = "//*[@class='form__actions text-align-center']//child::button[@class='btn btn--outline-large']")
    private WebElement sendRentRequestButton;
    @FindBy (xpath = "//*[@class='form__item form__item--col form__item--time2 form__item--col--320-2']/div")
    private WebElement timeMontageField;
    @FindBy (xpath = "//*[@class='section section--quote']//*[@class='form__item']/*[@class='form__item-field']/textarea")
    private WebElement commentsField;
    //RENT HALL REQUEST FIELDS ERROR MESSAGES
    @FindBy (xpath = "//*[@class='form__item-field']//child::input[@name='f_Name']//following-sibling::div[@class='form__error active']")
    private WebElement nameRentError;
    @FindBy (xpath = "//*[@class='form__item-field']//child::input[@name='f_Phone']//following-sibling::div[@class='form__error active']")
    private WebElement phoneRentError;
    @FindBy (xpath = "//*[@class='form__item-field']//child::input[@name='f_Email']//following-sibling::div[@class='form__error active']")
    private WebElement emailRentError;
    @FindBy (xpath = "//*[@class='form__item-field']//child::input[@name='f_Date']//following-sibling::div[@class='form__error active']")
    private WebElement dateRentError;
    @FindBy (xpath = "//*[@class='form__item-field']//child::input[@name='f_Format']//following-sibling::div[@class='form__error active']")
    private WebElement formatRentError;
    @FindBy (xpath = "//*[@class='form__item-field']//child::input[@name='f_Guests']//following-sibling::div[@class='form__error active']")
    private WebElement guestsRentError;
    @FindBy (xpath = "//*[@class='form__item-field']//child::input[@name='f_Time']//following-sibling::div[@class='form__error active']")
    private WebElement timeRentError;

    public void enterNameInRentRequest(String name){
        nameField.sendKeys(name);
    }
    public void enterEmailInRentRequest(String email){
        emailField.sendKeys(email);
    }
    public void enterPhoneInRentRequest(String phone){
        phoneField.sendKeys(phone);}
    public void enterGuestsNumberInRentRequest(String guests){
        guestsField.sendKeys(guests);}
    public void enterDateInRentRequest(String date){
        dateField.sendKeys(date);}
    public void enterTimeInRentRequest(String time){
        timeField.sendKeys(time);}
    public void enterFormatInRentRequest(String format){
        formatField.sendKeys(format);}
    public void clickSendRentRequestButton(){Wait();
        sendRentRequestButton.click();}
    public void clickNextPhotoButton(){Wait();nextPhotoButton.click();}
    public void clickPreviousPhotoButton(){Wait();previousPhotoButton.click();}
    public void clickOnZoomInButton(){Wait();zoomInButton.click();}
    public void clickOnZoomOutButton(){Wait();zoomOutButton.click();}
    public void clickOnZoomResetButton(){Wait();zoomResetButton.click();}
    public void clickSwitchToGreatHallLink(){
        Wait();
        linkToGreatHall.click();
    }
    public void clickHomeButton(){Wait();homeButton.click();}
    public void clickBackButton(){Wait();backButton.click();}
    public double getMapScale(){
        waitUntilVisible(zoomInButton);
        return UsefullFunctions.getTransformMatrixValues(schemaMap);
    }
    public String getCurrentPhoto(){
        Wait();
        return currentPhoto.getAttribute("style");
    }
    public String getTitleText(){Wait();return Title.getText();}
    public String getGreatHallLinkText(){Wait();return linkToGreatHall.getText();}
    public String getPhonesTitleText(){Wait();return phonesTitle.getText();}
    public String getPhone1Text(){Wait();return phone1.getText();}
    public String getPhone2Text(){Wait();return phone2.getText();}
    public String getParketDescriptionText(){Wait();return parketHallDescription.getText();}
    public String getEquipmentTitleText(){Wait();return equipmentTitle.getText();}
    public String getEquipmentLightAndSoundText(){Wait();return equipLightAndSound.getText();}
    public String getEquipmentDanceFloorText(){Wait();return equipDanceFloor.getText();}
    public String getEquipmentPodiumsText(){Wait();return equipPodiums.getText();}
    public String getEquipmentRestaurantText(){Wait();return equipRestaurant.getText();}
    public String getEquipmentWardrobeText(){Wait();return equipWardrobe.getText();}
    public String getparketHallAdditionalDescriptionText(){Wait();return parketAdditionalDescription.getText();}
    public String getEvent1Text(){Wait();return parketHallEvent1.getText();}
    public String getEvent2Text(){Wait();return parketHallEvent2.getText();}
    public String getEvent3Text(){Wait();return parketHallEvent3.getText();}
    public String getEvent4Text(){Wait();return parketHallEvent4.getText();}
    public String getEvent5Text(){Wait();return parketHallEvent5.getText();}
    public String getEvent6Text(){Wait();return parketHallEvent6.getText();}
    public String getPhotoGalleryTitleText(){Wait();return photoGalleryTitle.getText();}
    public String getSchemaMapTitleText(){Wait();return schemaMapTitle.getText();}
    public String getPanoramaTitleText(){Wait();return panoramaTitle.getText();}
    public String getRentRequestTitleText(){Wait();return rentRequestTitle.getText();}
    public String getNameFieldTitleText(){Wait();return nameFieldTitle.getText();}
    public String getEmailFieldTitleText(){Wait();return emailFieldTitle.getText();}
    public String getCommentsFieldTitleText(){Wait();return commentsFieldTitle.getText();}
    public String getDateFieldTitleText(){Wait();return dateFieldTitle.getText();}
    public String getGuestsFieldTitleText(){Wait();return guestsFieldTitle.getText();}
    public String getFormatFieldTitleText(){Wait();return formatFieldTitle.getText();}
    public String getTimeMontageFieldTitleText(){Wait();return timeMontageFieldTitle.getText();}
    public String getTimeFieldTitleText(){Wait();return timeFieldTitle.getText();}
    public String getPhoneFieldTitleText(){Wait();return phoneFieldTitle.getText();}
    public String getRequiredFieldsTitleText(){Wait();return requiredFieldTitle.getText();}
    public String getSendRentRequestButtonText(){Wait();return sendRentRequestButton.getText();}
    public boolean checkIfPresentHomeButton(){Wait();return homeButton.isDisplayed();}
    public boolean checkIfPresentBackButton(){Wait();return backButton.isDisplayed();}
    public boolean checkIfMapDispalyed(){
        Wait();
        return schemaMap.isDisplayed();
    }
    public boolean checkIfNameRentRequestError(){
        Wait();
        return nameRentError.isDisplayed();
    }
    public boolean checkIfEmailRentRequestError(){
        Wait();
        return emailRentError.isDisplayed();
    }
    public boolean checkIfPhoneRentRequestError(){
        Wait();
        return phoneRentError.isDisplayed();
    }
    public boolean checkIfDateRentRequestError(){
        Wait();
        return dateRentError.isDisplayed();
    }
    public boolean checkIfFormatRentRequestError(){
        Wait();
        return formatRentError.isDisplayed();
    }
    public boolean checkIfGuestsRentRequestError(){
        Wait();
        return guestsRentError.isDisplayed();
    }
    public boolean checkIfTimeRentRequestError(){
        Wait();
        return timeRentError.isDisplayed();
    }
    public boolean checkIfPresentTitle(){Wait();return Title.isDisplayed();}
    public boolean checkIfPresentLinkToGreatHall(){Wait();return linkToGreatHall.isDisplayed();}
    public boolean checkIfPresentPhonesTitle(){Wait();return phonesTitle.isDisplayed();}
    public boolean checkIfPresentPhone1(){Wait();return phone1.isDisplayed();}
    public boolean checkIfPresentPhone2(){Wait();return phone2.isDisplayed();}
    public boolean checkIfPresentParketHallDescription(){Wait();return parketHallDescription.isDisplayed();}
    public boolean checkIfPresentEquipmentTitle(){Wait();return equipmentTitle.isDisplayed();}
    public boolean checkIfPresentEquipmentLightAndSound(){Wait();return equipLightAndSound.isDisplayed();}
    public boolean checkIfPresentEquipmentDanceFloor(){Wait();return equipDanceFloor.isDisplayed();}
    public boolean checkIfPresentEquipmentPodiums(){Wait();return equipPodiums.isDisplayed();}
    public boolean checkIfPresentEquipmentRestaurant(){Wait();return equipRestaurant.isDisplayed();}
    public boolean checkIfPresentEquipmentWardrobe(){Wait();return equipWardrobe.isDisplayed();}
    public boolean checkIfPresentParketAdditionalDescription(){Wait();return parketAdditionalDescription.isDisplayed();}
    public boolean checkIfPresentEvent1(){Wait();return parketHallEvent1.isDisplayed();}
    public boolean checkIfPresentEvent2(){Wait();return parketHallEvent2.isDisplayed();}
    public boolean checkIfPresentEvent3(){Wait();return parketHallEvent3.isDisplayed();}
    public boolean checkIfPresentEvent4(){Wait();return parketHallEvent4.isDisplayed();}
    public boolean checkIfPresentEvent5(){Wait();return parketHallEvent5.isDisplayed();}
    public boolean checkIfPresentEvent6(){Wait();return parketHallEvent6.isDisplayed();}
    public boolean checkIfPresentPhotoGalleryTitle(){Wait();return photoGalleryTitle.isDisplayed();}
    public boolean checkIfPresentMapTitle(){Wait();return schemaMapTitle.isDisplayed();}
    public boolean checkIfPresentZoomInButton(){Wait();return zoomInButton.isDisplayed();}
    public boolean checkIfPresentZoomOutButton(){Wait();return zoomOutButton.isDisplayed();}
    public boolean checkIfPresentZoomResetButton(){Wait();return zoomResetButton.isDisplayed();}
    public boolean checkIfPresentMap(){Wait();return schemaMap.isDisplayed();}
    public boolean checkIfPresentPanoramaTitle(){Wait();return panoramaTitle.isDisplayed();}
    public boolean checkIfPresentRentRequestTitle(){Wait();return rentRequestTitle.isDisplayed();}
    public boolean checkIfPresentNameFieldTitle(){Wait();return nameFieldTitle.isDisplayed();}
    public boolean checkIfPresentNameField(){Wait();return nameField.isDisplayed();}
    public boolean checkIfPresentPhoneFieldTitle(){Wait();return phoneFieldTitle.isDisplayed();}
    public boolean checkIfPresentPhoneField(){Wait();return phoneField.isDisplayed();}
    public boolean checkIfPresentEmailFieldTitle(){Wait();return emailFieldTitle.isDisplayed();}
    public boolean checkIfPresentEmailField(){Wait();return emailField.isDisplayed();}
    public boolean checkIfPresentDateFieldTitle(){Wait();return dateFieldTitle.isDisplayed();}
    public boolean checkIfPresentDateField(){Wait();return dateField.isDisplayed();}
    public boolean checkIfPresentGuestsFieldTitle(){Wait();return guestsFieldTitle.isDisplayed();}
    public boolean checkIfPresentGuestsField(){Wait();return guestsField.isDisplayed();}
    public boolean checkIfPresentCommentsFieldTitle(){Wait();return commentsFieldTitle.isDisplayed();}
    public boolean checkIfPresentCommentsField(){Wait();return commentsField.isDisplayed();}
    public boolean checkIfPresentFormatFieldTitle(){Wait();return formatFieldTitle.isDisplayed();}
    public boolean checkIfPresentFormatField(){Wait();return formatField.isDisplayed();}
    public boolean checkIfPresentTimeFieldTitle(){Wait();return timeFieldTitle.isDisplayed();}
    public boolean checkIfPresentTimeField(){Wait();return timeField.isDisplayed();}
    public boolean checkIfPresentTimeMontageFieldTitle(){Wait();return timeMontageFieldTitle.isDisplayed();}
    public boolean checkIfPresentTimeMontageField(){Wait();return timeMontageField.isDisplayed();}
    public boolean checkIfPresentSendRentRequestButton(){Wait();return sendRentRequestButton.isDisplayed();}
    public boolean checkIfPresentNextPhotoButton(){Wait();return nextPhotoButton.isDisplayed();}
    public boolean checkIfPresentPreviousPhotoButton(){Wait();return previousPhotoButton.isDisplayed();}
    public boolean checkIfPresentRequiredFieldsTitle(){Wait();return requiredFieldTitle.isDisplayed();}
    public void scrollUntilDescriptionContainerIsVisible(){
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", descriptionContainer);
    }
    public void scrollUntilPhotoGalleryIsVisible(){
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", nextPhotoButton);
    }
    public void scrollUntilPanoramaIsVisible(){
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", panoramaTitle);
    }
    public void scrollUntilHallInfoIsVisible(){
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", phonesTitle,parketHallEvent6);
    }
    public void scrollUntilMapSeactionIsVisible(){
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", schemaMap,schemaMap);
    }
    public void scrollUntilRenRequestFieldsAreVisible(){
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", sendRentRequestButton);
    }
    public void scrollUntilTitleIsVisible(){
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", Title);
    }
}

package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.UsefullFunctions;

public class GreatHallPage extends StartPage {
    public GreatHallPage(WebDriver driver) {
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

    @FindBy (xpath = "//*[@class='h-overlay-switcher']//*[@class='h-overlay-switcher__icon home']")
    private WebElement homeButton;
    @FindBy (xpath = "//*[@class='section section--bg section--bg-hall']//a[@href='/halls/']")
    private WebElement backButton;
    @FindBy (xpath = "//h1[@class='h1']")
    private WebElement Title;
    @FindBy (xpath = "//*[@class='subtitle2']//child::a[@href='http://www.mdmpalace.ru/halls/parket.html']")
    private WebElement linkToParquetHall;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']")
    private WebElement descriptionContainer;
    @FindBy (xpath = "//*[@class='section']//div[@class='container']//div[@class='contacts-panel__title']")
    private WebElement phonesTitle;
    @FindBy (xpath = "//*[@class='section']//*[@class='container']//*[@class='contacts-panel__content']/span[1]")
    private WebElement phone1;
    @FindBy (xpath = "//*[@class='section']//*[@class='container']//*[@class='contacts-panel__content']/span[2]")
    private WebElement phone2;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/div[@class='intro-text intro-text--medium']")
    private WebElement mdmDescription;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/div[@class='intro-text2']/p[1]")
    private WebElement equipmentTitle;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/div[@class='intro-text2']/ul/li[1]")
    private WebElement equipStage;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/div[@class='intro-text2']/ul/li[2]")
    private WebElement equipBackstage;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/div[@class='intro-text2']/ul/li[3]")
    private WebElement equipLightAndSound;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/div[@class='intro-text2']/p[2]")
    private WebElement vipOpportunitiesTitle;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/div[@class='intro-text2']/p[3]")
    private WebElement vipOpportunitiesDescription;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/p")
    private WebElement greatHallEvents;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/ul/li[1]")
    private WebElement greatHallEvent1;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/ul/li[2]")
    private WebElement greatHallEvent2;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/ul/li[3]")
    private WebElement greatHallEvent3;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/ul/li[4]")
    private WebElement greatHallEvent4;
    @FindBy (xpath = "//*[@class='section']/div[@class='container']/ul/li[5]")
    private WebElement greatHallEvent5;
    @FindBy (xpath = "//*[@class='section section--gallery']//descendant::h2")
    private WebElement photoGalleryTitle;
    @FindBy (xpath = "//*[@id='slider-gallery']/div[@class='slider__next']/i")
    private WebElement nextPhotoButton;
    @FindBy (xpath = "//*[@id='slider-gallery']/div[@class='slider__prev']/i")
    private WebElement previousPhotoButton;
    @FindBy (xpath = "//*[@id='slider-gallery']//div[@class='owl-stage-outer']/div[@class='owl-stage']")
    private WebElement currentPhoto;
    @FindBy (xpath = "//*[@class='section section--schema']//*[@data-selector='#plan']")
    private WebElement planMapButton;
    @FindBy (xpath = "//*[@class='section section--schema']//*[@data-selector='#schema']")
    private WebElement schemaMapButton;
    @FindBy (xpath = "//*[@id='plan']//*[@class='esvg__schema-inner']//*[@class='svg-pan-zoom_viewport']")
    private WebElement planMap;
    @FindBy (xpath = "//*[@id='schema']//*[@class='esvg__schema-inner']//*[@class='svg-pan-zoom_viewport']")
    private WebElement schemaMap;
    @FindBy (xpath = "//*[@id='plan']//div[@class='controls']/div[@class='control esvg-zoom-in']/i")
    private WebElement planZoomInButton;
    @FindBy (xpath = "//*[@id='plan']//div[@class='controls']/div[@class='control esvg-zoom-out']/i")
    private WebElement planZoomOutButton;
    @FindBy (xpath = "//*[@id='plan']//div[@class='controls']/div[@class='control esvg-zoom-reset']/i")
    private WebElement planZoomResetButton;
    @FindBy (xpath = "//*[@id='schema']//div[@class='controls']/div[@class='control esvg-zoom-in']/i")
    private WebElement schemaZoomInButton;
    @FindBy (xpath = "//*[@id='schema']//div[@class='controls']/div[@class='control esvg-zoom-out']/i")
    private WebElement schemaZoomOutButton;
    @FindBy (xpath = "//*[@id='schema']//div[@class='controls']/div[@class='control esvg-zoom-reset']/i")
    private WebElement schemaZoomResetButton;
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
    public void clickOnPlanZoomInButton(){Wait();planZoomInButton.click();}
    public void clickOnPlanZoomOutButton(){Wait();planZoomOutButton.click();}
    public void clickOnPlanZoomResetButton(){Wait();planZoomResetButton.click();}
    public void clickOnSchemaZoomInButton(){Wait();schemaZoomInButton.click();}
    public void clickOnSchemaZoomOutButton(){Wait();schemaZoomOutButton.click();}
    public void clickOnSchemaZoomResetButton(){Wait();schemaZoomResetButton.click();}
    public void clickPlanMapButton(){Wait();planMapButton.click();}
    public void clickSchemaMapButton(){Wait();schemaMapButton.click();}
    public void clickSwitchToParquetHallLink(){
        Wait();
        linkToParquetHall.click();
    }
    public void clickHomeButton(){Wait();homeButton.click();}
    public void clickBackButton(){Wait();backButton.click();}
    public double getPlanMapScale(){
        waitUntilVisible(planZoomInButton);
        return UsefullFunctions.getTransformMatrixValues(planMap);
    }
    public double getSchemaMapScale(){
        waitUntilVisible(schemaZoomInButton);
        return UsefullFunctions.getTransformMatrixValues(schemaMap);
    }
    public String getCurrentPhoto(){
        Wait();
        return currentPhoto.getAttribute("style");
    }
    public String getTitleText(){Wait();return Title.getText();}
    public String getParquetHallLinkText(){Wait();return linkToParquetHall.getText();}
    public String getPhonesTitleText(){Wait();return phonesTitle.getText();}
    public String getPhone1Text(){Wait();return phone1.getText();}
    public String getPhone2Text(){Wait();return phone2.getText();}
    public String getMdmDescriptionText(){Wait();return mdmDescription.getText();}
    public String getEquipmentTitleText(){Wait();return equipmentTitle.getText();}
    public String getEquipmentStageText(){Wait();return equipStage.getText();}
    public String getEquipmentBackStageText(){Wait();return equipBackstage.getText();}
    public String getEquipmentLightAndSoundText(){Wait();return equipLightAndSound.getText();}
    public String getVipOpportunitiesTitleText(){Wait();return vipOpportunitiesTitle.getText();}
    public String getVipOpportunitiesDescriptionText(){Wait();return vipOpportunitiesDescription.getText();}
    public String getEventsTitleText(){Wait();return greatHallEvents.getText();}
    public String getEvent1Text(){Wait();return greatHallEvent1.getText();}
    public String getEvent2Text(){Wait();return greatHallEvent2.getText();}
    public String getEvent3Text(){Wait();return greatHallEvent3.getText();}
    public String getEvent4Text(){Wait();return greatHallEvent4.getText();}
    public String getEvent5Text(){Wait();return greatHallEvent5.getText();}
    public String getPhotoGalleryTitleText(){Wait();return photoGalleryTitle.getText();}
    public String getPlanMapButtonText(){Wait();return planMapButton.getText();}
    public String getSchemaMapButtonText(){Wait();return schemaMapButton.getText();}
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
    public boolean checkIfPlanMapDispalyed(){
        Wait();
        return planMap.isDisplayed();
    }
    public boolean checkIfSchemaMapDispalyed(){
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
    public boolean checkIfPresentLinkToParquetHall(){Wait();return linkToParquetHall.isDisplayed();}
    public boolean checkIfPresentPhonesTitle(){Wait();return phonesTitle.isDisplayed();}
    public boolean checkIfPresentPhone1(){Wait();return phone1.isDisplayed();}
    public boolean checkIfPresentPhone2(){Wait();return phone2.isDisplayed();}
    public boolean checkIfPresentMdmDescription(){Wait();return mdmDescription.isDisplayed();}
    public boolean checkIfPresentEquipmentTitle(){Wait();return equipmentTitle.isDisplayed();}
    public boolean checkIfPresentEquipmentStage(){Wait();return equipStage.isDisplayed();}
    public boolean checkIfPresentEquipmentBackStage(){Wait();return equipBackstage.isDisplayed();}
    public boolean checkIfPresentEquipmentLightAndSound(){Wait();return equipLightAndSound.isDisplayed();}
    public boolean checkIfPresentVipOpportunitiesTitle(){Wait();return vipOpportunitiesTitle.isDisplayed();}
    public boolean checkIfPresentVipOpportunitiesDescription(){Wait();return vipOpportunitiesDescription.isDisplayed();}
    public boolean checkIfPresentEventsTitle(){Wait();return greatHallEvents.isDisplayed();}
    public boolean checkIfPresentEvent1(){Wait();return greatHallEvent1.isDisplayed();}
    public boolean checkIfPresentEvent2(){Wait();return greatHallEvent2.isDisplayed();}
    public boolean checkIfPresentEvent3(){Wait();return greatHallEvent3.isDisplayed();}
    public boolean checkIfPresentEvent4(){Wait();return greatHallEvent4.isDisplayed();}
    public boolean checkIfPresentEvent5(){Wait();return greatHallEvent5.isDisplayed();}
    public boolean checkIfPresentPhotoGalleryTitle(){Wait();return photoGalleryTitle.isDisplayed();}
    public boolean checkIfPresentPlanMapButton(){Wait();return planMapButton.isDisplayed();}
    public boolean checkIfPresentSchemaMapButton(){Wait();return schemaMapButton.isDisplayed();}
    public boolean checkIfPresentPlanZoomInButton(){Wait();return planZoomInButton.isDisplayed();}
    public boolean checkIfPresentPlanZoomOutButton(){Wait();return planZoomOutButton.isDisplayed();}
    public boolean checkIfPresentPlanZoomResetButton(){Wait();return planZoomResetButton.isDisplayed();}
    public boolean checkIfPresentSchemaZoomInButton(){Wait();return schemaZoomInButton.isDisplayed();}
    public boolean checkIfPresentSchemaZoomOutButton(){Wait();return schemaZoomOutButton.isDisplayed();}
    public boolean checkIfPresentSchemaZoomResetButton(){Wait();return schemaZoomResetButton.isDisplayed();}
    public boolean checkIfPresentPlanMap(){Wait();return planMap.isDisplayed();}
    public boolean checkIfPresentSchemaMap(){Wait();return schemaMap.isDisplayed();}
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
                "arguments[0].scrollIntoView();", phonesTitle,greatHallEvent5);
    }
    public void scrollUntilMapSeactionIsVisible(){
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", planMap,schemaMap);
    }
    public void scrollUntilRenRequestFieldsAreVisible(){
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", sendRentRequestButton);
    }
    public void scrollUntilTitleIsVisible(){
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", Title);
    }
    public boolean checkIfPlanViewIsActive(){
        Wait();
        return planMapButton.getAttribute("class").contains("active");
    }
    public boolean checkIfSchemaViewIsActive(){
        Wait();
        return schemaMapButton.getAttribute("class").contains("active");
    }

}

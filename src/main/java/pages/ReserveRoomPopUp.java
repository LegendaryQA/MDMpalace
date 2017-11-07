package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReserveRoomPopUp extends StartPage {
    public ReserveRoomPopUp(WebDriver driver) {
        super(driver);
    }
    private void Wait(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @FindBy(xpath = "//*[@id='popup-quote-lot']")
    private WebElement reservePopUp;
    @FindBy (xpath = "//*[@class='popup__title text-align-center']")
    private WebElement reservePopUpTitle;
    @FindBy (xpath = "//*[@class='form__items']//descendant::input[@name='f_Name']//..//preceding-sibling::label")
    private WebElement reservePopUpNameTitle;
    @FindBy (xpath = "//*[@class='form__items']//descendant::input[@name='f_Name']")
    private WebElement reservePopUpNameTextField;
    @FindBy (xpath = "//*[@class='form__items']//descendant::input[@name='f_Phone']//..//preceding-sibling::label")
    private WebElement reservePopUpPhoneTitle;
    @FindBy (xpath = "//*[@class='form__items']//descendant::input[@name='f_Phone']")
    private WebElement reservePopUpPhoneTextField;
    @FindBy (xpath = "//*[@class='form__items']//descendant::input[@name='f_Email']//..//preceding-sibling::label")
    private WebElement reservePopUpEmailTitle;
    @FindBy (xpath = "//*[@class='form__items']//descendant::input[@name='f_Email']")
    private WebElement reservePopUpEmailTextField;
    @FindBy (xpath = "//*[@class='form__items']//descendant::textarea[@name='f_Comment']//..//preceding-sibling::label")
    private WebElement reservePopUpCommentsTitle;
    @FindBy (xpath = "//*[@class='form__items']//descendant::textarea[@name='f_Comment']")
    private WebElement reservePopUpCommentsTextField;
    @FindBy (xpath = "//*[@class='form__required form__required--closer']")
    private WebElement reservePopUpRequiredFieldsTitle;
    @FindBy (xpath = "//button[@class='btn btn--outline']")
    private WebElement reservePopUpButton;
    @FindBy (xpath = "//*[@class='popup-close popup__close']")
    private WebElement reservePopUpCloseButton;
    @FindBy (xpath = "//input[@name='f_Name']//following-sibling::div")
    private WebElement errorNameMessage;
    @FindBy (xpath = "//input[@name='f_Phone']//following-sibling::div")
    private WebElement errorPhoneMessage;

    public boolean checkIfPresentTitle(){Wait();return reservePopUpTitle.isDisplayed();}
    public boolean checkIfPresentNameTitle(){Wait();return reservePopUpNameTitle.isDisplayed();}
    public boolean checkIfPresentEmailTitle(){Wait();return reservePopUpEmailTitle.isDisplayed();}
    public boolean checkIfPresentPhoneTitle(){Wait();return reservePopUpPhoneTitle.isDisplayed();}
    public boolean checkIfPresentCommentsTitle(){Wait();return reservePopUpCommentsTitle.isDisplayed();}
    public boolean checkIfPresentRequiredFieldsTitle(){Wait();return reservePopUpRequiredFieldsTitle.isDisplayed();}
    public boolean checkIfPresentReservePopUp(){Wait();return reservePopUp.isDisplayed();}
    public boolean checkIfPresentReserveButton(){Wait();return reservePopUpButton.isDisplayed();}
    public boolean checkIfPresentReservePopUpCloseButton(){Wait();return reservePopUpCloseButton.isDisplayed();}
    public boolean checkIfPresentNameField(){Wait();return reservePopUpNameTextField.isDisplayed();}
    public boolean checkIfPresentPhoneField(){Wait();return reservePopUpPhoneTextField.isDisplayed();}
    public boolean checkIfPresentEmailField(){Wait();return reservePopUpEmailTextField.isDisplayed();}
    public boolean checkIfPresentCommentsField(){Wait();return reservePopUpCommentsTextField.isDisplayed();}
    public boolean checkIfPresentErrorNameMessage(){Wait();return errorNameMessage.isDisplayed();}
    public boolean checkIfPresentErrorPhoneMessage(){Wait();return errorPhoneMessage.isDisplayed();}
    public String getPopUpTitleText(){return reservePopUpTitle.getText();}
    public String getNameTitleText(){return reservePopUpNameTitle.getText();}
    public String getPhoneTitleText(){return reservePopUpPhoneTitle.getText();}
    public String getEmailTitleText(){return reservePopUpEmailTitle.getText();}
    public String getCommentsTitleText(){return reservePopUpCommentsTitle.getText();}
    public String getReserveButtonText(){return reservePopUpButton.getText();}
    public String getRequiredFieldsTitleText(){return reservePopUpRequiredFieldsTitle.getText();}
    public String getErrorNameText(){return errorNameMessage.getText();}
    public String getErrorPhoneText(){return errorPhoneMessage.getText();}
    public void clickPopUpReserveButton(){Wait();reservePopUpButton.click();}
    public void clickPopUpCloseButton(){Wait();reservePopUpCloseButton.click();}
    public void enterName(String name){reservePopUpNameTextField.sendKeys(name);}
    public void enterPhone(String phone){reservePopUpNameTextField.sendKeys(phone);}
    public void enterEmail(String email){reservePopUpNameTextField.sendKeys(email);}
    public void enterComment(String comment){reservePopUpNameTextField.sendKeys(comment);}
}

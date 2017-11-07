package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RentPage extends StartPage {
    public RentPage(WebDriver driver) {
        super(driver);
    }
    private void waitForElementToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    private void waitUntilVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    private void Wait(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /** RENT BLOCK BUTTONS AND ACTIONS */
    @FindBy(xpath = "//*[@id='rent']//descendant::div[@class='panel__scroll-inner']/div[1]//descendant::a[@href='/rent/']")
    private WebElement watchAllRoomsLink;
    @FindBy (xpath = "//*[@id='rent']//descendant::div[@class='panel__scroll-inner']/div[3]//descendant::a[@href='/halls/great.html']")
    private WebElement greatHallLink;
    @FindBy (xpath = "//*[@id='rent']//descendant::div[@class='panel__scroll-inner']/div[3]/div[2]")
    private WebElement greatHallLine;
    @FindBy (xpath = "//*[@id='rent']//descendant::div[@class='panel__scroll-inner']/div[4]//descendant::a[@href='/halls/parket.html']")
    private WebElement parquetHallLink;
    @FindBy (xpath = "//*[@id='rent']//descendant::div[@class='panel__scroll-inner']/div[4]/div[2]")
    private WebElement parquetHallLine;
    @FindBy (xpath = "//*[@id='rent']//descendant::div[@class='panel__scroll-inner']/div[3]//descendant::a[@href='/halls/great.html#gorent']")
    private WebElement greatHallOrderLink;
    @FindBy (xpath = "//*[@id='rent']//descendant::div[@class='panel__scroll-inner']/div[4]//descendant::a[@href='/halls/parket.html#gorent']")
    private WebElement parquetHallOrderLink;
    @FindBy (xpath = "//*[@class='g-blocks-more']//child::a[@href='/rent/']")
    private WebElement allRoomsLink;
    @FindBy (xpath = "//*[@class='subtitle2']//child::a[@href='http://www.mdmpalace.ru/halls/great.html']")
    private WebElement linkToGreatHall;
    @FindBy (xpath ="//*[@id='rent']//child::div[@class='panel__close panel-deactivate']")
    private WebElement rentCloseButton;
    @FindBy (xpath = "//*[@id='rent']//descendant::div[@class='g-block__title']")
    private WebElement rentInnerTitle;
    @FindBy (xpath = "//*[@id='rent']//descendant::div[@class='g-block__subtitle']")
    private WebElement rentInnerSubTitle;
    @FindBy (xpath = "//*[@id='rent']//descendant::div[@class='panel__title']")
    private WebElement rentHallsTitle;
    @FindBy (xpath = "//*[@data-href='/halls/great.html']//descendant::div[@class='g-block__title g-block__title-w-prices']")
    private WebElement rentGreatHallTitle;
    @FindBy (xpath = "//*[@data-href='/halls/great.html']//descendant::div[@class='g-block__subtitle g-block__subtitle--small']")
    private WebElement rentGreatHallDescription;
    @FindBy (xpath = "//*[@data-href='/halls/parket.html']//descendant::div[@class='g-block__title g-block__title-w-prices']")
    private WebElement rentParquetHallTitle;
    @FindBy (xpath = "//*[@data-href='/halls/parket.html']//descendant::div[@class='g-block__subtitle g-block__subtitle--small']")
    private WebElement rentParquetHallDescription;
    @FindBy (xpath = "//*[@id='rent']//descendant::div[@class='panel__title noline']")
    private WebElement rentAllRoomsTitle;
    @FindBy (xpath = ".//*[@id='rent']//descendant::div[@class='panel__scroll-inner']/div[6]")
    private WebElement firstRoomInAllRoomsList;
    @FindBy (xpath = ".//*[@id='rent']//descendant::div[@class='panel__scroll-inner']/div[6]/div[3]/a")
    private WebElement firstRoomReserveButton;


    public void clickWatchAllRoomsLink(){
        Wait();
        watchAllRoomsLink.click();
    }
    public void clickGreatHallLink(){
        Wait();
        greatHallLink.click();
    }
    public void clickParquetHallLink(){
        Wait();
        parquetHallLink.click();
    }
    public void clickGreatHallOrderLink(){
        Wait();
        greatHallOrderLink.click();
    }
    public void clickParquetHallOrderLink(){
        Wait();
        parquetHallOrderLink.click();
    }
    public void clickAllRoomsLink(){
        Wait();
        allRoomsLink.click();
    }
    public void switchToGreatHall(){
        Wait();
        linkToGreatHall.click();
    }
    public void clickRentCloseButton(){
        Wait();
        rentCloseButton.click();
    }
    public void clickReserverRoomButton(){
        Wait();
        firstRoomReserveButton.click();
    }
    public void scrollUntilAllRoomsIsVisible(){
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", allRoomsLink);
    }
    public void scrollToTheTopOfRent(){
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", rentInnerTitle);
    }
    public void focusOnGreatHallLink(){
        new Actions(driver).moveToElement(greatHallLine).perform();
        Wait();
    }
    public void focusOnParquetHallLink(){
        new Actions(driver).moveToElement(parquetHallLink).perform();
        Wait();
    }
    public void focusOnFirstRoomInTheRoomList(){
        new Actions(driver).moveToElement(firstRoomInAllRoomsList).perform();
        Wait();
    }
    public String getRentInnerTitle(){return rentInnerTitle.getText();}
    public String getRentInnerSubTitle(){return rentInnerSubTitle.getText();}
    public String getRentWatchAllRoomsButtonText(){return watchAllRoomsLink.getText();}
    public String getRentGreatHallTitleText(){return rentGreatHallTitle.getText();}
    public String getRentGreatHallDescriptionText(){return rentGreatHallDescription.getText();}
    public String getRentGreatHallButtonText(){return greatHallLink.getText();}
    public String getRentGreatHallOrderButtonText(){return greatHallOrderLink.getText();}
    public String getRentParquetHallTitleText(){return rentParquetHallTitle.getText();}
    public String getRentParquetHallDescriptionText(){return rentParquetHallDescription.getText();}
    public String getRentParquetHallButtonText(){return parquetHallLink.getText();}
    public String getRentParquetHallOrderButtonText(){return parquetHallOrderLink.getText();}
    public String getRentAllRoomsTitle(){return rentAllRoomsTitle.getText();}
    public String getRentAllRoomsButtonText(){return allRoomsLink.getText();}
    public String getRentHallsTitle(){return rentHallsTitle.getText(); }
    public boolean checkIfPresentWatchAllRoomsLink(){
        Wait();
        return watchAllRoomsLink.isDisplayed();
    }
    public boolean checkIfPresentInnerTitle(){
        Wait();
        return rentInnerTitle.isDisplayed();
    }
    public boolean checkIfPresentInnerSubTitle(){
        Wait();
        return rentInnerSubTitle.isDisplayed();
    }
    public boolean checkIfPresentGreatHallTitle(){
        Wait();
        return rentGreatHallTitle.isDisplayed();
    }
    public boolean checkIfPresentGreatHallDescription(){
        Wait();
        return rentGreatHallDescription.isDisplayed();
    }
    public boolean checkIfPresentGreatHallButton(){
        Wait();
        return greatHallLink.isDisplayed();
    }
    public boolean checkIfPresentGreatHallOrderButton(){
        Wait();
        return greatHallOrderLink.isDisplayed();
    }
    public boolean checkIfPresentParquetHallTitle(){
        Wait();
        return rentParquetHallTitle.isDisplayed();
    }
    public boolean checkIfPresentParquetHallDescription(){
        Wait();
        return rentParquetHallDescription.isDisplayed();
    }
    public boolean checkIfPresentParquetHallButton(){
        Wait();
        return parquetHallLink.isDisplayed();
    }
    public boolean checkIfPresentParquetHallOrderButton(){
        Wait();
        return parquetHallOrderLink.isDisplayed();
    }
    public boolean checkIfPresentAllRoomsTitle(){
        Wait();
        return rentAllRoomsTitle.isDisplayed();
    }
    public boolean checkIfPresentAllRoomsButton(){
        Wait();
        return allRoomsLink.isDisplayed();
    }
    public boolean checkIfPresentHallsTitle(){
        Wait();
        return rentHallsTitle.isDisplayed();
    }
    public boolean checkIfPresentCloseButton(){
        Wait();
        return rentCloseButton.isDisplayed();
    }

}

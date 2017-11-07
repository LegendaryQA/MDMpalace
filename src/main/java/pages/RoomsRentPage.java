package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.UsefullFunctions;

public class RoomsRentPage extends StartPage {
    public RoomsRentPage(WebDriver driver) {
        super(driver);
    }

    private void Wait(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void waitUntilVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    /** Rooom rent page static items */
    @FindBy(xpath = "//*[@id='rent']//descendant::div[@class='panel__title2']")
    private WebElement roomsRentTitle;
    @FindBy(xpath = "//*[@class='h-overlay-switcher__icon home home-active']")
    private WebElement homePageButton;
    @FindBy(xpath = "//*[@class='toggler__button toggler-js-toggle']")
    private WebElement switchViewButton;
    @FindBy (xpath = "//*[@data-selector='#map']")
    private WebElement mapTitle;
    @FindBy (xpath = "//*[@data-selector='#list']")
    private WebElement listTitle;
    /** List selected items */
    @FindBy(xpath = "//*[@class='table-row']//child::div[@class='table-cell table-cell--2']")
    private WebElement photoHeader;
    @FindBy(xpath = "//*[@id='list']/div[@class='panel__table-body scrollable nicescroll nicescroll--inited']/a[1]/descendant::div[@class='table-cell__image']")
    private WebElement photoColumnValue;
    @FindBy(xpath = "//*[@class='table-row']//child::div[@class='table-cell table-cell--3']")
    private WebElement rentTypeHeader;
    @FindBy(xpath = "//*[@id='list']/div[@class='panel__table-body scrollable nicescroll nicescroll--inited']/a[1]//descendant::div[@class='table-row']/div[5]")
    private WebElement rentTypeColumnValue;
    @FindBy(xpath = "//*[@class='table-row']//child::div[@class='table-cell table-cell--4']")
    private WebElement spaceHeader;
    @FindBy(xpath = "//*[@id='list']/div[@class='panel__table-body scrollable nicescroll nicescroll--inited']/a[1]//descendant::div[@class='table-row']/div[6]")
    private WebElement spaceColumnValue;
    @FindBy(xpath = "//*[@class='table-row']//child::div[@class='table-cell table-cell--5']")
    private WebElement floorHeader;
    @FindBy(xpath = "//*[@id='list']/div[@class='panel__table-body scrollable nicescroll nicescroll--inited']/a[1]//descendant::div[@class='table-row']/div[7]")
    private WebElement floorColumnValue;
    @FindBy(xpath = "//*[@class='table-row']//child::div[@class='table-cell table-cell--6']")
    private WebElement monthPriceHeader;
    @FindBy(xpath = "//*[@id='list']/div[@class='panel__table-body scrollable nicescroll nicescroll--inited']/a[1]//descendant::div[@class='table-row']/div[9]")
    private WebElement monthPriceColumnValue;
    @FindBy(xpath = "//*[@class='table-row']//child::div[@class='table-cell table-cell--7']")
    private WebElement yearPriceHeader;
    @FindBy(xpath = "//*[@id='list']/div[@class='panel__table-body scrollable nicescroll nicescroll--inited']/a[1]//descendant::div[@class='table-row']/div[11]")
    private WebElement yearPriceColumnValue;
    @FindBy(xpath = "//*[@id='list']/div[@class='panel__table-body scrollable nicescroll nicescroll--inited']/a[1]//descendant::div[@class='table-row']/div[1]")
    private WebElement roomNumberColumnValue;
    @FindBy (xpath = "//*[@class='panel__table-body scrollable nicescroll nicescroll--inited']/a[1]")
    private WebElement firstRoomInTable;
    /** Map selected items */
    @FindBy (xpath = "//*[@id='map']//descendant::ul/li[1]")
    private WebElement firstFloorTab;
    @FindBy (xpath = "//*[@id='map']//descendant::ul/li[2]")
    private WebElement secondFloorTab;
    @FindBy (xpath = "//*[@id='map']//descendant::ul/li[3]")
    private WebElement thirdFloorTab;
    @FindBy (xpath = "//*[@id='map']//descendant::ul/li[4]")
    private WebElement fourthFloorTab;
    @FindBy (xpath = "//*[@id='map']/div[@class='panel__tabs-content']/div[@class='esvg esvg--absolute active']//descendant::div[@class='control esvg-zoom-in']/i")
    private WebElement activeFloorZoomInButton;
    @FindBy (xpath = "//*[@id='map']/div[@class='panel__tabs-content']/div[@class='esvg esvg--absolute active']//descendant::div[@class='control esvg-zoom-out']/i")
    private WebElement activeFloorZoomOutButton;
    @FindBy (xpath = "//*[@id='map']/div[@class='panel__tabs-content']/div[@class='esvg esvg--absolute active']//descendant::div[@class='control esvg-zoom-reset']/i")
    private WebElement activeFloorZoomResetButton;
    @FindBy (xpath = "//*[@id='map']/div[@class='panel__tabs-content']/div[@class='esvg esvg--absolute active']")
    private WebElement currentFloorMap;
    @FindBy (xpath = "//*[@id='map']/div[@class='panel__tabs-content']/div[@class='esvg esvg--absolute active']//descendant::*[@id='Layer_1']/*[@class='svg-pan-zoom_viewport']")
    private WebElement currentFloorMapSize;
    @FindBy (xpath = "//*[@id='map']//descendant::ul/li[@class='active']/a")
    private WebElement currentFloorTab;

    public void clickOnFirstRoomInTable(){Wait();firstRoomInTable.click();}
    public void clickOnSwitchViewButton(){Wait();switchViewButton.click();waitUntilVisible(activeFloorZoomInButton);}
    public void clickOnHomePageButton(){Wait();homePageButton.click();}
    public void clickOnFirstFloorTab(){Wait();firstFloorTab.click();waitUntilVisible(activeFloorZoomInButton);}
    public void clickOnSecondFloorTab(){Wait();secondFloorTab.click();waitUntilVisible(activeFloorZoomInButton);}
    public void clickOnThirdFloorTab(){Wait();thirdFloorTab.click();waitUntilVisible(activeFloorZoomInButton);}
    public void clickOnFourthFloorTab(){Wait();fourthFloorTab.click();waitUntilVisible(activeFloorZoomInButton);}
    public void clickZoomInButton(){
        Wait();
        activeFloorZoomInButton.click();
    }
    public void clickZoomOutButton(){
        Wait();
        activeFloorZoomOutButton.click();
    }
    public void clickZoomResetButton(){
        Wait();
        activeFloorZoomResetButton.click();
    }
    public boolean checkIfPresentFirstRoomInTable(){Wait();return firstRoomInTable.isDisplayed();}
    public boolean checkIfPresentHomePageButton(){Wait();return homePageButton.isDisplayed();}
    public boolean checkIfPresentListTitle(){Wait();return listTitle.isDisplayed();}
    public boolean checkIfPresentMapTitle(){Wait();return mapTitle.isDisplayed();}
    public boolean checkIfPresentTitle(){Wait();return roomsRentTitle.isDisplayed();}
    public boolean checkIfPresentPhotoHeader(){Wait();return photoHeader.isDisplayed();}
    public boolean checkIfPresentSpaceHeader(){Wait();return spaceHeader.isDisplayed();}
    public boolean checkIfPresentRentTypeHeader(){Wait();return rentTypeHeader.isDisplayed();}
    public boolean checkIfPresentFloorHeader(){Wait();return floorHeader.isDisplayed();}
    public boolean checkIfPresentMonthPriceHeader(){Wait();return monthPriceHeader.isDisplayed();}
    public boolean checkIfPresentYearPriceHeader(){Wait();return yearPriceHeader.isDisplayed();}
    public boolean checkIfPresentZoomInButton(){Wait();return activeFloorZoomInButton.isDisplayed();}
    public boolean checkIfPresentZoomOutButton(){Wait();return activeFloorZoomOutButton.isDisplayed();}
    public boolean checkIfPresentZoomResetButton(){Wait();return activeFloorZoomResetButton.isDisplayed();}
    public boolean checkIfPresentFirstFloorTab(){Wait();return firstFloorTab.isDisplayed();}
    public boolean checkIfPresentSecondFloorTab(){Wait();return secondFloorTab.isDisplayed();}
    public boolean checkIfPresentThirdFloorTab(){Wait();return thirdFloorTab.isDisplayed();}
    public boolean checkIfPresentFourthFloorTab(){Wait();return fourthFloorTab.isDisplayed();}
    public boolean checkIfPresentSwitchViewButton(){Wait();return switchViewButton.isDisplayed();}
    public String getTitleText(){return roomsRentTitle.getText();}
    public String getPhotoHeaderText(){return photoHeader.getText();}
    public String getFloorHeaderText(){return floorHeader.getText();}
    public String getSpaceHeaderText(){return spaceHeader.getText();}
    public String getMonthPriceHeaderText(){return monthPriceHeader.getText();}
    public String getYearPriceHeaderText(){return yearPriceHeader.getText();}
    public String getListTitleText(){return listTitle.getText();}
    public String getMapTitleText(){return mapTitle.getText();}
    public String getRentTypeHeaderText(){return rentTypeHeader.getText();}
    public String get1stLineFloorColumnValueText(){return floorColumnValue.getText();}
    public String get1stLineSpaceColumnValueText(){return spaceColumnValue.getText();}
    public String get1stLineMonthPriceColumnValueText(){return monthPriceColumnValue.getText();}
    public String get1stLineYearPriceColumnValueText(){return yearPriceColumnValue.getText();}
    public String get1stLineRentTypeColumnValueText(){return rentTypeColumnValue.getText();}
    public String get1stLineNumberColumnValueText(){return roomNumberColumnValue.getText();}
    public String getFirstFloorTabText(){return firstFloorTab.getText();}
    public String getSecondFloorTabText(){return secondFloorTab.getText();}
    public String getThirdFloorTabText(){return thirdFloorTab.getText();}
    public String getFourthFloorTabText(){return fourthFloorTab.getText();}
    public String getCurrentFloorTabText(){return currentFloorTab.getText();}
    public double getMapScale(){
        waitUntilVisible(activeFloorZoomInButton);
        return UsefullFunctions.getTransformMatrixValues(currentFloorMapSize);
    }
    public boolean isRightFloorMapDisplayed(String id){
        Wait();
        return currentFloorMap.getAttribute("data-url").endsWith("id="+id);
    }

}

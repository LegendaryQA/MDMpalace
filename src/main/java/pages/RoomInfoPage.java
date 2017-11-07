package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.UsefullFunctions;

public class RoomInfoPage extends StartPage {
    public RoomInfoPage(WebDriver driver) {
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
    @FindBy(xpath = "//*[@class='iorg__title']")
    private WebElement roomTitle;
    @FindBy (xpath = "//*[@class='iorg__header']//child::div[@class='iorg__params']/div[1]/div[2]")
    private WebElement spaceTitle;
    @FindBy (xpath = "//*[@class='iorg__header']//child::div[@class='iorg__params']/div[1]/div[1]")
    private WebElement spaceValue;
    @FindBy (xpath = "//*[@class='iorg__header']//child::div[@class='iorg__params']/div[2]/div[2]")
    private WebElement floorTitle;
    @FindBy (xpath = "//*[@class='iorg__header']//child::div[@class='iorg__params']/div[2]/div[1]")
    private WebElement floorValue;
    @FindBy (xpath = "//*[@class='panel__left-scroll-inner']/div[2]/div/div[1]/div[1]")
    private WebElement rentTypeTitle;
    @FindBy (xpath = "//*[@class='panel__left-scroll-inner']/div[2]/div/div[1]/div[2]")
    private WebElement rentTypeValue;
    @FindBy (xpath = "//*[@class='panel__left-scroll-inner']/div[2]/div/div[2]/div[1]")
    private WebElement rentPeriodTitle;
    @FindBy (xpath = "//*[@class='panel__left-scroll-inner']/div[2]/div/div[2]/div[2]")
    private WebElement rentPeriodValue;
    @FindBy (xpath = "//*[@class='panel__left-scroll-inner']/div[2]/div/div[3]/div[1]")
    private WebElement depositTitle;
    @FindBy (xpath = "//*[@class='panel__left-scroll-inner']/div[2]/div/div[3]/div[2]")
    private WebElement depositValue;
    @FindBy (xpath = "//*[@class='panel__left-scroll-inner']/div[3]/div/div[1]/div[1]")
    private WebElement monthRentTitle;
    @FindBy (xpath = "//*[@class='panel__left-scroll-inner']/div[3]/div/div[1]/div[2]")
    private WebElement monthRentValue;
    @FindBy (xpath = "//*[@class='panel__left-scroll-inner']/div[3]/div/div[2]/div[1]")
    private WebElement yearRentTitle;
    @FindBy (xpath = "//*[@class='panel__left-scroll-inner']/div[3]/div/div[2]/div[2]")
    private WebElement yearRentValue;
    @FindBy (xpath = "//*[@class='btn btn--outline btn--outline-tablet-larger popup-open']")
    private WebElement roomReserveButton;
    @FindBy (xpath = "//*[@class='panel__left-scroll-inner']/div[5]/div/div/div[1]")
    private WebElement phonesTitle;
    @FindBy (xpath = "//*[@class='panel__left-scroll-inner']/div[5]/div/div/div[2]")
    private WebElement phone1;
    @FindBy (xpath = "//*[@class='panel__left-scroll-inner']/div[5]/div/div/div[3]")
    private WebElement phone2;
    @FindBy (xpath = "//*[@class='back back--active']")
    private WebElement backButton;
    @FindBy(xpath = "//*[@class='h-overlay-switcher__icon home home-active']")
    private WebElement homeButton;
    @FindBy (xpath = "//*[@class='toggler__button toggler__button--active toggler-js-toggle']")
    private WebElement planSwitchButton;
    @FindBy (xpath = "//*[@id='plan-common']//descendant::*[@id='_x34__x5F__x23_4']//child::*[@class='svg-pan-zoom_viewport']")
    private WebElement commonPlanScale;
    @FindBy (xpath = "//*[@id='plan-large']//descendant::*[@id='Layer_1']//child::*[@class='svg-pan-zoom_viewport']")
    private WebElement largePlanScale;
    @FindBy (xpath = "//*[@id='plan-common']//descendant::div[@class='control esvg-zoom-in']/i")
    private WebElement commonZoomInButton;
    @FindBy (xpath = "//*[@id='plan-common']//descendant::div[@class='control esvg-zoom-out']/i")
    private WebElement commonZoomOutButton;
    @FindBy (xpath = "//*[@id='plan-common']//descendant::div[@class='control esvg-zoom-reset']/i")
    private WebElement commonZoomResetButton;
    @FindBy (xpath = "//*[@id='plan-large']//descendant::div[@class='control esvg-zoom-in']/i")
    private WebElement largeZoomInButton;
    @FindBy (xpath = "//*[@id='plan-large']//descendant::div[@class='control esvg-zoom-out']/i")
    private WebElement largeZoomOutButton;
    @FindBy (xpath = "//*[@id='plan-large']//descendant::div[@class='control esvg-zoom-reset']/i")
    private WebElement largeZoomResetButton;
    @FindBy (xpath = "//*[@data-selector='#plan-large']")
    private WebElement largePlanTitle;
    @FindBy (xpath = "//*[@data-selector='#plan-common']")
    private WebElement commonPlanTitle;
    @FindBy (xpath = "//*[@class='slick-list draggable']")
    private WebElement photoSlider;
    @FindBy (xpath = "//*[@class='item slick-slide slick-current slick-active']//descendant::img")
    private WebElement firstPhotoInTheList;
    @FindBy (xpath = "//*[@class='slick-next slick-arrow']")
    private WebElement nextPhotoButton;
    @FindBy (xpath = "//*[@class='fancybox-inner']//child::img[@class='fancybox-image']")
    private WebElement popUpCurrentPhoto;
    @FindBy (xpath = "//*[@class='fancybox-outer']//child::a[@class='fancybox-nav fancybox-prev']")
    private WebElement previousPhoto;
    @FindBy (xpath = "//*[@class='fancybox-outer']//child::a[@class='fancybox-nav fancybox-next']")
    private WebElement nextPhoto;
    @FindBy (xpath = "//*[@class='fancybox-item fancybox-close']")
    private WebElement photoPopUpCloseButton;


    public boolean checkIfPresentTitle(){
        Wait();
        return roomTitle.isDisplayed();
    }
    public boolean checkIfPresentSpaceTitle(){
        Wait();
        return spaceTitle.isDisplayed();
    }
    public boolean checkIfPresentSpaceValue(){
        Wait();
        return spaceValue.isDisplayed();
    }
    public boolean checkIfPresentFloorTitle(){
        Wait();
        return floorTitle.isDisplayed();
    }
    public boolean checkIfPresentFloorValue(){
        Wait();
        return floorValue.isDisplayed();
    }
    public boolean checkIfPresentRentTypeTitle(){
        Wait();
        return rentTypeTitle.isDisplayed();
    }
    public boolean checkIfPresentRentTypeValue(){
        Wait();
        return rentTypeValue.isDisplayed();
    }
    public boolean checkIfPresentRentPeriodTitle(){
        Wait();
        return rentPeriodTitle.isDisplayed();
    }
    public boolean checkIfPresentRentPeriodValue(){
        Wait();
        return rentPeriodValue.isDisplayed();
    }
    public boolean checkIfPresentDepositTitle(){
        Wait();
        return depositTitle.isDisplayed();
    }
    public boolean checkIfPresentDepositValue(){
        Wait();
        return depositValue.isDisplayed();
    }
    public boolean checkIfPresentMonthRentTitle(){
        Wait();
        return monthRentTitle.isDisplayed();
    }
    public boolean checkIfPresenMonthRentValue(){
        Wait();
        return monthRentValue.isDisplayed();
    }
    public boolean checkIfPresentYearRentTitle(){
        Wait();
        return yearRentTitle.isDisplayed();
    }
    public boolean checkIfPresentYearRentValue(){
        Wait();
        return yearRentValue.isDisplayed();
    }
    public boolean checkIfPresentRoomReserverButton(){
        Wait();
        return roomReserveButton.isDisplayed();
    }
    public boolean checkIfPresentPhonesTitle(){
        Wait();
        return phonesTitle.isDisplayed();
    }
    public boolean checkIfPresentPhone1Value(){
        Wait();
        return phone1.isDisplayed();
    }
    public boolean checkIfPresentPhone2Value(){
        Wait();
        return phone2.isDisplayed();
    }
    public boolean checkIfPresentPlanSwitchButton(){
        Wait();
        return planSwitchButton.isDisplayed();
    }
    public boolean checkIfPresentTitleLargePlan(){
        Wait();
        return largePlanTitle.isDisplayed();
    }
    public boolean checkIfPresentTitleCommonPlan(){
        Wait();
        return commonPlanTitle.isDisplayed();
    }
    public boolean checkIfPresentPhotoSlider(){
        Wait();
        return photoSlider.isDisplayed();
    }
    public boolean checkIfPresentCommonZoomInButton(){
        Wait();
        return commonZoomInButton.isDisplayed();
    }
    public boolean checkIfPresentCommonZoomOutButton(){
        Wait();
        return commonZoomOutButton.isDisplayed();
    }
    public boolean checkIfPresentCommonZoomResetButton(){
        Wait();
        return commonZoomResetButton.isDisplayed();
    }
    public boolean checkIfPresentNextPhotoButton(){
        Wait();
        return nextPhotoButton.isDisplayed();
    }
    public boolean checkIfPresentPopUpCloseButton(){Wait(); return photoPopUpCloseButton.isDisplayed();}
    public String getRoomTitleText(){return roomTitle.getText();}
    public String getRoomSpaceTitleText(){return spaceTitle.getText();}
    public String getRoomFloorTitleText(){return floorTitle.getText();}
    public String getRoomRentTypeTitleText(){return rentTypeTitle.getText();}
    public String getRoomRentPeriodTitleText(){return rentPeriodTitle.getText();}
    public String getRoomDepositTitleText(){return depositTitle.getText();}
    public String getSpaceValueText(){return spaceValue.getText();}
    public String getFloorValueText(){return floorValue.getText();}
    public String getRentTypeValueText(){return rentTypeValue.getText();}
    public String getDepositValueText(){return depositValue.getText();}
    public String getRentPeriodValueText(){return rentPeriodValue.getText();}
    public String getRoomMonthRentTitleText(){return monthRentTitle.getText();}
    public String getRoomYearRentTitleText(){return yearRentTitle.getText();}
    public String getMonthRentValueText(){return monthRentValue.getText();}
    public String getYearRentValueText(){return yearRentValue.getText();}
    public String getRoomPhonesTitleText(){return phonesTitle.getText();}
    public String getPhone1ValueText(){return phone1.getText();}
    public String getPhone2ValueText(){return phone2.getText();}
    public String getRoomReserveButtonText(){return roomReserveButton.getText();}
    public String getCurrentPopUpPhotoName(){
        Wait();
        return popUpCurrentPhoto.getAttribute("src");
    }
    public String getCurrentSliderPhotoName(){
        Wait();
        return firstPhotoInTheList.getAttribute("src");
    }
    public double getLargePlanScale(){
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='plan-large']//descendant::div[@class='control esvg-zoom-in']/i")));
        return UsefullFunctions.getTransformMatrixValues(largePlanScale);
    }
    public double getCommonPlanScale(){
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='plan-common']//descendant::div[@class='control esvg-zoom-in']/i")));
        return UsefullFunctions.getTransformMatrixValues(commonPlanScale);
    }
    public void clickReserveRoomButton(){Wait();roomReserveButton.click();}
    public void openFirstPhotoInTheList(){
        Wait();
        firstPhotoInTheList.click();
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fancybox-inner']//child::img[@class='fancybox-image']")));
        }
    public void clickNextPhotoButton(){Wait();nextPhotoButton.click();}
    public void clickPhotoPopUpCloseButton(){Wait();photoPopUpCloseButton.click();}
    public void clickBackButton(){Wait();backButton.click();}
    public void clickHomeButton(){Wait();homeButton.click();}
    public void clickSwitchPlanButton(){
        planSwitchButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='plan-large']//descendant::div[@class='control esvg-zoom-in']/i | //*[@id='plan-common']//descendant::div[@class='control esvg-zoom-in']/i")));
    }
    public void clickCommonZoomInButton(){Wait();commonZoomInButton.click();}
    public void clickCommonZoomOutButton(){Wait();commonZoomOutButton.click();}
    public void clickCommonZoomResetButton(){Wait();commonZoomResetButton.click();}
    public void clickLargeZoomInButton(){Wait();largeZoomInButton.click();}
    public void clickLargeZoomOutButton(){Wait();largeZoomOutButton.click();}
    public void clickLargeZoomResetButton(){Wait();largeZoomResetButton.click();}
    public void clickPhotoPopUpPrevious(){
        Wait();
        previousPhoto.click();
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fancybox-inner']//child::img[@class='fancybox-image']")));
    }
    public void clickPhotoPopUpNext() {
        Wait();
        nextPhoto.click();
        WebDriverWait wait = new WebDriverWait(driver, 30); //seconds
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='fancybox-inner']//child::img[@class='fancybox-image']")));
    }
}

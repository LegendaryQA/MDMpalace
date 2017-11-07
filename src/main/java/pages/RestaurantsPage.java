package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RestaurantsPage extends StartPage {
    public RestaurantsPage(WebDriver driver) {
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

    /** RESTAURANTS BLOCK BUTTONS AND ACTIONS */
    @FindBy(xpath = "//*[@class='g-block__more']//child::a[@href='/infrastructure/renters/#1']")
    private WebElement allRestaurantsLink;
    @FindBy(xpath = "//*[@href='http://www.24coffee.ru/']//child::span")
    private WebElement coffeeTimeLink;
    @FindBy (xpath = "//*[@href='http://fuda.su/']//child::span")
    private WebElement fudaLink;
    @FindBy (xpath = "//*[@href='http://www.prazdnikvkusa.ru/']//child::span")
    private WebElement prazdnikVkusaLink;
    @FindBy (xpath = "//*[@href='http://www.starbucks.com/']//child::span")
    private WebElement starBucksLink;
    @FindBy (xpath="//*[@class='g-blocks-more']//child::a[@href='/infrastructure/renters/']")
    private WebElement allArendatorsLink;
    @FindBy (xpath = "//*[@id='restaurants']//child::div[@class='panel__close panel-deactivate']")
    private WebElement restaurantsCloseButton;
    @FindBy (xpath = "//*[@id='restaurants']//descendant::div[@class='g-block g-block--primary g-block--restaurants']//descendant::div[@class='g-block__title']")
    private WebElement restInnerTitle;
    @FindBy (xpath = "//*[@href='http://www.24coffee.ru/']//child::div[@class='g-block__title']")
    private WebElement coffeTimeTitle;
    @FindBy (xpath = "//*[@href='http://www.24coffee.ru/']//child::div[@class='g-block__subtitle g-block__subtitle--small']")
    private WebElement coffeTimeDescription;
    @FindBy (xpath = "//*[@href='http://fuda.su/']//child::div[@class='g-block__title']")
    private WebElement fudaTitle;
    @FindBy (xpath = "//*[@href='http://fuda.su/']//child::div[@class='g-block__subtitle g-block__subtitle--small']")
    private WebElement fudaDescription;
    @FindBy (xpath = "//*[@href='http://www.prazdnikvkusa.ru/']//child::div[@class='g-block__title']")
    private WebElement vkusaTitle;
    @FindBy (xpath = "//*[@href='http://www.prazdnikvkusa.ru/']//child::div[@class='g-block__subtitle g-block__subtitle--small']")
    private WebElement vkusaDescription;
    @FindBy (xpath = "//*[@href='http://www.starbucks.com/']//child::div[@class='g-block__title']")
    private WebElement starBucksTitle;
    @FindBy (xpath = "//*[@href='http://www.starbucks.com/']//child::div[@class='g-block__subtitle g-block__subtitle--small']")
    private WebElement starBucksDescription;
    @FindBy (xpath = "//*[@id='restaurants']//descendant::div[@class='panel__title']")
    private WebElement restMostPopularTitle;

    public void clickAllRestaurantsLink(){
        Wait();
        allRestaurantsLink.click();}
    public void clickCoffeeTimeLink(){
        Wait();
        coffeeTimeLink.click();}
    public void clickFudaLink(){
        Wait();
        fudaLink.click();}
    public void clickPrazdnikVkusaLink(){
        Wait();
        prazdnikVkusaLink.click();}
    public void clickStarBucksLink(){
        Wait();
        starBucksLink.click();}
    public void clickAllArendatorsLink(){
        Wait();
        allArendatorsLink.click();}
    public void clickRestaurantsCloseButton(){
        Wait();
        restaurantsCloseButton.click();}
    public boolean checkIfPresentRestaurantsLink(){
        Wait();
        return allRestaurantsLink.isDisplayed();
    }
    public boolean checkIfPresentInnerTitle(){
        Wait();
        return restInnerTitle.isDisplayed();
    }
    public boolean checkIfPresentMostPopularTitle(){
        Wait();
        return restMostPopularTitle.isDisplayed();
    }
    public boolean checkIfPresentCoffeeTimeTitle(){
        Wait();
        return coffeTimeTitle.isDisplayed();
    }
    public boolean checkIfPresentCoffeeTimeDescription(){
        Wait();
        return coffeTimeDescription.isDisplayed();
    }
    public boolean checkIfPresentCoffeeTimeButton(){
        Wait();
        return coffeeTimeLink.isDisplayed();
    }
    public boolean checkIfPresentFudaTitle(){
        Wait();
        return fudaTitle.isDisplayed();
    }
    public boolean checkIfPresentFudaDescription(){
        Wait();
        return fudaDescription.isDisplayed();
    }
    public boolean checkIfPresentFudaButton(){
        Wait();
        return fudaLink.isDisplayed();
    }
    public boolean checkIfPresentVkusaTitle(){
        Wait();
        return vkusaTitle.isDisplayed();
    }
    public boolean checkIfPresentVkusaDescription(){
        Wait();
        return vkusaDescription.isDisplayed();
    }
    public boolean checkIfPresentVkusaButton(){
        Wait();
        return prazdnikVkusaLink.isDisplayed();
    }
    public boolean checkIfPresentStarBucksTitle(){
        Wait();
        return starBucksTitle.isDisplayed();
    }
    public boolean checkIfPresentStarBucksDescription(){
        Wait();
        return starBucksDescription.isDisplayed();
    }
    public boolean checkIfPresentStarBucksButton(){
        Wait();
        return starBucksLink.isDisplayed();
    }
    public boolean checkIfPresentAllArendatorsButton(){
        Wait();
        return allArendatorsLink.isDisplayed();
    }
    public String getRestInnerTitle(){return restInnerTitle.getText();}
    public String getRestAllRestsButtonText(){return allRestaurantsLink.getText();}
    public String getRestMostPopularTitle(){return restMostPopularTitle.getText();}
    public String getRestCoffeTimeTitle(){return coffeTimeTitle.getText();}
    public String getRestCoffeTimeDescription(){return coffeTimeDescription.getText();}
    public String getRestCoffeTimeButtonText(){return coffeeTimeLink.getText();}
    public String getRestFudaTitle(){return fudaTitle.getText();}
    public String getRestFudaDescription(){return fudaDescription.getText();}
    public String getRestFudaButtonText(){return fudaLink.getText();}
    public String getRestVkusaTitle(){return vkusaTitle.getText();}
    public String getRestVkusaDescription(){return vkusaDescription.getText();}
    public String getRestVkusaButtonText(){return prazdnikVkusaLink.getText();}
    public String getRestStarBucksTitle(){return starBucksTitle.getText();}
    public String getRestStarBucksDescription(){return starBucksDescription.getText();}
    public String getRestStarBucksButtonText(){return starBucksLink.getText();}
    public String getRestAllArendatorsButtonText(){return allArendatorsLink.getText();}
}

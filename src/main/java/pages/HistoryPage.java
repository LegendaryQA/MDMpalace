package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HistoryPage extends StartPage {
    public HistoryPage(WebDriver driver) {
        super(driver);
    }

    private void Wait(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @FindBy (xpath = "//*[@class='title-corner']")
    private WebElement leftTitle;
    @FindBy (xpath = "//*[@id='item-1']//h1")
    private WebElement historyTitle;
    @FindBy (xpath = "//*[@id='item-2']//h1")
    private WebElement ideaTitle;
    @FindBy (xpath = "//*[@id='item-3']//h1")
    private WebElement musicleTitle;
    @FindBy (xpath = "//*[@class='sync-scroll-bottom__next sync-scroll-bottom-next']/i")
    private WebElement nextButton;
    @FindBy (xpath = "//*[@class='sync-scroll-bottom__prev sync-scroll-bottom-prev']/i")
    private WebElement previousButton;
    @FindBy (xpath = "//*[@class='history-stages']//div[1]/div[@class='history-stage__title']")
    private WebElement historyBlock;
    @FindBy (xpath = "//*[@class='history-stages']//div[2]/div[@class='history-stage__title']")
    private WebElement ideaBlock;
    @FindBy (xpath = "//*[@class='history-stages']//div[3]/div[@class='history-stage__title']")
    private WebElement musicleBlock;
    @FindBy (xpath = "//*[@id='item-1']//*[@class='intro-text intro-text--medium']")
    private WebElement historyIntro;
    @FindBy (xpath = "//*[@id='item-2']//*[@class='intro-text intro-text--medium']")
    private WebElement ideaIntro;
    @FindBy (xpath = "//*[@id='item-3']//*[@class='intro-text intro-text--medium']")
    private WebElement musicleIntro;
    @FindBy (xpath = "//*[@id='item-1']//*[@class='intro-text intro-text--medium']//following-sibling::p[2]")//*[@id='item-1']//*[@class='section__scroll-inner container']/p[3]
    private WebElement historyDescription;
    @FindBy (xpath = "//*[@id='item-2']//*[@class='intro-text intro-text--medium']//following-sibling::p[2]")
    private WebElement ideaDescription1;
    @FindBy (xpath = "//*[@id='item-2']//*[@class='intro-text intro-text--medium']//following-sibling::p[3]")
    private WebElement ideaDescription2;
    @FindBy (xpath = "//*[@id='item-2']//*[@class='intro-text intro-text--medium']//following-sibling::p[4]")
    private WebElement ideaDescription3;
    @FindBy (xpath = "//*[@id='item-3']//*[@class='intro-text intro-text--medium']//following-sibling::p[2]")
    private WebElement musicleDescription;
    @FindBy (xpath = "//*[@class='history-stages']//div[1]/div[@class='history-stage__overlay']")
    private WebElement scrollInfo;
    @FindBy (xpath = "//*[@class='history-stages']/div[@class='history-stage sync-scroll-bottom-center active']")
    private WebElement currentBlock;
    @FindBy (xpath = "//*[@id='item-3']//*[@href='/event/']")
    private WebElement musicleBuyButton;

    public void clickNext(){Wait();nextButton.click();}
    public void clickPrevious(){Wait();previousButton.click();}
    public void clickOnHistoryBlock(){Wait();historyBlock.click();}
    public void clickOnIdeaBlock(){Wait();ideaBlock.click();}
    public void clickOnMusicleBlock(){Wait();musicleBlock.click();}
    public void clickOnBuyTicketButton(){Wait();musicleBuyButton.click();}
    public String getLeftCornerTitle(){return leftTitle.getText();}
    public String getHistoryTitleText(){return historyTitle.getText();}
    public String getHistoryDescriptionText(){return historyDescription.getText();}
    public String getHistoryBlockText(){return historyBlock.getText();}
    public String getHistoryIntroText(){return historyIntro.getText();}
    public String getIdeaTitleText(){return ideaTitle.getText();}
    public String getIdeaBlockText(){return ideaBlock.getText();}
    public String getIdeaIntroText(){return ideaIntro.getText();}
    public String getIdeaDescription1Text(){return ideaDescription1.getText();}
    public String getIdeaDescription2Text(){return ideaDescription2.getText();}
    public String getIdeaDescription3Text(){return ideaDescription3.getText();}
    public String getMusicleTitleText(){return musicleTitle.getText();}
    public String getMusicleBlockText(){return musicleBlock.getText();}
    public String getMusicleDescriptionText(){return musicleDescription.getText();}
    public String getMusicleIntroText(){return musicleIntro.getText();}
    public String getCurrentBlockText(){return currentBlock.getText();}
    public String getBuyTicketButtonText(){return musicleBuyButton.getText();}
    public boolean checkIfPresentLeftCornerTitle(){Wait();return leftTitle.isDisplayed();}
    public boolean checkIfPresentHistoryTitle(){Wait();return historyTitle.isDisplayed();}
    public boolean checkIfPresentHistoryBlock(){Wait();return historyBlock.isDisplayed();}
    public boolean checkIfPresentHistoryDescription(){Wait();return historyDescription.isDisplayed();}
    public boolean checkIfPresentHistoryIntro(){Wait();return historyIntro.isDisplayed();}
    public boolean checkIfPresentIdeaTitle(){Wait();return ideaTitle.isDisplayed();}
    public boolean checkIfPresentIdeaBlock(){Wait();return ideaBlock.isDisplayed();}
    public boolean checkIfPresentIdeaDescription1(){Wait();return ideaDescription1.isDisplayed();}
    public boolean checkIfPresentIdeaDescription2(){Wait();return ideaDescription2.isDisplayed();}
    public boolean checkIfPresentIdeaDescription3(){Wait();return ideaDescription3.isDisplayed();}
    public boolean checkIfPresentIdeaIntro(){Wait();return ideaIntro.isDisplayed();}
    public boolean checkIfPresentMusicleTitle(){Wait();return musicleTitle.isDisplayed();}
    public boolean checkIfPresentMusicleBlock(){Wait();return musicleBlock.isDisplayed();}
    public boolean checkIfPresentMusicleIntro(){Wait();return musicleIntro.isDisplayed();}
    public boolean checkIfPresentMusicleDescription(){Wait();return musicleDescription.isDisplayed();}
    public boolean checkIfPresentNextButton(){
        Wait();
        try{
            return nextButton.isDisplayed();
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }
    public boolean checkIfPresentPreviousButton(){
        Wait();
        try{
        return previousButton.isDisplayed();
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }
    public boolean checkIfPresentBuyTicketButton(){Wait();return musicleBuyButton.isDisplayed();}

}

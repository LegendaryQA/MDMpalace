package tools;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static tools.BasicTestConditions.driver;

public class UsefullFunctions {

    private static void Wait(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void switchToMainTab(){
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        // change focus to new tab
        driver.switchTo().window(newTab.get(0));
    }
    public static void switchToNewTab(){
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        // change focus to new tab
        driver.switchTo().window(newTab.get(1));
    }
    public static void closeNonUsefullTabs(){
        switchToMainTab();
        String originalHandle = driver.getWindowHandle();
        for(String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }
        driver.switchTo().window(originalHandle);
    }
    public static double getTransformMatrixValues(WebElement element){
        String matrixValue = element.getAttribute("style");
        String matrixValues = matrixValue.replaceAll("[a-zA-Z]","").replace(":","").replace("(","").replace(")","").replace(";","");
        String[] doubles = matrixValues.split(",");
        int temp = (int)(Double.parseDouble(doubles[0])*100.0);
        double shortDouble = ((double)temp)/100.0;
        return shortDouble;
    }

    static WebDriverWait wait = new WebDriverWait(driver, 60);
    static JavascriptExecutor js  = (JavascriptExecutor) driver;
    public static void waitForPageLoaded() {
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                Boolean res = (js.executeScript("return document.readyState").equals("complete"));
                System.out.println("[DEBUG] waitForPageLoaded: " + res);
                return res;
            }
        });
    }
}

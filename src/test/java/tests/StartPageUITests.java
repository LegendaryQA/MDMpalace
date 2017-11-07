package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tools.BasicTestConditions;

import java.util.Calendar;

public class StartPageUITests extends BasicTestConditions{


    @Test
    public void checkPresenceOfSevenPagers(){
        Assert.assertTrue(startPage.checkIfAdvantagesPagerIsPresent());
        Assert.assertTrue(startPage.checkIfRestaurantsPagerIsPresent());
        Assert.assertTrue(startPage.checkIfEventsPagerIsPresent());
        Assert.assertTrue(startPage.checkIfRentPagerIsPresent());
        Assert.assertTrue(startPage.checkIfInfrastructurePagerIsPresent());
        Assert.assertTrue(startPage.checkIfContactsPagerIsPresent());
        Assert.assertTrue(startPage.checkIfMainPagerIsPresent());
    }
    @Test
    public void checkLeftFooter(){
        Calendar now = Calendar.getInstance();
        String year = Integer.toString(now.get(Calendar.YEAR));
        Assert.assertTrue(startPage.getLeftFooterText().contains(year +" © АО «Московский дворец молодежи»"));
        Assert.assertTrue(startPage.getLeftFooterText().contains("+7 (499) 246-18-46"));
    }
    @Test
    public void checkRightFooter(){
        Assert.assertTrue(startPage.getRightFooterText().contains("Сделано в"));
    }
    @Test
    public void checkPresenceOfLeftMenuButton(){
        Assert.assertTrue(startPage.checkIfLeftMenuButtonIsPresent());
    }
    @Test
    public void checkPresenceOfAdvantagesBlock(){
        Assert.assertTrue(startPage.checkIfAdvanatgesBlockIsPresent());
    }
    @Test
    public void checkPresenceOfRestaurantsBlock(){
        Assert.assertTrue(startPage.checkIfRestaurantsBlockIsPresent());
    }
    @Test
    public void checkPresenceOfEventsBlock(){
        Assert.assertTrue(startPage.checkIfEventsBlockIsPresent());
    }
    @Test
    public void checkPresenceOfRentBlock(){
        Assert.assertTrue(startPage.checkIfRentBlockIsPresent());
    }
    @Test
    public void checkPresenceOfMainTitle(){
        Assert.assertTrue(startPage.checkIfPresentMainTitle());
    }
    @Test
    public void checkPresenceOfSubTitle(){
        Assert.assertTrue(startPage.checkIfPresentSubTitle());
    }
    @Test
    public void checkPresenceOfVkLink(){
        Assert.assertTrue(startPage.checkIfPresentVkLink());
    }
    @Test
    public void checkPresenceOfFaceBookLink(){
        Assert.assertTrue(startPage.checkIfPresentFaceBookLink());
    }
    @Test
    public void checkPresenceOfTwitterLink(){
        Assert.assertTrue(startPage.checkIfPresentTwitterLink());
    }
    @Test
    public void checkPresenceOfOkLink(){
        Assert.assertTrue(startPage.checkIfPresentOkLink());
    }
    @Test
    public void checkPresenceOfInstagramLink(){
        Assert.assertTrue(startPage.checkIfPresentInstagramLink());
    }
    @Test
    public void checkMainTitlesText(){
        Assert.assertEquals(startPage.getMainTitleText(),"Московский дворец молодежи");
        Assert.assertEquals(startPage.getMainSubTitleText(),"МЕСТО ДЛЯ ВСТРЕЧ");
    }
    @Test
    public void checkAdvanatgesBlockText(){
        Assert.assertEquals(startPage.getAdvantagesTitleText(),"Преимущества");
        Assert.assertEquals(startPage.getAdvatagesSubTitleText(),"УДОБСТВА ДЛЯ ВСЕХ");
    }
    @Test
    public void checkRestaurantsBlockText(){
        Assert.assertEquals(startPage.getRestaurantsTitleText(),"Рестораны");
        Assert.assertEquals(startPage.getRestaurantsSubTitelText(),"");
    }
    @Test
    public void checkEventsBlockText(){
        Assert.assertEquals(startPage.getEventsTitleText(),"Афиша");
        Assert.assertEquals(startPage.getEventsSubTitleText(),"МЕРОПРИЯТИЯ");
    }
    @Test
    public void checkRentBlockText(){
        Assert.assertEquals(startPage.getRentTitleText(),"Аренда");
        Assert.assertEquals(startPage.getRentSubTitleText(),"ПЛОЩАДИ И СТАВКИ");
    }
}

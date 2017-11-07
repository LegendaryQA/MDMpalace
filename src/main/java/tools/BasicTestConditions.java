package tools;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BasicTestConditions {

    protected static final String BASEURL = PropertiesProvider.getProperty("base.url");
    private static final int TIMEOUT = Integer.parseInt(PropertiesProvider.getProperty("time.out"));

    protected static WebDriver driver;
    protected static StartPage startPage;
    protected static AdvantagesPage advantagesPage;
    protected static RestaurantsPage restaurantsPage;
    protected static EventsPage eventsPage;
    protected static RentPage rentPage;
    protected static InfrastructurePage infrastructurePage;
    protected static ContactsPage contactsPage;
    protected static RoomInfoPage roomInfoPage;
    protected static RoomsRentPage roomsRentPage;
    protected static ReserveRoomPopUp reserveRoomPopUp;
    protected static GreatHallPage greatHallPage;
    protected static ParquetHallPage parquetHallPage;
    protected static HistoryPage historyPage;

    private static String webdriverName = PropertiesProvider.getProperty("webdriver.name");
    /** This methods will be executed before every test class*/

    @BeforeClass (alwaysRun = true)
    public void beforeClassSetUp() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        driver = (WebDriver) Class.forName(webdriverName).newInstance();
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(BASEURL);
        startPage = new StartPage(driver);
        advantagesPage = new AdvantagesPage(driver);
        restaurantsPage = new RestaurantsPage(driver);
        eventsPage = new EventsPage(driver);
        rentPage = new RentPage(driver);
        infrastructurePage = new InfrastructurePage(driver);
        contactsPage = new ContactsPage(driver);
        roomInfoPage = new RoomInfoPage(driver);
        roomsRentPage = new RoomsRentPage(driver);
        reserveRoomPopUp = new ReserveRoomPopUp(driver);
        greatHallPage = new GreatHallPage(driver);
        parquetHallPage = new ParquetHallPage(driver);
        historyPage = new HistoryPage(driver);
        }
    /** This methods will be executed after every test class*/
    @AfterClass (alwaysRun = true)
    public static void afterClassTearDown() {
        driver.quit();
    }
}

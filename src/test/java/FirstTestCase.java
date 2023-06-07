import core.SingletonBrowserClass;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;

import static PageObjects.ContactPage.contactPage;
import static PageObjects.GeneralPage.generalPage;
import static PageObjects.StartPage.startPage;

public class FirstTestCase {

    SingletonBrowserClass singletonBrowserClass = SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
    WebDriver driver = singletonBrowserClass.getDriver();

    @Test
    @Tag("MyFirstTest")
    public void firstTestCase(){
        System.out.println("FirstTest");
        generalPage.doOpenBrowserWithLink("http://selenium.webtesting.eu/");
        startPage.checkHeaderContributionsIsShown();
        generalPage.clickOnElementWithId("menu-item-134");
        generalPage.assertTabTitle("Testseite-Kontaktformular – Selenium");
        contactPage.checkBusinessIsChecked();
        contactPage.checkPrivateIsNotChecked();
    }

    @Test
    @Tag("MySecondTestcase")
    public void secondTestCase(){
        System.out.println("SecondTest");
    }

    @BeforeEach
    public void browserOptions(){
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        if(driver!=null){
            driver.quit();
        }
    }
}

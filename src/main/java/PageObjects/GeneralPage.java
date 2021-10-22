package PageObjects;

import core.GeneralHelper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GeneralPage extends GeneralHelper {
    public static final GeneralPage generalPage = new GeneralPage();
    public static GeneralPage getInstance(){
        return generalPage;
    }

    public void doOpenBrowserWithLink(String url){
        driver.get(url);
    }

    public void clickOnElementWithId(String id){
        driver.findElement(By.id(id)).click();
    }

    public void assertTabTitle(String title){
        Assertions.assertTrue(driver.getTitle().toLowerCase().contains(title));
    }

    public WebElement waitUntilElementClickable(WebElement e, int duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(e));
        return e;
    }
}

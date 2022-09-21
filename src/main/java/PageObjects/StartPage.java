package PageObjects;

import core.GeneralHelper;
import org.openqa.selenium.By;

public class StartPage extends GeneralHelper {
    public static final StartPage startPage = new StartPage();
    public static StartPage getInstance(){
        return startPage;
    }

    public static final By newEntries = By.xpath("//h2[contains(text(),'Neue Beiträge')]");

    public void checkHeaderContributionsIsShown(){
        generalPage.waitUntilElementClickable(driver.findElement(newEntries),10).isDisplayed();
    }
}

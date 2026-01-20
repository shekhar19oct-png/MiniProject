package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class GoogleHomePage {
    private WebDriver driver;

    @FindBy(name = "q")
    private WebElement searchBox;

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void search(String keyword) {
        searchBox.sendKeys(keyword);
        searchBox.sendKeys(Keys.RETURN);
    }
}

package tests;

import base.BaseTest;
import pages.GoogleHomePage;
import utils.ExcelUtils;
import utils.ScreenshotUtils;
import utils.WaitUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void searchCognizant() throws Exception {
        String keyword = ExcelUtils.getCellData(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 0, 0);

        GoogleHomePage home = new GoogleHomePage(driver);
        home.search(keyword);

        WebElement stats = WaitUtils.waitForElement(driver, By.id("result-stats"), 10);
        System.out.println("Result stats: " + stats.getText());

        ScreenshotUtils.captureScreenshot(driver, "searchResults");
    }
}

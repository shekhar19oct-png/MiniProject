package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser) {
        driver = DriverFactory.getDriver(browser);
        driver.get("https://www.google.com/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}

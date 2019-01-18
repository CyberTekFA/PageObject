package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected SoftAssert softAssert;

    @BeforeMethod
    public void setDriver(){
        driver = Driver.getDriver();
        actions = new Actions(driver);
        softAssert = new SoftAssert();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
    }
    @AfterMethod
    public void tearDownPages(){
        softAssert.assertAll();
        Driver.closrDriver();
    }
}

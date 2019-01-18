package homePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="email")
    public WebElement userName;

    public void openUrl(){
        Driver.getDriver().get("http:facebook.com");
    }
}

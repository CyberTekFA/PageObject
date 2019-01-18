package test;

import homePages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Facebook extends TestBase {

    HomePage facebook = new HomePage();

    @Test
    public void test(){

        facebook.openUrl();
    }
}

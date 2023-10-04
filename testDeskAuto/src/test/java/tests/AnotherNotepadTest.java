package tests;

import base.Base;
import desktopObjects.NotePadObject;
import io.appium.java_client.windows.WindowsDriver;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import routes.Routes;
import windriver.WinDriver;

import java.net.URL;

public class AnotherNotepadTest extends  Base {


    @BeforeTest (alwaysRun = true)
    public void setup() throws Exception {
        loadConfig();
    }

    @AfterMethod (alwaysRun = true)
    public void teardow()  {
        driver.quit();
    }


    @Test
    public void checkHelpAboutNowTest(){
        NotePadObject np = new NotePadObject();

        np.click_help_button();

    }




}

package base;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import routes.Routes;
import windriver.WinDriver;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WindowsDriver<WindowsElement> driver = null;

    Routes route = new Routes();

    public void loadConfig() throws Exception{
        DesiredCapabilities capability = new DesiredCapabilities();

        capability.setCapability("ms:experimental-webdriver", true);
        capability.setCapability("app",route.getNotepad_path());
        capability.setCapability("platformName", "Windows");
        capability.setCapability("deviceName", "Windows10Machine");

        /* Start WinAppDriver.exe so that it can start listening to incoming requests */
        WinDriver.start();

        driver = new WindowsDriver<>(new URL("http://127.0.0.1:4723/"), capability);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);



    }




}

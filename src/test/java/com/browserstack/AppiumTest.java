package com.browserstack;

import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;


public class AppiumTest {

    public IOSDriver driver;

    @BeforeMethod(alwaysRun=true)
    public void setUp() throws Exception {
        MutableCapabilities options = new XCUITestOptions();
        /*DesiredCapabilities options = new DesiredCapabilities();
        options.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
        options.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        options.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 14 Pro Simulator");
        options.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.4");
        options.setCapability(MobileCapabilityType.UDID, "350B3668-6B0C-4729-84E4-62569319E5CC");
        options.setCapability(MobileCapabilityType.APP, "/Users/adityagupta/Downloads/Wikipedia.app");*/
        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"),options);
    }

    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }
}

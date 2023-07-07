package com.browserstack;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class FirstTest extends AppiumTest {

  @Test
  public void testBstackSample() throws Exception {
    WebElement textButton = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
        ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Text Button")));
    textButton.click();
    WebElement textInput = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
        ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Text Input")));
    textInput.sendKeys("hello@browserstack.com"+"\n");

    Thread.sleep(5000);

    WebElement textOutput = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
        ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Text Output")));

    Assert.assertEquals(textOutput.getText(),"hello@browserstack.com");
  }
  
  /*@Test
  public void testWiki() throws Exception {
    WebElement skipButton = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
        ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]")));
    skipButton.click();
    
    //Thread.sleep(2000);
    
    WebElement settingsButton1 = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
        ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeToolbar/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")));
    settingsButton1.click();

    WebElement loginBar = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
        ExpectedConditions.elementToBeClickable(AppiumBy.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")));
    loginBar.click();
    
    WebElement usernameInput = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
            ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//XCUIElementTypeApplication[@name=\"Wikipedia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")));
        usernameInput.sendKeys("SilverScar25");
        
    WebElement passwordInput = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
            ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//XCUIElementTypeApplication[@name=\"Wikipedia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")));
        passwordInput.sendKeys("Aditya@098");
        
    WebElement loginBtn = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
            ExpectedConditions.elementToBeClickable(AppiumBy.xpath("(//XCUIElementTypeStaticText[@name=\"Log in\"])[2]")));
        loginBtn.click();
        
    WebElement notNowBtn = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
            ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Not Now")));
        notNowBtn.click();
        
    List<WebElement> syncDialog = driver.findElements(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Got it\"]"));
    if(syncDialog.size() > 0) {
    	syncDialog.get(0).click();
    }
        
    WebElement closeBtn = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
            ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Close")));
        closeBtn.click();
   
    WebElement searchInput1 = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
            ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Search Wikipedia")));
    	searchInput1.click();
    	
	WebElement searchInput2 = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
            ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Search Wikipedia")));
        searchInput2.sendKeys("BrowserStack");
        
    List<WebElement> allProductsName = driver.findElements(AppiumBy.accessibilityId("No results found"));
    Assert.assertFalse(allProductsName.size() > 0);
    
    WebElement cancelBtn = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
            ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Cancel\"]")));
        cancelBtn.click();
        
    WebElement settingsButton2 = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
            ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Settings")));
        settingsButton2.click();
    
    WebElement accBar = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
            ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//XCUIElementTypeApplication[@name=\"Wikipedia\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]")));
        accBar.click();
    
    WebElement logoutBtn = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
            ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Log out")));
        logoutBtn.click();
        
    WebElement confirmLogoutBtn = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(50)).until(
            ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Log out\"]")));
        confirmLogoutBtn.click();
        
    
    
        
  }*/
}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[starts-with(text(),'Reg')]")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTab;


    public void clickOnLoginLink(){
        log.info("Clicking on login link" + loginLink.toString());
        clickOnElement(loginLink);
    }
    public String getLogininlink(){
        return getTextFromElement(loginLink);
    }

    public void clickOnRegisterLink(){
        log.info("Clicking on Register link");
        clickOnElement(registerLink);
    }

    public void clickOnComputers(){
        log.info("Clicking on Computer Tab");
        clickOnElement( computerTab);
    }

}


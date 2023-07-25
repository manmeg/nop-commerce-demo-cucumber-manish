package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement verifyDesktops;

    @CacheLookup
    @FindBy(xpath ="//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourComputerlink;


    public String getDesktopsText(){
        log.info("Verify Desktops Text");
        return getTextFromElement(verifyDesktops);
    }
    public void clickOnBuildYourComputer(){
        log.info("Clicking on Build Your Computer Product name "+ buildYourComputerlink.toString());
        clickOnElement(buildYourComputerlink);
    }
}

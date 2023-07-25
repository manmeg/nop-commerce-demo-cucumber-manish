package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath ="//select[@name='product_attribute_1']")
    WebElement processor;

    @CacheLookup
    @FindBy(css ="#product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_3']")
    //List<WebElement> hddRadio;
    WebElement    hddRadio;

    @CacheLookup
    @FindBy(xpath = "//input[@name= 'product_attribute_4']")
    WebElement osRadio;

    @CacheLookup
    @FindBy(xpath = "//input[@name= 'product_attribute_5']")
    WebElement msOfficeSoftware;

    @CacheLookup
    @FindBy(xpath ="//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath ="//p[@class='content']")
    WebElement verifyProductAddedToCart;
    public void selectProcessor(String text){
        log.info("Select Processor in Processor dropdown");
        selectByVisibleTextFromDropDown(processor,text);
    }
    public void selectRAM(String text){
        log.info("Select RAM in RAM dropdown");
        selectByVisibleTextFromDropDown(ram,text);
    }
    public void selectHDDRadio(String text) {
        log.info("Clicking on HDD Radio");
        mouseHoverToElementAndClick(hddRadio);
    }


    public void selectOSRadio(String text){
        log.info("Clicking on OS Radio");
        mouseHoverToElementAndClick(osRadio);
    }
    public void selectSoftwareMS(String text) {
        log.info("Clicking on Software check box");
        mouseHoverToElementAndClick(msOfficeSoftware);
    }
    public void clickOnAddToCartButton() {
        log.info("Clicking on add to cart button"+ addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String verifyTheProductHasBeenAddedToYourShoppingCart(){
        log.info("Getting The product has been added to your shopping cart Message");
        return getTextFromElement(verifyProductAddedToCart);
    }
}

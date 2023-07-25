package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Log out')]")
    WebElement  logOutlink;

    public String getWelcomeText() {
        log.info("Getting Welcome Text");
        return getTextFromElement(welcomeText);
    }
    public void enterEmailId(String email){
        log.info("Enter email " +email+" to email field" + emailField.toString());
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        log.info("Enter password " +password+" to password field" + passwordField.toString());
        sendTextToElement(passwordField,password);
    }

    public void clickOnLogInButton(){
        log.info("Clicking on Login Button"+ loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        log.info("getting error message"+errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
    public String getlogOutlink() {
        log.info("Getting LogOut link Display");
        return getTextFromElement(logOutlink);
    }

    public void clickOnLogOutLink(){
        log.info("Clicking on Logout Button"+ logOutlink.toString());
        clickOnElement(logOutlink);
    }
}

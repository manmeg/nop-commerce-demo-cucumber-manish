package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class LoginPageSteps {

    @And("I click on Log in link")
    public void iClickOnLogInLink() {
        new HomePage().clickOnLoginLink();

    }

    @When("I Enter email {string}")
    public void iEnterEmailDiueshGmailCom(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I Enter password {string}")
    public void iEnterPasswordDivuesh(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I Click on Log in Button")
    public void iClickOnLogInButton() {
        new LoginPage().clickOnLogInButton();
    }

    @And("I Verify that LogOut link is display {string}")
    public void iVerifyThatLogOutLinkIsDisplayLogOut(String link) {
        Assert.assertEquals("Logout not display", link, new LoginPage().getlogOutlink());
    }

    @Then("Login is successfully")
    public void loginIsSuccessfully() {
    }

    @And("I Click on log out link")
    public void iClickOnLogOutLink() {
        new LoginPage().clickOnLogOutLink();
    }

    @And("I Verify that LogIn Link Display {string}")
    public void iVerifyThatLogInLinkDisplayLogIn(String link) {
        Assert.assertEquals("Log in link not display", link, new HomePage().getLogininlink());
    }

    @Then("Log out is successfully")
    public void logOutIsSuccessfully() {
    }
}

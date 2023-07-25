package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterPageSteps {
    @And("I click on Register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @When("I Should see the Register Text {string}")
    public void iShouldSeeTheRegisterTextRegister(String Result) {
        Assert.assertEquals("Text is not match", Result, new RegisterPage().getRegisterText());
    }

    @When("I click on Register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButtonLink();
    }

    @And("I Should see Firstname error message {string}")
    public void iShouldSeeFirstnameErrorMessageFirstNameIsRequired(String Firstname) {
        Assert.assertEquals("Text is not match", Firstname, new RegisterPage().getFirstNameRequiredMessage());

    }

    @And("I Should see Lastname error message {string}")
    public void iShouldSeeLastnameErrorMessageLastNameIsRequired(String lastname) {
        Assert.assertEquals("Text is not match", lastname, new RegisterPage().getLastNameRequiredMessage());
    }

    @And("I Should see Email error message {string}")
    public void iShouldSeeEmailErrorMessageEmailIsRequired(String email) {
        Assert.assertEquals("Text is not match", email, new RegisterPage().getEmailRequiredMessage());
    }

    @And("I Should see Password error message {string}")
    public void iShouldSeePasswordErrorMessagePasswordIsRequired(String password) {
        Assert.assertEquals("Text is not match", password, new RegisterPage().getPasswordRequiredMessage());
    }

    @Then("I Should see Confirm Password error message {string}")
    public void iShouldSeeConfirmPasswordErrorMessagePasswordIsRequired(String confirmpassword) {
        Assert.assertEquals("Text is not match", confirmpassword, new RegisterPage().getConfirmPassRequiredMessage());
    }

    @When("I select Gender {string}")
    public void iSelectGenderFemale(String gender) {
        new RegisterPage().SelectGenderFemale();
    }

    @And("I Enter Firstname {string}")
    public void iEnterFirstnameDiuesh(String firstname) {
        new RegisterPage().inputFirstname(firstname);
    }

    @And("I Enter Lastname {string}")
    public void iEnterLastnameRoman(String lastname) {
        new RegisterPage().inputLastname(lastname);
    }

    @And("I Select Birth of day {string}")
    public void iSelectBirthOfDay(String DAY) {
        new RegisterPage().selectDay(DAY);
    }

    @And("I Select Birth of month {string}")
    public void iSelectBirthOfMonthJune(String month) {
        new RegisterPage().selectMonth(month);
    }

    @And("I Select Birth of Year {string}")
    public void iSelectBirthOfYear(String year) {
        new RegisterPage().selectYear(year);
    }

    @And("I Enter Email {string}")
    public void iEnterEmailDiueshGmailCom(String email) {
        new RegisterPage().inputEmail(email);
    }

    @And("I Enter Password {string}")
    public void iEnterPasswordDivuesh(String password) {
        new RegisterPage().inputPassword(password);
    }

    @And("I Enter Confirm Password {string}")
    public void iEnterConfirmPasswordDivuesh(String confirmpassword) {
        new RegisterPage().inputConfirmPassword(confirmpassword);
    }

    @And("I Should see the register created {string}")
    public void iShouldSeeTheRegisterCreatedYourRegistrationCompleted(String message) {
        Assert.assertEquals("Message not match", message, new RegisterPage().getYourRegisterText());
    }

    @Then("Register is successfully")
    public void registerIsSuccessfully() {
    }
}

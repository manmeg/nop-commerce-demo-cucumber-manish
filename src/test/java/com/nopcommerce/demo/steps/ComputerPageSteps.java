package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageSteps
{
    @And("I Click on Computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputers();
    }

    @When("I Should see the Computer Text {string}")
    public void iShouldSeeTheComputerTextComputer(String text) {
        Assert.assertEquals("text not match", "Computers", new ComputerPage().getComputersText());
    }

    @Then("I Should navigate to Computer page successfully")
    public void iShouldNavigateToComputerPageSuccessfully() {
    }

    @When("I Click on Desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktops();
    }

    @And("I Should see the Desktops Text {string}")
    public void iShouldSeeTheDesktopsTextDesktops(String text) {
        Assert.assertEquals("text not match", text, new DesktopsPage().getDesktopsText());
    }

    @Then("I Should navigate to Desktops page successfully")
    public void iShouldNavigateToDesktopsPageSuccessfully() {

    }

    @And("Click on product name Build your own computer")
    public void clickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().clickOnBuildYourComputer();
    }

    @And("I Select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I Select RAM {string}")
    public void iSelectRAM(String Ram) {
        new BuildYourOwnComputerPage().selectRAM(Ram);
    }

    @And("I  Select HDD {string}")
    public void iSelectHDD(String HDD) {
        new BuildYourOwnComputerPage().selectHDDRadio(HDD);
    }

    @And("I Select OS {string}")
    public void iSelectOS(String OS) {
        new BuildYourOwnComputerPage().selectOSRadio(OS);
    }

    @And("I Select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftwareMS(software);
    }

    @And("I Click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @And("I Verify message {string}")
    public void iVerifyMessage(String Result) {
        Assert.assertEquals("message not match", Result, new BuildYourOwnComputerPage().verifyTheProductHasBeenAddedToYourShoppingCart());

    }

    @Then("I should Product add to card is successfully")
    public void iShouldProductAddToCardIsSuccessfully() {
    }
}

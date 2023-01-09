package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.InventoriPage;
import org.example.pageObject.LoginPage;
import org.example.pageObject.UserInformationPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class PurchaseSteps {

    private WebDriver webDriver;

    public PurchaseSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User sort product list from z to a")
    public void selectProductContainer() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        String a = "Name (Z to A)";
        inventoriPage.selectProductContainer(a);
        Thread.sleep(2000);
    }

    @And("User pick item Sauce Labs Onice")
    public void clickItemBasket1() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket1();
        Thread.sleep(2000);
    }

    @And("User pick item Test.allTheThingsT-Shirt")
    public void clickItemBasket2() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket2();
        Thread.sleep(2000);

    }

    @And("User click shopping cart")
    public void clickShoppingCart() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickShoppingCart();
        Thread.sleep(2000);

    }

    @Then("verify item 1 display on Landing Page")
    public void verifyCartItem1() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.verifyCartItem1());
        Thread.sleep(2000);
    }

    @Then("verify item 2 display on Landing Page")
    public void verifyCartItem2() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.verifyCartItem2());
        Thread.sleep(2000);
    }

    @And("User Click Remove Button for 1 Item Test.allTheThingsT-ShirtRed")
    public void clickRemoveItem2() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickRemoveItem2();
        Thread.sleep(3000);
    }

    @And("User Click Button CheckOut")
    public void clickBtnCheckOut() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBtnCheckOut();
        Thread.sleep(3000);
    }

    @When("User input \"(.*)\" as fisrtName and input \"(.*)\" as lastName and input \"(.*)\" as postal code")
    public void inputUserInformation(String firstrName, String lastName, String postalCode) throws InterruptedException {
        UserInformationPage userInformationPage = new UserInformationPage(webDriver);
        userInformationPage.setFirstName(firstrName);
        userInformationPage.setLastName(lastName);
        userInformationPage.setPostalCode(postalCode);
        userInformationPage.clickContinue();
        Thread.sleep(2000);
    }

    @Then("verify item Total")
    public void verifyItemTotal() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.verifyItemTotal());
        Thread.sleep(3000);
    }

    @Then("verify tax of payment")
    public void verifyTaxItem() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.verifyTaxItem());
        Thread.sleep(3000);
    }

    @Then("verify total of payment")
    public void verifyTotal() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.verifyTotal());
        Thread.sleep(3000);
    }

    @And("User Click Button Finish")
    public void clickButtonFinish() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickButtonFinish();
        Thread.sleep(3000);
    }

    @Then("user will direct to page CheckOut Complete")
    public void verifyLandingPageChecKOutComplete() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.verifyLandingPageChecKOutComplete());
        Thread.sleep(3000);
    }

    @Then("Pop up Message THANK YOU FOR YOUR ORDER")
    public void verifyThanksPopUpMessage() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.verifyThanksPopUpMessage());
        Thread.sleep(3000);
    }


}


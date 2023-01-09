package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.InventoriPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class LoginSteps {
    private WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;

    }
    @Given("User open the website sauce demo")
    public void verifyDisplay() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        loginPage.isDisplayed();

        Thread.sleep (3000);
    }

    @When("user input \"(.*)\" as userName and input \"(.*)\" as password")
    public void inputCredential(String userName, String password){
        LoginPage loginPage = new LoginPage(webDriver);
        log.println("sudah sampai sini");
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }


    @Then("User see error \"(.*)\" on login page")
    public void errorText(String errorText){
        LoginPage loginpage = new LoginPage(webDriver);
        Assert.assertEquals(errorText, loginpage.getErrorText());
    }






}



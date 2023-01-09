package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    static WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement btnLogin;

    @FindBy(xpath  = "//h3")
    private WebElement errorText;

    @FindBy(xpath  = "//select[@class='product_sort_container']")
    private WebElement selectContainer;


    public void setUserName(String user){
        userName.sendKeys(user);
    }

    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickLogin(){
        btnLogin.click();
    }

    public boolean isDisplayed() {
        userName.isDisplayed();
        return true;
    }

    public String getErrorText(){
        return errorText.getText();
    }

}

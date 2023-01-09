package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInformationPage {
    static WebDriver driver;

    public UserInformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath  = "//input[@id='continue']")
    private WebElement buttonContinue;

    public void setFirstName(String first){
        firstName.sendKeys(first);
    }
    public void setLastName(String last){
        lastName.sendKeys(last);
    }

    public void setPostalCode(String postal){
        postalCode.sendKeys(postal);
    }
    public void clickContinue(){
        buttonContinue.click();
    }
}


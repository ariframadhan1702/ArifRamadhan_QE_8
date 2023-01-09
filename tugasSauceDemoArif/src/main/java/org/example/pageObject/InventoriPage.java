package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoriPage {

    public static WebDriver driver;

    public InventoriPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver ;
    }

    @FindBy(xpath  = "//select[@class='product_sort_container']")
    private WebElement selectContainer;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement basketItem1;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement basketItem2;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement shoppingCart;

    @FindBy(xpath = "//div[.='Sauce Labs Onesie']")
    private WebElement cartItem1;

    @FindBy(xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
    private WebElement cartItem2;

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeItem2;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement BtnCheckOut;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement itemTotal;

    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement taxItem;

    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement total;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement landingPageChecKOutComplete;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement thanksPopUpMessage;


    public void selectProductContainer(String sortProductList){
        Select b = new Select (selectContainer);
        b.selectByVisibleText(sortProductList);
    }
    public void clickBasket1(){
        basketItem1.click();
    }

    public void clickBasket2(){
        basketItem2.click();
    }

    public void clickShoppingCart(){
        shoppingCart.click();
    }

    public boolean verifyCartItem1() {
        cartItem1.isDisplayed();
        return true;

    }

    public boolean verifyCartItem2() {
        cartItem2.isDisplayed();
        return true;

    }
    public void clickRemoveItem2(){
        removeItem2.click();
    }

    public void clickBtnCheckOut(){
        BtnCheckOut.click();
    }
    public boolean verifyItemTotal() {
        itemTotal.isDisplayed();
        return true;
    }
    public boolean verifyTaxItem() {
        taxItem.isDisplayed();
        return true;
    }

    public boolean verifyTotal() {
        total.isDisplayed();
        return true;
    }
    public void clickButtonFinish() {
        finishButton.click();
    }

    public boolean verifyLandingPageChecKOutComplete() {
        landingPageChecKOutComplete.isDisplayed();
        return true;

    }
    public boolean verifyThanksPopUpMessage() {
        thanksPopUpMessage.isDisplayed();
        return true;

    }

}

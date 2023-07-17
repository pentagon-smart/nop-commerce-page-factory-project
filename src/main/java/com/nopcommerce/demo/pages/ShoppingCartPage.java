package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//li[@id='topcartlink']/a[@class='ico-cart']")
    WebElement cart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement changeQty;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-2 update-cart-button']")
    WebElement updateButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[text()='$2,950.00']")
    WebElement productPrice;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[text()='$698.00']")
    WebElement productPrice1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkBoxButton;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOutButton;
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement verifyQty;


    public void mouseHoverAndClickOnCart(){
        mouseHoverTwo(cart,goToCart);
    }
    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public void changeProductQty(String qty){
        driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
        sendTextToElement(changeQty,qty);
        clickOnElement(updateButton);
    }
    public String getProductPrice(){
        return getTextFromElement(productPrice);
    }
    public String getProductPrice1(){
        return getTextFromElement(productPrice1);

    }

    public void clickOnCheckBox(){
        clickOnElement(checkBoxButton);
    }
    public void clickOnCheckOut(){
        clickOnElement(checkOutButton);
    }
    public String getQty(){
        return getTextFromElement(verifyQty);
    }
}

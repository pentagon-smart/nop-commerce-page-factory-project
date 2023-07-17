package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement productText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement productPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement changeQty;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeButton;

    public String  getProductName() {
        return getTextFromElement(productText);
    }

    public String getProductPrice() {
        return getTextFromElement(productPrice);
    }

    public void enterQty(String qty) {
        driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).clear();
        sendTextToElement(changeQty, qty);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String getText(){
        return getTextFromElement(verifyText);
    }
    public void clickOnCloseButton(){
        clickOnElement(closeButton);
    }
}

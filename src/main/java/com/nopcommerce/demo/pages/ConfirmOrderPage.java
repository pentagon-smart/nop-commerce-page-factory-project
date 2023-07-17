package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ConfirmOrderPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement verifyPaymentMethod;
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']/span[@class='value']")
    WebElement VerifyShippingMethod;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[text()='$2,950.00']")
    WebElement verifyTotal;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement verifyThankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifyMessage;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement verifyText;

    public String  getPaymentMthod(){
        return getTextFromElement(verifyPaymentMethod);

    }
    public String  getShippingMethod(){
        return getTextFromElement(VerifyShippingMethod);
    }
    public String getTotal(){
        return getTextFromElement(verifyTotal);
    }
    public void clickOnConfirm(){
        clickOnElement(confirmButton);
    }
    public String getThankYou(){
        return getTextFromElement(verifyThankYouText);
    }

    public String getMessage(){
        return getTextFromElement(verifyMessage);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
    public String getText(){
        return getTextFromElement(verifyText);
    }
}

package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement fName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegisterText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyShoppingCarText;
    public String getText(){
        return getTextFromElement(verifyText);

    }
    public void enterDetails(String name, String surname, String id, String pword, String cword){
        sendTextToElement(fName,name);
        sendTextToElement(lName,surname);
        sendTextToElement(email,id);
        sendTextToElement(password,pword);
        sendTextToElement(confirmPassword,cword);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String  getRegisteText(){
        return getTextFromElement(verifyRegisterText);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
    public String getShoppingCartText(){
        return getTextFromElement(verifyShoppingCarText);
    }

}

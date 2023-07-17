package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyText1;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkOutGuest;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement fName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_StateProvinceId']")
    WebElement address;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement address1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement zipCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement number;
    @CacheLookup
    @FindBy(xpath = "//div[@id='billing-buttons-container']//button[text()='Continue']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerButton;

    public String getproductText(){
        return getTextFromElement(verifyText1);
    }
    public void clickONCheckOutGuest(){
        clickOnElement(checkOutGuest);
    }
    public void enterGuestDetails(String name,String surname, String id, String text, String text1, String text2, String add, String zip, String num)
    {
        sendTextToElement(fName,name);
        sendTextToElement(lName,surname);
        sendTextToElement(email,id);
        selectByVisibleTextFromDropDown(country,text);;
        selectByVisibleTextFromDropDown(address,text1);
        sendTextToElement(city,text2);
        sendTextToElement(address1,add);
        sendTextToElement(zipCode,zip);
        sendTextToElement(number,num);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
}

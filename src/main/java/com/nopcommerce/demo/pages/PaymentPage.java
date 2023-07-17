package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentPage extends Utility {

    By nextDayAir = By.xpath("//input[@id='shippingoption_1']");
    By continueButton = By.xpath("//div[@id='shipping-method-buttons-container']//button[text()='Continue']");

    By creditCard = By.xpath("//input[@id='paymentmethod_1']");
    By nextContinue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    By masterCard = By.xpath("//select[@id='CreditCardType']");

    By name = By.xpath("//input[@id='CardholderName']");
    By number = By.xpath("//input[@id='CardNumber']");
    By expMonth = By.xpath("//select[@id='ExpireMonth']");
    By expYear = By.xpath("//select[@id='ExpireYear']");
    By code = By.xpath("//input[@id='CardCode']");
    By continueButton1 =By.xpath("//div[@id='payment-info-buttons-container']//button[text()='Continue']");


    public void enterCardDetails(){
        sendTextToElement(name,"Poonam");
        sendTextToElement(number,"5425233430109903");
        selectByValueFromDropDown(expMonth,"12");
        selectByValueFromDropDown(expYear,"2026");
        sendTextToElement(code,"0136");
    }
    public void clickOnNextDayAir(){
        clickOnElement(nextDayAir);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
    public void clickOnCreditCard(){
        clickOnElement(creditCard);
        clickOnElement(nextContinue);
    }
    public void selectMasterCard(){
        selectByVisibleTextFromDropDown(masterCard,"Master card");
    }
    public void clickOnContinue1(){
        clickOnElement(continueButton1);
    }

}

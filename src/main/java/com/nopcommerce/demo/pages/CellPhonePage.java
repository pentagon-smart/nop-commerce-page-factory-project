package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CellPhonePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyCellPhone;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listView;
    @CacheLookup
    @FindBy(xpath = "//div[@class='details']//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement productName;

    public String getCellPhoneText(){
        return getTextFromElement(verifyCellPhone);
    }
    public void clickOnListVeiw(){
        clickOnElement(listView);
    }
    public void clickOnProduct(){
        clickOnElement(productName);
    }
}

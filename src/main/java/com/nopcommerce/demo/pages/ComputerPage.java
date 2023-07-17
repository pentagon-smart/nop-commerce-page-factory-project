package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(name = "products-orderby")
    WebElement sortFilterZToA;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortFilterAToZ;
    @CacheLookup
    @FindBy(xpath = "//div[@class='buttons']//button[text()='Add to cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyText1;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ram;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hdd;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement os;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Total Commander [+$5.00]')]")
    WebElement totalCommander;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement price;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartLink;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeButton;


    public void selectSortFilterZToA(String text){
        selectByVisibleTextFromDropDown(sortFilterZToA,text);
    }
    public void selectSortFilterAToZ(int num){
        selectByIndexFromDropDown(sortFilterAToZ,num);
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }

    public String getBuildYourComputer(){
        return getTextFromElement(verifyText1);
    }
    public void selectProcessor(String value){
        selectByValueFromDropDown(processor, value);
    }
    public void selectRam(String value){
        selectByValueFromDropDown(ram,value);
    }

    public void selectHDD(){
        clickOnElement(hdd);
    }
    public void selectOS(){
        clickOnElement(os);
    }
    public void clickOnTotalCommander(){
        clickOnElement(totalCommander);
    }

    public String getPriceText(){
        return getTextFromElement(price);
    }
    public void clickOnAddToCartLink(){
        clickOnElement(addToCartLink);
    }
    public String getProductMessage(){
        return getTextFromElement(productMessage);

    }
    public void clickOnCloseButton(){
        clickOnElement(closeButton);
    }



}

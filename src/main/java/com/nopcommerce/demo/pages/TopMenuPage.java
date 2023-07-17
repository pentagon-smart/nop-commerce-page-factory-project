package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TopMenuPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
    WebElement desktop;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[@href='/electronics']")
    WebElement electronic;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhones;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Name: Z to A')]")
    WebElement productArrange;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement cellPhone;

    public void selectMenu(String menu){

    }
    public void clickOnComputer(){
        clickOnElement(computerMenu);
    }

    public void mouseHoverAndClickOnDesktopMenu(){
        mouseHoverTwo(computerMenu,desktop);
    }
    public void mouseHoverAndClickCellPhone(){
        mouseHoverTwo(electronic,cellPhones);
    }
    public void getCurrentUrl(){
        String expectedPage = "https://demo.nopcommerce.com/computers";
        String actualPage = driver.getCurrentUrl();
        Assert.assertEquals(actualPage,expectedPage,"Page is not displayed");

    }
    public String getProductArrange(){
        return getTextFromElement(productArrange);

    }
    public String getProductCellPhone(){
     return getTextFromElement(cellPhone);

    }

}

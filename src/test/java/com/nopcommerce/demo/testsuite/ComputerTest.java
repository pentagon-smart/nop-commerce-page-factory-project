package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class ComputerTest extends BaseTest {

    ComputerPage computerPage;
    TopMenuPage topMenuPage;
    ShoppingCartPage shoppingCartPage;
    CheckOutPage checkOutPage;
    PaymentPage paymentPage;
    ConfirmOrderPage confirmOrderPage;
    @BeforeMethod(alwaysRun = true)
    public void inIT()
    {
        computerPage = new ComputerPage();
        topMenuPage = new TopMenuPage();
        shoppingCartPage =new ShoppingCartPage();
        checkOutPage = new CheckOutPage();
        paymentPage = new PaymentPage();
        confirmOrderPage = new ConfirmOrderPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        //1.1 Click on Computer Menu.
        //1.2 Click on Desktop
        topMenuPage.mouseHoverAndClickOnDesktopMenu();
        Thread.sleep(1000);
        //1.3 Select Sort By position "Name: Z to A"
        computerPage.selectSortFilterZToA("Name: Z to A");
        Thread.sleep(1000);
        //1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(topMenuPage.getProductArrange(),"Name: Z to A","Product is not displayed");
    }

    @Test(groups = {"sanity", "smoke","regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        //2.1 Click on Computer Menu.
        //2.2 Click on Desktop
        topMenuPage.mouseHoverAndClickOnDesktopMenu();
        Thread.sleep(1000);
        //2.3 Select Sort By position "Name: A to Z"
        computerPage.selectSortFilterAToZ(1);
        Thread.sleep(1000);

        //2.4 Click on "Add To Cart"
        computerPage.clickOnAddToCart();
        Thread.sleep(1000);

        //2.5 Verify the Text "Build your own computer"
        Assert.assertEquals(computerPage.getBuildYourComputer(),"Build your own computer","Build your own computer is not displayed");
        Thread.sleep(1000);

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        computerPage.selectProcessor("1");
        Thread.sleep(1000);

        //2.7.Select "8GB [+$60.00]" using Select class.
        computerPage.selectRam("5");
        Thread.sleep(1000);

        //2.8 Select HDD radio "400 GB [+$100.00]"
        computerPage.selectHDD();
        Thread.sleep(1000);

        //2.9 Select OS radio "Vista Premium [+$60.00]"
        computerPage.selectOS();
        Thread.sleep(1000);

        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        computerPage.clickOnTotalCommander();
        Thread.sleep(1000);

        //2.11 Verify the price "$1,475.00"
        Assert.assertEquals(computerPage.getPriceText(),"$1,475.00","$1,475.00 is not displayed");
        Thread.sleep(1000);

        //2.12 Click on "ADD TO CARD" Button.
        computerPage.clickOnAddToCartLink();
        Thread.sleep(1000);
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Assert.assertEquals(computerPage.getProductMessage(),"The product has been added to your shopping cart","Message is not displayed");
        Thread.sleep(1000);

        //After that close the bar clicking on the cross button.
        computerPage.clickOnCloseButton();
        Thread.sleep(1000);

        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        shoppingCartPage.mouseHoverAndClickOnCart();
        Thread.sleep(1000);

        //2.15 Verify the message "Shopping cart"
        Assert.assertEquals(shoppingCartPage.getShoppingCartText(), "Shopping cart", "Shopping cart is not displayed");
        Thread.sleep(1000);

        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeProductQty("2");
        Thread.sleep(1000);

        //2.17 Verify the Total"$2,950.00"
        Assert.assertEquals(shoppingCartPage.getProductPrice(), "$2,950.00", "$2,950.00 is not displayed");
        Thread.sleep(1000);

        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnCheckBox();
        Thread.sleep(1000);

        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOut();
        Thread.sleep(1000);

        //2.20 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(checkOutPage.getproductText(),"Welcome, Please Sign In!","Message is not dispalyed");
        Thread.sleep(1000);

        //2.21Click on “CHECKOUT AS GUEST” Tab
        checkOutPage.clickONCheckOutGuest();
        Thread.sleep(1000);

        //2.22 Fill the all mandatory field
        checkOutPage.enterGuestDetails("Poonam","Ramavat","poonamramavat123@gmail.com","United States","Arizona","New York","Burley Road","FA1234","09887241121");
        Thread.sleep(1000);

        //2.23 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton();
        Thread.sleep(1000);

        //2.24 Click on Radio Button “Next Day Air($0.00)”
        paymentPage.clickOnNextDayAir();
        Thread.sleep(1000);

        //2.25 Click on “CONTINUE”
        paymentPage.clickOnContinue();
        Thread.sleep(1000);

        //2.26 Select Radio Button “Credit Card”
        paymentPage.clickOnCreditCard();
        Thread.sleep(1000);

        // 2.27 Select “Master card” From Select credit card dropdown
        paymentPage.selectMasterCard();
        Thread.sleep(1000);

        //2.28 Fill all the details
        paymentPage.enterCardDetails();
        Thread.sleep(1000);

        //2.29 Click on “CONTINUE”
        paymentPage.clickOnContinue1();
        Thread.sleep(1000);

        //2.30 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(confirmOrderPage.getPaymentMthod(),"Credit Card","Credit Card is not displayed");
        Thread.sleep(1000);

        //2.32 Verify “Shipping Method” is “Next Day Air”
        Assert.assertEquals(confirmOrderPage.getShippingMethod(),"Next Day Air","Next Day Air is not displayed");
        Thread.sleep(1000);

        //2.33 Verify Total is “$2,950.00”

        Assert.assertEquals(confirmOrderPage.getTotal(),"$2,950.00","$2,950.00 is not displaye");
        Thread.sleep(1000);

        //2.34 Click on “CONFIRM”
        confirmOrderPage.clickOnConfirm();
        Thread.sleep(1000);

        //2.35 Verify the Text “Thank You"
        Assert.assertEquals(confirmOrderPage.getThankYou(),"Thank you","Thank you is not displayed");
        Thread.sleep(1000);

        //2.36 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(confirmOrderPage.getMessage(),"Your order has been successfully processed!","Message is not displayed");
        Thread.sleep(1000);

        //2.37 Click on “CONTINUE”
        confirmOrderPage.clickOnContinue();
        Thread.sleep(1000);

        //2.37 Verify the text “Welcome to our store”
        Assert.assertEquals(confirmOrderPage.getText(),"Welcome to our store","text is not displayed");
        Thread.sleep(1000);
    }
}

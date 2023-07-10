package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility
{
    //********************************Men's Shopping cart ***********************************************
    By actualTextShoppingCart= By.xpath("//span[text()='Shopping Cart']");

    By actualTextCronusPant = By.xpath("//div[@class='product-item-details']//a[text()='Cronus Yoga Pant ']");

    By actualTextSize = By.xpath("//dd[contains(text(),'32')]");

    By actualTextColor =By.xpath("//dd[contains(text(),'Black')]");

    //********************************Gears Shopping cart ***********************************************

    By actualTextOvernightDuffleInCart = By.xpath("/td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By actualQuantity = By.xpath("//input[@class='input-text qty']");
    By actualProductPrice = By.xpath("(//span[@class='cart-price']//span)[2]");
    By quantityChangeToFive = By.xpath("//input[@class='input-text qty']");
    By clickOnUpdateShoppingCart = By.xpath("//span[contains(text(),'Update Shopping Cart')]");
    By actualProductPriceChange = By.xpath("(//span[@class='cart-price']//span)[2]");

    //********************************Men's Shopping cart method ****************************************

    // 1.10 Verify the text ‘Shopping Cart.’
    public void verifyTextShoppingCart()
    {
        assertVerifyText(actualTextShoppingCart,"Shopping Cart","Shopping cart text not found");
    }

    // 1.11 Verify the product name ‘Cronus Yoga Pant’
    public void verifyTextCronusPant()
    {
        //assertVerifyText(actualTextCronusPant,"Cronus Yoga Pant","Cronus Pant text not found");
    }

    // 1.12 Verify the product size ‘32’
    public void verifyTextOfSize()
    {
        assertVerifyText(actualTextSize,"32","Size text not found");
    }

    // 1.13 Verify the product colour ‘Black’
    public void verifyTextOfColor()
    {
        assertVerifyText(actualTextColor,"Black","Black text not found");
    }

    //******************************Gears shopping cart methods**************************************

    //1.9 Verify the product name ‘Overnight Duffle’
    public void verifyTextOvernightDuffle()
    {
        assertVerifyText(actualTextOvernightDuffleInCart, "Overnight Duffle", "Overnight Duffle not found");
    }

    //1.10 Verify the Qty is ‘3’
    public void verifyQuantity()
    {
        assertVerifyText(actualQuantity, "3","Quantity 3 not found");
    }

    //1.11 Verify the product price ‘$135.00’
    public void verifyProductPrice()
    {
        assertVerifyText(actualProductPrice, "$135.00","Product price not found");
    }

    //1.12 Change Qty to ‘5’
    public void changeQuantity()
    {
        driver.findElement(By.xpath("//input[@class='input-text qty']")).clear();
        sendTextToElement(quantityChangeToFive,"5");
    }

    //1.13 Click on ‘Update Shopping Cart’ button
    public void clickOnUpdateButton()
    {
        clickOnElement(clickOnUpdateShoppingCart);
    }

    //1.14 Verify the product price ‘$225.00’
    public void verifyProductPriceChange()
    {
        assertVerifyText(actualProductPriceChange,"$225.00", "Product price not Updated");
    }
}

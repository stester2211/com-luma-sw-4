package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility
{
    By productGearLink = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By actualTextOvernightDuffle = By.xpath("//span[contains(text(),'Overnight Duffle')]");
    By changeQuantity = By.xpath("//input[@id='qty']");
    By clickOnAddToCartButton = By.xpath("//span[contains(text(),'Add to Cart')]");
    By actualTextDuffleAdded = By.xpath("//div[@class='message-success success message']");
    By cilckOnShoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");

    //1.3 Click on Product Name ‘Overnight Duffle’
    public void clickOnOverNightDuffle()
    {
        clickOnElement(productGearLink);
    }

    //1.4 Verify the text ‘Overnight Duffle’
    public void verifyTextOvernightDuffle()
    {
        assertVerifyText(actualTextOvernightDuffle, "Overnight Duffle","Overnight Duffle text not found");
    }

    //1.5 Change Qty 3
    public void GearchangeQuantity()
    {
       driver.findElement(By.xpath("//input[@id='qty']")).clear();
       sendTextToElement(changeQuantity,"3");
    }

    //1.6 Click on ‘Add to Cart’ Button.
    public void userClickOnAddToCart()
    {
        clickOnElement(clickOnAddToCartButton);
    }

    //1.7 Verify the text ‘You added Overnight Duffle to your shopping cart.’
    public void verifyTextAddDuffle()
    {
        assertVerifyText(actualTextDuffleAdded,"You added Overnight Duffle to your shopping cart.","Overnight Duffle text not found in cart");
    }

    //1.8 Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCart()
    {
        clickOnElement(cilckOnShoppingCartLink);
    }
}

package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility
{
    By productName= By.xpath("//a[contains(text(),'Cronus Yoga Pant')]");
    By clickOnsize= By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");

    By clickOnColor= By.xpath("//div[@id='option-label-color-93-item-49']");

    By clickOnAddToCart =By.xpath("//span[text()='Add to Cart']");

    By actualText= By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    By clickOnShoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");


    // 1.4 Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
    public void verifyUserSelectSize()
    {
        mouseHoverAction(productName, clickOnsize);
    }

    // 1.5  Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
    public void verifyUserClickOnColor()
    {
        mouseHoverAction(productName,clickOnColor);
    }
    // 1.7 Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
    public void verifyUserClickOnAddToCart()
    {
        mouseHoverAction(productName,clickOnAddToCart);
    }

    // 1.8 Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
    public void verifyTextAddedToCart()
    {
       assertVerifyText(actualText,"You added Cronus Yoga Pant to your shopping cart.","Added message not found");
    }

    // 1.9 Click on ‘shopping cart’ Link into message
    public void verifyUserclickOnShoppingCartLink()
    {
        clickOnElement(clickOnShoppingCartLink);
    }
}

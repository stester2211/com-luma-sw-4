package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenTest extends BaseTest
{
    HomePage homePage =new HomePage();
    MenPage menPage=new MenPage();
    ShoppingCartPage shoppingCartPage= new ShoppingCartPage();

    //1. userShouldAddProductSuccessFullyToShoppinCart()
    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart()
    {
        /**1.1 Mouse Hover on Men Menu
         * 1.2 Mouse Hover on Bottoms
         * 1.3 Click on Pants**/
        homePage.clickOnDropdownMen();

        //1.4 Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        menPage.verifyUserSelectSize();

        //1.5 Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
        menPage.verifyUserClickOnColor();

        //1.7 Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
        menPage.verifyUserClickOnAddToCart();

        //1.8 Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        menPage.verifyTextAddedToCart();

        //1.9 Click on ‘shopping cart’ Link into message
        menPage.verifyUserclickOnShoppingCartLink();

        //1.10 Verify the text ‘Shopping Cart.’
        shoppingCartPage.verifyTextShoppingCart();

        //1.11 Verify the product name ‘Cronus Yoga Pant’
        shoppingCartPage.verifyTextCronusPant();

        //1.12 Verify the product size ‘32’
        shoppingCartPage.verifyTextOfSize();

        //1.13 Verify the product colour ‘Black’
        shoppingCartPage.verifyTextOfColor();
    }
}

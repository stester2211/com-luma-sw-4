package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class GearTest extends BaseTest
{
    HomePage homePage= new HomePage();
    ShoppingCartPage shoppingCartPage= new ShoppingCartPage();
    GearPage gearPage= new GearPage();

    //1. userShouldAddProductSuccessFullyToShoppingCart()
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException
    {
        /**1.1 Mouse Hover on Gear Menu
         * 1.2 Click on Bags
         */
        homePage.clickOnDropdownGear();
        Thread.sleep(1000);

        //1.3 Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOverNightDuffle();

        //1.4 Verify the text ‘Overnight Duffle’
        gearPage.verifyTextOvernightDuffle();

        //1.5 Change Qty 3
        gearPage.GearchangeQuantity();

        //1.6 Click on ‘Add to Cart’ Button.
        gearPage.userClickOnAddToCart();

        //1.7 Verify the text ‘You added Overnight Duffle to your shopping cart.’
        gearPage.verifyTextAddDuffle();

        //1.8 Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCart();

        //1.9 Verify the product name ‘Overnight Duffle’
        shoppingCartPage.verifyTextShoppingCart();

        //1.10 Verify the Qty is ‘3’
        //shoppingCartPage.verifyQuantity();

        //1.11 Verify the product price ‘$135.00’
        shoppingCartPage.verifyProductPrice();

        //1.12 Change Qty to ‘5’
        shoppingCartPage.changeQuantity();

        //1.13 Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateButton();
        Thread.sleep(2000);

        //1.14 Verify the product price ‘$225.00’
        shoppingCartPage.verifyProductPriceChange();
    }

}

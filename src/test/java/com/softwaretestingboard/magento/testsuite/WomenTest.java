package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenJacketPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest
{
    HomePage homePage= new HomePage();
    WomenJacketPage jacketPage=new WomenJacketPage();

    @Test
    public void verifyTheSortByProductNameFilter()
    {
        /**
         * All 5 steps in 2 line
         * Import methods from homepage and WomenJacketPage from main package
         * 1.1 Mouse Hover on Women Menu
         * 1.2 Mouse Hover on Tops
         * 1.3 Click on Jackets
         * 1.4 Select Sort By filter “Product Name”
         * 1.5 Verify the products name display in alphabetical order
         */
       homePage.clickOnDropdownWomen();
       jacketPage.selectAndVerifySortByFilterProductName();
    }

    // 2. verifyTheSortByPriceFilter
    @Test
    public void verifyTheSortByPriceFilter()
    {
        /**
         * All 5 steps in 2 line
         * Import methods from homepage and WomenJacketPage from main package
         * 2.1 Mouse Hover on Women Menu
         * 2.2 Mouse Hover on Tops
         * 2.3 Click on Jackets
         * 2.4 Select Sort By filter “Price”
         * 2.5 Verify the products price display in Low to High
         */
        homePage.clickOnDropdownWomen();
        jacketPage.selectAndVerifySortByPrice();
    }

}

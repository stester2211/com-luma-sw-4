package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class WomenJacketPage extends Utility
{
    /**
     * 1.4 Select Sort By filter “Product Name”
     * 1.5 Verify the products name display in alphabetical order
     */
    By filterProductName = By.xpath("//div[@class='toolbar-sorter sorter']//select[@id='sorter']");
    public void selectAndVerifySortByFilterProductName()
    {
        // Import this verification method from Utility class
        listOfElementVerify(By.xpath("//strong[@class='product name product-item-name']//a"), filterProductName, "Product Name", By.xpath("//strong[@class='product name product-item-name']//a"));
    }

    /**
     2.4 Select Sort By filter “Price”
     2.5 Verify the products price display in Low to High
     */
    By filterWithPrice = By.xpath("//div[@class='toolbar-sorter sorter']//select[@id='sorter']");
    public void selectAndVerifySortByPrice()
    {
        // Import this verification method from Utility class
        listOfElementVerify(By.xpath("//span[@class='price-container price-final_price tax weee']"),filterWithPrice,"Price", By.xpath("//span[@class='price-container price-final_price tax weee']"));
    }
}

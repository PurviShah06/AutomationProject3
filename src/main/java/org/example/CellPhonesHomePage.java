package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import javax.swing.*;

public class CellPhonesHomePage extends Utils {
    private By _verifyCellPhonesText=By.xpath("//div[@class=\"page-title\"]/h1[1]");
    private String _expectedCellPhonesText ="Cell phones";
    private By _clickonAddToCartButton1=By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]");
    private By _clickonAddtocartButton2=By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/input[1]");
    private By _clickOnCloseRadioButton=By.cssSelector("span.close");
    private By _clickonShoppingcartButton=By.linkText("Shopping cart");

    public void verifyCellphonePage(){
        waituntillElmentVisible(By.xpath("//div[@class=\"page-title\"]/h1[1]"),200);
        Assert.assertEquals(getElement(_verifyCellPhonesText),_expectedCellPhonesText,"PAGE NOT FOUND");
    }

    public void addItemstoAddtocart(){
        clickable(_clickonAddToCartButton1);//click on add to cart of HTC One
        Sleep1(6);
        waitUntilElementClickable(By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/input[1]"),100);
        clickable(_clickonAddtocartButton2);//clcik on add to cart of Nokia Lumia
        Sleep1(6);
        waitUntilElementClickable(By.cssSelector("span.close"),100);//Add Explicite Wait for 90Sec until click on close button
        clickable(_clickOnCloseRadioButton);// Clcik on close radio button
        clickable(_clickonShoppingcartButton);//Click on shopping cart button
    }
}

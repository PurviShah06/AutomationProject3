package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import javax.swing.*;

public class CellPhonesHomePage extends Utils {
    //Locators store in variables

    private By _verifyCellPhonesText=By.xpath("//div[@class=\"page-title\"]/h1[1]");
    private String _expectedCellPhonesText ="Cell phones";//expected result store in variable
    private By _clickonAddToCartButton1=By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]");
    private By _clickonAddtocartButton2=By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/input[1]");
    private By _clickOnCloseRadioButton=By.cssSelector("span.close");
    private By _clickonShoppingcartButton=By.linkText("Shopping cart");

    public void verifyCellphonePage(){  // Create Void method
        waituntillElmentVisible(_verifyCellPhonesText,200);//Explicite Wait
        Assert.assertEquals(getElement(_verifyCellPhonesText),_expectedCellPhonesText,"PAGE NOT FOUND");//Assert to check Expected mathch to actual
    }

    public void addItemstoAddtocart(){ // create method
      //  waitUntilElementClickable(_clickonAddToCartButton1,100);

        clickable(_clickonAddToCartButton1);//click on add to cart of HTC One

       // waitUntilElementClickable(_clickonAddtocartButton2,200);// add Expllicite Wait

        clickable(_clickonAddtocartButton2);//clcik on add to cart of Nokia Lumia

       // waitUntilElementClickable(_clickOnCloseRadioButton,200);//Add Explicite Wait for 90Sec until click on close button

        clickable(_clickOnCloseRadioButton);// Clcik on close radio button

       // waitUntilElementClickable(_clickonShoppingcartButton,250);//add Explicite wait

        clickable(_clickonShoppingcartButton);//Click on shopping cart button
    }
}

package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends  Utils{

    private By _verifyShoopingcartpagetext=By.xpath("//h1[text()=\"Shopping cart\"]");
    private String _expectedverifyTextOfShoppingCartPage ="Shopping cart";
    private By _actualTextHTCOneM8 =By.xpath("//tbody/tr[1]/td[4]/a");//Store Text in variable by using locators
    private  String  _expectedTextHTCOneM8="HTC One M8 Android L 5.0 Lollipop";
    private By _actualTextNokiaLumia=By.xpath("//tbody/tr[2]/td[4]/a");
    private String _expectedTextforNokiaLumia="Nokia Lumia 1020";


    public void shoppingcartPageVerifyText(){
        waituntillElmentVisible(By.xpath("//h1[text()=\"Shopping cart\"]"),180);
        Assert.assertEquals(getElement(_verifyShoopingcartpagetext),_expectedverifyTextOfShoppingCartPage,"PAGE NOT FOUND");
    }

    public void verifyTextofitemsOnShoopingcart(){
        Assert.assertEquals(getElement(_actualTextNokiaLumia),_expectedTextforNokiaLumia,"Text Not Match");
        waituntillElmentVisible(By.xpath("//tbody/tr[1]/td[4]/a"),60);
        Assert.assertEquals(getElement(_actualTextHTCOneM8),_expectedTextHTCOneM8,"Text Not Match");
    }
}

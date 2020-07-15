package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends  Utils{//create inheritance between Classes
//store locators in variable
    private By _verifyShoopingcartpagetext=By.xpath("//h1[text()=\"Shopping cart\"]");
    private String _expectedverifyTextOfShoppingCartPage ="Shopping cart";
    private By _actualTextHTCOneM8 =By.xpath("//tbody/tr[1]/td[4]/a");//Store Text in variable by using locators
    private  String  _expectedTextHTCOneM8="HTC One M8 Android L 5.0 Lollipop";
    private By _actualTextNokiaLumia=By.xpath("//tbody/tr[2]/td[4]/a");
    private String _expectedTextforNokiaLumia="Nokia Lumia 1020";


    public void shoppingcartPageVerifyText(){
        waituntillElmentVisible(_verifyShoopingcartpagetext,400);//add explicit wait
        Assert.assertEquals(getElement(_verifyShoopingcartpagetext),_expectedverifyTextOfShoppingCartPage,"PAGE NOT FOUND");//Assert to check Expected match to actual
    }

    public void verifyTextofitemsOnShoopingcart(){//create method
        Assert.assertEquals(getElement(_actualTextNokiaLumia),_expectedTextforNokiaLumia,"Text Not Match");//Assert to check Expected match to actual
        waituntillElmentVisible(_actualTextHTCOneM8,200);//add explicit wait
        Assert.assertEquals(getElement(_actualTextHTCOneM8),_expectedTextHTCOneM8,"Text Not Match");//Assert to check Expected match to actual
    }
}

package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DesktopsHomePage extends Utils{//creat inheritance between Classes
    //Store locators in variables
    private By _cliclonDigitalStorm =By.xpath("//div[@class=\"product-grid\"]/div[1]/div[2]/div[1]/div[2]/h2[1]/a");
    private By _actualTextverifyOnDesktopPage=By.xpath("//h1[text()=\"Desktops\"]");
    private String _expectedVerifyTextonDesktopPage ="Desktops";

    public void verifyTextOnDeskTopPage() {//crate method for
        waituntillElmentVisible(_actualTextverifyOnDesktopPage,60);//explicite wait
        Sleep1(6);
        Assert.assertEquals(getElement(_actualTextverifyOnDesktopPage),_expectedVerifyTextonDesktopPage, "PAGE NOT FOUND");//Assert to check Expected match to actual
    }
    public void clickOnAddtoCartOfdigital(){
       waitUntilElementClickable(_cliclonDigitalStorm,200);//add explicit wait
       Sleep1(6);
       clickable(_cliclonDigitalStorm);// call clickable method to click on digital storm button
    }

}

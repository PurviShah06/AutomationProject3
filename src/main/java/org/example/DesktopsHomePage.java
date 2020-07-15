package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DesktopsHomePage extends Utils{
    private By _cliclonDigitalStorm =By.xpath("//div[@class=\"product-grid\"]/div[1]/div[2]/div[1]/div[2]/h2[1]/a");
    private By _actualTextverifyOnDesktopPage=By.xpath("//h1[text()=\"Desktops\"]");
    private String _expectedVerifyTextonDesktopPage ="Desktops";

    public void verifyTextOnDeskTopPage() {
        waituntillElmentVisible(By.xpath("//div[@class=\"product-grid\"]/div[1]/div[2]/div[1]/div[2]/h2[1]/a"),60);
        Sleep1(6);
        Assert.assertEquals(getElement(_actualTextverifyOnDesktopPage),_expectedVerifyTextonDesktopPage, "PAGE NOT FOUND");
        System.out.println(_actualTextverifyOnDesktopPage);
    }
    public void clickOnAddtoCartOfdigital(){
       waitUntilElementClickable(By.xpath("//div[@class=\"product-grid\"]/div[1]/div[2]/div[1]/div[2]/h2[1]/a"),200);
       Sleep1(6);
       clickable(_cliclonDigitalStorm);
    }

}

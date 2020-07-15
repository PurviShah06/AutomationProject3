package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends Utils {

    private By _verifyhomepagetext=By.xpath("//h2[text()=\"Welcome to our store\"]");
    private String _expectedTextofHomepage ="Welcome to our store";
    private By _registerClickButton=By.xpath("//div[@class=\"header-links\"]/ul[1]/li[1]/a");
    private By _clickonComputerButton= By.xpath("//a[text()=\"Computers \"]");
    private By _clickOnElectronics= By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[2]/a");

    public void homepageverification(){

       // waituntillElmentVisible(By.xpath("\"//h2[text()=\\\"Welcome to our store\\\"]"),50);
        Assert.assertEquals(getElement(_verifyhomepagetext),_expectedTextofHomepage,"PAGE NOT FOUND");
    }
    public void ClickonRegisterButton(){
         clickable(_registerClickButton);
    }
    public void clickOnElectronics(){
        clickable(_clickOnElectronics);
    }

    public void clickonComputerButton(){
        clickable(_clickonComputerButton);
    }

}

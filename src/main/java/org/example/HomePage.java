package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends Utils {//create inheritance between Classes
//Store locators in variable
    private By _verifyhomepagetext=By.xpath("//h2[text()=\"Welcome to our store\"]");
    private String _expectedTextofHomepage ="Welcome to our store";
    private By _registerClickButton=By.xpath("//div[@class=\"header-links\"]/ul[1]/li[1]/a");
    private By _clickonComputerButton= By.xpath("//a[text()=\"Computers \"]");
    private By _clickOnElectronics= By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[2]/a");

    public void homepageverification(){//create method

        waituntillElmentVisible(_verifyhomepagetext,50);//add explicit wait
        Assert.assertEquals(getElement(_verifyhomepagetext),_expectedTextofHomepage,"PAGE NOT FOUND");//Assert to check Expected match to actual

    }
    public void ClickonRegisterButton(){//call clickable method for click on register button
         clickable(_registerClickButton);
    }
    public void clickOnElectronics(){

        clickable(_clickOnElectronics);//call clickable method for click on Electronics button
    }

    public void clickonComputerButton(){
        clickable(_clickonComputerButton);//call clickable method for click on Computer button
    }

}

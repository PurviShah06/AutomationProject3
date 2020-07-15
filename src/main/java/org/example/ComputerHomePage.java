package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComputerHomePage extends Utils { //create inheritance between Classes
    //Store locators in variables
    private By _clickOnDesktopButton=By.xpath("//img[@title =\"Show products in category Desktops\"]");
    private By _verifyDesktopPagetext=By.xpath("/h1[text()=\"Desktops\"]");
    private String _expectedTextofDesktop ="Desktops";

    public void verifyTextonDesktoppage(){//void method create
        Assert.assertEquals(getElement(_verifyDesktopPagetext),_expectedTextofDesktop);//Assert to check Expected mathch to actual
        System.out.println("Desktops");
    }
    public void clickOnDesktopButton(){
        waitUntilElementClickable(_clickOnDesktopButton,200);//add Explicite wait
        Sleep1(6);
        clickable(_clickOnDesktopButton);//call Clickable method to click on desktop button
    }
}

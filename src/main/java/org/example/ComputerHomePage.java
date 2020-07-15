package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComputerHomePage extends Utils {
    private By _clickOnDesktopButton=By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/ul[1]/li[1]/a");
    private By _verifyDesktopPagetext=By.xpath("/h1[text()=\"Desktops\"]");
    private String _expectedTextofDesktop ="Desktops";

    public void verifyTextonDesktoppage(){
        Sleep1(3);
        Assert.assertEquals()
        System.out.println(_verifyDesktopPagetext);
    }
    public void clickOnDesktopButton(){
        waitUntilElementClickable(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/ul[1]/li[1]/a"),200);
        Sleep1(5);
        clickable(_clickOnDesktopButton);
    }
}

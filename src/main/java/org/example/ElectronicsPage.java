package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ElectronicsPage extends Utils {//create inheritance between Classes
    private By _clickonCellphoneButton=By.xpath("//li[@class=\"active last\"]/ul[1]/li[2]/a");
    private By _verifyCellphonePageText=By.xpath("//h1[text()=\"Electronics\"]");
    private String _expectedCellPhonePageText ="Electronics";

    public void verifyElectronicsPageText(){
        Assert.assertEquals(getElement(_verifyCellphonePageText),_expectedCellPhonePageText,"PAGE NOT FOUND");
    }
    public  void clickonCellPhoneButton(){
        Sleep1(6);
        clickable(_clickonCellphoneButton);//Click on Cellphone Button
    }
}


package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DigitalStromVANQUISHCustomPerformancePC extends Utils {//create inheritance between Classes
    //store locators in variables
    private By _clickOnEmailFriendButton=By.xpath("//input[@value=\"Email a friend\"]");
    private By _verifyDigitalStromVANQUISHpagetext=By.xpath("//div[@class=\"product-name\"]/h1[1]");
    private String _expectedTextofStromVAQUISH ="Digital Storm Vanquish 3 Desktop PC";


    public void verifyDigitalStormVANQUISHPPageText(){//create method
        Assert.assertEquals(getElement(_verifyDigitalStromVANQUISHpagetext),_expectedTextofStromVAQUISH,"PAGE NOT FOUND");//Assert to check Expected match to actual
    }
    public void clickOnEmailFrndButton(){//create method
        waitUntilElementClickable(_clickOnEmailFriendButton,120);//add explicit wait
        Sleep1(8);
        clickable(_clickOnEmailFriendButton);// call clickable method for click on emailfriend button
    }
}

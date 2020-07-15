package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DigitalStromVANQUISHCustomPerformancePC extends Utils {
    private By _clickOnEmailFriendButton=By.xpath("//input[@value=\"Email a friend\"]");
    private By _verifyDigitalStromVANQUISHpagetext=By.xpath("//div[@class=\"product-name\"]/h1[1]");
    private String _expectedTextofStromVAQUISH ="Digital Storm Vanquish 3 Desktop PC";


    public void verifyDigitalStormVANQUISHPPageText(){
        Assert.assertEquals(getElement(_verifyDigitalStromVANQUISHpagetext),_expectedTextofStromVAQUISH,"PAGE NOT FOUND");
    }
    public void clickOnEmailFrndButton(){
        waitUntilElementClickable(By.xpath("//input[@value=\"Email a friend\"]"),120);
        clickable(_clickOnEmailFriendButton);
    }
}

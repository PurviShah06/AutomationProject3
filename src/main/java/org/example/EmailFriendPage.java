package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailFriendPage extends Utils {//create inheritance between Classes
    private By _verifyEmailAFriendPageText=By.xpath("//input[@id=\"FriendEmail\"]");
    private String _expectedverifyEmailFriendPageText ="FriendEmail";
    private By _FriendMailInput=By.xpath("//input[@id=\"FriendEmail\"]");
    private By _typePersonalMessage=By.xpath("//textarea[@id=\"PersonalMessage\"]");

    public void verifyTextOnEmailAFriendPage(){
        Assert.assertEquals(getElement(_verifyEmailAFriendPageText),_expectedverifyEmailFriendPageText,"PAGE NOT FOUND");
    }

    public void userReferFriend(){
        waitUntilElementClickable(_FriendMailInput,140);
        sendKeyElements(_FriendMailInput,"purvi_mit1@yahoo.co.uk");
        waituntillElmentVisible(_typePersonalMessage,100);
        sendKeyElements(_typePersonalMessage,"Please review for product ");
    }


}

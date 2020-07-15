package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailFriendPage extends Utils {
    private By _verifyEmailAFriendPageText=By.xpath("//input[@id=\"FriendEmail\"]");
    private String _expectedverifyEmailFriendPageText ="FriendEmail";
    private By _FriendMailInput=By.xpath("//input[@id=\"FriendEmail\"]");
    private By _typePersonalMessage=By.xpath("//textarea[@id=\"PersonalMessage\"]");

    public void verifyTextOnEmailAFriendPage(){
        Assert.assertEquals(getElement(_verifyEmailAFriendPageText),_expectedverifyEmailFriendPageText,"PAGE NOT FOUND");
    }

    public void userReferFriend(){
        waitUntilElementClickable(By.xpath("//input[@value=\"Email a friend\"]"),140);
        sendKeyElements(_FriendMailInput,"purvi_mit1@yahoo.co.uk");
        waituntillElmentVisible(By.xpath("//textarea[@id=\"PersonalMessage\"]"),100);
        //Sleep1(20);
        sendKeyElements(_typePersonalMessage,"Please review for product ");
    }


}

package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class UserSuccessfullySentEmail extends  Utils {

    private By _actualTextverifyOfEmailFriend=By.xpath("//div[@class='result']");
    private String _expextexTextOFEmailFriend="Your message has been sent.";
    private By _clickonSendMailButton=By.xpath("//input[@name=\"send-email\"]");

    public void verifyfriendEmailSentmessage(){
        Assert.assertEquals(getElement(_actualTextverifyOfEmailFriend),_expextexTextOFEmailFriend,"Try Again!!!!!!!!!!!!");
        System.out.println(_actualTextverifyOfEmailFriend);
    }
    public void clickOnSendButton(){
        clickable(_clickonSendMailButton);
    }
}


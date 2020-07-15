package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class UserSuccessfullySentEmail extends  Utils {//create inheritance between Classes
//Store locators in variable
    private By _actualTextverifyOfEmailFriend=By.xpath("//div[@class='result']");
    private String _expextexTextOFEmailFriend="Your message has been sent.";
    private By _clickonSendMailButton=By.xpath("//input[@name=\"send-email\"]");

    public void verifyfriendEmailSentmessage(){// create method
        Assert.assertEquals(getElement(_actualTextverifyOfEmailFriend),_expextexTextOFEmailFriend,"Try Again!!!!!!!!!!!!");//Assert to check Expected match to actual
    }
    public void clickOnSendButton(){//create method
        clickable(_clickonSendMailButton);//call clickable method to click send mail button
    }
}


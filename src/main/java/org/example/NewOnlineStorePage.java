package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import sun.security.mscapi.CPublicKey;

public class NewOnlineStorePage extends Utils{
    private String expectedTexttoverifyonNewonlinePage="New online store is open!";
    private By _actualTexttoverifyonNewonlinePage = By.xpath("//h1[text()='New online store is open!']");
    private By _titleBox=By.cssSelector("input#AddNewComment_CommentTitle");
    private By  _Comment =By.xpath("//textarea[@class='enter-comment-text']");
    private By _clickOnAddCommentButton=By.xpath("//input[@name=\"add-comment\"]");
    private By _actualTextofSuccessmessage = By.xpath("//div[text()='News comment is successfully added.']");
    private String expectedTextofSuccessmessage = "News comment is successfully added.";


    public void verifyTextofNewsOnlinePage(){
        //Assert to check Expected mathch to actual
        Assert.assertEquals(getElement(_actualTexttoverifyonNewonlinePage),expectedTexttoverifyonNewonlinePage,"PAGE NOT FOUND");

    }
    public void addCommentonNEwonlineStorePage(){
       // waituntillElmentVisible(_titleBox,100);
        Sleep1(3);
        sendKeyElements(_titleBox,"Polo");
      //  waituntillElmentVisible(_Comment,160);
        Sleep1(3);
        sendKeyElements(_Comment,"This Store is Open 24/7!!!!!");
        Sleep1(3);
      //  waitUntilElementClickable(_clickOnAddCommentButton,140);
        clickable(_clickOnAddCommentButton);
    }
    public void verifyTextofSuccessfullySentMessage(){

        //Assert to check Expected mathch to actual
        Assert.assertEquals(getElement(_actualTextofSuccessmessage),expectedTextofSuccessmessage,"Page NOT Found!!!!!");
}
}

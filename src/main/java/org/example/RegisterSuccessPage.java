package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterSuccessPage extends Utils{

   private By _actualTextofVerifyregistrationcomplete=By.xpath("//div[text()=\"Your registration completed\"]");
   private String _ExpectedTextofRegistrationComplete="Your registration completed";
   private By _clickOnContinueButton=By.cssSelector("input[name=register-continue]");

public void verifyRegistrationCompleteText(){
    Assert.assertEquals(getElement(_actualTextofVerifyregistrationcomplete),_ExpectedTextofRegistrationComplete,"Registration NOT Complete");
}
    public void clickOnContinueButton(){
   //Sleep1(3);
        waitUntilElementClickable(By.cssSelector("input[name=register-continue]"),80);
    clickable(_clickOnContinueButton);

    }

}

package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterSuccessPage extends Utils{//create inheritance between Classes
//store locators variable
   private By _actualTextofVerifyregistrationcomplete=By.xpath("//div[text()=\"Your registration completed\"]");
   private String _ExpectedTextofRegistrationComplete="Your registration completed";
   private By _clickOnContinueButton=By.cssSelector("input[name=register-continue]");

public void verifyRegistrationCompleteText(){
    Assert.assertEquals(getElement(_actualTextofVerifyregistrationcomplete),_ExpectedTextofRegistrationComplete,"Registration NOT Complete");//Assert to check Expected match to actual
}
    public void clickOnContinueButton(){
        waitUntilElementClickable(_clickOnContinueButton,100);//add explicit  Wait
        clickable(_clickOnContinueButton);//call clickable method to click on Continue button

    }

}

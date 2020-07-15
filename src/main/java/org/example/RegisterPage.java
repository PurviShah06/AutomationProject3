package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RegisterPage extends Utils{
      private By _registerpageverifyText=By.xpath("//strong[text()=\"Your Personal Details\"]");
      private  String _expectedTextforVerifyRegisterpage="Your Personal Details";
      private By _genderButton=By.cssSelector("input#gender-female");
      private By _fristName=By.cssSelector("input#FirstName");
      private By _lastName=By.cssSelector("input#LastName");
      private By _dateOfbirth=By.xpath("//select[@name=\"DateOfBirthDay\"]");
      private By _Monthofbirth=By.xpath("//select[@name=\"DateOfBirthMonth\"]");
      private By _YearofBirth=By.xpath("//select[@name=\"DateOfBirthYear\"]");
      private By _Email=By.xpath("//input[@id=\"Email\"]");
      private By _Company=By.xpath("//input[@id=\"Company\"]");
      private By _password=By.xpath("//input[@id=\"Password\"]");
      private By _ConfirmPassword=By.xpath("//input[@id=\"ConfirmPassword\"]");
      private By _NewsletterBox=By.xpath("//input[@id=\"Newsletter\"]");
      private By _ClickonButton=By.xpath("//input[@id=\"register-button\"]");


      public void registerMessageVerificationText()
      {
          Assert.assertEquals(getElement(_registerpageverifyText),_expectedTextforVerifyRegisterpage,"Page Not Found");
          System.out.println(_expectedTextforVerifyRegisterpage);
      }
      public void userEnterRegistrationDetails()
      {
      clickable(_genderButton);
            waituntillElmentVisible(By.cssSelector("input#FirstName"),60);
            Sleep1(3);
      sendKeyElements(_fristName,"Polo");
            waituntillElmentVisible(By.cssSelector("input#FirstName"),80);
      sendKeyElements(_lastName,"Shah");
      selectDropDownVisibleText(_dateOfbirth,"6");
      selectDropDownIndexValue (_Monthofbirth,6);
      selectDropDownValue(_YearofBirth,"1989");
      String date="Textx1+"+TimeStamp()+"@gmail.com";
      sendKeyElements(_Email,date);
      sendKeyElements(_Company,"XYZ ltd.");
      clickable(_NewsletterBox);
      sendKeyElements(_password,"polo1234");
      sendKeyElements(_ConfirmPassword,"polo1234");

     }
      public void clickRegisterButton() {
            clickable(_ClickonButton);
      }
}

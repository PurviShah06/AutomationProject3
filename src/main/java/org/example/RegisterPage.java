package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RegisterPage extends Utils{//create inheritance between Classes
      //Store locators in variable
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


      public void registerMessageVerificationText()//create Method
      {
          Assert.assertEquals(getElement(_registerpageverifyText),_expectedTextforVerifyRegisterpage,"Page Not Found");//Assert to check Expected match to actual
          System.out.println(_expectedTextforVerifyRegisterpage);
      }
      public void userEnterRegistrationDetails()//create Method
      {
      clickable(_genderButton);//call clickable method to select gender
            waituntillElmentVisible(_fristName,60);//add explicit wait
            Sleep1(3);
      sendKeyElements(_fristName,"Polo");//call clickable method to send text to first name
            waituntillElmentVisible(_lastName,80);
      sendKeyElements(_lastName,"Shah");// call sendkeyElements method to send text to last name
      selectDropDownVisibleText(_dateOfbirth,"6");//select date of birth by using method
      selectDropDownIndexValue (_Monthofbirth,6);//select date of month by index value using method
      selectDropDownValue(_YearofBirth,"1989");//select date of year by value calling method
      String date="Textx1+"+TimeStamp()+"@gmail.com";
      sendKeyElements(_Email,date);//call sendkeyElements method to input email
      sendKeyElements(_Company,"XYZ ltd.");//call sendkeyElements to add text in company
      clickable(_NewsletterBox);//method call to untick box
      sendKeyElements(_password,"polo1234");//call method to send text to password by call variable
      sendKeyElements(_ConfirmPassword,"polo1234");//call method to send text to confirm  password box  by call variable
     }
      public void clickRegisterButton() {
            clickable(_ClickonButton);// call clickable method to click on Button
      }
}

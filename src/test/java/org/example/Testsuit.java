package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Testsuit extends BaseTest{//create inheritance between Classes

    //create objects
    HomePage homepage=new HomePage();
    RegisterPage registerpage=new RegisterPage();
    RegisterSuccessPage registersuccessPage =new RegisterSuccessPage();
    ComputerHomePage computerHomePage =new ComputerHomePage();
    DesktopsHomePage desktopsHomePage =new DesktopsHomePage();
    DigitalStromVANQUISHCustomPerformancePC digitalStromVANQUISHCustomPerformancePC =new DigitalStromVANQUISHCustomPerformancePC();
    EmailFriendPage emailFriendPage=new EmailFriendPage();
    UserSuccessfullySentEmail userSuccessfullySentEmail=new UserSuccessfullySentEmail();
    ElectronicsPage electronicsPage =new ElectronicsPage();
    CellPhonesHomePage cellPhonesHomePage =new CellPhonesHomePage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    UserSuccessfullySentEmail usersuccessfullysentemail=new UserSuccessfullySentEmail();
    FaceBookPage faceBookPage =new FaceBookPage();
    NewOnlineStorePage newOnlineStorePage=new NewOnlineStorePage();
    IFrameExample iFrameExample =new IFrameExample();



   @Test (priority = 3)
     public void ListOfPage() {
       List<WebElement> productList = driver.findElements(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div"));
       System.out.println("Product List Size "+""+productList.size());

       for (WebElement product:productList)
       {
       System.out.println(product.getText());
       }
   }
    @Test(priority = 0)// annotation
    public  void usershouldBeregisterSuccessfully() {//creat method to run registration
        homepage.homepageverification();//call method of homepage verification text
        homepage.ClickonRegisterButton();//call method of click on register button
        registerpage.registerMessageVerificationText();//call method of register page verification text
        registerpage.userEnterRegistrationDetails();//call method to complete registration
        registerpage.clickRegisterButton();
        registersuccessPage.verifyRegistrationCompleteText();//call method of registration page verification text
        registersuccessPage.clickOnContinueButton();//call method through object


    }
    @Test (priority = 1)
        public void  registerUserShouldBeableToReferaProductToFriendSuccessfully(){//create method to run refer product to friend
        usershouldBeregisterSuccessfully();// call method
        homepage.clickonComputerButton();//call method through object for click on computer button
        computerHomePage.clickOnDesktopButton();//call method through object for click on desktop button
        computerHomePage.verifyTextonDesktoppage();//call method through object to verification text on desktop page
        desktopsHomePage.verifyTextOnDeskTopPage();//call method through object to verification text on desktop page
        desktopsHomePage.clickOnAddtoCartOfdigital();//call method through object for click on add to cart of digital button
        digitalStromVANQUISHCustomPerformancePC.verifyDigitalStormVANQUISHPPageText();//call method through object for  page verification text
        digitalStromVANQUISHCustomPerformancePC.clickOnEmailFrndButton();// call method through object  to click on emailfriend button
        emailFriendPage.verifyTextOnEmailAFriendPage();//call method through object for  page verification text on emailfriend
        emailFriendPage.userReferFriend();//call method through object
        userSuccessfullySentEmail.verifyfriendEmailSentmessage();//call method through object for  page verification text on verifyfreind email sent message
        userSuccessfullySentEmail.clickOnSendButton();//call method through object for  click send button
    }
    @Test(priority = 2)
    public  void UserShouldVerifyOfElectronicsAddToCartText(){// create method to run verify text of items on shopping cart
        homepage.homepageverification();//call method through object for  page verification text on homepage verification text
        homepage.clickOnElectronics();//call method through object for  click Electronics button
        electronicsPage.verifyElectronicsPageText();//call method through object for  page verification text on
        electronicsPage.clickonCellPhoneButton();//call method through object for  click send button
        cellPhonesHomePage.verifyCellphonePage();//call method through object for  page verification text on emailfriend
        cellPhonesHomePage.addItemstoAddtocart();//call method through object for  click send button
        shoppingCartPage.shoppingcartPageVerifyText();//call method through object for  page verification text on emailfriend
        shoppingCartPage.verifyTextofitemsOnShoopingcart();//call method through object for  click send button
        usersuccessfullysentemail.verifyfriendEmailSentmessage();//call method through object for  page verification text on emailfriend
        usersuccessfullysentemail.clickOnSendButton();//call method through object for  click send button
    }
    @Test// annotation
    public void usercanClickonSearchButtonAndHandleAlertMessageandVerifyAlertTextToo(){
       homepage.homepageverification();//call method through object for  page verification text on homepage verification text
       homepage.clickOnSearchButton();//call method through object for  click search button
       homepage.alertPopUpWindowTextverify();
    }

    @Test
    public void usercanClickButtononFBPAGEandgetcolourofCreatepageButton(){
       homepage.homepageverification();//call method through object for  page verification text on homepage verification text
       homepage.clickonFBbutton();//call method through object for  click Click on FB button
       faceBookPage.verifyFacebookPopUpWindowPage();//call method through object for  page verification text on FaceBook verification text
    }
    @Test
    public void userSelectEurofromDropdownListandsuccessfullyVerifySymbolofEuro(){
       homepage.selectCurrencyfromDropdownBox();//call Method to Execute select currency from dropdown box
    }
    @Test
    public void userCanSuccessfullySendCommentNewOnlinePageAndCanSeeCommentAtLast(){
       homepage.homepageverification();//call method through object for  page verification text on homepage verification text
       homepage.clickOnDetailButtonOnHomePage();
       newOnlineStorePage.verifyTextofNewsOnlinePage();//call method through object for  page verification text on New online Page
       newOnlineStorePage.addCommentonNEwonlineStorePage();
       newOnlineStorePage.verifyTextofSuccessfullySentMessage();//call method through object for  page verification text on Message Sent successfully verification text
    }
    @Test
    public void iFrameSwitchExamplePage(){
       //call method to Execute method for handle iFrame window
        iFrameExample.OpenIframeExamplePage();
    }
}

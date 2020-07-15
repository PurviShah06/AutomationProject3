package org.example;

import org.testng.annotations.Test;

public class Testsuit extends BaseTest{
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
    @Test(priority = 0)
    public  void usershouldBeregisterSuccessfully() {
        homepage.homepageverification();
        homepage.ClickonRegisterButton();
        registerpage.userEnterRegistrationDetails();
        registerpage.registerMessageVerificationText();
        registerpage.clickRegisterButton();
        registersuccessPage.verifyRegistrationCompleteText();
        registersuccessPage.clickOnContinueButton();
    }
    @Test
        public void  registerUserShouldBeableToReferaProductToFriendSuccessfully(){
        usershouldBeregisterSuccessfully();
        homepage.clickonComputerButton();
        computerHomePage.clickOnDesktopButton();
        computerHomePage.verifyTextonDesktoppage();
        desktopsHomePage.verifyTextOnDeskTopPage();
        desktopsHomePage.clickOnAddtoCartOfdigital();
        digitalStromVANQUISHCustomPerformancePC.verifyDigitalStormVANQUISHPPageText();
        digitalStromVANQUISHCustomPerformancePC.clickOnEmailFrndButton();
        emailFriendPage.verifyTextOnEmailAFriendPage();
        emailFriendPage.userReferFriend();
        userSuccessfullySentEmail.verifyfriendEmailSentmessage();
        userSuccessfullySentEmail.clickOnSendButton();
    }
    @Test(priority = 1)
    public  void UserShouldVerifyOfElectronicsAddToCartText(){
        homepage.homepageverification();
        homepage.clickOnElectronics();
        electronicsPage.verifyElectronicsPageText();
        electronicsPage.clickonCellPhoneButton();
        cellPhonesHomePage.verifyCellphonePage();
        cellPhonesHomePage.addItemstoAddtocart();
        shoppingCartPage.shoppingcartPageVerifyText();
        shoppingCartPage.verifyTextofitemsOnShoopingcart();
        usersuccessfullysentemail.verifyfriendEmailSentmessage();
        usersuccessfullysentemail.clickOnSendButton();
    }
}

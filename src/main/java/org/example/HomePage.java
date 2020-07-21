package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomePage extends Utils {//create inheritance between Classes
       //Store locators in variable
       private By _verifyhomepagetext = By.xpath("//h2[text()=\"Welcome to our store\"]");
       private String _expectedTextofHomepage = "Welcome to our store";
       private By _registerClickButton = By.xpath("//div[@class=\"header-links\"]/ul[1]/li[1]/a");
       private By _clickonComputerButton = By.xpath("//a[text()=\"Computers \"]");
       private By _clickOnElectronics = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[2]/a");
       private By _ClcikonSerachButton = By.xpath("//input[@type=\"submit\"]");
       private By _clickonFBButton = By.xpath("//a[text()='Facebook']");
       private By _clickonCurrencySelector = By.xpath("//select[@id=\"customerCurrency\"]");
       private By _clickonDollarCurrencyButton = By.xpath("//select[@id=\"customerCurrency\"]/option[1]");
       private By _clickonEuroCurrencyButton=By.xpath("//select[@id=\"customerCurrency\"]/option[2]");
      // Locators store in variable for news Online
      private By  _clickonDetailButton=By.xpath("//div[@class='news-items']//div[1]//div[3]//a");

       public void homepageverification() {//create method
           waituntillElmentVisible(_verifyhomepagetext, 50);//add explicit wait
           Assert.assertEquals(getElement(_verifyhomepagetext), _expectedTextofHomepage, "PAGE NOT FOUND");//Assert to check Expected match to actual
       }

       public void ClickonRegisterButton() {//call clickable method for click on register button
           clickable(_registerClickButton);
       }

       public void clickOnElectronics() {

           clickable(_clickOnElectronics);//call clickable method for click on Electronics button
       }

       public void clickonComputerButton() {
           clickable(_clickonComputerButton);//call clickable method for click on Computer button
       }

       //Call Clcikable method for click on Search Button
       public void clickOnSearchButton() {
           clickable(_ClcikonSerachButton);
       }

       //Create Method for Handle Alert PopupWindow
       public void alertPopUpWindowTextverify() {
           Alert alert = driver.switchTo().alert();
           String actualTextofAlertPopupwindow = driver.switchTo().alert().getText();
           String expectedTextofAlertPopupwindow = "Please enter some search keyword";
           Assert.assertEquals(actualTextofAlertPopupwindow, expectedTextofAlertPopupwindow, "Result Not Match");//Assert to check Expected match to actual
           alert.accept();//to close Alert Box
       }
       //Call Clcikable method for click on FaceBook Button
       public void clickonFBbutton() {
           clickable(_clickonFBButton);
       }
       //Create Method of Select Currency from DropdownBox and Verify
       public void selectCurrencyfromDropdownBox() {
           selectDropDownVisibleText(_clickonCurrencySelector, "Euro");//
           //store price in variable by using Array List
           List<WebElement> priceSelector = driver.findElements(By.xpath("//div[@class=\"item-grid\"]//div[@class=\"prices\"]"));
           //store products Name in variable by using ArrayLsit
           List<WebElement> ProductList =driver.findElements(By.xpath("//div[@class='product-grid home-page-product-grid']//div[2]/h2/a"));
           //printing out size of prices
           System.out.println(priceSelector.size());

            //for loop for printing out each price of product.
           for (WebElement currencySelector : priceSelector)
           {
               System.out.println(currencySelector.getText());
           }
           Assert.assertEquals(priceSelector.size(),ProductList.size(),"Result Not Match");
       }

       //create method for click on Details Button
           public void clickOnDetailButtonOnHomePage()
       {
               clickable(_clickonDetailButton);
       }
       }




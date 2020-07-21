package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FaceBookPage extends Utils {
    private String expectedURlofFBHomePage = "https://www.facebook.com/nopCommerce";
    private By _actualTextofCreatePage=By.xpath("//button[@class=\"_4jy0 _4jy3 _4jy2 _51sy selected _42ft\"]");
    private String _expectedTextofCreatePage="Create a Page";
    private By  _FindColourofCreatePage=By.xpath("//button[@class=\"_4jy0 _4jy3 _4jy2 _51sy selected _42ft\"]");
    private String actualElementofCreatePageButton="rgba(66, 183, 42, 1)";
    private String expecteElementofCreatePageButton="rgba(66, 183, 42, 1)";


    public void verifyFacebookPopUpWindowPage()
    {
        String MainWindow=driver.getWindowHandle();//to handle main window
        //// To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();//
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                String actualURlofFBHomePage = driver.getCurrentUrl();//Get FB page URL
                Assert.assertEquals(actualURlofFBHomePage,expectedURlofFBHomePage,"PAGE NOT FOUND tRY AGAIN!!!");


                //Verification of Create Page Button Verification
                Assert.assertEquals(getElement(_actualTextofCreatePage),_expectedTextofCreatePage,"Result Not Found");

                //Verification of Create Page Colour Verification
                String ColourofCreateButton=driver.findElement(_FindColourofCreatePage).getCssValue("background-color");
                Assert.assertEquals(actualElementofCreatePageButton,expecteElementofCreatePageButton,"Result Not Found");
                
                driver.close();
            }
        }
          // Switching to Parent window i.e Main Window.
           driver.switchTo().window(MainWindow);
    }
}

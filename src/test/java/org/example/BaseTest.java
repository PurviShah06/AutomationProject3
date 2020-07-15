package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

  public class BaseTest extends Utils{
 BrowserManager browserManager =new BrowserManager();

 @BeforeMethod
  public  void openMainHomePage() {
  browserManager.setBrowser();
 }
// @AfterMethod
//  public void closeUrl() {
//  browserManager.closeApplication();

// }
}


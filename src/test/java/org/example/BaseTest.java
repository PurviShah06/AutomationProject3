package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

  public class BaseTest extends Utils{//create inheritance between Classes
 BrowserManager browserManager =new BrowserManager();//create object

 @BeforeMethod//annotation
  public  void openMainHomePage() {//create method
  browserManager.setBrowser();//call method
 }

 @AfterMethod//annotation
  public void closeUrl(ITestResult getresult) {//create method
  if(ITestResult.FAILURE==getresult.getStatus())
  {
   screenShot(getresult.getName()+TimeStamp());
  }
  browserManager.closeApplication();//call method
 }
}


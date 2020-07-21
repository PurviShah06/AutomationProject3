package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class IFrameExample extends Utils{
    //Declare Variable to store Locators.//

    private String expectedTextonIframePage ="Not a Friendly Topic";
    private By _actualverifyTextonIframePage =By.xpath("//span[text()='Not a Friendly Topic']");
    private By _topicText = By.xpath("//input[@type=\"text\"]");
    private By _checkBox=By.cssSelector("input#a");
    private By _DropdownBox=By.xpath("//select[@id=\"animals\"]");

    public void OpenIframeExamplePage()
    {
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");//open Url

        ////Assert to check Expected match to actual
        Assert.assertEquals(getElement(_actualverifyTextonIframePage),expectedTextonIframePage,"PAge Not Found!!!!!!");

        //switch to Iframe.
        driver.switchTo().frame("frame1");

        //Send Text to Topic Box
        sendKeyElements(_topicText,"This is Topic");

        //Switch to Frame3 from Frame1
        driver.switchTo().frame("frame3");

        //click on CheckBox.
        clickable(_checkBox);

        //Switch to Main parent Frame
        iFrameSwitchTodefaultContent();

        //Switch to Frame2 from Default parent Page
        driver.switchTo().frame("frame2");
        //select value from Drop down List
        selectDropDownValue(_DropdownBox,"avatar");

        //Switch to main Frame
        iFrameSwitchTodefaultContent();
    }
}

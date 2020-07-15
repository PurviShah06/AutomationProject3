package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Utils extends Basepage {
    public void Sleep1(int time)//Method for Thread Sleep Wait
    {
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void whenClickablemehtodNotWorking(By by) {
        WebElement element = driver.findElement(by);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
    public  void waitUntilElementClickable(By by, int waittime)//Method for Explicit Wait
    {
        WebDriverWait wait =new WebDriverWait(driver,waittime);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public  void waituntillElmentVisible(By by,int time)
    {
        WebDriverWait wait=new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public  String getElement(By by)//Method for GetText from Element
    {
        return driver.findElement(by).getText();
    }
    public  void clickable(By by)
    {
        driver.findElement(by).click(); }//Method for Clickable Element

    public  void sendKeyElements(By by, String Text1){//Method for Send Text Element
        driver.findElement(by).click();
        driver.findElement(by).sendKeys(Text1);
    }
    public  long TimeStamp() {//Method for DateTimeStamp

        return (System.currentTimeMillis()); }
    public  void selectDropDownValue(By by, String value){
        Select select=new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public  void selectDropDownIndexValue(By by, int indexvalue){//Method for DropDown box byIndexValue
        Select select=new Select(driver.findElement(by));
        select.selectByIndex(indexvalue);
    }
    public  void selectDropDownVisibleText(By by, String textvalue){//Method for DropDown box by Visible Text
        Select select=new Select(driver.findElement(by));
        select.selectByVisibleText(textvalue);
    }

}

package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {

    public  void setBrowser()//Method for Open HomePage
    {
        //setting up Chromedriver path
        System.setProperty("webdriver.chrome.driver", "src\\test\\BrowserDrivers\\chromedriver.exe");//Open chromedriver Exe
        driver = new ChromeDriver();//Creat ChromeDriver object to open Google Chrome Browser
        driver.manage().window().maximize();//window maximize
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);//default implicit wait for 30 sec to driver instance
        driver.get("https://demo.nopcommerce.com/");//open Url
    }
        public  void closeApplication(){
        driver.close();//Close Application
    }

}

package org.example;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class FileUtils extends  Utils {
    public static void copyFile(File srcFile, File file) {
        TakesScreenshot takesScreenshot=((TakesScreenshot)driver);//convert driver object to TakeScreenshot
        File SrcFile=takesScreenshot.getScreenshotAs(OutputType.FILE);//Call getScreenshotAs method to creat image file
        FileUtils.copyFile(SrcFile,new File("src/test/ScreenShots"));
        System.out.println("Hello");
        driver.quit();
    }
}

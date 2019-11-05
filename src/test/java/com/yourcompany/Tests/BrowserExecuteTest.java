package com.yourcompany.Tests;

import org.junit.Test;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class BrowserExecuteTest extends TestBase {

    private int numberOfCommands = 288;



    public BrowserExecuteTest(String os,
                          String version, String browser, String deviceName, String deviceOrientation) {
        super(os, version, browser, deviceName, deviceOrientation);
    }

    @Test
    public void browserExecuteTest() throws InvalidElementStateException {

        driver.get("chrome://version");
        ((JavascriptExecutor)driver).executeScript("document.getElementsByTagName('body')[0].innerHTML = ''");


        for (int k = 0; k < numberOfCommands; k++) {


            int unboundedRandomValue = ThreadLocalRandom.current().nextInt();

            ((JavascriptExecutor)driver).executeScript(
               // "var startDate = new Date(Date.parse('" + subStr + "'); " +
               // "var endDate = new Date(); " +
               // "var seconds = (endDate.getTime() - startDate.getTime()) / 1000; " +
                "document.getElementsByTagName('body')[0].innerHTML = '<div>" + unboundedRandomValue + "</div>' + document.getElementsByTagName('body')[0].innerHTML;");
        }

        //Date.parse('" + subStr + "')

    }

}

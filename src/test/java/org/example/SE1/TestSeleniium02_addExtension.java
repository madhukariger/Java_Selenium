package org.example.SE1;

import jdk.jfr.Description;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSeleniium02_addExtension {

    @Description("option class")
    @Test
    public void test_Selenium01(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        chromeOptions.addExtensions();
    }
}

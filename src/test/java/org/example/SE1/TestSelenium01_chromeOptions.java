package org.example.SE1;

import jdk.jfr.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium01_chromeOptions {
    @Description("Options class")
    @Test
    public void test_Selenium01() {

       ChromeOptions chromeOptions = new ChromeOptions();
        // FirefoxOptions , chromeoptions ....

       // chromeOptions.addArguments("--window-size=1280,720");
        //chromeOptions.addArguments("--window-size=800,600");
        //edgeOptions.addArguments(" --window-size=1280,720");
        //chromeOptions.addArguments("--incognito");
        // chromeOptions.addArguments("--start-maximized");



        ChromeDriver driver = new ChromeDriver(chromeOptions);

    }
}

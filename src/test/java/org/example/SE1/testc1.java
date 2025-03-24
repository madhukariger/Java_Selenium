package org.example.SE1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testc1 {
   // @Description("open URL")
    @Test
    public void SeleniumBasics(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.redhat.com/en");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.manage().window().maximize();

    }
}

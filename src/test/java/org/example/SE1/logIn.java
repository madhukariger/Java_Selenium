package org.example.SE1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class logIn {
    @Test
    public void test_VerifyVWOLogin(){
        // Write the code which will execute the perform the ui interactions
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.redhat.com/en");
        // Assert.assertEquals(driver.getCurrentUrl(),"https://www.redhat.com/en");
        System.out.println(driver.getSessionId());
        System.out.println(driver.getTitle());
        // driver.quit();
    }

}

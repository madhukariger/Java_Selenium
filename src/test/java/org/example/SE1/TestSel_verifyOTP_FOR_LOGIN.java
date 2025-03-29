package org.example.SE1;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Scanner;

public class TestSel_verifyOTP_FOR_LOGIN {
    @Description("VERIFY INVALID EMAIL,PASS ERROR MESSAGE ")
    @Test
    public void test_negative_login() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.flipkart.com/");
        WebElement loginelement = driver.findElement(By.className("_1TOQfO"));
        loginelement.click();
        Thread.sleep(2000);
        //By.className() does not support multiple class names. You cannot pass a space-separated list of classes.
        // wrong ----WebElement emailinputbox = driver.findElement(By.className("r4vIwl _5BVqVB mYpCuj BV+Dqf"));
        //<input autocomplete="off" type="text" class="r4vIwl _5BVqVB mYpCuj BV+Dqf" value="JGKVN">
        WebElement emailinputbox = driver.findElement(By.xpath("//input[contains(@class, 'r4vIwl')]"));
        emailinputbox.sendKeys("madhukariger98@gmail.com");
       // emailinputbox.sendKeys("9113663632");


        // <button class="QqFHMw twnTnD _7Pd1Fp">Request OTP</button>

        WebElement requestOtp = driver.findElement(By.xpath("//button[contains(@class, 'QqFHMw')]"));
        requestOtp.click();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter OTP manually: ");
        String otp = scanner.nextLine();

// <button class="QqFHMw llMuju M5XAsp" type="submit">Verify</button>
        WebElement verifybutton = driver.findElement(By.xpath("//button[contains(@class, 'M5XAsp')]"));
        verifybutton.click();








    }
}

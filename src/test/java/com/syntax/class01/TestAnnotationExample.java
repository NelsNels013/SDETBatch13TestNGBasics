package com.syntax.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotationExample {
    //go to facebook.com
    //enter the password
    //enter the invalid username
    //click login
    //make sure the error is there

    public static WebDriver driver;

    @Test
    public void testingForFbText(){
        //setting up the webdriver
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //getting the particular username
        driver.get("http://www.facebook.com/");*/
        String text = driver.findElement(By.xpath("//h2")).getText();

        if(text.equals("Connect with friends and the world around you on Facebook.")){
            System.out.println("Successful");
        }else{
            System.out.println("Failed");
        }
        //driver.quit();
    }

    //go to facebook.com
    //make sure create account text is there

    @Test
    public void createAccountText(){
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com/");*/

        String text = driver.findElement(By.xpath("//a[text() = 'Create new account']")).getText();

        if(text.equals("Create new account")){
            System.out.println("Successful");
        }else{
            System.out.println("Failed");
        }
        //driver.quit();
    }

    @BeforeMethod
    public void settingBrowser(){
        //setting up the WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //getting particular website
        driver.get("http://www.facebook.com/");
    }

    @AfterMethod
    public void quittingTheBrowser(){
        driver.quit();
    }
}


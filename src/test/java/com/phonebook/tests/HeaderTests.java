package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase{

    @Test
    public void openPhoneBookTest() {

        // System.out.println("Home Component is " + isHomeComponentPresent1());
        //   isElementPresent(By.xpath("//h1[text()='Home Component']"));

        Assert.assertTrue( isElementPresent1(By.xpath("//h1[text()='PHONEBOOK']")));
    }
    @Test
    public void openHomePageTest(){
        Assert.assertTrue( isElementPresent1(By.xpath("//a[.='HOME']")));
    }
    @Test
    public void openAboutPageTest(){
        Assert.assertTrue( isElementPresent1(By.xpath("//a[.='ABOUT']")));
    }
    @Test
    public void openLoginPageTest(){
        Assert.assertTrue( isElementPresent1(By.xpath("//a[.='LOGIN']")));
    }
}

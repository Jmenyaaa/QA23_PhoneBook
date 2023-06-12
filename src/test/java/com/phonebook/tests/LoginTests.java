package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (!isElementPresent(By.xpath("//a[.='LOGIN']"))) {
            click(By.xpath("//button[.='Sign Out']"));
        }
        //click on Login link
        click(By.xpath("//a[.='LOGIN']"));
    }

    @Test
    public void loginPositiveTest() {
        //enter email field
        type(By.cssSelector("[placeholder='Email']"), "gekageka2612@gmail.com");
        //enter password field
        type(By.cssSelector("[placeholder='Password']"), "Kan123$-_$");

        click(By.name("login"));


        Assert.assertTrue(isElementPresent1(By.xpath("//button[.='Sign Out']")));
    }
}

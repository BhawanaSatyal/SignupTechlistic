package org.example;

import org.testng.Assert;

public class HomePage extends BrowserManager{

    public void userISOnHomePage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("techlistic"));
        System.out.println("You are on Home Page");
    }
}

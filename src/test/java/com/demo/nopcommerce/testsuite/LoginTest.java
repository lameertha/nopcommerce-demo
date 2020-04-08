package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginFeature(){
        homePage.clickOnLoginElement();
        String expectedResult= "Welcome, Please Sign In!";
        String actualResult = loginPage.getWelcomeMessage();
        Assert.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void verifyUserShouldLoginWithValidCredentialsSuccessfully(){
        homePage.clickOnLoginElement();
        loginPage.waitForVisibilityToseeElement();
        loginPage.enterEmailId();
        loginPage.enterPassword();
        loginPage.setClickOnLoginButton();
        String expectedResult = "Welcome to our store";
        String actualResult = loginPage.getTextFromElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
        Assert.assertEquals(expectedResult,actualResult);

    }
}
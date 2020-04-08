package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPage() {
        homePage.clickOnRegisterElement();
        String expectedResult = "Your Personal Details";
        String actualResult = registerPage.getRegisterMessage();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void verifyUserShouldRegisterSuccessfullyWithValidCredentials() {

        homePage.clickOnRegisterElement();
        registerPage.clickOnRadioButton();
        registerPage.enterFirstName();
        registerPage.enterLastName();
        registerPage.selectDayOfBirth();
        registerPage.selectDateOfBirthMonth();
        registerPage.selectDateOfBirthYear();
        registerPage.setEmailemail();
        registerPage.enterCompanyName();
        registerPage.selectCheckBoxOfNewsLetter();
        registerPage.enterPassword();
        registerPage.enterConfirmPassword();
        registerPage.ClickOnRegisterButton();

        String expectedResult = "Your registration completed";
        String actualResult = registerPage.getTextFromElement(By.xpath("//div[@class='result']"));
        Assert.assertEquals(expectedResult, actualResult);


    }


}

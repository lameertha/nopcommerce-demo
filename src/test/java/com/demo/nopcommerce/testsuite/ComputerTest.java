package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.ComputersPage;
import com.demo.nopcommerce.pages.DesktopPage;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    ComputersPage computersPage = new ComputersPage();


    @Test
    public void verifyUserShouldNavigateToComputersPage() {
        homePage.clickOnComputersElement();
        String expectedResult = "Computers";
        String actualResult = computersPage.getComputerTextMessage();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void verifyUserShouldAddProductToCartSuccessfully() {

        homePage.clickOnComputersElement();
        desktopPage.ClickOnDesktopButton();
        desktopPage.clickOnPosition();
        desktopPage.atozSort();
        computersPage.clickOnBuildComputer();
        computersPage.clickOnRadioButtonFeature();
        computersPage.clickOnAddToCartButton();

        String expectedResult = "The product has been added to your shopping cart";
        String actualResult = computersPage.getAddToCartMessage();
        Assert.assertEquals(expectedResult, actualResult);


    }
}



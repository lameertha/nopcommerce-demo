package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By clickOnDesktopFeature = By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]");
    By sortByPosition = By.id("products-orderby");
    By aTOzSorting = By.xpath("//option[contains(text(),'Name: A to Z')]");



    public void ClickOnDesktopButton() {

        clickOnElement(clickOnDesktopFeature);
    }

    public void clickOnPosition() {
        clickOnElement(sortByPosition);
    }

    public void atozSort() {
        clickOnElement(aTOzSorting);


    }
}

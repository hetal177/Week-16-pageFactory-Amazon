package com.amazon.pages;

import com.amazon.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FindYourProductPage extends Utility {
    public FindYourProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'2021 Newest HP 15.6 HD Laptop for Business and Student')]")
    WebElement targetLaptop;
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchBox;

    @FindBy(xpath = "//a[contains(text(),'Next')]")
    WebElement nextBTN;

    public void SearchProduct(String productName) {
        if (searchBox.isDisplayed()) {
            DoSendTextandPressEnter(searchBox,productName);
        } else {
            Assert.fail("Amazon web not launched");
        }
        if (doElementVisible(targetLaptop)) {
            doClickOnElement(targetLaptop);

        } else {
            System.out.println("Target" +productName+ "is not on 1st page");

        }



        do {javaExecutorScriptExecuteScriptToScrollThePageTillElementFound(nextBTN);


            if (doElementVisible(nextBTN)) {
                System.out.println("next btn is visible");
                doClickOnElement(nextBTN);
            } else {
                System.out.println("next btn is not visible");
            }


            if (doElementVisible(targetLaptop)) {
                System.out.println("target" +productName +  "  is visible");
                doClickOnElement(targetLaptop);
            } else {
                System.out.println("target" +productName +  " is not visible");
            }

        } while (!doElementVisible(targetLaptop));


    }
}







package com.amazon.pages;

import com.amazon.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddToCartPAge extends Utility {
    public AddToCartPAge() {
        PageFactory.initElements(driver, this);
    }

    //-----
    @FindBy(id = "seeMoreDetailsLink")
    WebElement productMoreDetails;
    @FindBy(xpath = "//span[text()='Qty:']")
    WebElement qtyBtn;
    @FindBy(xpath = "//a[@id='quantity_2']")
    WebElement qtyEnter3;
    @FindBy(name = "submit.add-to-cart")
    WebElement addToCartBTN;
    @FindBy(xpath = "//span[contains(text(),'Added to Cart')]")
    WebElement addToCartConfirmationMessage;

    public void verifyTheAddToCartMessage(String message) throws InterruptedException {
        //pmWaitUntilVisibilityOfElementLocated(By.linkText("Added to Cart"), 30);
        String actualMessage = doGetTextFromElement(addToCartConfirmationMessage);
        Thread.sleep(5000);
        doVerifyElements(actualMessage, message, "Incorrect Message");
        Reporter.log("Verifying the Added To Cart Message :" + message);


    }


    public void clickOnProductMoreDeatailsLInk() {
        doClickOnElement(productMoreDetails);
    }

    public void clickOnQtyBtn() {
        doClickOnElement(qtyBtn);

    }

    public void changeQuentityto3() {
        doClickOnElement(qtyEnter3);
    }

    public void setAddToCartBTN() {
        doClickOnElement(addToCartBTN);

    }

}
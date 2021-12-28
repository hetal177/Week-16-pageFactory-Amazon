package com.amazon.pages;

import com.amazon.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage extends Utility {
    public MobilePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_42']//div[@class='a-section a-spacing-none s-padding-right-small s-title-instructions-style']//span[1]")
    WebElement targetMoblie;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchBox;

    @FindBy(xpath = "//a[contains(text(),'Next')]")
    WebElement nextBTN;
    @FindBy(xpath = "//span[@id='a-autoid-0-announce']")
    WebElement qtyBtn;
    @FindBy(xpath = "//a[@id='quantity_2']")
    WebElement qtyEnter3;
    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    WebElement addToCartBTN;

    public void clickOnQtyBtnmobile() {
        doClickOnElement(qtyBtn);

    }

    public void changeQuantityto3mobile() {
        doClickOnElement(qtyEnter3);
    }

    public void setAddToCartBTNmobile() {
        doClickOnElement(addToCartBTN);
    }


/*
    public void SearchProduct(String productName) {
        if (searchBox.isDisplayed()) {

            DoSendTextandPressEnter(searchBox,productName);
        } else {
            Assert.fail("Amazon web not launched");
        }
        if (doElementVisible(targetMoblie)) {
            doClickOnElement(targetMoblie);

        } else {
            System.out.println("Target Mobile is not on 1st page");

        }


           do {javaExecutorScriptExecuteScriptToScrollThePageTillElementFound(nextBTN);


            if (doElementVisible(nextBTN)) {
                System.out.println("next btn is visible");
                doClickOnElement(nextBTN);
            } else {
                System.out.println("next btn is not visible");
            }


            if (doElementVisible(targetMoblie)) {
                System.out.println("target mobile  is visible");
                doClickOnElement(targetMoblie);
            } else {
                System.out.println("target Mobile  is not visible");
            }

        }  while (!doElementVisible(targetMoblie));


    }

        */


}


package com.amazon.testsuite;


import com.amazon.pages.AddToCartPAge;
import com.amazon.pages.FindYourProductPage;

import com.amazon.pages.MobilePage;
import com.amazon.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindProductTest extends TestBase {
    FindYourProductPage findYourProductPage;
    AddToCartPAge addToCartPage;
    MobilePage mobilepage;

    @BeforeMethod
    public void inIt() {

     findYourProductPage=new FindYourProductPage();
     addToCartPage = new AddToCartPAge();


    }

    @Test
    public void verifyUserAbletoselectLaptop() {
       findYourProductPage.SearchProduct("Laptop");
    }
@Test

    public void seeMoreProdductDetail() throws InterruptedException {
        addToCartPage.clickOnProductMoreDeatailsLInk();
        addToCartPage.verifyTheAddToCartMessage("\n" +
                "Added to Cart");
        addToCartPage.clickOnQtyBtn();
        addToCartPage.changeQuentityto3();
        addToCartPage.setAddToCartBTN();
    }

    @Test
    public void VerifyUserAbleToSelectMobilie() {
        findYourProductPage.SearchProduct("Mobile phone");
        mobilepage.clickOnQtyBtnmobile();
        mobilepage.changeQuantityto3mobile();
        mobilepage.setAddToCartBTNmobile();
    }

}



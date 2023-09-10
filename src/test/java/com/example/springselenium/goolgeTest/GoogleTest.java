package com.example.springselenium.goolgeTest;

import com.example.springselenium.SpringTestNGTest;
import com.example.springselenium.page.Google.GooglePage;
import com.google.common.util.concurrent.Uninterruptibles;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class GoogleTest extends SpringTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Test
    public void googleTest(){

        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        //Hard wait
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);

        this.googlePage.getSearchComponent().search("India");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().count()>2);

    }
}

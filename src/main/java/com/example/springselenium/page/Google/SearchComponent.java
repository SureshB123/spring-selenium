package com.example.springselenium.page.Google;

import com.example.springselenium.page.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class SearchComponent extends Base {

    @FindBy(xpath="//textarea[@name='q']")
    private WebElement searchArea;

    @FindBy(xpath="(//input[@name='btnK'])[2]")
    private WebElement btn_Search;


    public void search(String value){
        searchArea.sendKeys(value);
        searchArea.sendKeys(Keys.TAB);
        btn_Search.click();
    }


    @Override
    public boolean isAt() {
        return this.wait.until((d)->this.searchArea.isDisplayed());
    }
}

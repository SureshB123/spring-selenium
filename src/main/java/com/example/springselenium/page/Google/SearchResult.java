package com.example.springselenium.page.Google;

import com.example.springselenium.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchResult extends Base {

    @FindBy(xpath="//div[@class='TzHB6b cLjAic K7khPe']")
    List<WebElement> results;


    public int count(){
        return this.results.size();
    }


    public boolean isAt() {
        return this.wait.until((d)-> !results.isEmpty());
    }
}

package com.example.springselenium.page.Google;

import com.example.springselenium.page.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GooglePage extends Base {

    @Autowired
    private SearchComponent searchComponent;

    @Autowired
    private SearchResult searchResult;

    @Value("${application.URL}")
    private String applicationURL;


    public void goTo(){
        this.driver.get(applicationURL);
    }


    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public SearchResult getSearchResult() {
        return searchResult;
    }

    @Override
    public boolean isAt() {
        return searchComponent.isAt();
    }
}

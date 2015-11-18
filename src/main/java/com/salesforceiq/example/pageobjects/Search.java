package com.salesforceiq.example.pageobjects;

import com.salesforceiq.augmenteddriver.web.pageobjects.WebPageObject;
import org.openqa.selenium.By;

import java.util.Optional;

public class Search extends WebPageObject {
    @Override
    public Optional<By> visibleBy() {
        return Optional.of(Bys.INPUT);
    }

    public WikiPage searchAndGo(String searchText) {
        augmented().findElementClickable(Bys.INPUT).sendKeys(searchText);
        augmented().findElementClickable(Bys.BUTTON).click();
        return get(WikiPage.class);
    }

    private static class Bys {
        private static final By INPUT = By.id("searchInput");
        private static final By BUTTON = By.name("go");
    }
}

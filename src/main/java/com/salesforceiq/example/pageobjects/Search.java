package com.salesforceiq.example.pageobjects;

import com.salesforceiq.augmenteddriver.web.pageobjects.WebPageObject;
import org.openqa.selenium.By;

import java.util.Optional;

public class Search extends WebPageObject {
    // To check that the PageObject is present
    // If Optional.empty() is returned, no check is made.
    // If the condition is not as simple as waiting for an element to be present,
    // you can always override WebPageObject#assertPresent
    @Override
    public Optional<By> visibleBy() {
        return Optional.of(Bys.INPUT);
    }

    public WikiPage searchAndGo(String searchText) {
        augmented().findElementClickable(Bys.INPUT).sendKeys(searchText);
        augmented().findElementClickable(Bys.BUTTON).click();
        return get(WikiPage.class);
    }

    public static class Bys {
        private static final By INPUT = By.id("searchInput");
        public static final By BUTTON = By.name("go");
    }
}

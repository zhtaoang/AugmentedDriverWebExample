package com.salesforceiq.example.pageobjects;

import com.salesforceiq.augmenteddriver.web.pageobjects.WebPageObject;
import org.openqa.selenium.By;

import java.util.Optional;

public class WikiPage extends WebPageObject {
    @Override
    public Optional<By> visibleBy() {
        return Optional.of(Bys.HEADING);
    }

    public String getTitle() {
        return augmented().findElementVisible(Bys.HEADING).getText();
    }

    public InfoBox infoBox() {
        return get(InfoBox.class);
    }

    public static class Bys {
        public static final By HEADING = By.id("firstHeading");
    }
}

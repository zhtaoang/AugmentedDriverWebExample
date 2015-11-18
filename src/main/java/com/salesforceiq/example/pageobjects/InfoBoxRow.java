package com.salesforceiq.example.pageobjects;

import com.salesforceiq.augmenteddriver.web.pageobjects.WebPageContainerObject;
import org.openqa.selenium.By;

import java.util.Optional;

public class InfoBoxRow extends WebPageContainerObject {
    @Override
    public Optional<By> visibleBy() {
        return Optional.of(Bys.HEADER);
    }

    public String getTitle() {
        return container().augmented().findElementVisible(Bys.HEADER).getText();
    }

    private static class Bys {
        private static final By HEADER = By.tagName("th");
    }
}

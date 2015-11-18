package com.salesforceiq.example.pageobjects;

import com.salesforceiq.augmenteddriver.web.AugmentedWebElement;
import com.salesforceiq.augmenteddriver.web.pageobjects.WebPageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Optional;

/**
 * The box to the right containing industry, founder, etc
 */
public class InfoBox extends WebPageObject {
    @Override
    public Optional<By> visibleBy() {
        return Optional.of(Bys.INFOBOX_CONTAINER);
    }

    // 0 indexed
    public InfoBoxRow getRow(int index) {
        List<AugmentedWebElement> rows = augmented().findElementsVisible(Bys.ROW);
        return get(InfoBoxRow.class, rows.get(index));
    }

    private static class Bys {
        private static final By INFOBOX_CONTAINER = By.className("infobox");
        private static final By ROW = By.tagName("tr");
    }
}

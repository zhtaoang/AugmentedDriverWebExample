package com.salesforceiq.example;

import com.salesforceiq.augmenteddriver.testcases.AugmentedWebTestCase;
import com.salesforceiq.augmenteddriver.util.Suites;
import com.salesforceiq.example.pageobjects.Search;
import com.salesforceiq.example.pageobjects.WikiPage;
import org.junit.Assert;
import org.junit.Test;

@Suites(WebSuites.SMOKE)
public class ExampleTest extends AugmentedWebTestCase {

    @Test
    public void searchForSalesforceIQInWiki() {
        // With driver() you get the usual functionality of WebDriver.
        driver().get("https://www.wikipedia.org/");

        // Either with augmented() or driver().augmented() you get extra funcitonality
        // for examples:
        // find an element and wait until it is clickable/visible/present
        // find an element and wait until it stops moving/
        // wait until an element is not visible/clickable/present
        // scroll to Bottom
        // find all visible/clickable/present elements identified by a by
        // etc
        augmented().findElementClickable(Search.Bys.BUTTON);

        // use the get() functionality to go from one view to another.
        WikiPage wiki = get(Search.class)
                                    .searchAndGo("SalesforceIq");
        Assert.assertEquals("SalesforceIQ", wiki.getTitle());
        // AugmentedWebTestCase comes with several assertions,
        // such as
        // assert an element contains some text.
        // assert an element is visible/clickable/present (or not)
        // etc
        assertElementContains(WikiPage.Bys.HEADING, "SalesforceIQ");
    }

    @Test
    public void searchForSalesforceInWiki() {
        driver().get("https://www.wikipedia.org/");
        WikiPage wiki = get(Search.class)
                                    .searchAndGo("Salesforce.com");
        Assert.assertEquals("Salesforce.com", wiki.getTitle());
        assertElementContains(WikiPage.Bys.HEADING, "Salesforce.com");
    }

    @Test
    public void checkInfoBoxHasTheRightInfo() {
        driver().get("https://www.wikipedia.org/");
        WikiPage wiki = get(Search.class)
                .searchAndGo("SalesforceIq");

        String founded = wiki
                            .infoBox()
                            .getRow(2)
                            .getTitle();
        Assert.assertEquals("Founded", founded);
    }
}

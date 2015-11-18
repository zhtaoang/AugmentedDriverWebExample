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
        driver().get("https://www.wikipedia.org/");
        WikiPage wiki = get(Search.class)
                                        .searchAndGo("SalesforceIq");
        Assert.assertEquals("SalesforceIQ", wiki.getTitle());
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

}

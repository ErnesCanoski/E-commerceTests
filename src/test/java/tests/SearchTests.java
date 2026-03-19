package tests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

public class SearchTests extends BaseTest {

    @Test(groups = "smoke")
    public void testValidSearch() {

        HomePage home = new HomePage(driver);
        home.search("MacBook");

        SearchPage search = new SearchPage(driver);

        Assert.assertTrue(search.getResultsCount() > 0);
    }

    @Test(groups = "regression")
    public void testInvalidSearch() {

        HomePage home = new HomePage(driver);
        home.search("XYZ12345");

        SearchPage search = new SearchPage(driver);

        Assert.assertTrue(search.isNoResultsDisplayed());
    }
}

package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class basicStep extends BaseUtil {

    private BaseUtil base;

    public basicStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the main search page$")
    public void navToPage() throws Throwable {
        String baseUrl = "https://www.google.com/";
        base.Driver.navigate().to(baseUrl);
    }

    @Given("^I enter the following for Search$")
    public void addToSeachInput(DataTable table) throws Throwable {
        List<Input> items =  table.asList(Input.class);

        WebElement myElement = base.Driver.findElement(By.name("q"));
        myElement.sendKeys(items.get(0).search);
    }

    @Given("^I click search button$")
    public void clickSearchButton() throws Throwable {
        base.Driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    }

    @Then("^I should see the search list page$")
    public void getListOfResults() throws Throwable {
        String expectedTitle = "helloworld - Google Search";
        String actualTitle = base.Driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public class Input {
        public String search;

        public Input(String toSearch) {
            search= toSearch;
        }
    }
}


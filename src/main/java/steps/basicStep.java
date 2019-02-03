package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class basicStep {
    @Given("^I navigate to the main search page$")
    public void navToPage() throws Throwable {
    }

    @Given("^I enter the following for Search$")
    public void addToSeachInput(DataTable arg1) throws Throwable {
    }

    @Given("^I click search button$")
    public void clickSearchButton() throws Throwable {
    }

    @Then("^I should see the search list p$")
    public void getListOfResults() throws Throwable {
    }

}

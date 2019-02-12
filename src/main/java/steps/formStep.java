package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class formStep extends BaseUtil {

    private BaseUtil base;

    public formStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the main form page here: \"([^\"]*)\"$")
    public void navigateToFormPage(String formUrl) throws Throwable {
        base.Driver.navigate().to(formUrl);

    }

    @Given("^I enter the following$")
    public void fillOutForm(DataTable table) throws Throwable {
        List<Map<String, String>> list = table.asMaps(String.class, String.class);
        String radioInput = list.get(0).get("radio");
        String checkboxInput = list.get(0).get("checkbox");
        String shortAnsInput = list.get(0).get("Short answer");
        String longAnsInput = list.get(0).get("Long answer");

        base.Driver.findElement(By.xpath("(//DIV[@role='radio' and @data-value='"+radioInput+"'])")).click();
        base.Driver.findElement(By.xpath("(//DIV[@role='checkbox' and @aria-label='"+checkboxInput+"'])")).click();

        base.Driver.findElement(By.xpath("//INPUT[@type='text']")).sendKeys(shortAnsInput);
        base.Driver.findElement(By.xpath("//TEXTAREA[@aria-label='Long answer']")).sendKeys(longAnsInput);

    }

    @Given("^I click \"([^\"]*)\" button$")
    public void submitForm(String btn) throws Throwable {
        base.Driver.findElement(By.xpath("//SPAN[text()='"+btn+"']")).click();
    }

    @Then("^I should see the submitted page$")
    public void getResponsePage() throws Throwable {
        Assert.assertTrue(base.Driver.getPageSource().contains("Your response has been recorded."));
    }
}

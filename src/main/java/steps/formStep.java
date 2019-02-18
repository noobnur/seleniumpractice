package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

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

//        int i = 0;
        for(int i = 0; i < list.size(); i ++) {
            String radioInput = list.get(i).get("radio");
            String checkboxInput = list.get(i).get("checkbox");
            String shortAnsInput = list.get(i).get("Short answer");
            String longAnsInput = list.get(i).get("Long answer");
            String dropdownInput = list.get(i).get("Dropdown");

            base.Driver.findElement(By.xpath("(//DIV[@role='radio' and @data-value='" + radioInput + "'])")).click();
            base.Driver.findElement(By.xpath("(//DIV[@role='checkbox' and @aria-label='" + checkboxInput + "'])")).click();

            base.Driver.findElement(By.xpath("//INPUT[@type='text']")).sendKeys(shortAnsInput);
            base.Driver.findElement(By.xpath("//TEXTAREA[@aria-label='Long answer']")).sendKeys(longAnsInput);

            base.Driver.findElement(By.xpath("//CONTENT[@class='quantumWizMenuPaperselectContent exportContent'][text()='Choose']")).click();
            base.Driver.findElement(By.xpath("//DIV[@data-value='"+dropdownInput+"']"));

            Reporter.log(i + "gg to submit");
            if (i < list.size()-1) {
                String btn = "Submit";
                base.Driver.findElement(By.xpath("//SPAN[text()='" + btn + "']")).click();

                base.Driver.findElement(By.xpath("//A[@href='https://docs.google.com/forms/d/e/1FAIpQLSezE_NGzI-f92U8OVk-tonitgNzmJwAidtfLAueJakTldce-g/viewform?usp=form_confirm'][text()='Submit another response']")).click();
            }
        }

    }

    @Given("^I click \"([^\"]*)\" button$")
    public void submitForm(String btn) throws Throwable {
        base.Driver.findElement(By.xpath("//SPAN[text()='"+btn+"']")).click();
    }

    @Then("^I should see the submitted page$")
    public void getResponsePage() throws Throwable {
        Assert.assertTrue(base.Driver.getPageSource().contains("Practice Automation Form"));
    }
}

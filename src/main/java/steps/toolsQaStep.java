package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class toolsQaStep extends BaseUtil {

    private BaseUtil base;

    public toolsQaStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^open the link \"([^\"]*)\" in a new tab$")
    public void openLinkInNewTab(String arg1) throws Throwable {
        String openLink = Keys.chord(Keys.CONTROL,"t");
        base.Driver.findElement(By.partialLinkText(arg1)).sendKeys(openLink);
    }


    @Given("^I enter the following for toolsqa$")
    public void fillOutToolsQaForm(DataTable table) throws Throwable {
        List<Map<String, String>> list = table.asMaps(String.class, String.class);

        int i = 0;
        String firstname = list.get(i).get("firstname");
        String lastname = list.get(i).get("lastname");
        String sex = list.get(i).get("sex");
        String experience = list.get(i).get("experience");
        String date = list.get(i).get("date");
        String profession = list.get(i).get("profession");

        String img = list.get(i).get("img");
        String download = list.get(i).get("download");
        String continent = list.get(i).get("continent");
        String commands = list.get(i).get("commands");

        base.Driver.findElement(By.name("firstname")).sendKeys(firstname);
        base.Driver.findElement(By.name("lastname")).sendKeys(lastname);
        base.Driver.findElement(By.xpath("//input[@value='"+sex+"']")).click();
        base.Driver.findElement(By.xpath("//input[@value='"+experience+"']")).click();
        base.Driver.findElement(By.id("datepicker")).sendKeys(date);
        base.Driver.findElement(By.xpath("//input[@value='"+profession+"']")).click();

        base.Driver.findElement(By.id("photo")).sendKeys("/Users/dayah/Desktop/practice/BEACH/seleniumpractice/src/main/resources/imgs/"+img+"");

        Select selectContinent = new Select(base.Driver.findElement(By.id("continents")));
        selectContinent.selectByVisibleText(continent);

        Select selectCommands = new Select(base.Driver.findElement(By.id("selenium_commands")));
        selectCommands.selectByVisibleText(commands);




    }

    @Given("^I click \"([^\"]*)\" button toolsqa$")
    public void submitToolsQaForm(String btn) throws Throwable {
        base.Driver.findElement(By.name(btn)).click();
    }
//
//    @Then("^I should see the submitted page$")
//    public void getResponsePage() throws Throwable {
//        Assert.assertTrue(base.Driver.getPageSource().contains("Test Selenium Forms"));
//    }
}

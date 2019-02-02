
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass  {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/dayah/Desktop/Tools/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.google.com/";
        String expectedTitle = "helloworld - Google Search";
        String actualTitle = "";

        driver.get(baseUrl);

        WebElement myElement = driver.findElement(By.name("q"));
        myElement.sendKeys("helloworld");
        myElement.sendKeys(Keys.RETURN);
        actualTitle = driver.getTitle();


        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
            System.out.println(actualTitle );
        }

        driver.close();

    }

}
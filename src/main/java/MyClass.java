
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass  {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/dayah/Desktop/Tools/chromedriver");
        WebDriver driver = new ChromeDriver();

//        String baseUrl = "https://goo.gl/qK4fDy";
        String baseUrl = "https://www.guru99.com/";
//        String expectedTitle = "helloworld - Google Search";
//        String actualTitle = "";

        driver.get(baseUrl);

        driver.findElement(By.partialLinkText("Payment Gateway")).click();

//        WebElement myElement = driver.findElement(By.name("q"));

        // These are the absolute paths
//        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div[2]/div[2]/div[1]/div/div[2]/div/content/div/div[1]/label/div/div[1]")).click();
//        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/label/div/div[1]")).click();


        // These are relative paths
//        driver.findElement(By.xpath("(//DIV[@role='radio' and @data-value='Option 1'])")).click();
//        driver.findElement(By.xpath("(//DIV[@role='checkbox' and @aria-label='Option 2'])")).click();
//
//        driver.findElement(By.xpath("//INPUT[@type='text']")).sendKeys("This is my short answer");
//        driver.findElement(By.xpath("//TEXTAREA[@aria-label='Long answer']")).sendKeys(
//                "This is my long long looooonnggg answer. This time round we have changed the xpaths to something more readable." +
//                        "But best is if we use ids most likely. Now the roles (radio and checkbox) is useful only if there's only one of each. Might still work " +
//                        "but if there's more exact same data-value then we'd have a problem");
//
////        driver.findElement(By.xpath("(//DIV[@class='quantumWizTogglePaperradioOffRadio exportOuterCircle'])[3]")).click();
//
//        driver.findElement(By.xpath("//SPAN[text()='Submit']")).click();

//        myElement.sendKeys("helloworld");
//        myElement.sendKeys(Keys.RETURN);
//        actualTitle = driver.getTitle();
//
//
//        if (actualTitle.contentEquals(expectedTitle)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//            System.out.println(actualTitle );
//        }

        driver.close();

    }

}
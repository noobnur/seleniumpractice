
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass  {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/dayah/Desktop/Tools/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://goo.gl/qK4fDy";
//        String expectedTitle = "helloworld - Google Search";
//        String actualTitle = "";

        driver.get(baseUrl);

//        WebElement myElement = driver.findElement(By.name("q"));

        // These are the absolute paths
//        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div[2]/div[2]/div[1]/div/div[2]/div/content/div/div[1]/label/div/div[1]")).click();
//        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/label/div/div[1]")).click();


        // These are relative paths
        driver.findElement(By.xpath("(//DIV[@class='quantumWizTogglePaperradioOffRadio exportOuterCircle'])[1]")).click();
        driver.findElement(By.xpath("(//DIV[@class='quantumWizTogglePapercheckboxInnerBox exportInnerBox'])[2]")).click();

        driver.findElement(By.xpath("//INPUT[@type='text']")).sendKeys("This is my short answer");
        driver.findElement(By.xpath("//TEXTAREA[@class='quantumWizTextinputPapertextareaInput exportTextarea']")).sendKeys("This is my long long looooonnggg answer");

        driver.findElement(By.xpath("(//DIV[@class='quantumWizTogglePaperradioOffRadio exportOuterCircle'])[3]")).click();

        driver.findElement(By.xpath("//SPAN[@class='quantumWizButtonPaperbuttonLabel exportLabel'][text()='Submit']")).click();

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
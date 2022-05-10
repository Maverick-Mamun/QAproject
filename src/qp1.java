import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class qp1 {
    WebDriver driver;
   @Test(enabled = false)
   public void display(){
       System.out.println("demo print");
   }




    @Test
    public void setupbrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\amamu\\IdeaProjects\\QAproject\\webbrowser\\chromedriver_win32 (1)\\chromedriver.exe");

          driver = new ChromeDriver();
        driver.manage().window().maximize();
        //web driver is interface and driver is the name of raferance varable

        driver.get("https://www.amazon.com/");
    }
        @Test
        public void searchbox1(){
        setupbrowser();
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Hand Sanitizer");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        //verify expected result and actual result match
        String expectedResult = "\"Hand Sanitizer\"";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Expected result" + expectedResult);
        System.out.println("actual Result" + actualResult);
        Assert.assertEquals(actualResult, expectedResult, "test fail");

        String expectedTitle = "Amazon.com : Hand Sanitizer";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "test fail");
     closebrowser();
    }

            public void closebrowser()
            {

            driver.close();

        }






    /*
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\amamu\\IdeaProjects\\QAproject\\webbrowser\\chromedriver_win32 (1)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //web driver is interface and driver is the name of raferance varable

        driver.get("https://www.amazon.com/");
        //Thread.sleep(500);
        //driver.close();
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Hand Sanitizer");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        Thread.sleep(500);
        //verify expected result and actual result match
        String expectedResult ="\"Hand Sanitizer\"";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Expected result" + expectedResult);
        System.out.println("actual Result" + actualResult);
        if (expectedResult.equalsIgnoreCase(actualResult))
        {
            System.out.println("Test pass");
        } else {
            System.out.println("Test fail");
        }
        String expectedTitle ="Amazon.com : Hand Sanitizer";
        String actualTitle= driver.getTitle();
        if(expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("title pass");
        }
        else {
            System.out.println("fail");
        }


      driver.close();


    }

     */
}

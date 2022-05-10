
package autom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class tired {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\amamu\\IdeaProjects\\QAproject\\webbrowser\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //web driver is interface and driver is the name of raferance varabl
        driver.get("https://www.amazon.com/");
        Thread.sleep(500);
        driver.get("https://www.yahoo.com/");
    }
}


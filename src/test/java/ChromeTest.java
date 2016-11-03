import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Lelik on 26.10.2016.
 */
public class ChromeTest {


    @Test
    public void chromeTestMethod() {
        System.setProperty("webdriver.chrome.driver",  "D:\\SELENIUM\\Library\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://mail.ru");
        driver.manage().window().maximize();
        driver.quit();

    }

}

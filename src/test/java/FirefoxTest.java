import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.testng.annotations.Test;

/**
 * Created by Lelik on 24.08.2016.
 */
public class FirefoxTest {

    @Test
    public void firefoxTestMethod() {

        System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM\\Library\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://rediffmail.com");
        driver.manage().window().maximize();
        driver.quit();
    }


}

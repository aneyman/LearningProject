import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/**
 * Created by Lelik on 24.08.2016.
 */
public class IETest {

    @Test
    public void IETestMethod() {
        //!!!!make sure that your zoom is set up to 100%.
        //On IE 7 or higher on Windows Vista or Windows 7, you must set the Protected Mode settings
        // for each zone to be the same value. The value can be on or off, as long as it is the same for every zone.
        // To set the Protected Mode settings, choose "Internet Options..." from the Tools menu, and click on the
        // Security tab. For each zone, there will be a check box at the bottom of the tab labeled
        // "Enable Protected Mode". •Additionally, "Enhanced Protected Mode" must be disabled for IE 10 and higher.
        // This option is found in the Advanced tab of the Internet Options dialog.

        System.setProperty("webdriver.ie.driver", "D:\\SELENIUM\\Library\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.quit();


    }
}

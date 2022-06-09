package dockerValidation;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class FirefoxStandaloneTest {


    public static void main(String[] args) throws MalformedURLException {

        // Todo auto-generated method stub
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(false);
        options.addArguments("--start-maximized");
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT_AND_NOTIFY);
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL); // https://www.skptricks.com/2018/08/timed-out-receiving-message-from-renderer-selenium.html
        options.setPageLoadTimeout(Duration.ofSeconds(30000));
        options.setScriptTimeout(Duration.ofSeconds(30000));

        RemoteWebDriver driver = new RemoteWebDriver( new URL("http://localhost:4444/wd/hub"),options);

        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
}

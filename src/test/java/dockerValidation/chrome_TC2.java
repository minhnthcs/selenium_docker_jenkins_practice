package dockerValidation;

import com.google.common.annotations.VisibleForTesting;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class chrome_TC2 {

    @Test
    public void test2() throws MalformedURLException {

        // Todo auto-generated method stub
        FirefoxOptions options = new FirefoxOptions();
//        options.addArguments("--ignore-ssl-errors=yes");
//        options.addArguments("--ignore-certificate-errors");
//        options.setPageLoadTimeout(Duration.ofSeconds(10));
//        options.setScriptTimeout(Duration.ofSeconds(20));

        RemoteWebDriver driver = new RemoteWebDriver( new URL("http://localhost:4444/wd/hub"),options);
        driver.get("https://docs.google.com/");
        System.out.println(driver.getTitle());
    }
}

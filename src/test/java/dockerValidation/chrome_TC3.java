package dockerValidation;

import com.google.common.annotations.VisibleForTesting;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class chrome_TC3 {

    @Test
    public void test3() throws MalformedURLException {

        // Todo auto-generated method stub
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        options.setPageLoadTimeout(Duration.ofSeconds(10));
        options.setScriptTimeout(Duration.ofSeconds(20));

        RemoteWebDriver driver = new RemoteWebDriver( new URL("http://localhost:4444/wd/hub"),options);

        driver.get("https://gmail.com");
        System.out.println(driver.getTitle());
    }
}

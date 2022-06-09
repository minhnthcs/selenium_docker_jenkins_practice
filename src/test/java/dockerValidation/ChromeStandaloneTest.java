package dockerValidation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class ChromeStandaloneTest {


    public static void main(String[] args) throws MalformedURLException {

        // Todo auto-generated method stub
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        options.setPageLoadTimeout(Duration.ofSeconds(10));
        options.setScriptTimeout(Duration.ofSeconds(20));

        RemoteWebDriver driver = new RemoteWebDriver( new URL("http://localhost:7777/wd/hub"),options);

        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }
}

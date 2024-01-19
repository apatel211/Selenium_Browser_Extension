package testCase;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;



public class init {

    public static WebDriver initDriver() {

        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("./extension/TrustWallet.crx"));
        options.setCapability("acceptInsecureCerts", true);
        WebDriver driver = new ChromeDriver(options);

        try{
            driver.get("chrome-extension://egjidjbpglichdcondbcbdnbeeppgdph/home.html#/onboarding");

            ArrayList<String> newTb = new ArrayList<>(driver.getWindowHandles());
            driver.manage().window().maximize();

            driver.switchTo().window(newTb.get(0));

        } catch (Exception e){
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        return driver;
    }

}

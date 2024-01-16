package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class Main {
    public static void main(String[] args) {


            ChromeOptions options = new ChromeOptions();

            WebDriver driver = new ChromeDriver(options);

            options.addExtensions(new File("./extension/TrustWallet.crx"));
            options.setCapability("acceptInsecureCerts", true);

            try {
                driver.get("chrome-extension://egjidjbpglichdcondbcbdnbeeppgdph/home.html#/onboarding/");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                driver.quit();
            }

        }

}
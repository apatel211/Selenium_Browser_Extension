package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;




public class baseClass {
    public static void main(String[] args) {

            ChromeOptions options = new ChromeOptions();

            options.addExtensions(new File("./extension/TrustWallet.crx"));
            options.setCapability("acceptInsecureCerts", true);
            WebDriver driver = new ChromeDriver(options);

            try {
                Thread.sleep(30000);
                WebElement element = driver.findElement(By.className( "text-iconNormal"));
                element.click();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                driver.quit();
            }

        }
}
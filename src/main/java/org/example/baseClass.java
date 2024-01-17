package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;



public class baseClass {

    @Test
        public void setupClass() {

            ChromeOptions options = new ChromeOptions();
            options.addExtensions(new File("./extension/TrustWallet.crx"));
            options.setCapability("acceptInsecureCerts", true);
            WebDriver driver = new ChromeDriver(options);

            try{
            Thread.sleep(30000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            System.out.println("browser open");
            js.executeScript("document.evaluate(\"//*[@class='text-iconNormal']\", document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotItem(4).click();");
            System.out.println("Element clicked");
            } catch (Exception e){
                e.printStackTrace();

            } finally {
                driver.quit();
            }
        }

}
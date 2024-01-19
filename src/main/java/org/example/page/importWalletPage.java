package org.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.basePage;
import utils.logger;

public class importWalletPage extends basePage {



    public importWalletPage(final WebDriver driver) {
        super(driver);
    }
   WebElement import_wallet = driver.findElement(By.xpath("//*[ contains(text(),'Create a new wallet')] "));



    public String clickImportWallet() {
        final String messageText = import_wallet.getText();
        logger.info("Click on import wallet page succesfully ");
        import_wallet.click();
        return messageText;
    }



//    WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
//            password.sendKeys("Test@123");
//
//    WebElement confirmPassword = driver.findElement(By.xpath("(//input[@type='password'])[last()] "));
//            confirmPassword.sendKeys("Test@123");
//
//    WebElement termsCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//            termsCheckbox.click();
//
//    WebElement Next_btn = driver.findElement(By.xpath("//button[ contains(text(),'Next')] "));
//            Next_btn.click();

//                WebElement Nothanks_btn = driver.findElement(By.xpath("//p[ contains(text(),'No thanks')] "));
//                Nothanks_btn.click();
//
//                WebElement Openwallet_btn = driver.findElement(By.xpath("//button[ contains(text(),'Open wallet')] "));
//                Openwallet_btn.click();
//
//                driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
//
//                WebElement Gotit_btn = driver.findElement(By.xpath("//button[ contains(text(),'Got it')] "));
//                //Gotit_btn.click();
//                JavascriptExecutor executor = (JavascriptExecutor)driver;
//                executor.executeScript("arguments[0].click();", Gotit_btn);
//
//                driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
//                WebElement Gotit2nd_btn = driver.findElement(By.xpath("//button[ contains(text(),\"I’m ready to use Trust Wallet\")] "));
//                //Gotit2nd_btn.click();
//                executor.executeScript("arguments[0].click();", Gotit2nd_btn);
//
//                driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
//                WebElement Search_btn = driver.findElement(By.xpath("//button[@data-testid='wallet-header-manage-crypto-button']"));
//                //Search_btn.click();
//                executor.executeScript("arguments[0].click();", Search_btn);

//
}

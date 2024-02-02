package org.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.basePage;
import utils.logger;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class importWalletPage extends basePage {



    public importWalletPage(final WebDriver driver) {
        super(driver);
    }
    WebElement import_wallet = driver.findElement(By.xpath("//*[ contains(text(),'Import or recover wallet')]"));
    private final By setPassword = By.xpath("//*[ contains(text(),'Set Password')]");
    private final By password = By.xpath("(//input[@type='password'])[1]");
    private final By confirmPassword = By.xpath("(//input[@type='password'])[last()] ");
    private final By termsCheckbox = By.xpath("//input[@type='checkbox']");
    private final By  Next_btn = By.xpath("//button[ contains(text(),'Next')] ");

    public String clickImportWallet() {
        final String messageText = import_wallet.getText();
        logger.info("Click on import wallet page successfully");
        import_wallet.click();
        System.out.println(messageText);
        return messageText;
    }

    public String enterPasswordAndConfirmPassword(){
        final String messageText= wait.until(visibilityOfElementLocated(this.setPassword)).getText();
        wait.until(visibilityOfElementLocated(this.password)).sendKeys("@Test12345");
        wait.until(visibilityOfElementLocated(this.confirmPassword)).sendKeys("@Test12345");
        wait.until(visibilityOfElementLocated(this.termsCheckbox)).click();
        logger.info("Click on next page successfully ");
        wait.until(visibilityOfElementLocated(this.Next_btn)).click();
        return messageText;
    }



//                WebElement Nothanks_btn = driver.findElement(By.xpath("//p[ contains(text(),'No thanks')] "));
//                Nothanks_btn.click();
//
//                WebElement Openwallet_btn = driver.findElement(By.xpath("//button[ contains(text(),'Open wallet')] "));
//                Openwallet_btn.click();
//
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

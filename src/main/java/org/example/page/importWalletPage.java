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

    WebElement import_wallet = driver.findElement(By.xpath("//*[ contains(text(),'Import or recover wallet')]"));

    public String clickImportWallet() {
        final String messageText = import_wallet.getText();
        logger.info("Click on import wallet page successfully");
        import_wallet.click();
        System.out.println(messageText);
        return messageText;
    }

}



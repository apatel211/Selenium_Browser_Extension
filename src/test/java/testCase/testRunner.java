package testCase;

import org.testng.Assert;
import utils.logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.example.page.importWalletPage;


public class testRunner {

    private WebDriver driver;

    @BeforeMethod
    public void setupClass() {
        driver = init.initDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }

    @Test
    public void import_wallet()  {
        logger.startTestCase("Import or recover wallet successfully ");

        final importWalletPage iw = new importWalletPage(driver);
        Assert.assertEquals(iw.clickImportWallet(), "Import or recover wallet");
        Assert.assertEquals( iw.enterPasswordAndConfirmPassword(), "Set Password");

        logger.endTestCase("Test case executed successfully ");

    }

}

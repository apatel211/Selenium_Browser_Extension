package org.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.basePage;
import utils.logger;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class setPasswordPage extends basePage {

    public setPasswordPage(final WebDriver driver) {
        super(driver);
    }

    private final By setPassword = By.xpath("//*[ contains(text(),'Set Password')]");
    private final By password = By.xpath("(//input[@type='password'])[1]");
    private final By confirmPassword = By.xpath("(//input[@type='password'])[last()] ");
    private final By termsCheckbox = By.xpath("//input[@type='checkbox']");
    private final By  Next_btn = By.xpath("//button[ contains(text(),'Next')] ");

    public String enterPasswordAndConfirmPassword(){
        final String messageText= wait.until(visibilityOfElementLocated(this.setPassword)).getText();
        wait.until(visibilityOfElementLocated(this.password)).sendKeys("@Test12345");
        wait.until(visibilityOfElementLocated(this.confirmPassword)).sendKeys("@Test12345");
        wait.until(visibilityOfElementLocated(this.termsCheckbox)).click();
        logger.info("Click on next page successfully ");
        wait.until(visibilityOfElementLocated(this.Next_btn)).click();
        return messageText;
    }

}

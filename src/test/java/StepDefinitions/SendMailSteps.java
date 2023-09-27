package StepDefinitions;

import Pages.Elements;
import Utilitys.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

public class SendMailSteps {
    Elements cl = new Elements();

    @When("Click on the Contact Us button")
    public void clickOnTheContactUsButton() throws InterruptedException{
        Thread.sleep(1000);
        cl.scrollToElement(cl.ContactUs); // Bu satır, ContactUs butonuna odaklanmanızı sağlar.
        cl.MyClick(cl.ContactUs);
    }

    @And("Select Customer service from the Subject Heading dropdown")
    public void selectCustomerServiceFromDropdown() {

        cl.scrollToElement(cl.SubjectHeading);
        Select dropdown = new Select(cl.SubjectHeading);
        dropdown.selectByVisibleText("Customer service");

    }

    @And("Enter an email address")
    public void enterAnEmailAddress() throws AWTException, InterruptedException{
        Thread.sleep(2000);
        cl.scrollToElement(cl.Email);
        cl.MyClick(cl.Email);
        cl.Email.clear();
        cl.mySendKeys(cl.Email, "wokisa92240@alvisani.com");

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

    }

    @And("Enter a Order Reference Number")
    public void enterAOrderReferenceNumber() {

        cl.actionClick(cl.OrderReference);
        cl.scrollByPixel(415);
        cl.scrollToElement(cl.OrderReference);
        cl.OrderReference.sendKeys("AOREFALYR - 09/23/2023");

    }

    @And("Enter a Product")
    public void enterAProduct() {

        cl.scrollToElement(cl.Product);
        cl.scrollByPixel(415);
        cl.actionClick(cl.Product);
        cl.Product.sendKeys("Faded Short Sleeves T-shirta - Size : S, Color : Orange");

    }

    @And("Click on fileUpload button")
    public void clickOnFileUploadButton() throws Exception {
        cl.scrollToElement(cl.ChooseFile);
        Robot robot = new Robot();
        Set<String> windowHandles = GWD.getDriver().getWindowHandles();

        for (String handle : windowHandles) {
            GWD.getDriver().switchTo().window(handle);
            if (GWD.getDriver().getTitle().contains("Upload")) {
                break;
            }
        }
        JavascriptExecutor executor = (JavascriptExecutor) GWD.getDriver();
        executor.executeScript("arguments[0].click();", cl.ChooseFile);
        cl.MyClick(cl.ChooseFile);

        StringSelection dosyaYolu = new StringSelection("/Users/macbookair/Desktop/Fatura.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        for (int i = 0; i < 6; i++) {
            robot.keyPress(KeyEvent.VK_RIGHT);
            robot.keyRelease(KeyEvent.VK_RIGHT);
            Thread.sleep(1000);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        for (int i = 0; i < 3; i++) {
            robot.keyPress(KeyEvent.VK_RIGHT);
            robot.keyRelease(KeyEvent.VK_RIGHT);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    @And("Enter a message")
    public void enterAMessageButton() throws InterruptedException {

        cl.scrollToTop();
        Thread.sleep(1000);
        cl.MyClick(cl.Message);
        Thread.sleep(1000);

        cl.mySendKeys(cl.Message, "Banka havalesi henüz yapıldı, ödeme dekontu ektedir. Team8 TechnoStudy");
        Thread.sleep(2000);
    }
    @And("Click the Send button")
    public void clickTheSendButton() {
        cl.MyClick(cl.SendBtn);
    }

    @Then("Success message should be displayed.")
    public void Success_message_should_be_displayed() {
        WebElement successMessageElement = cl.successMessage;
        Assert.assertTrue(successMessageElement.getText().toLowerCase().contains("successfully sent"));
    }

    @Then("Enter email and password and click sign in button")
    public void enterEmailAndPasswordAndClickSignInButton() {
        cl.MyClick(cl.Email);
        cl.mySendKeys(cl.Email, "wokisa9124@alvisani.com");
        cl.MyClick(cl.Password);
        cl.mySendKeys(cl.Password, "Team8");
        cl.MyClick(cl.signInBtn);
    }
    @And("User should login successfully welcome")
    public void userShouldLoginSuccessfully() {
        cl.verifyContainsText(cl.welcomeMessage, "Welcome");
    }
}
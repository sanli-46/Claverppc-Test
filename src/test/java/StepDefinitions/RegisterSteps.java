package StepDefinitions;

import Pages.Elements;
import Utilitys.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class RegisterSteps {
    Elements cl = new Elements();

    @Given("Navigate to the cleverppc")
    public void navigateToTheCleverppc() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("Click the sign in button")
    public void clickTheSignInButton() throws InterruptedException{
        cl.scrollByPixel(415);
        Thread.sleep(1000);
        cl.myClick(cl.SignInBtn);
    }

    @Then("Enter email address and click create account button")
    public void Enteremailaddressandclickcreateaccountbutton() throws InterruptedException {

        cl.scrollByPixel(415);
        Thread.sleep(1000);
        cl.myJsClick(cl.NewEmail);
        Thread.sleep(1000);
        cl.mySendKeys(cl.NewEmail, "wokisa921240@alvisani.com");
        Thread.sleep(1000);
        cl.myClick(cl.CreateAccountBtn);

    }
    @And("User sending the keys in Elements")
    public void userSendingTheKeysInElements(DataTable table) throws InterruptedException {
        List<List<String>> rows = table.asLists(String.class);
        for (int i = 1; i < rows.size(); i++) {
            List<String> currentRow = rows.get(i);
            String field = currentRow.get(0);
            String value = currentRow.get(1);
            cl.scrollByPixel(415);
            Thread.sleep(1000);
            cl.mySendKeys(cl.getWebElement(field), value);
        }
    }

    @And("Click on the element in Elements")
    public void clickOnTheelementInElements(DataTable table) throws InterruptedException {
        List<String> elements = table.asList(String.class);
        for (String element : elements) {
            cl.scrollByPixel(415);
            Thread.sleep(1000);
            cl.myClick(cl.getWebElement(element));
        }
    }

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        WebElement successMessageElement = cl.successMessage;
        Assert.assertTrue(successMessageElement.getText().toLowerCase().contains("created"));
    }
}
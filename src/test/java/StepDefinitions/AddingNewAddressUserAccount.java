package StepDefinitions;

import Pages.Elements;
import Utilitys.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddingNewAddressUserAccount {

    Elements cl = new Elements();

    @When("user clicks on the sitemap link and directed to the sitemap page")
    public void userClicksOnTheSitemapLinkAndDirectedToTheSitemapPage() {

        cl.MyClick(cl.sitemapButton);
        cl.verifyContainsText(cl.sitemapText, "SITEMAP");
    }

    @Then("user clicks on the address link and directed to the address page")
    public void userClicksOnTheAddressLinkAndDirectedToTheAddressPage() {

        cl.MyClick(cl.addressButton);
        cl.verifyContainsText(cl.addressText, "MY ADDRESSES");
    }

    @And("user clicks on the add a new address button")
    public void userClicksOnTheAddANewAddressButton() {

        cl.MyClick(cl.newAddressButton);
    }

    @Then("user fills all required fields")
    public void userFillsAllRequiredFields(DataTable dt) {

        Select ddMenu = new Select(cl.state);
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement e = cl.ElementGet(items.get(i).get(0));
            cl.mySendKeys(e, items.get(i).get(1));
        }
        ddMenu.selectByIndex(5);
        cl.MyClick(cl.saveButton);
    }

    @And("address should be successfully added")
    public void addressShouldBeSuccessfullyAdded() {

        cl.verifyContainsText(cl.addressConfirm, "MY ADDRESS2");
        cl.MyClick(cl.deleteSecondAddress);
        GWD.getDriver().switchTo().alert().accept();
    }
}

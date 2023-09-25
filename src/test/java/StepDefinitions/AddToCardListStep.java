package StepDefinitions;

import Pages.Elements;
import Pages.Parents;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.HashMap;
import java.util.Map;

public class AddToCardListStep {
    Elements elm=new Elements();
    @Given("Click Dresses button")
    public void clickDressesButton() {
        elm.myClick(elm.dressesButton);
    }
    Map<Integer, WebElement> selectElements=new HashMap<>();
    @When("Select three random clothes")
    public void selectThreeRandomClothes() {

        while (selectElements.size() < 3) {
            int randomChoose = Parents.randomGenerator(3);
            WebElement selectedElm = elm.dressesBox.get(randomChoose);
            elm.scrollToElement(elm.dressesBox.get(0));

            if (!selectElements.containsKey(randomChoose)) {
                selectElements.put(randomChoose, selectedElm);
                elm.actionHover(selectedElm);
                elm.myClick(elm.AddToCardButtons.get(randomChoose));
                elm.myClick(elm.ContShoppingButton);
                System.out.println(selectedElm.getText());
            }
        }
    }
    @Then("Verify a shopping card")
    public void verifyAShoppingCard() {
        elm.myClick(elm.myCardLabel);
        elm.scrollToElement(elm.shopCardSummaryText);

        elm.listSizeAssert(elm.dressesName ,3);
        Assert.assertEquals(selectElements.size(), elm.dressesName.size());
    }
}

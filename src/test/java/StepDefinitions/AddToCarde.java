package StepDefinitions;

import Pages.Elements;
import Pages.Parents;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddToCarde {
    Elements fh = new Elements();

    @When("The user is directed to the women category by clicking on the Women category")
    public void theUserShouldBeDirectedToTheWomenCategoryByClickingOnTheWomenCategory() {
        fh.actionHover(fh.women);
    }

    @And("Clicks on the Summer dress product and is directed to the product page")
    public void clickOnTheSummerDressProductAndBeDirectedToTheProductPage() {
        fh.MyClick(fh.summer);
    }

    @And("The user hovers over a random product")
    public void theUserMustHoverOverARandomProduct() {
        fh.MyScrollToElement(fh.dressesBox1);
        for (int i = 0; i < 1; i++) {
            int randomSummer = Parents.randomGenerator(fh.dressesBox.size());
            fh.actionHover(fh.dressesBox.get(randomSummer));
            fh.MyClick(fh.AddToCardButtons.get(randomSummer));
            fh.MyClick(fh.ContShoppingButton);
        }
    }
    @Then("It must be verified that the product has been successfully added to the cart")
    public void ItMustBeVerifiedThatTheProductHasBeenSuccessfullyAddedToTheCart() {
        Assert.assertTrue(fh.message.getText().contains("Product successfully added to your shopping cart"));
    }
}



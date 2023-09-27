package StepDefinitions;


import Pages.Elements;
import Utilitys.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ProductList extends GWD {
    Elements cl = new Elements();


    @When("Searched product listing")
    public void searchedProductListing() {
        cl.MyClick(cl.dressesBtn);


    }

    @Then("Product list check")
    public void productListCheck() {
       cl.MyAssert(cl.headingCounter,"5");
       cl.MyAssert(cl.productCount,"5");
       cl.MysizeAssert(cl.productName,5);

    }
}

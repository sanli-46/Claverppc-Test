package StepDefinitions;

import Pages.Elements;
import Utilitys.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.testng.Assert;

public class LoginSteps {
    Elements elm=new Elements();
    @Given("Navigate to CleverEcommerce")
    public void navigateToCleverEcommerce() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }
    @When("Enter username as {string} and password as {string} for negative login")
    public void enterUsernameAsAndPasswordAsForNegativeLogin(String name, String password) {
        elm.MyClick(elm.HmSignInButton);
        elm.mySendKeys(elm.emailInput,name);
        elm.mySendKeys(elm.passwInput,password);
        elm.MyClick(elm.signInButton);
    }
    @Then("User should login failed")
    public void userShouldLoginFailed() {
        elm.verifyContainsText(elm.loginErrorMsg,"error");
    }

    @And("Enter username and password pozitive login")
    public void enterUsernameAndPasswordPozitiveLogin() {
        elm.MyClick(elm.HmSignInButton);
        elm.mySendKeys(elm.emailInput,"test.enes12@gmail.com");
        elm.mySendKeys(elm.passwInput,"e.b1357");
        elm.MyClick(elm.signInButton);
    }
    @And("User should login successfully")
    public void userShouldLoginSuccessfully() {
        Assert.assertTrue(GWD.getDriver().getCurrentUrl()
                .contains("my-acc"));
        elm.MyClick(elm.homeIcon);
    }
}

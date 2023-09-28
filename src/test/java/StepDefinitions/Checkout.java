package StepDefinitions;


import Pages.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class Checkout {
    Elements cl = new Elements();
    @And("Cart and checkout click")
    public void cartAndCheckoutClick() {
        cl.MyClick(cl.cartBtn);
        cl.actionHover(cl.cartBtn);
        cl.actionClick(cl.checkoutBtn);

    }

    @When("Going the payment way")
    public void goingThePaymentWay() {
        cl.MyScrollClick(cl.proceedCheckoutBtn);
        cl.MyScrollClick(cl.proceedCheckoutBtn);
        cl.MyScrollClick(cl.agreecheckbox);
        Assert.assertTrue(cl.radioCheck.isSelected());
        cl.MyClick(cl.errproceedCheckoutBtn);

    }

    String price;

    @Then("Payment methods checks")
    public void paymentMethodsChecks() {
        cl.MyScrollClick(cl.paypal);
        cl.MyAssert(cl.errPaypalmsg, "Şu anda bir şeylerin yolunda gitmediği görülüyor.");
        cl.backPage();
        cl.MyScrollClick(cl.creditCard);
        cl.MyAssert(cl.errcreditmsg, "Invalid request (1)");
        cl.backPage();
        price = cl.totalPrice.getText().replaceAll("[^0-9.,]", "");
        cl.MyScrollClick(cl.bankTransfer);
    }

    @And("Payment completion")
    public void paymentCompletion() {
        cl.MyAssert(cl.amount, price);
        cl.MyScrollClick(cl.PaymentCheckoutBtn);
        cl.MyAssert(cl.orderCongirmMsg, "Xu Clothing is complete.");
        cl.MyScrollClick(cl.orderHistoryBtn);
        cl.refList(cl.orderNumber);
    }
}

package Pages;

import Utilitys.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static Utilitys.GWD.driver;


public class Parents {
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));


    public void refList(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        List<String> refList = new ArrayList<>();
        String ref=element.getText();
        refList.add(ref);
        System.out.println(refList);
    }
    public void MyClick(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        // MyScrollToElement(element);
        element.click();

    }
    public void backPage(){
        driver.navigate().back();
    }
    public void MyScrollClick(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        MyScrollToElement(element);
        element.click();

    }



    public void MyScrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void MyAssert(WebElement element,String number){
        wait.until(ExpectedConditions.visibilityOf(element));
        MyScrollToElement(element);
        String text=element.getText();
        boolean countainsNumber=text.contains(number);

        Assert.assertTrue(countainsNumber,"Sayı yok");
    }

    public void MysizeAssert(List<WebElement> element, int number){
        int productsize = element.size();
        Assert.assertEquals(productsize,number,"beklenen sonuç la gelen sonuç doğru değil");
    }

    public void mySendKeys(WebElement element, String yazi) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.click();
        element.clear();
        element.sendKeys(yazi);
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void verifyContainsText(WebElement element, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void myJsClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public void scrollToTop() {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("window.scrollTo(0, 0);");
    }

    public void actionClick(WebElement element) {
        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(element).click().perform();
    }

    public void scrollByPixel(int pixel) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("window.scrollTo(0," + pixel + ");");

    }

    public static int randomGenerator(int limit) {
        return (int) (Math.random() * limit);
    }

    public void actionHover(WebElement element) {
        Actions actions = new Actions(GWD.getDriver());
        Action action = actions.moveToElement(element).build();
        action.perform();
    }

    public void listSizeAssert(List<WebElement> element, int number) {
        int productSize = element.size();
        Assert.assertEquals(productSize, number, "The result doesn't match the expected result");
    }
}


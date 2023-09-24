package Pages;

import Utilitys.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements extends Parents {

        public Elements() {
                PageFactory.initElements(GWD.getDriver(), this);
        }

        //Case 1 Elements

        @FindBy(css = "a.login[title='Log in to your customer account']")
        public WebElement SignInBtn;

        @FindBy(xpath = "//input[@id='email_create']")
        public WebElement NewEmail;

        @FindBy(css = "span > i.icon-user")
        public WebElement CreateAccountBtn;

        @FindBy(xpath = "//input[@id='customer_firstname']")
        public WebElement FirstName;

        @FindBy(xpath = "//input[@id='customer_lastname']")
        public WebElement LastName;

        @FindBy(xpath = "//input[@id='email']")
        public WebElement Email;

        @FindBy(xpath = "//input[@id='passwd']")
        public WebElement Password;

        @FindBy(xpath = "//span[text()='Register']")
        public WebElement RegisterBtn;

        @FindBy(css = "span > i.icon-lock")
        public WebElement signInBtn;

        @FindBy(css = "p.info-account")
        public WebElement welcomeMessage;

        @FindBy(css = "p.alert.alert-success")
        public WebElement successMessage;

        //Case 8 Elements

        @FindBy(xpath = "(//a[@title='Contact us'])[1]")  //
        public WebElement ContactUs;

        @FindBy(css = "select[name='id_contact']")
        public WebElement SubjectHeading;

        @FindBy(xpath = "(//select[@class='form-control'])[1]")
        public WebElement CustomerService;

       // @FindBy(xpath = "//input[@id='email']") // yukarida kullanilmis bu casede de kullanilabilir
      //  public WebElement Email;

        @FindBy(name = "id_order")
        public WebElement OrderReference;

        @FindBy(xpath = "//option[text()='RHTYUTQIH - 09/23/2023']")
        public WebElement OrderReferenceChoose;

        @FindBy(xpath = "//select[@name='id_product']")
        public WebElement Product;

        @FindBy(xpath = "//span[contains(text(), 'Faded Short Sleeves T-shirta')]")
        public WebElement ProductChoose;

        @FindBy(id = "uniform-fileUpload")
        public WebElement ChooseFile;

        @FindBy(css = "#message")
        public WebElement Message;

        @FindBy(xpath = "//span[text()='Send']")
        public WebElement SendBtn;

        @FindBy(css = ".contact-form-box")
        public WebElement scrollToElementCenter;


        public WebElement getWebElement(String strElement) {

                        switch (strElement) {

                                case "FirstName": return this.FirstName;
                                case "LastName": return this.LastName;
                                case "Email": return this.Email;
                                case "Password": return this.Password;
                                case "RegisterBtn": return this.RegisterBtn;

                                default:
                                        throw new RuntimeException("Element is not defined for: " + strElement);
                        }
                }

        @FindBy(xpath = "//a[@class='login']")
        public WebElement HmSignInButton;
        @FindBy (id = "email")
        public WebElement emailInput;
        @FindBy (id = "passwd")
        public WebElement passwInput;
        @FindBy(id = "SubmitLogin")
        public WebElement signInButton;
        @FindBy(xpath = "//a[@class='home']")
        public WebElement homeIcon;
        @FindBy(xpath = "//div[@class='alert alert-danger']/p")
        public WebElement loginErrorMsg;

        //LoginElements-E*

        //AddtoCardList element
        @FindBy(xpath = "(//a[@title='Dresses'])[2]")
        public WebElement dressesButton;
        @FindBy(xpath = "//span[text()='Add to cart']")
        public List<WebElement> AddToCardButtons;
        @FindBy(xpath = "//span[@title='Continue shopping']")
        public WebElement ContShoppingButton;
        @FindBy(xpath = "//a[@title='View my shopping cart']")
        public WebElement myCardLabel;
        @FindBy(xpath = "//td[@class='cart_description']/p")
        public List<WebElement> dressesName;
        @FindBy(xpath = "//div[@class='product-container']")
        public List<WebElement> dressesBox;

}


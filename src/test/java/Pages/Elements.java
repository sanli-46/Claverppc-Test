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
        //Case 5 and 7 Elements
        @FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
        public WebElement orderHistoryBtn;

        @FindBy(xpath = "(//a[@class='color-myaccount'])[1]")
        public WebElement orderNumber;

        @FindBy(xpath = "//p[@class='alert alert-success']")
        public WebElement orderCongirmMsg;

        @FindBy(xpath = "//span[@id='total_price']")
        public WebElement totalPrice;

        @FindBy(xpath = "//span[@id='amount']")
        public WebElement amount;

        @FindBy(xpath = "//input[@id='paypal-standard-btn']")
        public WebElement paypal;
        @FindBy(xpath = "//div[@class='message']")
        public WebElement errPaypalmsg;
        @FindBy(xpath = "(//p[@class='payment_module'])[3]")
        public WebElement creditCard;
        @FindBy(xpath = "(//body)[1]")
        public WebElement errcreditmsg;
        @FindBy(xpath = "(//p[@class='payment_module'])[1]")
        public WebElement bankTransfer;

        @FindBy(xpath = "(//a[@title='Dresses'])[2]")
        public WebElement dressesBtn;
        @FindBy(xpath = "//span[@class='heading-counter']")
        public WebElement headingCounter;
        @FindBy(xpath = "(//div[@class='product-count'])[2]")
        public WebElement productCount;
        @FindBy(xpath = "//a[@class='product-name']")
        public List<WebElement> productName;

        @FindBy(xpath = "//div[@class='shopping_cart']/a")
        public WebElement cartBtn;

        @FindBy(xpath = "//a[@id='button_order_cart']/span")
        public WebElement checkoutBtn;
        @FindBy(xpath = "//span[text()='Proceed to checkout']")
        public WebElement proceedCheckoutBtn;
        @FindBy(xpath = " //button[@class=\"button btn btn-default standard-checkout button-medium\"]")
        public WebElement errproceedCheckoutBtn;

        @FindBy(xpath = "//button[@class=\"button btn btn-default button-medium\"]")
        public WebElement PaymentCheckoutBtn;


        @FindBy(xpath = "//input[@class='delivery_option_radio']")
        public WebElement radioCheck;

        @FindBy(xpath = "//div[@id='uniform-cgv']")
        public WebElement agreecheckbox;
         //Case 5 and 7 Elements
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
        @FindBy(xpath = "//td[@class='cart_description']")
        public List<WebElement> dressesName;
        @FindBy(xpath = "//div[@class='product-container']")
        public List<WebElement> dressesBox;
        @FindBy(xpath = "//div[@id='center_column']/h1")
        public WebElement shopCardSummaryText; //only for scroll


        //AddtoCardListElement-E*

        //Test AddtoCard
        @FindBy(xpath = "(//a[@title='Women'])[1]")
        public WebElement women;
        @FindBy(css = "span[class='title']")
        public WebElement message;
        @FindBy(xpath= "(//a[@title='Summer Dresses'])[1]")
        public WebElement summer;
        @FindBy(xpath = "(//div[@class='product-container'])[1]")
        public WebElement dressesBox1;

        //Case 3 Elements

        @FindBy(css = "a[title='Sitemap']")
        public WebElement sitemapButton;

        @FindBy(css = "h1[class='page-heading']")
        public WebElement sitemapText;

        @FindBy(css = "a[title='View a list of my addresses']")
        public WebElement addressButton;

        @FindBy(css = "h1[class='page-heading']")
        public WebElement addressText;

        @FindBy(css = "a[title='Add an address']")
        public WebElement newAddressButton;

        @FindBy(id = "firstname")
        public WebElement nameInput;

        @FindBy(id = "lastname")
        public WebElement lastnameInput;

        @FindBy(id = "address1")
        public WebElement addressInput;

        @FindBy(id = "city")
        public WebElement cityInput;

        @FindBy(id = "id_state")
        public WebElement state;

        @FindBy(id = "postcode")
        public WebElement zipCode;

        @FindBy(id = "phone")
        public WebElement phone;

        @FindBy(id = "alias")
        public WebElement addressAlias;

        @FindBy(id = "submitAddress")
        public WebElement saveButton;

        @FindBy(xpath = "(//h3[@class='page-subheading'])[2]")
        public WebElement addressConfirm;

        @FindBy(xpath = "(//a[@title='Delete'])[2]")
        public WebElement deleteSecondAddress;

        public WebElement ElementGet(String element) {
                switch (element) {
                        case "nameInput": return this.nameInput;
                        case "lastnameInput": return this.lastnameInput;
                        case "addressInput": return this.addressInput;
                        case "cityInput": return this.cityInput;
                        case "zipCode": return this.zipCode;
                        case "phone": return this.phone;
                        case "addressAlias": return this.addressAlias;

                }

                return null;
        }




}



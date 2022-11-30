package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.accountPage;
import pages.homePage;

import pages.loginPage;

import java.time.Duration;

public class steps {
    private WebDriver driver;
    private loginPage login;
private accountPage account;
    private homePage home;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @When("the user clicks on the customer login button")
    public void the_user_clicks_on_the_customer_login_button() {
        login = new loginPage(driver);
    login.loginClick();

    }
    @When("clicks on the dropdown button and selects Harry Potter's account")
    public void clicks_on_the_dropdown_button_and_selects_harry_potter_s_account() {
    home = new homePage(driver);
    home.dropDownSelect();

    }
    @When("clicks on the login button and lands on the account page")
    public void clicks_on_the_login_button_and_lands_on_the_account_page() {
    home =new homePage(driver);
    home.harryLogin();

    }
    @When("the user clicks on the deposit button")
    public void the_user_clicks_on_the_deposit_button() {
    account = new accountPage(driver);
    account.depositButton1();
    }
    @When("enters the amount and clicks the deposit button")
    public void enters_the_amount_and_clicks_the_deposit_button() {
        account = new accountPage(driver);
        account.amount();
    }
    @Then("the deposit should be successful")
    public void the_deposit_should_be_successful() {

    }

}

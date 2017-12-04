package Steps;

import base.testBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Login extends testBase {

    @Before
    public  void setup() throws IOException {
        initialize();
    }
    @When("^I click SignIn Button$")
    public void i_click_SignIn_Button() throws Throwable {
        driver.findElement(By.linkText("Sign in")).click();

    }

    @And("^I enter user email \"([^\"]*)\" details$")
    public void iEnterUserEmailDetails(String value) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(value);
    }

    @And("^I enter user password \"([^\"]*)\" details$")
    public void iEnterUserPasswordDetails(String value) throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.id("passwd")).sendKeys(value);
    }

    @And("^I click the Login Button$")
    public void iClickTheLoginButton() throws Throwable {
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() throws Throwable {
                String NameofUser= driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
                System.out.println(NameofUser);
    }

    @And("^I sign out$")
    public void iSignOut() throws Throwable {
        driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a"));

    }





}


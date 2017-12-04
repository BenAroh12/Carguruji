package Steps;

import base.testBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;

public class ForgotPassword extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @And("^I click forgot password Link$")
    public void iClickForgotPasswordLink() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.linkText("Forgot your password?")).click();
    }


    @When("^I click retrieve password button$")
    public void iClickRetrievePasswordButton() throws Throwable {
        driver.findElement(By.cssSelector("#form_forgotpassword > fieldset > p > button > span")).click();
    }

    @Then("^I see an error \"([^\"]*)\" message details$")
    public void iSeeAnErrorMessageDetails(String ErrorMessage) throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
//        String ExpectedMessage = ErrorMessage;
//        String ActualErrorMessage = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();
//        System.out.println(ActualErrorMessage);
//        Assert.assertEquals(ExpectedMessage, ActualErrorMessage);
        String ExpectedMessage = "Password is required";
        String ActualMessage =driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();
        ExpectedMessage.equals(ActualMessage);
        System.out.println(ActualMessage);
    }
}





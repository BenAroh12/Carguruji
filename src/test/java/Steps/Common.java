package Steps;

import base.testBase;
import cucumber.api.java.en.Given;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Common extends testBase {

    @Before
    public  void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the Home Page$")
    public void i_am_on_the_Home_Page() throws Throwable {
//    driver.manage().deleteAllCookies();
    driver.get(CONFIG.getProperty("URL"));
//    driver.manage().window().maximize();
    }

    @Given("^I see a Logo Banner$")
    public void i_see_a_Logo_Banner() throws Throwable {
        driver.findElement(By.id("header_logo")).isDisplayed();
    }

}




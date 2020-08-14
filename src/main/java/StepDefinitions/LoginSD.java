package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSD {

    /*static WebDriver driver;

    @Given("we are on the login page")
    public void we_are_on_the_login_page() {
           // open browser & open login page

         System.out.println("we are on the login page");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://stock.scriptinglogic.net");


    }

    @When("we enter correct username & password")
    public void we_enter_correct_username_password() {
        System.out.println("we enter correct username & password");

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");

    }

    @When("click on login button")
    public void click_on_login_button() {
        System.out.println("click on login button");
        driver.findElement(By.name("submit")).click();

    }

    @Then("we should land up to the home page")
    public void we_should_land_up_to_the_home_page() {
        System.out.println("we should land up to the home page");
        // check whether we are on homepage or not

        String expected = "http://stock.scriptinglogic.net/dashboard.php1";
        String actual = driver.getCurrentUrl();

        Assert.assertEquals("wrong home page",expected,actual);


    }

    @When("we enter incorrect username & password")
    public void we_enter_incorrect_username_password()  {
        driver.findElement(By.name("username")).sendKeys("admin1");
        driver.findElement(By.name("password")).sendKeys("admin1");
    }

    @Then("^There should be error message$")
    public void there_should_be_error_message() {

        String expected = "http://stock.scriptinglogic.net/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("incorrect or no error message",expected,actual);
    }*/

}

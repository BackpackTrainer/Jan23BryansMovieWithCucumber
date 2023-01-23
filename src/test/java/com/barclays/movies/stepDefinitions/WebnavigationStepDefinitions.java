package com.barclays.movies.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebnavigationStepDefinitions {

    WebDriver driver;

    @Before
    public void setUp()  {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        
    }

    @Given("I have a browser open")
    public void i_have_a_browser_open() {
        driver = new ChromeDriver();
    }

    @Given("I have a {string} browser open")
    public void i_have_a_browser_open(String browser) {
        if(browser.equals("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new ChromeDriver();
        }
    }
    @When("I navigate to {string}")
    public void i_navigate_to(String url) {
        driver.get(url);
      }
    @Then("I am on the {string} page")
    public void i_am_on_the_page(String title) {
        String pageTitle = driver.getTitle();
        assertTrue(pageTitle.contains(title));
    }

    @When("I enter {string} in the ISBN box")
    public void i_enter_in_the_isbn_box(String isbn) {
        WebElement isbnBox = driver.findElement(By.name("isbn"));
        isbnBox.clear();
        isbnBox.sendKeys(isbn);
    }
    @When("I enter {string} in the Title box")
    public void i_enter_in_the_title_box(String title) {
        WebElement titleBox = driver.findElement(By.id("title"));
        titleBox.clear();
        titleBox.sendKeys(title);

    }
    @When("I select {string} from the dropdown")
    public void i_select_from_the_dropdown(String type) {
      Select movieTypeSelectMenu = new Select(driver.findElement(By.id("movieType")));
      movieTypeSelectMenu.selectByVisibleText(type);


    }
    @When("I click the submit button")
    public void i_click_the_submit_button() {
        driver.findElement(By.id("submit")).click();

    }
    @Then("I see that {string} was successfully added")
    public void i_see_that_was_successfully_added(String string) {

    }
}

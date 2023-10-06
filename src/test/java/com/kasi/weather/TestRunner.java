package com.kasi.weather;


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/com/kasi/weather/wea.feature"}, glue = {"com.kasi.weather"},
        plugin = {})
public class TestRunner  extends AbstractTestNGCucumberTests{
}



















//   private static WebDriver driver;
//    ChromeOptions chromeOptions;

//    @Before
//    void loadDriver()
//    {
//        String basepath = System.getProperty("user.dir");
//        System.setProperty("webdriver.chrome.driver", basepath + "//driver//chromedriver.exe");
////        chromeOptions = new ChromeOptions();
////        chromeOptions.setBinary("C:\\Users\\kamlesh\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
//        //   chromeOptions.setBrowserVersion();
//        // DesiredCapabilities capabilities = new DesiredCapabilities();
//        //    capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//
//         driver = new ChromeDriver();
//         driver.manage().window().maximize();
//         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//
//    }
//
//    @Given("User is on HRMLogin page {string}")
//    public  void user_is_on_hrm_login_page(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        driver.get(string);
//    }
//    @When("User enters username as {string} and password as {string}")
//    public void user_enters_username_as_and_password_as(String string, String string2) {
//      driver.findElement(By.id("id")).sendKeys(string);
//      driver.findElement(By.id("password")).sendKeys(string2);
//      driver.findElement(By.id("submit")).click();
//
//    }
//    @Then("User should be able to login sucessfully and new page open")
//    public void user_should_be_able_to_login_sucessfully_and_new_page_open() {
//        // Write code here that turns the phrase above into concrete actions
//
//        System.out.println("login Succesful");
//    }
//    @Then("User should be able to see error message {string}")
//    public void userShouldBeAbleToSeeErrorMessage(String arg0) {
//        System.out.println("login SFailed ccesful");
//    }
//
//    @After
//    public void teardown() {
//
//        driver.quit();
//    }


//}






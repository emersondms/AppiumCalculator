package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import pageobject.CalculatorPageObject;
import singleton.AppiumDriverSingleton;

import static org.testng.AssertJUnit.assertEquals;

public class BasicOperationsSteps {

    private AppiumDriver driver;
    private CalculatorPageObject pageObject;

    @Given("^The calculator app is running")
    public void theCalculatorAppIsRunning() throws Throwable {
        driver = AppiumDriverSingleton.getInstance();
        pageObject = new CalculatorPageObject(driver);
    }

    @When("^I sum (\\d+) and (\\d+)$")
    public void iSumAnd(int arg0, int arg1) throws Throwable {
        pageObject.formulaEditText().clear();
        pageObject.digitButton(arg0).click();
        pageObject.sumButton().click();
        pageObject.digitButton(arg1).click();
    }

    @Then("^The sum result should be (\\d+)$")
    public void theSumResultShouldBe(int arg0) throws Throwable {
        assertEquals(
            Integer.parseInt(pageObject.resultView().getText()), arg0
        );
    }

    @When("^I subtract (\\d+) and (\\d+)$")
    public void iSubtractAnd(int arg0, int arg1) throws Throwable {
        pageObject.formulaEditText().clear();
        pageObject.digitButton(arg0).click();
        pageObject.subButton().click();
        pageObject.digitButton(arg1).click();
    }

    @Then("^The subtraction result should be (-\\d+)$")
    public void theSubtractionResultShouldBe(int arg0) throws Throwable {
        assertEquals(
            Integer.parseInt(pageObject.resultView().getText()), arg0
        );
    }

    @When("^I multiply (\\d+) and (\\d+)$")
    public void iMultiplyAnd(int arg0, int arg1) throws Throwable {
        pageObject.formulaEditText().clear();
        pageObject.zeroButton().click();
        pageObject.multButton().click();
        pageObject.digitButton(arg1).click();
    }

    @Then("^The multiplication result should be (\\d+)$")
    public void theMultiplicationResultShouldBe(int arg0) throws Throwable {
        assertEquals(
            Integer.parseInt(pageObject.resultView().getText()), arg0
        );
    }

    @When("^I divide (\\d+) by (\\d+)$")
    public void iDivideBy(int arg0, int arg1) throws Throwable {
        pageObject.formulaEditText().clear();
        pageObject.digitButton(arg0).click();
        pageObject.divButton().click();
        pageObject.zeroButton().click();
    }

    @Then("^The division result should be an error$")
    public void theDivisionResultShouldBeAnError() throws Throwable {
        assertEquals(pageObject.resultView().getText(), "∞");
        driver.quit();
    }
}
